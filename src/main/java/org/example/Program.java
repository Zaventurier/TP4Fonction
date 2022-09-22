package org.example;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir nombre 1 :");
        double nb1 = sc.nextDouble();
        System.out.println("Saisir nombre 2 :");
        double nb2 = sc.nextDouble();

        double max = Math.max(nb1, nb2);
        System.out.println("Le nombre est : " + max);

        double min = Math.min(nb1, nb2);
        System.out.println("Le nombre est : " + min);

        double pui = Math.pow(nb1, nb2);
        System.out.println("Le nombre est : " + pui);

        Fonctions f = new Fonctions();
        System.out.println("Saisir âge : ");
        int age = sc.nextInt();
        f.AfficherMajorite(age);

    }


}
