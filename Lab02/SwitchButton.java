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
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;
    public SwitchButton(){
        this.status = false;
    }
    public void connectToLamp(ElectricLamp lamp){
        this.lamp = lamp;
    }
    public void switchOff(){
        this.status = false;
    }
    public void switchOn(){
        this.status = true;
    }
}
