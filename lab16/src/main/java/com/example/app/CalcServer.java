package com.example.app;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @WebService : Signale que c'est le SEI (Service Endpoint Interface).
 * @WebMethod : Signale que la methode est une operation du service.
 * @SOAPBinding permet de changer la construction du service (RPC permet de le deployer plus facilement)
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalcServer {
    @WebMethod public int calculate(int x,int y,String operation) throws Exception;
}
