package net.ilyasse.decourateur;

import net.ilyasse.composants.Boisson;

public class Noiset extends Decorateur{
    public Noiset(Boisson boisson){
        super(boisson);
    }
    public String getDescription(){
        return boisson.getDescription()+ " au Caramel";
    }
    @Override
    public double cout() {
        return 3.5+boisson.cout();
    }
}
