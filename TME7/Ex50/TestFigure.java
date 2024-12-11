public class TestFigure{
    public static void main(String[] args){
        Carre c1 = new Carre(3);
        Rectangle r1 = new Rectangle(3, 4);
        Cercle c2 = new Cercle(3);
        Ellipse e1 = new Ellipse(3, 4);
        Figure2D[] tab = {c1,c2,r1,e1};
        for(Figure2D f : tab){
            System.out.println(f.perimetre() + " " + f.surface());
        }
    }
}