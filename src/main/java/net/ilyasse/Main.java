package net.ilyasse;

import net.ilyasse.composants.Boisson;
import net.ilyasse.composants.Sumatra;
import net.ilyasse.decourateur.Caramel;
import net.ilyasse.decourateur.Chocolat;
import net.ilyasse.decourateur.Noiset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boisson boisson=new Sumatra();
        System.out.println("=============================");
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("******************************");
        boisson=new Chocolat(boisson);
        System.out.println("=============================");
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("******************************");
        boisson=new Noiset(boisson);
        System.out.println("=============================");
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("******************************");
        boisson=new Caramel(boisson);
        System.out.println("=============================");
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("******************************");
    }
}