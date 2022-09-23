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

    /*Fonction créer sans rapport avec le TP*/
    public static double calculMoy(double totalnote, double nbrnote){
        double moyenne = totalnote/nbrnote;
        return moyenne;
    }
    public static double Addition(double nbr1, double nbr2){
        /*Cette fonction à pour but de faire une addition entre 2 nombres*/
        return nbr1 + nbr2;
    }
    public static double Soustraction(double nbr1, double nbr2){
        /*Cette fonction à pour but de faire une soustraction entre 2 nombres*/
        return nbr1 - nbr2;
    }
    public static double Division(double nbr1, double nbr2){
        if(nbr2 == 0){
            return 0;
        }else{
            return nbr1/nbr2;
        }
    }
    public static double Multiplication(double nbr1, double nbr2){
        return nbr1 * nbr2;
    }
    public static double Puissance(double nbr1, double nbr2){
        return Math.pow(nbr1, nbr2);
    }
    public static double plusPetit(double nbr1, double nbr2){
        return Math.min(nbr1, nbr2);
    }
    public static double plusGrand(double nbr1, double nbr2){
        return Math.max(nbr1, nbr2);
    }
    public static double PourcentageRemise(double montantRemise, double prixInitial){
        return (montantRemise*100)/prixInitial;
    }
    /*public static double TauxChange(double prix, char devise){
        /*Bientpôt disponible...*/
        /*if(devise == '$'){
            double dollars = 0.97;
            double change = devise*dollars;
            return change;
        }
        else if(devise == '£'){
            double livreS = 0.88;
            double change = devise*livreS;
            return change;
        }
    }*/
}
