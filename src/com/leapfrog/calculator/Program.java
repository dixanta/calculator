/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Modified");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first Number:");
            int x = input.nextInt();
            System.out.println("Enter Second Number:");
            int y = input.nextInt();
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Div");
            System.out.println("4. Mul");
            System.out.println("5. Exit");
            System.out.println("Enter your choice[1-5]:");
            int choice = input.nextInt();
            int total = 0;
            switch (choice) {
                case 1:
                    total = x + y;
                    break;
                case 2:
                    total = x - y;
                    break;
                case 3:
                    total = x / y;
                    break;
                case 4:
                    total = x * y;
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

            System.out.println("Total is " + total);
            
            System.out.println("Do you want to continue[Y/N]");
            String ch=input.next();
            if(ch.equalsIgnoreCase("n")){
                System.exit(0);
            }
        }

    }

}
