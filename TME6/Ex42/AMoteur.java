public class AMoteur extends Vehicule{
    private int reservoir;
    private int niveauE;
    public AMoteur(String marque, int reservoir){
        super(marque);
        this.reservoir = reservoir;
    }
    public String toString(){
        return super.toString();
    }
    public void approvisionner(double nbLitres){
        niveauE += nbLitres;
    }
    public boolean enPanne(){
        if(niveauE == 0){
            return true;
        }
        return false;
    }
}