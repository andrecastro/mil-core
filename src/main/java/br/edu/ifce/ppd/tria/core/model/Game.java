package br.edu.ifce.ppd.tria.core.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by andrecoelho on 2/16/16.
 */
public class Game implements Serializable {

    private String id;
    private String alias;
    private Player firstPlayer;
    private Player secondPlayer;
    private GameStatus status;
    private HashMap<Integer, Spot> board;

    public Game(String alias, Player firstPlayer) {
        this.alias = alias;
        this.firstPlayer = firstPlayer;
        this.status = GameStatus.IDLE;
    }

    public String getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setBoard(HashMap<Integer, Spot> board) {
        this.board = board;
    }

    public HashMap<Integer, Spot> getBoard() {
        return board;
    }

    public boolean isIdle() {
        return getStatus().equals(GameStatus.IDLE);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSecondPlayer(Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public boolean isFirstPlayer(Client client) {
        if (firstPlayer == null || client == null) {
            return false;
        }

        return firstPlayer.getClient().equals(client);
    }

    public boolean isSecondPlayer(Client client) {
        if (secondPlayer == null || client == null) {
            return false;
        }

        return secondPlayer.getClient().equals(client);
    }

    public Client getOpponentClientOf(Client client) {
        if (isFirstPlayer(client)) {
            return getSecondPlayer().getClient();
        }

        return getFirstPlayer().getClient();
    }

}
