import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres = new ArrayList<>();
    public void ajouter(String titre, String auteur, String isbn, boolean disponibilite) {
        livres.add(new Livre(titre, auteur, isbn, disponibilite));
        System.out.println("Le livre est  ajouter ! ");
    }
