public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bibliotheque biblio = new Bibliotheque();
    boolean exit = true;

    while (exit) {
        System.out.println("\nMenu:");
        System.out.println("1 - Ajouter un livre:");
        System.out.println("2 - Afficher les livres: ");
        System.out.println("3 - Rechercher un livre par ISBN: ");
        System.out.println("4 - Supprimer un livre: ");
        System.out.println("5 - Modifier un livre: ");
        System.out.println("6 - Quitter\n=> ");

        int CH = scanner.nextInt();
        scanner.nextLine(); // Consomme la nouvelle ligne

        switch (CH) {
            case 1:
                System.out.print("Entrez le titre: ");
                String titre = scanner.nextLine();
                System.out.print("Entrez l'auteur: ");
                String auteur = scanner.nextLine();
                System.out.print("Entrez l'ISBN: ");
                String ISBN = scanner.nextLine();
                System.out.print("Disponible (1-oui/2-non): ");
                int ch = scanner.nextInt();
                boolean disponibilite = (ch == 1);
                biblio.ajouter(titre, auteur, ISBN, disponibilite);
                break;
            case 2:
                biblio.afficher();
                break;
            case 3:
                System.out.print("Entrer l'ISBN du livre à rechercher: ");
                String isbnRecherche = scanner.nextLine();
                biblio.recherche(isbnRecherche);
                break;
            case 4:
                System.out.println("Au revoir!");
                exit = false; // Mettre exit à false pour sortir de la boucle
                break;
            default:
                System.out.println("Le choix est invalide!!");
        }
    }

    scanner.close(); // Fermer le scanner .
}
