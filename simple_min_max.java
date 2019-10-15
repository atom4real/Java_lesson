/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author atomf
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println("Max : "+num1);
            System.out.println("Min : "+num2);
        }
        if (num1<num2){
            System.out.println("Max : "+num2);
            System.out.println("Min : "+num1);
        }


    }
    
}
