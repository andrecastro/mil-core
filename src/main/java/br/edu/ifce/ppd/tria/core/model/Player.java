package br.edu.ifce.ppd.tria.core.model;

import java.io.Serializable;

/**
 * Created by andrecoelho on 2/16/16.
 */
public class Player implements Serializable {

    private String name;
    private PlayerSelection selection;
    private Integer numberOfPieces;
    private Integer numberOfPiecesPlaced;

    private Client client;

    public Player(Client client, String name, PlayerSelection selection) {
        this.name = name;
        this.client = client;
        this.selection = selection;
        this.numberOfPieces = 9; // each player start with 9 pieces
        this.numberOfPiecesPlaced = 0; // each player has no pieces placed
    }

    public String getName() {
        return name;
    }

    public PlayerSelection getSelection() {
        return selection;
    }

    public Client getClient() {
        return client;
    }

    public void increaseNumberOfPiecesPlaced() {
        this.numberOfPiecesPlaced++;
    }

    public void decreaseNumberOfPieces() {
        this.numberOfPieces--;
    }

    public Integer getNumberOfPieces() {
        return numberOfPieces;
    }

    public Integer getNumberOfPiecesPlaced() {
        return numberOfPiecesPlaced;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }

        String currentId = getClient().getId();
        String otherId = ((Player) obj).getClient().getId();

        return currentId.equals(otherId);
    }
}
