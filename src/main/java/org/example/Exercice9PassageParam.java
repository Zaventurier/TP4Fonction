package org.example;

public class Exercice9PassageParam {
    public static void main(String[] args) {
        Fonctions f = new Fonctions();
        int n = 1000;
        System.out.println("Dans main, n vaut " + n);
        f.modifier(n);
    }
}
