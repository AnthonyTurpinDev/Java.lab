package lab.exercises.algo;

public class donne {
    public static void main (String[] args) {
        donne.commenteLaMeteo("") ; 

    }
    public static void commenteLaMeteo (final String meteo) {
        switch (meteo) {
            case "soleil":
                System.out.println("Il fait beau");
                break;
            case "pluie":
                System.out.println("Il pleut");
                break;
            case "neige":
                System.out.println("Il neige");
                break;
            default:
                System.out.println("Météo inconnue");
        }
    }
}
