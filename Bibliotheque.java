import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres = new ArrayList<>();
    public void ajouter(String titre, String auteur, String isbn, boolean disponibilite) {
        livres.add(new Livre(titre, auteur, isbn, disponibilite));
        System.out.println("Le livre est  ajouter ! ");
    }
    public void afficher() {
        if (livres.isEmpty()) {
            System.out.println("aucun livre !!!");
            return;
        }
        for (int i = 0; i < livres.size(); i++) {
            Livre livre = livres.get(i);
            System.out.println("= la listes des livres =");
            System.out.println("Titre : " + livre.titre);
            System.out.println("Auteur : " + livre.auteur);
            System.out.println("ISBN : " + livre.isbn);
            if (livre.disponibilite) {
                System.out.println("le liver est disponible.");
            }else System.out.println("le liver n'est pas disponible. ");
        }

    }
}