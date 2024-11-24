public class Guitare extends Instrument{
    private String type;
    public Guitare(String type, int prix, int poids){
        super(poids, prix);
        this.type = type;
    }
    public String toString(){
        return "Guitare : la guitare " + type + super.toString();  
    }
    public void jouer(){
        System.out.println("La guitare " + type + " joue");
    }
}
