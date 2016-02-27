package br.edu.ifce.ppd.tria.core.model;

import java.io.Serializable;
import java.util.*;

import static br.edu.ifce.ppd.tria.core.model.SpotOccupiedBy.NO_ONE;
import static br.edu.ifce.ppd.tria.core.model.SpotOccupiedBy.PLAYER_ONE;
import static br.edu.ifce.ppd.tria.core.model.SpotOccupiedBy.PLAYER_TWO;

/**
 * Created by andrecoelho on 2/23/16.
 */
public class Spot implements Serializable {

    private int id;

    private HashSet<Spot> possiblePaths;

    private SpotOccupiedBy occupiedBy;

    private List<Mil> milsBelongsTo;

    public Spot(int id) {
        this.id = id;
        this.possiblePaths = new HashSet<>();
        this.occupiedBy = NO_ONE;
    }

    public void setMilsBelongsTo(ArrayList<Mil> mils) {
        if (mils.size() != 2)
            throw new RuntimeException("You must provide 2 mils");

        this.milsBelongsTo = mils;
    }

    public List<Mil> getMilsBelongsTo() {
        return milsBelongsTo;
    }

    public void addPossiblePath(Collection<Spot> spots) {
        this.possiblePaths.addAll(spots);
    }

    public boolean isPossiblePath(Spot spot) {
        return this.possiblePaths.contains(spot);
    }

    public int getId() {
        return id;
    }

    public void occupiedBy(SpotOccupiedBy occupiedBy) {
        this.occupiedBy = occupiedBy;
    }

    public boolean isOccupiedByPlayerOne() {
        return this.occupiedBy.equals(PLAYER_ONE);
    }

    public boolean isOccupiedByPlayerTwo() {
        return this.occupiedBy.equals(PLAYER_TWO);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Spot)) {
            return false;
        }

        Spot other = (Spot) obj;
        return this.getId() == other.getId();
    }
}
