class Livre {


    String titre;
    String auteur;
    String isbn;
    boolean disponibilite;

    public Livre(String titre, String auteur, String isbn, boolean disponibilite) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponibilite = disponibilite;
    }

    @Override
    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", ISBN: " + isbn + ", Disponible: " + (disponibilite ? "Oui" : "Non");
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean estdisponibilite() {
        return disponibilite;
    }
}





