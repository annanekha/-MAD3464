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
public class Person {
    
    String Fname,Lname;
    int age;
    
    
    
    Person(){
        
        this.Fname = "Unknown";
        this.Lname = "Unknown";
        this.age = 1;
        }
    
    Person(String Fname, String Lname, int age){
        
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
    }
    
    //copy constructor
    Person(Person obj){
        this.Fname = obj.Fname;
        this.Lname = obj.Lname;
        this.age = obj.age;
    }
    
    void getDetails()
    {
        Scanner myPerson = new Scanner(System.in);
        System.out.println("Enter the Firstname :");
        this.Fname = myPerson.nextLine();
        
        System.out.println("Enter the Lastname :");
        this.Lname = myPerson.nextLine();
        
        System.out.println("Enter Age :");
        this.age = myPerson.nextInt(); 
    }
    
    void putDetails()
    {
       System.out.println("First Name :"+this.Fname);
       System.out.println("Last  Name :"+this.Lname);
       System.out.println("Age        :"+this.age);
    }
    
    
}
