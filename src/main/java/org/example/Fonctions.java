package org.example;

//Ce fichier rassemble l'ensemble des fonctions necessaire dans le tp4Fonction
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
    public static char enMajuscule(char c){
        char maj = Character.toUpperCase(c);
        return maj;
    }
    public static String getEmail(String nom, String prenom, String domaine){
        char i = '@';
        String email = nom + prenom + i + domaine;
        return email;
    }
    public static void modifier(int n){
        System.out.println("Début fonction modifier");
        n = 0;
        System.out.println("n vaut " + n);
    }
}
