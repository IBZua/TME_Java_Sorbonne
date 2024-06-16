public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle() {
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }

    public Triangle(Triangle t) {
        this.p1 = new Point(t.p1);
        this.p2 = new Point(t.p2);
        this.p3 = new Point(t.p3);
    }

    public Point getPoint1() {
        return p1;
    }

    public Point getPoint2() {
        return p2;
    }

    public Point getPoint3() {
        return p3;
    }

    public String toString() {
        return "{(" + p1.getPosx() + "," + p1.getPosy() + "),(" + p2.getPosx() + "," + p2.getPosy() + "),("
                + p3.getPosx() + "," + p3.getPosy() + ")}";
    }

    public double getPerimetre() {
        return this.p1.distance(this.p2) + this.p2.distance(this.p3)
                + this.p3.distance(this.p1);
    }
}
