package org.example;

public abstract class Action {
    private String prompt;
    public Action(String prompt){
        this.prompt = prompt;
    }
    public abstract void execute();
    public String toString(){
        return prompt;
    }

}
