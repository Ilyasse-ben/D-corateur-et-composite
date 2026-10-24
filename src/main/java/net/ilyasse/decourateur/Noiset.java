package net.ilyasse.decourateur;

import net.ilyasse.composants.Boisson;

public class Noiset extends Decorateur{
    public Noiset(Boisson boisson){
        super(boisson);
    }
    public String getDescription(){
        return boisson.getDescription()+ " au Noiset";
    }
    @Override
    public double cout() {
        return 1.5+boisson.cout();
    }
}
