package org.example;

/**
 * Abstract class of to be used by possible actions
 * prompt meant for TextUI format
 */

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
