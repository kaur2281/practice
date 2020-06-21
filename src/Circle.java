/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harba
 */
public class Circle extends Shape {
    public double radius;

    public Circle() {
        super();
        this.radius = 7.00;  
    }

    public Circle(String color, String texture, double radius) {
        super(color,texture);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 2*3.1411*radius*radius;
    }

    @Override
    public String toString() {
        return super.toString() + "" + getArea();
    }
    
}
