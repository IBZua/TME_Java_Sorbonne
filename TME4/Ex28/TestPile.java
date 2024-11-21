public class TestPile{
    public static void main(String[] args){
        Assiette a1 = new Assiette();
        Assiette a2 = new Assiette();
        Assiette a3 = new Assiette(36);
        Assiette a4 = new Assiette(12);
        Pile p1 = new Pile(3);
        p1.empiler(a1);
        p1.empiler(a2);
        p1.empiler(a3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3 + "\n");
        System.out.println(p1);
        p1.depiler();
        System.out.println(p1);
        p1.empiler(a3);
        p1.empiler(a4);
        System.out.println(p1);
        for(int i = 0; i < 4; i++){
            p1.depiler();
        }
        System.out.println(p1);
    }
}