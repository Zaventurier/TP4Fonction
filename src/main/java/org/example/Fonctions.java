package org.example;

public class Fonctions {
    public static void AfficherMajorite(int age) {
        if (age < 18){
            System.out.println("Mineur");
        }else{
            System.out.println("Majeur");
        }
    }
    public static double valeurAbsolue(double nombre){
        double nbr = Math.abs(nombre);
        return nbr;
    }
}
