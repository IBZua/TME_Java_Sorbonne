public class Piano extends Instrument{
    private int nbTouches;
    public Piano(int nbTouches, int poids, int prix){
        super(nbTouches, nbTouches);
        this.nbTouches = nbTouches;
    }
    public String toString(){
        return "Piano " + nbTouches + " touches " + super.toString();
    }
    public void jouer()[
        System.out.println("Le piano joue"); 
    ]
}
