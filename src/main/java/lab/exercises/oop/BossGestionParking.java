public class BossGestionParking {
    import java.util.ArrayList;

// 1. CLASSE MÈRE
class VehiculeParking {
    private String plaque;
    private double tarifDeBase = 5.0; // Prix fixe pour stationner

    public VehiculeParking(String plaque) {
        this.plaque = plaque;
    }

    public String getPlaque() { return plaque; }

    // Méthode polymorphe qui sera calculée différemment selon le véhicule
    public double calculerPrix() {
        return tarifDeBase;
    }
}

// 2. CLASSES FILLES (À TOI DE JOUER)
// Crée la classe 'VoitureParking' qui hérite de VehiculeParking.
// Redéfinis calculerPrix() : Le prix d'une voiture c'est tarifDeBase + 2.0€.



// Crée la classe 'CamionParking' qui hérite de VehiculeParking.
// Redéfinis calculerPrix() : Le prix d'un camion c'est tarifDeBase * 3 (gros gabarit !).



// 3. LE PARKING (LE GESTIONNAIRE)
class Parking {
    // Une liste qui peut contenir n'importe quel type de véhicule grâce au polymorphisme
    private ArrayList<VehiculeParking> places = new ArrayList<>();

    public void GarerVehicule(VehiculeParking v) {
        places.add(v);
        System.out.println("Véhicule matriculé " + v.getPlaque() + " garé.");
    }

    // À TOI DE JOUER : Complète cette méthode
    public void afficherRecettesTotales() {
        double total = 0;
        // Fais une boucle sur tous les véhicules présents dans la liste 'places'
        // Additionne le prix de chacun dans la variable 'total' via calculerPrix()
        
        System.out.println("Recettes totales du parking : " + total + "€");
    }
}

// 4. LE MAIN POUR TESTER
public class BossGestionParking {
    public static void main(String[] args) {
        Parking monParking = new Parking();

        // À TOI DE JOUER :
        // 1. Instancie une VoitureParking (ex plaque: "AA-123-AA")
        // 2. Instancie un CamionParking (ex plaque: "BB-456-BB")
        // 3. Gare-les tous les deux dans 'monParking' via GarerVehicule()
        // 4. Appelle afficherRecettesTotales(). Le résultat attendu doit être 22.0€ (7€ pour la voiture + 15€ pour le camion).
        
    }
}
}
