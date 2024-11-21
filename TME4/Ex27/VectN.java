public class VectN{
    private int[] tab;
    private VectN(int n){
        tab = new int[n];
    }
    public VectN(int n, int valMax){
        this(n);
        for(int i = 0; i < n; i++){
            tab[i] = (int) (Math.random()*valMax);
        }
    }
    public VectN(){
        this(5);
        for(int i = 0; i < 5; i++){
            tab[i] = (int) (Math.random()*9);
        }
    }
    public VectN(int a, int b, int c){
        tab = new int[] {a,b,c};
    }
    public int somme(){
        int sum = 0;
        for(int i : tab){
            sum += i;
        }
        return sum;
    }
    public String toString(){
        String s = "";
        for(int i : tab){
            s += i + " ";
        }
        return "[ " + s + "]";
    }
    public int[] getTab(){
        return tab;
    }
}