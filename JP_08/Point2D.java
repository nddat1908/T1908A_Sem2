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
public class Point2D {
    private float x;
    private float y;
    
    public Point2D(float x,float y){
        this.x = x;
        this.y = y;
    }
    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(){
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
        
    }
    public float[] getXY(){
        float[] results = new float[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
}
