package exo.un;

import java.util.Scanner;

public class exo3 {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez les heures: ");
        int heures = clavier.nextInt();
        System.out.print("Entrez les minutes: ");
        int minutes = clavier.nextInt();
        System.out.print("Entrez les secodes: ");
        int secondes = clavier.nextInt();
        clavier.close();    

        int heuresSeconde = heures * 3600;
        int minutesSeconde = minutes * 60;

        int resFinal = 24*3600 - heuresSeconde + minutesSeconde + secondes;

        System.out.println("Il reste  "+ resFinal + " secondes avant minuit.");
    }
    
}
