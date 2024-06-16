public class Villageois {
    String nom;
    double poids;
    boolean malade;

    public Villageois(String nomVillageois) {
        nom = nomVillageois;
        poids = Math.random() * (150 - 50) + 50;
        malade = Math.random() < 0.2;
    }

    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    public boolean getMalade() {
        return malade;
    }

    public double poidsSouleve() {
        return malade ? poids / 4 : poids / 3;
    }

    public String toString() {
        return "villageois : " + nom + ", poids : " + String.format("%.2f", poids) + " kg, malade : "
                + (malade ? "oui" : "non") + ", peut soulever " + String.format("%.2f", poidsSouleve()) + "kg ";
    }
}
