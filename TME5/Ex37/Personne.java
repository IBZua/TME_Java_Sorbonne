public class Personne{
    private String nom;
    private static int nbPersonnes = 0;
    private static char Lettre;
    public Personne(){
        Lettre = (char)('A' + nbPersonnes);
        nom  = "Inidividu" + Lettre;
        nbPersonnes+=1;
    }
    public static int getNbPersonnes(){
        return nbPersonnes;
    }
    public String toString(){
        return nom;
    }
    public static int getnbPersonnes(){
        return nbPersonnes;
    }
}