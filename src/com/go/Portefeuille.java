package com.go;

import java.util.ArrayList;
import java.util.Scanner;

public class Portefeuille {
    private ArrayList<Action> actions;
    private ArrayList<Obligation> obligations;

    // Constructeur de la classe Portefeuille
    public Portefeuille() {
        actions = new ArrayList<>();
        obligations = new ArrayList<>();
    }

    // Méthode pour ajouter une action au portefeuille
    public void ajouterAction(Action action) {
        actions.add(action);
    }

    // Méthode pour ajouter une obligation au portefeuille
    public void ajouterObligation(Obligation obligation) {
        obligations.add(obligation);
    }

    public void supprimerElement(String nom) {
        // Parcourir la liste des actions
        for (int i = 0; i < actions.size(); i++) {
            if (actions.get(i).getNom().equals(nom)) {
                actions.remove(i);
                System.out.println("L'action " + nom + " a été supprimée !");
                return;
            }
        }

        // Parcourir la liste des obligations
        for (int i = 0; i < obligations.size(); i++) {
            if (obligations.get(i).getNom().equals(nom)) {
                obligations.remove(i);
                System.out.println("L'obligation " + nom + " a été supprimée !");
                return;
            }
        }

        // Si on arrive ici, l'élément n'a pas été trouvé
        System.out.println("Aucun élément ne porte le nom " + nom + " !");
    }

    public void supprimerPortefeuille() {
        actions.clear();
        obligations.clear();
    }

    // Méthode pour afficher le contenu du portefeuille
    public void afficherPortefeuille() {
        System.out.println("Actions :");
        for (Action action : actions) {
            System.out.println(action);
        }

        System.out.println("Obligations :");
        for (Obligation obligation : obligations) {
            System.out.println(obligation);
        }
    }

    // Méthode main pour lancer le programme
    public static void main(String[] args) {
        Portefeuille portefeuille = new Portefeuille();
        Scanner scanner = new Scanner(System.in);

        boolean quitter = false;
        while (!quitter) {
            System.out.println("Que souhaitez-vous faire ?");
            System.out.println("1 - Ajouter une action");
            System.out.println("2 - Ajouter une obligation");
            System.out.println("3 - Afficher le portefeuille");
            System.out.println("4 - Supprimer un élément du portefeuille");
            System.out.println("5 - Supprimer le portefeuille");
            System.out.println("6 - Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    // Saisir les informations de l'action à ajouter
                    System.out.println("Nom de l'action :");
                    String nomAction = scanner.nextLine();

                    System.out.println("Prix de l'action :");
                    double prixAction = scanner.nextDouble();

                    System.out.println("Quantité d'actions :");
                    int quantiteAction = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Entreprise :");
                    String entreprise = scanner.nextLine();

                    System.out.println("Dividende :");
                    double dividende = scanner.nextDouble();

                    // Créer l'action avec les informations saisies et l'ajouter au portefeuille
                    Action action = new Action(nomAction, prixAction, quantiteAction, entreprise, dividende);
                    portefeuille.ajouterAction(action);
                    break;
                case 2:
                    // Saisir les informations de l'obligation à ajouter
                    System.out.println("Nom de l'obligation :");
                    String nomObligation = scanner.nextLine();

                    System.out.println("Prix de l'obligation :");
                    double prixObligation = scanner.nextDouble();

                    System.out.println("Quantité d'obligations :");
                    int quantiteObligation = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Durée :");
                    int duree = scanner.nextInt();

                    System.out.println("Taux d'intérêt :");
                    double tauxInteret = scanner.nextDouble();

                    // Créer l'obligation avec les informations saisies et l'ajouter au portefeuille
                    Obligation obligation = new Obligation(nomObligation, prixObligation, quantiteObligation, duree, tauxInteret);
                    portefeuille.ajouterObligation(obligation);
                    break;
                case 3:
                    // Afficher le contenu du portefeuille
                    portefeuille.afficherPortefeuille();
                    break;
                case 4:
                    // Supprimer un élément du portefeuille
                    System.out.println("Entrez le nom de l'élément à supprimer :");
                    String nom = scanner.nextLine();
                    portefeuille.supprimerElement(nom);
                    break;
                case 5:
                    // Supprimer le portefeuille
                    portefeuille.supprimerPortefeuille();
                    System.out.println("Le portefeuille a été supprimé !");
                    break;
                case 6:
                    // Quitter le programme
                    quitter = true;
                    System.out.println("Au revoir !");
                    break;
                default:
                    // Afficher un message d'erreur si le choix est invalide
                    System.out.println("Choix invalide !");
                    break;
            }
        }

        scanner.close();
    }
}
