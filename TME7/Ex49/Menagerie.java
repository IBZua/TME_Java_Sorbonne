public class Menagerie{
    private Animaux[] tab;
    private int nbAnimaux = 0;
    public Menagerie(int max){
        tab = new Animaux[max];
    }
    public void ajouter(Animaux a){
        if(nbAnimaux < tab.length){
            tab[nbAnimaux] = a;
            nbAnimaux++;
        }else{
            System.out.println("Menagerie pleine");
        }
    }
    public String toString(){
        String s = "";
        for(Animaux a: tab){
            s += a.toString() + "\n";
        }
        return s;
    }
    public void midi(){
        for(Animaux a: tab){
            a.crier();
        }
    }
    public void vieillirTous(){
        for(Animaux a: tab){
            a.vieillir();
        }
    }
}