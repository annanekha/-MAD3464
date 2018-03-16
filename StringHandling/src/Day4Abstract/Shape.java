/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4Abstract;

/**
 *
 * @author annanekhashabu
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MyShape sp1 = new MyShape();
        Circle c1 = new Circle();
        c1.draw();
        c1.display("It's A Circle"); 
    }
    
}


   abstract class MyShape{
       int x,y;
       abstract void draw();
       void display(String msg)
       {
           System.out.println(msg);
       }
   }
            
class Circle extends MyShape{

    @Override
    void draw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Drawing Circle");
        super.x = 20;
        super.y = 30;
        System.out.println("x = " + super.x + "\ny = " + super.y);
    }
    
}

abstract class Rectangle extends MyShape{
    
    int h;
    abstract void draw();
}