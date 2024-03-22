/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleinterest;
import java.util.Scanner;
        

/**
 *
 * @author Acer-User
 */
public class SimpleInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount");
        int P = input.nextInt();
        System.out.print("Enter Number of years");
        int N = input.nextInt();
        System.out.print("Enter Interest Rate");
        int R = input.nextInt();
        int SimpleInterest = (P*N*R)/100;
        
        System.out.println(SimpleInterest);
    }
}
