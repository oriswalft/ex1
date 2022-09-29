package exo.un;

public class App {
    
    public static void main(String[] args) {
        int heures = 12;
        int minutes = 34;
        int secondes = 56;
        
        int heuresSeconde = heures * 3600;
        int minutesSeconde = minutes * 60;

        int resFinal = heuresSeconde + minutesSeconde + secondes;

        System.out.println("Il s'est écoulé "+ resFinal + " secondes depuis minuit.");
    }
    
}
