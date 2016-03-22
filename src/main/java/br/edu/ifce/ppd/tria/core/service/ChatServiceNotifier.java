package br.edu.ifce.ppd.tria.core.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by andrecoelho on 3/15/16.
 */
public interface ChatServiceNotifier extends Remote {

    void notifySendMessage(String playerName, String message) throws RemoteException;

}
