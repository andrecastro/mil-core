package br.edu.ifce.ppd.tria.core.service;

import br.edu.ifce.ppd.tria.core.model.Game;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by andrecoelho on 3/15/16.
 */
public interface GameServiceNotifier extends Remote {

    void notifyCloseGame() throws RemoteException;

    void notifyEnterGame(Game game) throws RemoteException;

    void notifyPutPiece(Game game) throws RemoteException;

    void notifyMovePiece(Game game) throws RemoteException;

    void notifyRemovePiece(Game game) throws RemoteException;

    void notifyAskToRestart() throws RemoteException;

    void notifyRestartGame(Game game) throws RemoteException;

    void notifyGiveUp() throws RemoteException;

}
