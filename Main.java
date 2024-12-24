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
                biblio.ajouter();
                break;
            case 2:
                for (Livre livre :biblio.afficher() ) {
           System.out.println(livre);
      }
                break;
            case 3:
                System.out.print("Entrer l'ISBN du livre à rechercher: ");
                String isbnRecherche = scanner.nextLine();
                biblio.recherche(isbnRecherche);
                break;
            case 4:
                System.out.print("Entrer l'ISBN du livre à supprimer: ");
                String isbnSupprimer = scanner.nextLine();
                biblio.supprimer(isbnSupprimer);
                break;
            case 5:
                System.out.print("Entrer l'ISBN du livre à modifier: ");
                String isbnModifier = scanner.nextLine();

                System.out.print("Entrez le nouveau titre: ");
                String nouveauTitre = scanner.nextLine();

                System.out.print("Entrez le nouvel auteur: ");
                String nouvelAuteur = scanner.nextLine();

                System.out.print("Disponible (1-oui/2-non): ");
                int choixDisponibilite = scanner.nextInt();
                boolean nouvelleDisponibilite = (choixDisponibilite == 1);

                biblio.modifier(isbnModifier, nouveauTitre, nouvelAuteur, nouvelleDisponibilite);
                break;
            case 6:
                System.out.println("Au revoir!");
                exit = false; // Mettre exit à false pour sortir de la boucle
                break;
            default:
                System.out.println("Le choix est invalide!!");
        }
    }

    scanner.close(); // Fermer le scanner .
}
