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
public class Battery {
    private int energy;
    public Battery(){
        energy = 100;
    }
    public void setBattery(int value){
        energy = value;
    }
    public int getEnergy(){
        return energy;
    }
    public void decreaseEnergy(){
        energy--;
    }
}
