import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bibliotheque {
    private List<Livre> livres = new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public void ajouter() {
        System.out.print("Entrez le titre: ");
        String titre = scanner.nextLine();
        System.out.print("Entrez l'auteur: ");
        String auteur = scanner.nextLine();
        System.out.print("Entrez l'ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Disponible (1-oui/2-non): ");
        int ch = scanner.nextInt();
        boolean disponibilite = (ch == 1);
        Livre livre=new Livre (titre,auteur,ISBN,disponibilite);
        livres.add(livre);
        System.out.println("Le livre est  ajouter ! ");
    }


    public List<Livre> afficher(){
        return livres;
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
                System.out.println("Le liver avec l'ISBN  " + isbn + "  a été supprimé ");
                return ;
            }
            System.out.println("Aucun livre à ce ISBN :" + isbn);
            return ;
        }
    }

    public void modifier(String isbn, String nouveauTitre, String nouvelAuteur, boolean nouvelleDisponibilite) {
        for (Livre livre : livres) {
            if (livre.getIsbn().equals(isbn)) {
                livre.setTitre(nouveauTitre);
                livre.setAuteur(nouvelAuteur);
                livre.setDisponibilite(nouvelleDisponibilite);
                System.out.println("Le livre avec l'ISBN " + isbn + " a été modifié.");
                return;
            }
        }
        System.out.println("Aucun livre trouvé avec cet ISBN : " + isbn);
    }
}

