public class Tracteur {
    private Roue r1;
    private Roue r2;
    private Roue r3;
    private Roue r4;
    private Cabine c;

    public Tracteur(Roue r1, Roue r2, Roue r3, Roue r4, Cabine c) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
        this.c = c;
    }

    public Tracteur(Tracteur t) {
        this.c = new Cabine(t.c.getVolume(), t.c.getCouleur());
        this.r1 = new Roue(t.r1.getDiametre());
        this.r2 = new Roue(t.r2.getDiametre());
        this.r3 = new Roue(t.r3.getDiametre());
        this.r4 = new Roue(t.r4.getDiametre());
    }

    public void peindre(String couleur) {
        c.setCouleur(couleur);
    }

    public String toString() {
        return "tracteur: " + r1.toString() + r2.toString() + r3.toString() + r4.toString() + c.toString();
    }
}