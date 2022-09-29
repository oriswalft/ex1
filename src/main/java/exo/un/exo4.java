package exo.un;

public class exo4 {
    public static void main(String[] args) {
        int heures = 12 * 3600;
        int minutes = 34 * 60;
        int secondes = 56;
        float tempsDebut = heures + minutes + secondes;

        int heuresFin = 15 * 3600;
        int minutesFin = 27 * 60;
        int secondesFin = 12;
        float  tempsFin = heuresFin + minutesFin + secondesFin;

        float tempsEcouleDebut = 24*3600-tempsDebut; 
        float  tempsEcouleFin = 24*3600-tempsFin;

        float resFinal = tempsEcouleFin * 100 / tempsEcouleDebut;
        System.out.println(resFinal+"%");
    
    }
}
