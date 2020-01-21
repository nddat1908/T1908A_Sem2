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
public class TestFlash {
    public static void main(String[] args) {
        Battery bat = new Battery();
        FlashLamp fl = new FlashLamp();
        fl.setBattery(bat);
        for (int i = 0; i < 10; i++) {
            fl.turnOn();
            fl.turnOff();
        }
        System.out.println("Muc pin hien tai: "+fl.getBatteryInfo()+"%");
    }
}
