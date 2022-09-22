package org.example;

import java.util.Scanner;

public class Exercice5ValeurA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir un nombre : ");
        double nbr = sc.nextDouble();
        nbr = f.valeurAbsolue(nbr);
        System.out.println(nbr);
    }
}
