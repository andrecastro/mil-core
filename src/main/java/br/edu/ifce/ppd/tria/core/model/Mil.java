package br.edu.ifce.ppd.tria.core.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static br.edu.ifce.ppd.tria.core.model.PlayerSelection.FIRST_PLAYER;

/**
 * Created by andrecoelho on 2/24/16.
 */
public class Mil implements Serializable {

    private int id;

    private ArrayList<Spot> spots;

    public Mil(int id) {
        this.id = id;
        this.spots = new ArrayList<Spot>();
    }

    public int getId() {
        return id;
    }

    public void setSpots(ArrayList<Spot> spots) {
        if (spots.size() != 3)
            throw new RuntimeException("You must provide 3 spots for a mil");

        this.spots = spots;
    }

    public boolean isCompletelyOccupiedBy(PlayerSelection playerSelection) {
        if (playerSelection.equals(FIRST_PLAYER)) {
            return spots.stream().allMatch(s -> s.isOccupiedByPlayerOne());
        }

        return spots.stream().allMatch(s -> s.isOccupiedByPlayerTwo());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Mil)) {
            return false;
        }

        return this.id == ((Mil) obj).id;
    }
}
