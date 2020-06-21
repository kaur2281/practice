/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceinheritance;

import java.math.BigInteger;

/**
 *
 * @author harba
 */
public class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle() {
        super();
        this.length = 5.00;
        this.width = 6.00;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, String texture, double length, double width) {
        super(color,texture);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return (length*width);
    
    }
     public String getRatio(){
        BigInteger w = new BigInteger(String.valueOf(Math.round(this.width)));
         BigInteger l = new BigInteger(String.valueOf(Math.round(this.length)));
         BigInteger gcd = l.gcd(w);
         System.out.println(gcd);
         String wStr = w.divide(gcd).toString();
         String lStr = l.divide(gcd).toString();
         return lStr + "/" + wStr;
    
    }
   // public double getRatio(){
    //return Math.round(length/width);
//}

    @Override
    public String toString() {
        return super.toString() + "" + getRatio() + "" + getArea();
    }
}
    
