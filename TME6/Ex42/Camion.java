public class Camion extends AMoteur{
    private int volume;
    public Camion(String marque, int niveauE, int volume){
        super(marque, niveauE);
        this.volume = volume;
    }
    public void transporter(String materiau, int km){
        if(enPanne()){
            System.out.println("Le camion 3 n’a plus plus d’essence!");
        }else{
            System.out.println("Le Camion " + id + " a transporté des " + materiau + " sur " + km);
        }
    }
    public String toString(){
        return "Camion " + super.toString();
    }
}