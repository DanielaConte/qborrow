package it.quix.academy.qborrow.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import it.quix.academy.qborrow.core.dao.generated.SoggettiAbstractDAO;
import it.quix.academy.qborrow.core.manager.QborrowManager;
import it.quix.academy.qborrow.core.model.Soggetti;
import it.quix.framework.core.exception.DAOFinderException;
import it.quix.framework.core.exception.DAOStoreException;
import it.quix.framework.util.FrameworkStringUtils;
import it.quix.framework.util.exceptions.SystemException;

/**
 * The DAO for Soggetti entity.
 * 
 * @author Quix CodeGenerator version 03.03.00-SNAPSHOT, generated 11/10/2017 14:50:05
 */
public class SoggettiDAO extends SoggettiAbstractDAO {

    private static Log log = LogFactory.getLog(SoggettiDAO.class);

    public SoggettiDAO(DataSource dataSource) {
        super(dataSource);
        if (log.isDebugEnabled()) {
            log.debug("SoggettiDAO initialized!");
        }
    }

    public void init() {
        log.info("SoggettoDAO initialized custom");
    }
    
    public void updateCompleannoSenzaCondizione(Soggetti soggetti) throws DAOStoreException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            // Compose the update query
            StringBuilder query = new StringBuilder(EOL);
            query.append(" UPDATE soggetti SET ").append(EOL);
            query.append(" mail = ? , ragione_sociale = ? , nome = ? , cognome = ? , immagine = ? , data_ultima_modifica = ? , data_compleanno = ?").append(EOL);
            query.append("  WHERE username = ? ").append(EOL); //aggiorno se l'anno è pari

            // Query logging
            if (queryLog.isInfoEnabled()) {
                queryLog.info(query);
            }
            // Get connection
            connection = getConnection();
            // Prepare the statement
            statement = connection.prepareStatement(query.toString());

            // set preUpdate
            soggetti.preUpdate(configuration);

            // Set the parameters
            int p = 1;
            super.setParameterString(statement, p++, soggetti.getMail());
            super.setParameterString(statement, p++, soggetti.getRagioneSociale());
            super.setParameterString(statement, p++, soggetti.getNome());
            super.setParameterString(statement, p++, soggetti.getCognome());
            super.setParameterString(statement, p++, soggetti.getImmagine());
            super.setParameterDate(statement, p++, soggetti.getDataUltimaModifica());
            super.setParameterDate(statement, p++, soggetti.getDataCompleanno());

            // Set the primary key
            super.setParameterString(statement, p++, soggetti.getUsername());

            // Execute the query
            long startTime = System.currentTimeMillis();
            int numberOfUpdatedRecord = statement.executeUpdate();
            long endTime = System.currentTimeMillis();
            long time = endTime - startTime;
            String msgTime = FrameworkStringUtils.concat("Query time: ", time);
            if (queryLog.isDebugEnabled()) {
                queryLog.debug(msgTime);
            }
            if (numberOfUpdatedRecord < 1) {
                String msg =
                    FrameworkStringUtils.concat("Error while updating the record of type Soggetti ", soggetti, " on database. Number of updated rows: ",
                        numberOfUpdatedRecord);
                if (log.isWarnEnabled()) {
                    log.warn(msg);
                }
                throw new DAOStoreException(msg);
            }
        } catch (SQLException ex) {
            String msg = FrameworkStringUtils.concat("Unexpeted error during update of record of type Soggetti ", soggetti, " on database.");
            if (log.isErrorEnabled()) {
                log.error(msg, ex);
            }
            throw new SystemException(msg, ex);
        } finally {
            closeStatement(statement);
            closeConnection(connection);
        }
    }
    
    public Soggetti getWithCompleanno(String username) throws DAOFinderException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            // Compose the select query
            StringBuilder query = new StringBuilder(EOL);
            query.append("SELECT * FROM soggetti ").append(EOL);
            query.append("WHERE USERNAME = ?  ").append(EOL);
            // Query logging
            if (queryLog.isInfoEnabled()) {
                queryLog.info(query);
            }
            // Get connection
            connection = getConnection();
            // Prepare the statement
            statement = connection.prepareStatement(query.toString());
            // Set the parameters
            int p = 1;
            // Set the primary key
            super.setParameterString(statement, p++, username);

            // Execute the query
            long startTime = System.currentTimeMillis();
            rs = statement.executeQuery();
            long endTime = System.currentTimeMillis();
            long time = endTime - startTime;
            String msgTime = FrameworkStringUtils.concat("Query time: ", time);
            if (queryLog.isDebugEnabled()) {
                queryLog.debug(msgTime);
            }
            if (rs.next()) {
                Soggetti soggettiModel = buildModelFromResultSetWithCompleanno(rs,getQborrowManager());
                return soggettiModel;
            }
            throw new DAOFinderException(FrameworkStringUtils.concat("Cannot find Soggetti on database with [username = ", username, "]"));

        } catch (SQLException ex) {
            String msg = FrameworkStringUtils.concat("Error on method get(String username) for Soggetti on database with [username = ", username, "]");
            if (log.isErrorEnabled()) {
                log.error(msg);
            }
            throw new SystemException(msg, ex);
        } finally {
            closeResultSet(rs);
            closeStatement(statement);
            closeConnection(connection);
        }
    }

    
    public Soggetti buildModelFromResultSetWithCompleanno(ResultSet rs, QborrowManager qborrowManager) throws SQLException {
        Soggetti soggetti = new Soggetti();

        soggetti.setJdbc(true);
        soggetti.setQborrowManager(qborrowManager);

        soggetti.setUsername(getParameterString(rs, "username"));
        soggetti.setMail(getParameterString(rs, "mail"));
        soggetti.setRagioneSociale(getParameterString(rs, "ragione_sociale"));
        soggetti.setNome(getParameterString(rs, "nome"));
        soggetti.setCognome(getParameterString(rs, "cognome"));
        soggetti.setImmagine(getParameterString(rs, "immagine"));
        soggetti.setDataUltimaModifica(getParameterDate(rs, "data_ultima_modifica"));
        soggetti.setDataCompleanno(getParameterDate(rs, "data_compleanno"));

        return soggetti;
    }
}