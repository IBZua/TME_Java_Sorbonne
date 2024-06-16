public class Roue {
    private int diametre;

    public Roue(int diametre) {
        this.diametre = diametre;
    }

    public Roue() {
        this(60);
    }

    public int getDiametre() {
        return diametre;
    }

    public String toString() {
        return "diametre: " + this.getDiametre();
    }
}
