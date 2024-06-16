public class Coureur {
    private int numDossard;
    private double tempsAu100;
    private boolean possedeTemoin;

    Coureur(int numDossard) {
        this.numDossard = numDossard;
        tempsAu100 = Math.random() * (16 - 12) + 12;
        possedeTemoin = false;
    }

    Coureur() {
        this((int) (Math.random() * (1000)));
    }

    public String toString() {
        return "Coureur " + numDossard + " tempsAu100 : " + tempsAu100 + "s au 100m possedeTemoin : "
                + (possedeTemoin ? "oui" : "non");
    }

    public int getNumDossard() {
        return numDossard;
    }

    public double getTempsAu100() {
        return tempsAu100;
    }

    public boolean getPossedeTemoin() {
        return possedeTemoin;
    }

    void setPossedeTemoin(boolean possedeTemoin) {
        possedeTemoin = !possedeTemoin;
    }

    void passeTemoin(Coureur c) {
        System.out.println(
                "moi, coureur " + this.getNumDossard() + ", je passe le témoin au coureur " + c.getNumDossard());
    }

    void courir() {
        System.out.println("je suis le coureur " + getNumDossard() + " et je cours");
    }
}
