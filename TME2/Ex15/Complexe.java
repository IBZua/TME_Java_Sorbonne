public class Complexe {
    private double reelle, imag;

    public Complexe(double reelle, double imag) {
        this.reelle = reelle;
        this.imag = imag;
    }

    public Complexe() {
        this.reelle = Math.random() * (2 + 2) - 2;
        this.imag = Math.random() * (2 + 2) - 2;
    }

    public String toString() {
        return "reelle " + reelle + " imag " + imag + "i";
    }

    public boolean estReel() {
        return imag == 0 ? true : false;
    }

    public Complexe Addition(Complexe c) {
        double reel = this.reelle + c.reelle;
        double ima = this.imag + c.imag;
        Complexe cf = new Complexe(reel, ima);
        return cf;
    }

    public Complexe Multiplication(Complexe c) {
        double reel = this.reelle * c.reelle - this.imag * c.imag;
        double ima = this.reelle * c.imag - this.imag * c.reelle;
        Complexe cf = new Complexe(reel, ima);
        return cf;
    }
}