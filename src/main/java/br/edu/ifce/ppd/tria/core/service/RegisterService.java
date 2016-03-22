package br.edu.ifce.ppd.tria.core.service;

import br.edu.ifce.ppd.tria.core.model.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by andrecoelho on 2/18/16.
 */
public interface RegisterService extends Remote {

    Client createClient() throws RemoteException;

    Client register(Client client) throws RemoteException;

    void deregister(Client client) throws RemoteException;

}
