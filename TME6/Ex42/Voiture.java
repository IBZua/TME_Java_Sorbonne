public class Voiture extends AMoteur{
    private int nbPlaces;
    public Voiture(String marque, int reservoir, int nbPlaces){
        super(marque, reservoir);
        this.nbPlaces = nbPlaces;
    }
    public String toString(){
        return "Voiture " + super.toString();
    }
    public void transporter(int nbPers, int km){
        if(this.enPanne()){
            System.out.println("La voiture " + id + " n'a plus d'essence");
        }else{
            distance += km;
            System.out.println("");
        }
    }
}