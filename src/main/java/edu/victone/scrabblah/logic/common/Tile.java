package edu.victone.scrabblah.logic.common;

/**
 * Created with IntelliJ IDEA.
 * User: vwilson
 * Date: 9/11/13
 * Time: 4:11 PM
 */
public class Tile {
    private Character letter;

    public Tile(Character c) {
        letter = Character.toLowerCase(c);
    }

    public Character getCharacter() {
        return letter;
    }

    public static int getValue(Character c) {
      int val;
        switch (c) {
            case 'e':
            case 'a':
            case 'i':
            case 'o':
            case 'n':
            case 'r':
            case 't':
            case 'l':
            case 's':
            case 'u':
                val = 1;
                break;
            case 'd':
            case 'g':
                val = 2;
                break;
            case 'b':
            case 'c':
            case 'm':
            case 'p':
                val = 3;
                break;
            case 'f':
            case 'h':
            case 'v':
            case 'w':
            case 'y':
                val = 4;
                break;
            case 'k':
                val = 5;
                break;
            case 'j':
            case 'x':
                val = 8;
                break;
            case 'q':
            case 'z':
                val = 10;
                break;
            case ' ':
                val = 0;
                break;
            default:
                throw new IllegalArgumentException("Illegal character");
        }
        return val;
    }

    @Override
    public String toString() {
        return String.valueOf(letter) + getValue(letter);
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) {
            return false;
        }

        final Tile t = (Tile) o;
        return letter == t.letter;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(letter);
    }
}