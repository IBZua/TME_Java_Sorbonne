public class TestCoureur {
    public static void main(String[] args) {
        double tempsTotal = 0;
        Coureur c1 = new Coureur();
        Coureur c2 = new Coureur();
        Coureur c3 = new Coureur();
        Coureur c4 = new Coureur();
        c1.courir();
        tempsTotal += c1.getTempsAu100();
        c1.passeTemoin(c2);
        c2.courir();
        tempsTotal += c2.getTempsAu100();
        c2.passeTemoin(c3);
        c3.courir();
        tempsTotal += c1.getTempsAu100();
        c3.passeTemoin(c4);
        c4.courir();
        tempsTotal += c1.getTempsAu100();
        System.out.println(String.format("%.2f", tempsTotal));
    }
}
