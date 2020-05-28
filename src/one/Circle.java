/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;
import java.util.Scanner;
/**
 *
 * @author Samuel377
 */
public class Circle {
    
    public static void areaCircle(){
        Scanner circle = new Scanner(System.in);
        double radius, diameter, pie, area;
        System.out.println("Enter the radius value: ");
        radius = circle.nextDouble();
        pie =Math.PI;
        radius = Math.pow(radius, 2);
        area = pie*radius;
        System.out.println("Area of a circle = "+ area + " "+ "cm");
        
       
    
}
}
