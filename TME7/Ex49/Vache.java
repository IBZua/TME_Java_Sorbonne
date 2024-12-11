public class Vache extends APattes{
    private int qLait;
    public Vache(String nom, int age){
        super(nom, age, 4);
        qLait = (int) (Math.random()*(30-5)+5);
    }
    public Vache(String nom){
        super(nom, 4);
        qLait = (int) (Math.random()*(30-5)+5);
    }
    public String toString(){
        return "Vache " + super.toString() + " produit " + qLait + " litres de lait";
    }
    public void crier(){
        System.out.println("La vache meugle");
    }
}