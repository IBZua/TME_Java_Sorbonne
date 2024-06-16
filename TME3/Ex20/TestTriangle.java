public class TestTriangle {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point();
        Point p3 = new Point();
        System.out.println("p1: " + p1 + " p2 " + p2 + " distance: " + p1.distance(p2));
        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println("triangle t1: " + t1.toString() + " perimetre: " + t1.getPerimetre());
        Triangle t2 = new Triangle(t1);
        System.out.println("triangle t2: " + t2.toString() + " perimetre: " + t2.getPerimetre());
        t2.getPoint1().deplaceToi(3, 2);
        System.out.println("triangle t1: " + t1.toString() + " perimetre: " + t1.getPerimetre());
        System.out.println("triangle t2: " + t2.toString() + " perimetre: " + t2.getPerimetre());
    }
}
