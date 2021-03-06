package br.edu.ifce.ppd.tria.core.service;

import br.edu.ifce.ppd.tria.core.model.Client;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by andrecoelho on 2/20/16.
 */
public interface ChatService extends Remote {

    <T extends Serializable> T sendMessage(Client client, String message) throws RemoteException;

}
