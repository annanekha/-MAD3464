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
public class Arithmetic {
    
                
            static int n1,n2;
            final int n3 = 9;
            
            int addition(int num1,int num2){
                
                 System.out.println("Multiplication result :"+multiplication(10,20));
            
                return num1 + num2;
            }
            int subtraction(int num1,int num2){
                
               return num1 - num2; 
            }
            
            float addition(float num1,float num2){
            
                return num1 + num2;
            }
            
             double addition(double num1,double num2){
            
                return num1 + num2;
            }
             
             
            int addition(int num1,int num2,int num3){
            
                
               
                
                return num1 + num2 + num3;
                
            }
            
            int addition(int... num){

                int sum,i;
                for(i=0,sum = 0; i<num.length; sum += num[i],i++){
                  
                }
                return sum;
            }
            
            static int multiplication(int... num){
                
               int i,sum;
               for(i=0,sum=1; i<num.length;i++){
                   
                    sum*=num[i];
               }
                return sum;
            }
               
}
