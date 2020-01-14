/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author Admin
 */
public class SoccerPlayer {
    private String name;
    private int number;
    private int x,y;
    
    public SoccerPlayer(){
        System.out.println("I'm SoccerPlayer");
    }
    public void run(){
        System.out.println("Run!");
    }
    public void jump(){
        System.out.println("Jump!");
    }
    public void kickBall(){
        System.out.println("KickBall!");
    }
}
