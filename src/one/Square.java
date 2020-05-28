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
public class Square {
    public static void areaSquare(){
        Scanner size =new Scanner (System.in);
        double length,area;
        System.out.println("Enter the Length: ");
        length = size.nextDouble();
        
        area = Math.pow(length, 2);
        System.out.println("Area of a square = "+ area);
        
    }
}
