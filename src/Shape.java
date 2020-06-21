/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harba
 */
public class Shape {
    private String color;
    private String texture;

    public Shape() {
        this ("blue", "rough");
    }

    public Shape(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
    
    
}
