package net.ilyasse.composants;

public class Sumatra extends Boisson{
    public Sumatra(){
        description+="Espresso";
    }

    @Override
    public double cout() {
        return 8;
    }
}
