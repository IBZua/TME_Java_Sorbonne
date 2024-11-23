public class Trio{
    private static int cpt = 0;
    private int num;
    private Personne[] personnes;
    public Trio(){
        cpt++;
        this.num = cpt;
        this.personnes = new Personne[3];
        for(int i = 0; i < 3; i++){
            this.personnes[i] = new Personne();
        }
    }
    public String toString(){
        String res = "Trio " + num + ":";
        for(Personne p : personnes){
            res += p + " ";
        }
        return res;
    }
    public static int getcpt(){
        return cpt;
    }
}