package net.ilyasse.decourateur;

import net.ilyasse.composants.Boisson;

public class Caramel extends Decorateur{
    public Caramel(Boisson boisson){
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
