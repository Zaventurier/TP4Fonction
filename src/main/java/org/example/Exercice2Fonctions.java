package org.example;

import java.util.Scanner;

public class Exercice2Fonctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre :");
        double nbr = sc.nextDouble();
        double rc = Math.sqrt(nbr);
        System.out.println(rc);
        double arrondis = Math.round(rc);
        System.out.println(arrondis);


    }
}
