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
    public static double calculerMoyenne(double nb1, double nb2){
        double moyenne = (nb1+nb2)/2;
        return moyenne;
    }
}
