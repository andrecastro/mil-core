package br.edu.ifce.ppd.tria.core.model;

import java.io.Serializable;

/**
 * Created by andrecoelho on 2/16/16.
 */
public enum GameStatus implements Serializable {

    IDLE,
    PLAYING,
    PLACING_OF_PIECE,
    REMOVING_PIECE;

}
