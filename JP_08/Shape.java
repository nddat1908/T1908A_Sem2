/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author Admin
 */
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        if(filled = true){
            System.out.println("Filled");
        }else{
            System.out.println("Not filled");
        }
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[" + "color=" + color + ", filled=" + filled + "]";
    }
    
    
}
