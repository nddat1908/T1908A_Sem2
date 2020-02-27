/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author Admin
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
       
         return day;
    }
    public int getMonth(){
   
         return month;
    }
    public int getYear(){
        
         return year;
    }
    public void setDay(int day){
         if(day < 1 || day > 31){
            System.out.println("Not day");
        }else{
            
        } 
    }
    public void setMonth(int month){
         if(month < 1 || month > 12){
            System.out.println("Not month");
        }else{
            
        } 
        
    }
    public void setYear(int year){
        if( year < 1900 || month > 9999){
            System.out.println("Not year");
        }else{
            
        } 
      
    }
    public void setDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        // Use built-in function String.format() to form a formatted String
        return String.format("%02d/%02d/%4d",day, month,year);
              // Specifier "0" to print leading zeros
   }

    
}
