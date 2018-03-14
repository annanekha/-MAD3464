/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author annanekhashabu
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person p = new Person();
        Person newPerson = new Person("EDWIN","JAIN",22);
        
       // p.getDetails();
        p.putDetails();
        
        newPerson.putDetails();
        Person p1 = new Person(newPerson); //copy constructor initialization nd calling
        p1.putDetails();
        
         EMPLOYEE emp = new EMPLOYEE();
         EMPLOYEE emp1 = new EMPLOYEE("Ann","Treasa",25,15.8);
         EMPLOYEE emp2 = new EMPLOYEE();
         emp.display();
         emp1.display();
         //emp2.read();
        // emp2.display();
         emp2.Fname = "ANNA";
         emp2.Lname = "Shabu";
         emp2.age = 21;
         emp2.salary = 100;
         emp2.putDetails();
         emp2.display();
         
    }
    
}
