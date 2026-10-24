package net.ilyasse.composants;

public abstract class Boisson {
    protected String description="Boisson ";

    public String getDescription(){
        return this.description;
    }
    public abstract double cout();
}
