package br.edu.ifce.ppd.tria.core.service;

import br.edu.ifce.ppd.tria.core.model.Client;
import br.edu.ifce.ppd.tria.core.protocol.Action;

import java.io.Serializable;

/**
 * Created by andrecoelho on 2/18/16.
 */
public interface GameService {

    <T extends Serializable> T retrieveIdleGames();

    <T extends Serializable> T createGame(Client client, String alias, String firstPlayerName);

    <T extends Serializable> T enterGame(Client client, String gameId, String secondPlayerName);

    <T extends Serializable> T putPieceInSpot(Client client, String gameId, Integer selectedSpotId);

    <T extends Serializable> T removePiece(Client client, String gameId, Integer selectedSpotId);

    <T extends Serializable> T movePiece(Client client, String gameId, Integer fromSpotId, Integer toSpotId);

    <T extends Serializable> T askToRestartGame(Client client, String gameId);

    <T extends Serializable> T restartGame(Client client, String gameId);

    <T extends Serializable> T giveUp(Client client);

}
