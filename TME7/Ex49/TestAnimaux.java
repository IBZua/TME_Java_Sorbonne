public class TestAnimaux{
    public static void main(String[] args){
        Vache v = new Vache("Marguerite");
        Boa b = new Boa("Orochimaru");
        Menagerie m = new Menagerie(2);
        m.ajouter(v);
        m.ajouter(b);
        System.out.println(m);
        m.midi();
        m.vieillirTous();
        System.out.println(m);
    }
}