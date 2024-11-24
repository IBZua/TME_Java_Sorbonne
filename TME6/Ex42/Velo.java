public class Velo extends SansMoteur{
    private int vitesse;
    public Velo(String marque, int vitesse){
        super(marque);
        this.vitesse = vitesse;
    }
    public String toString(){
        return "Velo " + super.toString() + " " + vitesse + " vitesses";
    }
    public String transporter(String depart, String arrivee){
        return "Le vélo " + id + " se déplace de " + depart + " à " + arrivee;
    }
}