public class Rectangle extends Figure2D{
    private double longueur;
    private double largeur;
    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double surface(){
        return longueur*largeur;
    }
    public double perimetre(){
        return longueur*2 + largeur*2;
    }
}