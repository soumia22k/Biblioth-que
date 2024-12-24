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

    public Livre() {
    }

    @Override
    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", ISBN: " + isbn + ", Disponible: " + (disponibilite ? "Oui" : "Non");
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
}





