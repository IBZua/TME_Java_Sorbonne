public class Assiette{
    private int diametre;
    public Assiette(int diametre){
        this.diametre = diametre;
    }
    public Assiette(){
        diametre = 26;
    }
    public String toString(){
        return "Assiette " + diametre + " cm";
    }
}