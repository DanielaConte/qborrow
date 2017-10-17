package it.quix.academy.qborrow;



import it.quix.academy.qborrow.core.model.Oggetti;
import it.quix.academy.qborrow.web.ws.WsOggetti;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class WsOggettiClient {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:9899/ws/oggetti?wsdl"); //

        QName qname = new QName("http://ws.web.qborrow.academy.quix.it/", "WsOggettiImplService"); /*
                                                                                                 * il primo parametro è
                                                                                                 * quello vicino a xmlns:tns= in TestWs.wsdl, secondo parametro
                                                                                                 * è quello vicino a wsdl:definitions name=
                                                                                                 */
        Service service = Service.create(url, qname);

        WsOggetti cli = service.getPort(WsOggetti.class);
        
        Integer id = 10;

        System.out.println(cli.getResponse(id));

    }
	
}
