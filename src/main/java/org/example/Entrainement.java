package org.example;

import java.util.Scanner;

/*Fichier sans rapport avec le TP4 - Fonctions*/
public class Entrainement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        boolean quitter = false;
        double resultat = 0;

        while (!false) {
            System.out.print("Saisissez une opération (+,-,/,*,^) :");
            char operation = sc.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '/' || operation == '*' || operation == '^') {
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
                }
                quitter = true;
            } else {
                quitter = true;
                System.out.println("Fin");
            }
        }
    }
}
