package br.edu.ifce.ppd.tria.core.service;

import br.edu.ifce.ppd.tria.core.model.Client;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by andrecoelho on 2/18/16.
 */
public interface GameService extends Remote {

    <T extends Serializable> T retrieveIdleGames() throws RemoteException;

    <T extends Serializable> T createGame(Client client, String alias, String firstPlayerName) throws RemoteException;

    <T extends Serializable> T enterGame(Client client, String gameId, String secondPlayerName) throws RemoteException;

    <T extends Serializable> T putPieceInSpot(Client client, String gameId, Integer selectedSpotId) throws RemoteException;

    <T extends Serializable> T removePiece(Client client, String gameId, Integer selectedSpotId) throws RemoteException;

    <T extends Serializable> T movePiece(Client client, String gameId, Integer fromSpotId, Integer toSpotId) throws RemoteException;

    <T extends Serializable> T askToRestartGame(Client client, String gameId) throws RemoteException;

    <T extends Serializable> T restartGame(Client client, String gameId) throws RemoteException;

    <T extends Serializable> T giveUp(Client client) throws RemoteException;

}
