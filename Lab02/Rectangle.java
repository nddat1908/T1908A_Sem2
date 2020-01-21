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
public class Rectangle {
        private int width;
        private int height;
        
        public Rectangle(){
            this.width = 7;
            this.height = 3;
        }
        public Rectangle(int width,int height){
            this.width = width;
            this.height = height;
        }
        public void display(){
            System.out.println("Width: " + this.width);
            System.out.println("Height: " + this.height);
            for(int i = 0; i < this.width;i++){
                for(int j = 0;j <this.height;j++){
                    System.out.print(" # ");
            }
            System.out.println("");
        }
   
        }
        /**
         * Chieu rong
         * @return 
         */
        public int getwidth(){
            return width;
        }
         public void setWidth(int width){
            this.width = width;
        }
        /**
         * Chieu dai
         * @return 
         */
        public int getHeight(){
            return height;
        }
         public void setHeight(int height){
            this.height = height;
        }
       public int getPerimeter(){
           return (width + height) * 2;
           
       }
        /**
         * Lay ra dien tich
         * @return 
         */
        public int getArea(){
            return width * height;
        }
        
}
