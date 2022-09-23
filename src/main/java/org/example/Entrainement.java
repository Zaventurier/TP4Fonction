package org.example;

import java.util.Scanner;

/*Fichier sans rapport avec le TP4 - Fonctions*/
public class Entrainement {
    public static void main(String[] args) {
        /*On déclare un objet de type Scanner nommé sc*/
        Scanner sc = new Scanner(System.in);
        /*On déclare un objet de type Fonctions nommé f qui comntient tout les fonctions*/
        Fonctions f = new Fonctions();
        /*On déclare un tableau de caractère qui contient toutes les opérations possible*/
        char[] ope = new char[] {'+', '-', '/', '*', '^', '<', '>', '%'};
        /*La variable quitter de type boolean prend la valeur de false*/
        boolean quitter = false;

        while (!false) {
            System.out.print("Saisissez une opération (+,-,/,*,^, <, >, %) :");
            char operation = sc.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '/' || operation == '*' || operation == '^' || operation == '<'  || operation == '>' /*|| operation == '%'*/) {
                System.out.print("Saisir nombre 1 :");
                double nbr1 = sc.nextInt();
                System.out.print("Saisir nombre 2 :");
                double nbr2 = sc.nextInt();

                switch (operation) {
                    case '+':
                        System.out.println(f.Addition(nbr1, nbr2));
                        break;
                    case '-':
                        System.out.println(f.Soustraction(nbr1, nbr2));
                        break;
                    case '/':
                        if(f.Division(nbr1, nbr2) == 0){
                            System.out.println("ERREUR");
                            break;
                        }else{
                            System.out.println(f.Division(nbr1, nbr2));
                            break;
                        }
                    case'^':
                        System.out.println(f.Puissance(nbr1, nbr2));
                        break;

                    case '*':
                        System.out.println(f.Multiplication(nbr1, nbr2));
                        break;
                    case '<':
                        System.out.println(f.plusPetit(nbr1, nbr2));
                        break;
                    case '>':
                        System.out.println(f.plusGrand(nbr1, nbr2));
                        break;
                    case '%':
                        System.out.println("Calcul du pourçenage d'une remise entre " + nbr1 + " et " + nbr2 + " !");
                        System.out.println(nbr1 + " équivaut au prix initial.");
                        System.out.println(nbr2 + " équivaut au prix final.");
                        double montantRemise = f.Soustraction(nbr1, nbr2);
                        System.out.println("La remise est de : " +montantRemise);
                        double pourcentage = f.PourcentageRemise(montantRemise, nbr1);
                        System.out.println("Le pourçentage de réduction est de : " +pourcentage + " %");
                        break;
                }
                quitter = true;
                System.out.println("Fin");
                break;
            } else {
                quitter = true;
                System.out.println("ERREUR");
                break;
            }
        }
    }
}
