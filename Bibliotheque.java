import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres = new ArrayList<>();


    public void ajouter(String titre, String auteur, String isbn, boolean disponibilite) {
        livres.add(new Livre(titre, auteur, isbn, disponibilite));
        System.out.println("Le livre est  ajouter ! ");
    }

    public void afficher() {
        for (int i = 0; i < livres.size(); i++) {
            System.out.println(livres);
        }
    }

    public Livre recherche(String isbn) {
        for (Livre livre : livres) {
            if (livre.getIsbn().equals(isbn)) {
                System.out.println("Le livre est trouvé : " + livre);
                return livre;
            }
        }
        System.out.println("Aucun livre trouvé avec  ce ISBN :" + isbn);
        return null;
    }

    public void supprimer(String isbn) {
        for (int i = 0; i < livres.size(); i++) {
            if (livres.get(i).getIsbn().equals(isbn)) {
                livres.remove(i);
                System.out.println("Le liver avec l'ISBN" + isbn + "a été supprimé");
                return ;
            }
            System.out.println("Aucun livre à ce ISBN :" + isbn);
            return ;
        }


    }

}

