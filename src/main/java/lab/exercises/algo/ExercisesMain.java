package lab.exercises.algo;

public class ExercisesMain {

    public static void main(String[] args) {
        exercice1CompteurDeNotes();
        exercice2PhraseMystere();
        exercice3A5Inventaire();
        exercice6A7Polymorphisme();
        exercice8A10ExceptionsEtBonus();
    }

    public static void exercice1CompteurDeNotes() {
        System.out.println("=== Exercice 1 : Le compteur de notes ===");
        int[] notes = {15, 8, 12, 4, 18, 10};
        int somme = 0;
        int compteSup10 = 0;

        for (int note : notes) {
            somme += note;
            if (note >= 10) {
                compteSup10++;
            }
        }

        double moyenne = (double) somme / notes.length;
        System.out.printf("Moyenne des notes : %.2f%n", moyenne);
        System.out.println("Nombre de notes >= 10 : " + compteSup10);
        System.out.println();
    }

    public static String transformePhrase(String phrase) {
        if (phrase.contains("java")) {
            return phrase.toUpperCase();
        }
        return phrase.toLowerCase();
    }

    public static void exercice2PhraseMystere() {
        System.out.println("=== Exercice 2 : La phrase mystère ===");
        String phrase1 = "J'adore java";
        String phrase2 = "Hello World";

        System.out.println("Entrée : " + phrase1);
        System.out.println("Sortie : " + transformePhrase(phrase1));
        System.out.println("Entrée : " + phrase2);
        System.out.println("Sortie : " + transformePhrase(phrase2));
        System.out.println();
    }

    public static void exercice3A5Inventaire() {
        System.out.println("=== Exercice 3/4/5 : Inventaire de jeux ===");
        Inventaire inventaire = new Inventaire();

        try {
            inventaire.ajouterJeu(new Jeu("Minecraft", GenreJeu.AVENTURE));
            inventaire.ajouterJeu(new Jeu("FIFA 24", GenreJeu.SPORT));
            inventaire.ajouterJeu(new Jeu("The Witcher 3", GenreJeu.RPG));
        } catch (JeuInvalideException e) {
            System.err.println("Erreur lors de l'ajout d'un jeu : " + e.getMessage());
        }

        inventaire.afficherJeux();

        Jeu jeuTrouve = inventaire.trouverJeuParTitre("FIFA 24");
        System.out.println("Jeu trouvé : " + (jeuTrouve != null ? jeuTrouve : "Introuvable"));
        System.out.println();
    }

    public static void exercice6A7Polymorphisme() {
        System.out.println("=== Exercice 6/7 : Héritage et polymorphisme ===");
        Inventaire inventaire = new Inventaire();

        try {
            inventaire.ajouterJeu(new Jeu("Minecraft", GenreJeu.AVENTURE));
            inventaire.ajouterJeu(new JeuVideo("FIFA 24", GenreJeu.SPORT, 16));
            inventaire.ajouterJeu(new Jeu("The Witcher 3", GenreJeu.RPG));
        } catch (JeuInvalideException e) {
            System.err.println("Erreur lors de l'ajout d'un jeu : " + e.getMessage());
        }

        inventaire.afficherJeux();
        System.out.println();
    }

    public static void exercice8A10ExceptionsEtBonus() {
        System.out.println("=== Exercice 8/9/10 : Exceptions et bonus ===");
        Inventaire inventaire = new Inventaire();

        try {
            inventaire.ajouterJeu(new Jeu("Minecraft", GenreJeu.AVENTURE));
            inventaire.ajouterJeu(new Jeu("Minecraft", GenreJeu.AVENTURE));
            inventaire.ajouterJeu(new JeuVideo("FIFA 24", GenreJeu.SPORT, 18));
            inventaire.ajouterJeu(new Jeu(null, GenreJeu.RPG));
        } catch (JeuInvalideException e) {
            System.err.println("Exception métier capturée : " + e.getMessage());
        }

        inventaire.afficherJeux();
        System.out.println("(Les doublons sont ignorés car l'inventaire utilise un Set.)");
        System.out.println();
    }
}
