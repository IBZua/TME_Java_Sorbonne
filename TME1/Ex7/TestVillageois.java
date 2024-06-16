public class TestVillageois {
    public static void main(String args[]) {
        Villageois vadym = new Villageois("vadym");
        Villageois masha = new Villageois("masha");
        Villageois mia = new Villageois("mia");
        Villageois illia = new Villageois("illia");
        double res = (illia.getPoids() + mia.getPoids() + masha.getPoids() + vadym.getPoids());
        System.out.println(
                vadym.toString() + masha.toString() + mia.toString() + illia.toString() + "poids total soulevable "
                        + String.format("%.2f", res)
                        + (res < 100 ? " rocher trop lourd" : " peuvent souvelever le rocher"));
    }
}
