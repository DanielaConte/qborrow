package it.quix.academy.qborrow.web.ws;

import it.quix.academy.qborrow.core.model.Oggetti;

import javax.jws.WebService;

@WebService(endpointInterface = "it.quix.academy.qborrow.web.ws.WsOggetti")
public class WsOggettiImpl implements WsOggetti {

    public Oggetti getResponse(Integer id) {
    	Oggetti oggetto = new Oggetti();
    	oggetto.setId(id);
        // TODO Auto-generated method stub
        return oggetto;
    }

} 
