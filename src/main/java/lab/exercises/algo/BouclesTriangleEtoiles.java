public class BouclesTriangleEtoiles {
    public static void main(String[] args) {
        // Consigne : affiche un triangle d'étoiles en N lignes avec une boucle imbriquée.
        int N = 5; // Nombre de lignes du triangle
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Passer à la ligne suivante
        }
    }
}