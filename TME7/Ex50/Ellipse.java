public class Ellipse extends Figure2D{
    private double a;
    private double b;
    public Ellipse(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double surface(){
        return Math.PI * a * b;
    }
    public double perimetre(){
        return 2*Math.PI*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2);
    }
}