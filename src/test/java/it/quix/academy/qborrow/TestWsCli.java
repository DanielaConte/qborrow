package it.quix.academy.qborrow;

import it.quix.academy.qborrow.web.ws.TestWs;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestWsCli {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:9999/ws/test?wsdl"); //

        QName qname = new QName("http://ws.web.qborrow.academy.quix.it/", "TestWsImplService"); /*
                                                                                                 * il primo parametro è
                                                                                                 * quello vicino a xmlns:tns= in TestWs.wsdl, secondo parametro
                                                                                                 * è quello vicino a wsdl:definitions name=
                                                                                                 */
        Service service = Service.create(url, qname);

        TestWs cli = service.getPort(TestWs.class);

        System.out.println(cli.getResponse("mkyong"));

    }

}
