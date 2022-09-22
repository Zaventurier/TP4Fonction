package org.example;

import java.util.Scanner;

public class Exercice8Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir votre nom :");
        String nom = sc.next();
        System.out.println("Saisir votre prenom :");
        String prenom = sc.next();
        System.out.println("Saisir votre domaine :");
        String domaine = sc.next();

        String mail = f.getEmail(nom, prenom, domaine);
        System.out.println(mail);
    }
}
