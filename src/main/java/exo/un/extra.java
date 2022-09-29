package exo.un;

import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
    
        int salaire = 400;
        int prime = 250;
        int quota = 10;

        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez votre nombre de vente: ");
        int nbVentes = clavier.nextInt();
        clavier.close();

        if (nbVentes >= quota) {
            salaire = salaire + prime; 
            System.out.println("Félicitations! Vous avez rempli le quota");
        }    
        else {
            int venteNecessaire = quota - nbVentes;
            System.out.println("Il vous manque "+ venteNecessaire +" ventes pour atteindre le quota.");
        }
        System.out.println("Votre salaire est de: "+ salaire);
    }
}
