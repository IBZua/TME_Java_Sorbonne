public abstract class Vehicule {
    private static int cpt;
    protected final int id;
    protected String marque;
    protected int distance;
    public Vehicule(String marque){
        id = cpt;
        cpt++;
        this.marque = marque;
        distance = 0;
    }
    public String toString(){
        return id + " de marque " + marque;
    }
    public void rouler(double distance){
        this.distance += distance;
        System.out.println(this.toString() + " a roulé " + distance + "km");
    }
    public abstract void transporter(){}
}
