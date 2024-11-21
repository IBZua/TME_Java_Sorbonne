public class Pile{
    private Assiette[] tab;
    private int nbA;
    public Pile(int tailleMax){
        tab = new Assiette[tailleMax];
    }
    public boolean estVide(){
        if(nbA == 0){
            return true;
        }
        return false;
    }
    public boolean estPleine(){
        if(nbA == tab.length){
            return true;
        }
        return false;
    }
    public void empiler(Assiette a){
        if(!estPleine()){
            tab[nbA] = a;
            nbA++;
        }
    }
    public Assiette depiler(){
        if(!estVide()){
            nbA--;
            Assiette a = tab[nbA];
            tab[nbA] = null;
            return a;
        }
        return null;
    }
    public String toString(){
        String s = "";
        for(Assiette a : tab){
            s += a + "\n";
        }
        return s;
    }
}