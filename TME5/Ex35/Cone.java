public class Cone{
    private double r, h;
    private final double PI = 3.14159;
    private static int nbCones = 0;
    public Cone(double r, double h){
        this.r = r;
        this.h = h;
    }
    public Cone(){
        r = Math.random()*10;
        h = Math.random()*10;
    }
    public double getVolume(){
        return (PI*Math.pow(r,2)*h)/3;
    }
    public static int getnbCones(){
        return nbCones;
    }
    public String toString(){
        return "Cone r=" + String.format("%.2f", r) +"cm h=" + String.format("%.2f", h) +"cm de volume " + String.format("%.2f", getVolume()) + " cm3";
    }
}