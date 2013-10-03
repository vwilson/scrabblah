package edu.victone.scrabblah.logic.player;

import edu.victone.scrabblah.logic.common.Tile;

/**
 * Created with IntelliJ IDEA.
 * User: vwilson
 * Date: 9/11/13
 * Time: 4:10 PM
 */

public abstract class Player {
    private String name;
    private int rank;
    protected boolean isHuman;

    private TileRack tileRack;

    private int score = 0;

    public Player(String name, int rank) {
        this.name = name;
        this.rank = rank;
        tileRack = new TileRack();
    }

    public boolean addTile(Tile t) {
        return tileRack.addTile(t);
    }

    //these abstract methods might not be strictly necessary.
    abstract public boolean playWord();

    abstract public boolean swap();

    abstract public boolean pass();

    abstract public void resign();

    public TileRack getTileRack() {
        return tileRack;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int delta) {
        score += delta;
    }

    @Override
    public String toString() {
        return "P" + rank + ": " + name + " (" + (isHuman ? "human" : "machine") + ") - Score: " + score;
    }
}
