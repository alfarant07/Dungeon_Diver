package org.example;

import java.io.IOException;

public class PrintError extends Action {
    private Dungeon d;
    private IOException e;
    public PrintError(Dungeon d, IOException e) {
        super("An Error has occured");
        this.d =d;
        this.e = e;
    }

    @Override
    public void execute() {
        System.out.println("Error: " + e.getMessage());

    }
}
