package Personne;
public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private char sexe;

    public Personne() {
        this.nom = "Ben";
        this.prenom = "medali";
        this.age = 30;
        this.sexe = 'M';
    }
    public Personne(String nom, String prenom, int age, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getAge() {
        return this.age;
    }

    public char getSexe() {
        return this.sexe;
    }
    public void affiche() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prénom : " + this.prenom);
        System.out.println("Age : " + this.age);
        System.out.println("Sexe : " + this.sexe);
    }

    public boolean sameLastName(Personne p) {
        return this.nom.equals(p.nom);
    }
}



public class Personne {
    public static void main(String[] args) {

        Personne p1 = new Personne();
        Personne p2 = new Personne("ali", "ahmed", 25, 'M');

        System.out.println("Personne 1 :");
        p1.affiche();

        System.out.println("\nPersonne 2 :");
        p2.affiche();
        if (p1.sameLastName(p2)) {
            System.out.println("\nLes deux personnes ont le même nom.");
        } else {
            System.out.println("\nLes deux personnes n'ont pas le même nom.");
        }

        if (p1.getAge() > p2.getAge()) {
            System.out.println("La personne 1 est la plus âgée.");
        } else if (p2.getAge() > p1.getAge()) {
            System.out.println("La personne 2 est la plus âgée.");
        } else {
            System.out.println("Les deux personnes ont le même âge.");
        }
    }
}