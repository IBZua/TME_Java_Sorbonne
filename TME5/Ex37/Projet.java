public class Projet{
    private String nom;
    private Trio t;
    public Projet(String nom){
        this.nom = nom;
        t = new Trio();
    }
    public String toString(){
        return "Projet " + nom + " " + t;
    }
}