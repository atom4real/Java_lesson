/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author atomf
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 9999999;
        for(int i = 1; i<=2 ; i++){
            int num1 = scanner.nextInt();
            if(num1>max){
                max = num1;
            }
            if(num1<min){
                min = num1;
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
    
}
