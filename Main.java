import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bibliotheque biblio = new Bibliotheque();
    boolean exit = true;

    while (exit) {
        System.out.println("\n Menu:");
         System.out.println("1 - Ajouter un livre");
        System.out.println("2 - Afficher les livres");
        System.out.print("3 - Quitter\n=> ");
        int CH = scanner.nextInt();
        scanner.nextLine();

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
                //boolean disponibilite = scanner.nextBoolean();
                boolean disponibilite;
                if (ch == 1) {
                    disponibilite = true;
                } else disponibilite = false;
                biblio.ajouter(titre, auteur, ISBN, disponibilite);
                break;
            case 2:
                biblio.afficher();
                break;
            case 3:
                System.out.println("Au revoir!");
                scanner.close();
                exit = false;
                break;
            default:
                System.out.println("Le choix est invalide!!");
        }
    }
}



