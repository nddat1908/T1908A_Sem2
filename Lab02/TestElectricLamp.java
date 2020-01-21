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
public class TestElectricLamp {
    public static void main(String[] args) {
        SwitchButton button = new SwitchButton();
        ElectricLamp lamp = new ElectricLamp();
        button.connectToLamp(lamp);
        for (int i = 0; i < 10; i++) {
            button.switchOn();
            button.switchOff();
        }
        System.out.println("Tat"+button);
    }
}
