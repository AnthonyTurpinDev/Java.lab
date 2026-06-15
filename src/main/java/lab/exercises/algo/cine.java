package lab.exercises.algo;

public class cine {
    public static void main(String[] args) {
        String film = "Star Wars";
        String categorie = cine.categorieDeFilm(film);
        System.out.println("Le film " + film + " appartient à la catégorie " + categorie);
    }



    public static String categorieDeFilm(final String film) {
      var resultat = switch (film) {
        case "Star Wars" -> "Science fiction";
        case "Blanche neige", "La petite sirène" -> "Disney";
        case "Indiana Jones" -> {
            String categorie = "Aventure";
            yield categorie;
        }
        default -> "Inconnu";
      };
      return resultat;
    }
    
}
