public class Boa extends SansPattes{
    public Boa(String nom, int age){
        super(nom, age);
    }
    public Boa(String nom){
        super(nom);
    }
    public abstract void crier(){
        System.out.println("Le Boa siffle");
    }
}