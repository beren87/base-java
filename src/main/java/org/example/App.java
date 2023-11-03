package org.example;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        sumTwoValues(3, 3);
        showMaxValue(4, 3);
        saisieNote();
    }

    // somme de deux valeurs
    public static void sumTwoValues(int valueOne, int valueTwo)
    {
        // +, -, /, %, *
        int sum = valueOne + valueTwo;
        System.out.println(sum);
    }

    public static void showMaxValue(int nextValueOne, int nextValueTwo)
    {
        //afficher la valeur la plus élevée
        if (nextValueOne > nextValueTwo){
            System.out.println(nextValueOne);
        } else if(nextValueTwo > nextValueOne){
            System.out.println(nextValueTwo);
        }else {
            System.out.println("même valeur");
        }
    }
    public static void saisieNote()
    {
        //Ensemble de valeur
        //0,1,2,3,4,5,6,7,8,9

        //Scanner sc = lire les entrées qu'on va faire dans la console
        Scanner sc = new Scanner(System.in);
        System.out.print("entrez le nombre d'élève : ");
        int nombreEleve = sc.nextInt();

        // boucle for : quand vous savez que le nombre de fois que vous voulez iterer
        // boucle while : Vous ne savez pas combien de fois vous voulez iterer
            // de ce fait, vous donnez une condition et tant qu'elle est vrai, on continue
        //boucle do while : d'abord on fait, ensuite on vérifie

        double sum = 0.0;

        for (int i = 0; i<nombreEleve; i++){
            System.out.print("Entrez votre note : ");
            sum = sum + sc.nextFloat();
        }

        double resultat = sum / nombreEleve;

        System.out.println(resultat);
    }

}
