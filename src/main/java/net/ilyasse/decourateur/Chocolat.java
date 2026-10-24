package net.ilyasse.decourateur;

import net.ilyasse.composants.Boisson;

public class Chocolat extends Decorateur{
    public Chocolat(Boisson boisson){
        super(boisson);
    }
    public String getDescription(){
        return boisson.getDescription()+ " au Chocolat";
    }
    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }
}
