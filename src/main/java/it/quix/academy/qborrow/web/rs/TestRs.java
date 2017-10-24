package it.quix.academy.qborrow.web.rs;

import it.quix.academy.qborrow.core.manager.QborrowException;
import it.quix.academy.qborrow.core.manager.QborrowManager;
import it.quix.academy.qborrow.core.model.Oggetti;
import it.quix.academy.qborrow.core.search.OggettiSearch;
import it.quix.framework.core.validation.exception.ValidationException;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/oggetti")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TestRs {

    // SELECT ON DB
    List<Oggetti> array = new ArrayList<Oggetti>();

    @GET
    public Response getOggetti() {

        // SELECT ON DB
        List<Oggetti> array = new ArrayList<Oggetti>();

        Oggetti ogg = new Oggetti();
        ogg.setId(45);
        array.add(ogg);

        Oggetti ogg2 = new Oggetti();
        ogg2.setId(95);
        array.add(ogg2);

        return Response.ok(array, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/{id}")
    // aggiugiamo l'id alla fine del path
        public
        Oggetti getOggetto(@PathParam("id") Integer id) {

        // SELECT ON DB
        Oggetti ogg = new Oggetti();
        ogg.setId(id);
        return ogg;

    }

    @POST
    public Oggetti postOggetto(Oggetti oggetto) {

        Oggetti ogg = new Oggetti();
        ogg.setId(88);
        ogg.setTitolo("PROVA");
        // INSERT ON DB
        return ogg;
    }

    @PUT
    public Oggetti putOggetto(Oggetti oggetto) throws QborrowException, ValidationException {
        oggetto.setId(50);
        QborrowManager manager = new QborrowManager();
        Oggetti ogg = new Oggetti();
        ogg = manager.updateOggetti(oggetto);
        // UPDATE ON DB
        return ogg;
    }

    @DELETE
    public String deleteOggetti() {
        return "{\"message\":  \"OK\"}";
    }

    @DELETE
    @Path("/{id}")
    public String deleteOggetto(@PathParam("id") Integer id) {
        // DELETE ON DB

        return "{\"message\":  \"OK\"}";

    }

}
