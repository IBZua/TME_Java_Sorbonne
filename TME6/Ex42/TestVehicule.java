public class TestVehicule{
    public static void main(String[] args){
        Velo v1 = new Velo("MyVTT", 17);
        v1.transporter("Paris", "Lyon");
        Voiture v2 = new Voiture("BMW", 100, 5);
        Camion c1 = new Camion("Mercedes", 500, 1000);
        Vehicule[] tab = {v1,v2,c1};
        for(Vehicule v : tab){
            System.out.println(v);
            v.rouler(10);
            v.transporter();
        }
    }
}