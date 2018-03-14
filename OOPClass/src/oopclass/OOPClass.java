/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclass;

import java.util.Scanner;

/**
 *
 * @author annanekhashabu
 */
public class OOPClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Bank myBank = new Bank(); //creating obj
//        System.out.println("Bank Id is :"+myBank.bankID);
//        System.out.println("Bank Name is :"+myBank.bankName);
//        
//        //assigning new values
//        Bank yourBank = new Bank();
//        
//        myBank.bankID = 10101;
//        myBank.bankName = "Bank of Nova Scotia";
//        System.out.println("Bank Id is :"+myBank.bankID);
//        System.out.println("Bank Name is :"+myBank.bankName);
//        
//        yourBank.bankID = 10100;
//        yourBank.bankName = "rbc";
//        System.out.println("Bank Id is :"+yourBank.bankID);
//        System.out.println("Bank Name is :"+yourBank.bankName);
//        
//        yourBank.getBankDetails();
//        myBank.getName("ICICI");
//        
//       
//        Scanner myInput = new Scanner(System.in); //reading data from user, using scanner class 
//        System.out.print("Enter Bank Name:");
//        String BName = myInput.nextLine(); //getting dta into a string
//        yourBank.getName(BName); // displaying the data
   
            Arithmetic arith = new Arithmetic();
            System.out.println("Result of addition = "+arith.addition(3, 4));
            
            System.out.println("Result of subtraction = "+arith.subtraction(9, 4));
            
//            System.out.println("Result of addition = "+arith.addition(9.8f, 4.7f));
//    
//            System.out.println("Result of addition = "+arith.addition(10.8, 4.76));
//    
          //  System.out.println("Result of addition = "+arith.addition(8, 5, 7));
            
            System.out.println("Result of addition = "+arith.addition(5,3,4,6,1,2,9));
            
            System.out.println("Result of multiplication = "+arith.multiplication(5,3));
            
            System.out.println("Result of multiplication = "+arith.multiplication(78,9));
            
            Arithmetic.multiplication(10,80);
            
            Arithmetic.n1 = 20;
            Arithmetic.n2 = 70;
            
            System.out.println(Arithmetic.n1 +" " +Arithmetic.n2); //accessing static variables
            System.out.println(Arithmetic.n1 +" " +Arithmetic.n2 + " " +arith.n3); //accessing static and final variables
    
    
    
    
    
    
    
            
    
    
                }
    
    

    }
