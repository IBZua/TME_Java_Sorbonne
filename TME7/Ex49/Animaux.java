public abstract class Animaux{
    private String nom;
    private int age;
    public Animaux(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    public Animaux(String nom){
        this.nom = nom;
        this.age = 1;
    }
    public String toString(){
        return "Animal: " + nom + " " + age + " ans";
    }
    public void vieillir(){
        age++;
    }
    public abstract void crier();
}