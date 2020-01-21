/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author Admin
 */
public class Temperature {
    private double cTemp;
    public Temperature(){
        this.cTemp = 20;
    }
    public Temperature(double c){
        this.cTemp = c;
    }
    public double getCtemp(){
        return this.cTemp;
    }
    public void setCtemp(double c){
        this.cTemp = c;
    }
    public double getFtemp(){
        return this.cTemp * 1.8 + 32;
    }
    public double getKtemp(){
        return this.cTemp + 273.15;
    }
}
