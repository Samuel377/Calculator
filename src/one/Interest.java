/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;
import java.util.Scanner;
/**
 *
 * @author HAYWHY
 */
public class Interest {
    public static void simpleInterest(){
        double interest, principal, year, rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your principal amount: ");
        principal = input.nextDouble();
        System.out.println("Enter your time rate:");
        year = input.nextDouble();
        System.out.println("Enter the increase rate: ");
        rate = input.nextDouble();
        
        interest = (principal*year*rate)/100;
        System.out.println("Simple interest = "+ interest);
    }
}
