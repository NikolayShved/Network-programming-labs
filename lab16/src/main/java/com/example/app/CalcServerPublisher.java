package com.example.app;

import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceException;

public class CalcServerPublisher {
    public static void main(String[ ] args) throws WebServiceException {
        Endpoint.publish("http://localhost:8081/calc", new CalcServerImpl());
    }
}
