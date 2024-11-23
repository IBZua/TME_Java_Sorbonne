public class TestProjet{
    public static void main(String[] Args){
        System.out.println(Personne.getNbPersonnes());
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        System.out.println(p1);
        System.out.println(p2);
        Projet pr1 = new Projet("P3X-774");
        System.out.println(pr1);
        Projet pr2 = new Projet("P3X-233");
        System.out.println(pr2);
        System.out.println("nb personne :" + Personne.getNbPersonnes() + " nb Trio :" + Trio.getcpt());
    }
}