public class Orchestre {
    private Instrument[] tab;
    private int max;
    private int nbInstru;
    public void ajouterInstrument(Instrument x){
        for(int i = 0; i < max; i++){
            if(nbInstru < max){
                tab[nbInstru] = x;
                nbInstru++;
            }else{
                System.out.println("orchestre complet");
            }
        }
    }
    public void jouer(){
        for(Instrument i : super.jouer)
        System.out.println("joue");
    }
}
