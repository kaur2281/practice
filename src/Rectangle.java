/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        return length*width;
    
    }
    public double getRatio(){
    return length/width;
}

    @Override
    public String toString() {
        return super.toString() + "" + getRatio();
    }
    
}
