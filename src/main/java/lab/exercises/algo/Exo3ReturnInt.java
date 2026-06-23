public class Exo3ReturnInt {
    

    // À TOI DE JOUER : Crée une méthode 'additionner'
    // Elle prend deux entiers en paramètres (int a, int b)
    // Elle doit RENVOYER (return) la somme des deux. Attention, son type n'est plus void, mais int !
    public static int additionner(int a, int b) {
        return a  + b; 
    }


    public static void main(String[] args) {
        // Appelle ta méthode et stocke son résultat dans une variable
        int resultat = additionner(5, 10);
        // int resultat = additionner(5, 10);
        // Affiche ensuite ce résultat.
        System.out.println(resultat);
    }
}

