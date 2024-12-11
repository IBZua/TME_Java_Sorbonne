public abstract class SansPattes extends Animaux{
    public SansPattes(String nom, int age){
        super(nom, age);
    }
    public SansPattes(String nom){
        super(nom);
    }
    public abstract void crier();
}