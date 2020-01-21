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
public class TestTemperature {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.setCtemp(25);
        System.out.println(temp.getCtemp()+"°C");
        System.out.println(temp.getFtemp()+"°F");
        System.out.println(temp.getKtemp()+"°K");
    }
}
