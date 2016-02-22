package br.edu.ifce.ppd.tria.core.model;

import java.io.Serializable;

/**
 * Created by andrecoelho on 2/16/16.
 */
public class Player implements Serializable {

    private String name;
    private PlayerSelection selection;

    private Client client;

    public Player(Client client, String name, PlayerSelection selection) {
        this.name = name;
        this.client = client;
        this.selection = selection;
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
}
