public class TestLettre {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            Lettre lettre = new Lettre(c);
            System.out.println("lettre :" + lettre.getCarac() + " ascii : " + lettre.getCodeAscii());
        }
        for (char c = 'a'; c <= 'z'; c++) {
            Lettre lettre = new Lettre(c);
            System.out.print(lettre.getCarac() + " ");
            if ((c - 'a' + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
