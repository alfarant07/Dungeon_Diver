package org.example;

import java.io.IOException;
//------------------------------------------------------

    /*
        A class meant to print the error message should one occur

     */
//--------------------------------------------------------
public class PrintError extends Action {
    private Dungeon d;
    private IOException e;

    /**
     * Creates a print error object with dungeon and IOException objects
     * @param d
     * @param e
     */
    public PrintError(Dungeon d, IOException e) {
        super("An Error has occured");
        this.d =d;
        this.e = e;
    }

    @Override
    /**
     * prints the error message
     */
    public void execute() {
        System.out.println("Error: " + e.getMessage());

    }
}
