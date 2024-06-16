public class TestAdresseWeb {
    public static void main(String[] args) {
        AdresseWeb a1 = new AdresseWeb("https://", "supersite.fr", "/rep1/rep2/index.html");
        AdresseWeb a2 = new AdresseWeb("supersite.fr", "/rep1/rep2/index.ua");
        AdresseWeb a3 = new AdresseWeb("supersite.fr");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
