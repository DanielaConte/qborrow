package it.quix.academy.qborrow;

import it.quix.academy.qborrow.web.ws.WsOggettiImpl;

import javax.xml.ws.Endpoint;

public class TestPubWsOggetti {

	public static void main(String[] args) {

        Endpoint.publish("http://localhost:9899/ws/oggetti", new WsOggettiImpl());

    }
	
} 
