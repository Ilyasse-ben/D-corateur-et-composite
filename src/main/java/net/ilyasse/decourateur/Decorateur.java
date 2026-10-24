package net.ilyasse;

import net.ilyasse.composants.Boisson;

public abstract class Decorateur extends Boisson {
    private Boisson boisson;
    public Decorateur(Boisson boisson){
        this.boisson=boisson;
    }
}
