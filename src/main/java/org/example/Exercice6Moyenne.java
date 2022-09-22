package org.example;

import java.util.Scanner;

public class Exercice6Moyenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir un nombre :");
        double nb1 = sc.nextDouble();
        System.out.println("Saisir un nombre :");
        double nb2 = sc.nextDouble();
        double moyenne = f.calculerMoyenne(nb1, nb2);
        System.out.println(moyenne);
    }
}
