package org.example;

import java.util.Scanner;

public class Exercice7Maj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir un caractère :");
        String c = sc.next();
        char d = c.charAt(0);
        char maj = f.enMajuscule(d);
        System.out.println(maj);
    }


}
