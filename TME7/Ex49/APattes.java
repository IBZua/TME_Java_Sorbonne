public abstract class APattes extends Animaux{
    protected int nbPattes;
    public APattes(String nom, int age, int nbPattes){
        super(nom, age);
        this.nbPattes = nbPattes;
    }
    public APattes(String nom, int nbPattes){
        super(nom);
        this.nbPattes = nbPattes;
    }
}