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
public class Trigonometry {
    public static void trig(){
     Scanner trigonometry = new Scanner(System.in);   
        double opposite, adjacent, hypothenus;
        System.out.println("Enter the opposite value");
        opposite = trigonometry.nextInt();
        System.out.println("Enter the adjacent value");
        adjacent = trigonometry.nextInt();
         
        opposite =  Math.pow(opposite, 2);
        adjacent =  Math.pow(adjacent, 2);
        hypothenus = opposite + adjacent;
        hypothenus = Math.sqrt(hypothenus);
        System.out.println("Solution");
        System.out.println("Formula: \n Hypothenus = \t (opposite*opposite) + (adjacent*adjacent)\n ");
        System.out.println("Hypothenus = "+ hypothenus);
}
}
