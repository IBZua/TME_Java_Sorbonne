public class Point {
    private int posx;
    private int posy;

    public Point(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }

    public Point() {
        posx = (int) (Math.random() * 10);
        posy = (int) (Math.random() * 10);
    }

    public Point(Point p) {
        this.posx = p.posx;
        this.posy = p.posy;
    }

    public String toString() {
        return "(" + posx + ", " + posy + ")";
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.posx - this.posx,2) + Math.pow(p.posy - this.posy,2));
    }

    public void deplaceToi(int newx, int newy) {
        posx = newx;
        posy = newy;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
}
