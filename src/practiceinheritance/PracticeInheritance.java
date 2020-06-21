/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceinheritance;

/**
 *
 * @author harba
 */
public class PracticeInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s = new Shape();
        Circle c = new Circle("black","sli",10.00);
        Shape [] shapes = new Shape[2];
       shapes[0] = new Circle("pink","rough",5.00);
       shapes[1] = new Rectangle(5.00,6.00);
        Rectangle r = new Rectangle();
        Shape myShape = new Circle();
        
        Circle myCircle = (Circle)myShape;
        myShape = new Rectangle();
        String ratio =((Rectangle) myShape).getRatio();
        System.out.println(c.getTexture());
        System.out.println(c.toString());
        System.out.println(s.getColor());
        System.out.println(r.getRatio());
        System.out.println(shapes[0].toString());
        System.out.println(shapes[1].toString());
    }
    
}
