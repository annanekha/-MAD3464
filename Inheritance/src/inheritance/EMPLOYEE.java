/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author annanekhashabu
 */
public class EMPLOYEE extends Person{
                
    
    
                    double salary;
    
                EMPLOYEE()
                    {
                        super();
                        this.salary = 14;
        
                    }
    
                EMPLOYEE(String Fname, String Lname, int age, double pay)
                    {
                        super(Fname, Lname, age);
                        this.salary = pay;
        
                    }
                void read()
                    {
            
                        Scanner input = new Scanner(System.in);
                        System.out.println("Enter the Salary :");
                        this.salary = input.nextDouble();
            
                     }
                void display()
                     {
           
                        System.out.println("First Name :"+this.Fname);
                        System.out.println("Last Name  :"+this.Lname);
                        System.out.println("Age        :"+this.age);
                        System.out.println("Salary     :" +salary); 
                     }
    
    
                                







                             
}
