/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclass;

/**
 *
 * @author annanekhashabu
 */
public class Bank {
    
    int bankID = 10102;
    String bankName = "TD";
    
    void getBankDetails()
    {
         System.out.println("Bank Id is :"+this.bankID);
        System.out.println("Bank Name is :"+this.bankName);
    
        
    }
    
    void getName(String name){
        
        System.out.println("Bank Name is :"+name);
    }
    
    
    
    
}

