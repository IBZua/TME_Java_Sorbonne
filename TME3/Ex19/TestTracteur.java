public class TestTracteur {
    public static void main(String[] args) {
        Roue r1 = new Roue(120);
        Roue r2 = new Roue(120);
        Roue r3 = new Roue();
        Roue r4 = new Roue();
        System.out.println(r1.toString() + r2.toString() + r3.toString() + r4.toString());
        Cabine c1 = new Cabine(3, "bleu");
        System.out.println(c1.toString());
        Tracteur t1 = new Tracteur(r1, r2, r3, r4, c1);
        System.out.println(t1.toString());
        Tracteur t2 = new Tracteur(t1);
        System.out.println(t2.toString());
        t2.peindre("rouge");
        System.out.println(t2.toString());
    }
}
