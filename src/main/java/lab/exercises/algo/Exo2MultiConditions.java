public class Exo2MultiConditions {
    public static void main(String[] args) {
        int note = 14; // Note sur 20

        // À TOI DE JOUER :
        // Si note >= 16 -> "Très bien"
        // Si note >= 12 et < 16 -> "Assez bien"
        // Si note >= 10 et < 12 -> "Moyen"
        // Sinon -> "Insuffisant"
        switch (true) {
            case note >= 16:
                System.out.println("Très bien");
                break;
            case note >= 12 && note < 16: 
                System.out.println("Assez bien");
                break;
            case note >= 10 && note < 12: 
                System.out.println("Moyen");
                break;
            default:
                System.out.println("Insuffisant");     
        }
    }
}
