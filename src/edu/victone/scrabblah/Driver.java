package edu.victone.scrabblah;

import edu.victone.scrabblah.ui.ConsoleUI;
import edu.victone.scrabblah.ui.GraphicalUI;
import edu.victone.scrabblah.ui.UserInterface;

/**
 * Created with IntelliJ IDEA.
 * User: vwilson
 * Date: 9/11/13
 * Time: 2:53 PM
 */

public class Driver {
    public static void main(String[] args) {
        UserInterface ui;

        if (args.length > 1 && args[1].equals("-g")) {
            //graphical mode
            ui = new GraphicalUI();
        } else {
            //console mode
            ui = new ConsoleUI();
        }
    }
}


