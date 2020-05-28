/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;
/**
 *
 * @author Samuel377
 */
public class One {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
       
       //Linked to Circle.java
       System.out.println("Calculate the area of a circle");
       Circle CircleObject = new Circle();
       Circle.areaCircle();
       
       //Linked to Square.java
       System.out.println("Calculate the area of a square");
       Square SquareObject = new Square();
       Square.areaSquare();
       
       //Linked to Interest.java
       System.out.println("Calculate the simple interest");
       Interest InterestObject = new Interest();
       Interest.simpleInterest();
      
       //Linked to Trigonometry.java
       System.out.println("Calculate the hypothenus of a right angle triangle");
       Trigonometry TrigonometryObject = new Trigonometry();
       Trigonometry.trig();
        
    }
    
}
