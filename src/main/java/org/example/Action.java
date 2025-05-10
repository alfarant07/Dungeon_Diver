package org.example;

/**
 * Abstract class of to be used by possible actions
 * prompt meant for TextUI format
 */
//------------------------------------------------------
// Assignment_2 (2)
// Written by: (Anthony Alfaro 2148110)
// For SES350 Section (602) – Spring 2025
    /*
    an abstract class action meant to serve as a basis for the actions integrated into the game
    creates an object Action using string prompt passed from subclasses for good output
     */
//--------------------------------------------------------

public abstract class Action {
    private String prompt;

    /**
     * we construct an Action with a prompt for nice output
     * @param prompt subclasses pass prompt on their respective action
     */
    public Action(String prompt){
        this.prompt = prompt;
    }

    /**
     * execute implemented by subclasses to do their effect
     */
    public abstract void execute();

    /**
     *
     * @return string representation of prompt and not javas base toString
     */
    public String toString(){
        return prompt;
    }

}
