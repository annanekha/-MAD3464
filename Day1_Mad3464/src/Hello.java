/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annanekhashabu
 */
public class Hello {
    
    public static void main(String args[]){

       System.out.println("Hi");
       int p = 10;
      
       System.out.println(p);
       int k = 10;
       int q = k + p;
       System.out.println("value of q = " + q);
       System.out.println("Anna Nekha Shabu");
       
               char vowel = 'A';
               String name = "Anna Nekha";
               float percentage = 78.6f;
               System.out.println(name +" " + percentage +" " + vowel);
               vowel = 70;
               System.out.println(name +" " + percentage +" " + vowel);
               
               System.out.println(1 + 2 + "test");
               
               switch(10+5){
                   
                   case 10:
                       System.out.println("value is 10");
                       break;
                   case 15:
                       System.out.println("value is 15");
                       break;
                   default:
                       System.out.println("No Matching Value");
                       break;
               
                   
               }
               
               vowel = 'b';
               switch(vowel){
                   
                   case 'a':
                       System.out.println("value is a");
                       break;
                   case 'b' :
                       System.out.println("value is b");
                       break;
                   default:
                       System.out.println("No Matching Value");
                       break;
               
                   
               }
               
                vowel = 'i';
               switch(vowel){
                   
                   case ('a'| 'e'|'i'|'o'|'u'):
                       System.out.println("Vowel");
                       break;
                   default:
                       System.out.println("Not a vowel");
                       break;
               
               }
               
               int numbers[] = new int[5];
               int i;
               for(i=0;i<numbers.length;i++){
                   numbers[i] = (int)(Math.random()*100);
                   System.out.println("numbers ["+ i + "] ="+numbers[i]);
               }
               
               
               double PI_VALUE = Math.PI; //use uppercase for constants, if multiple words use _
               double power = Math.pow(2,8);
               double y = Math.sqrt(144);
               double u = Math.abs(PI_VALUE);
               System.out.println(PI_VALUE + power +y +u);
               
               float grades[][] = new float [3][4];
               for(i=0;i<3;i++){
                   for(int j =0;j<4;j++){
                       
                       grades[i][j] = 10.0f;
                   }
               }
               
               
                int arr[] = new int[10];
                
               int randomNo,j;
               for(i=0;i<10;i++) {
                   
                  randomNo = (int)(Math.random()*10);
                  System.out.println("no" +(i+1) +"="+randomNo);
                      arr[i] = randomNo;    
             
               //System.out.println(arr[i]);
               
               }
               
               int sorted_array[] = new int[10];
               
               
               int temp;
               int min;
              for(i=0;i<10;i++)
              {
                  min = arr[i];
                  for( j=i+1;j<10;j++)
                  {
                    if(min>arr[j])
                     {
                         temp = arr[j];
                         arr[j] = min;
                         min = temp;
                     }
                
                  }
                  
                  sorted_array[i] = min;
                  
              }
              for(i=0;i<10;i++)
              {
                  System.out.println(sorted_array[i]);
              }
               
    
                              for( i = 1; i <= 10; i++)
                              {
           
                                     for(j = 0; j < 10 - i; j++)
                                     {
                                            System.out.print(" ");
                                      }
       
                                            for(k = 0; k < i; k++)
                                            {
                                            
                                                System.out.print("* ");
                                            }
                                                        System.out.println();
            
                                }
                              
                              
                              for( i = 1; i <= 10; i++)
                              {
           
                                     for(j = 1; j < 10 - i; j++)
                                     {
                                            System.out.print(" ");
                                      }
       
                                            for(k = 1; k < i; k++)
                                            {
                                            
                                                System.out.print(" "+k);
                                            }
                                                        System.out.println();
            
                                }
          
                              
                              
                              
                              
                                  for(i=1;i<=5;i++)
                                  {
                                      
                                      
                                      
                                      if ( i == 1 || i == 5)
                                      {
                                          for(j = 1; j <= 5 ; j++)
                                              
                                            {
                                              System.out.print(" *");
                                            }
  
                                       }
                                      
                                      else
                                      {
                                          for (k = 1; k <= 5; k++)
                                          {
                                              if (k == 1 || k == 5)
                                              {
                                                  System.out.print(" *");
                                              }
                                              else
                                              {
                                                  System.out.print(" ");
                                              }
                                                      
                                          }
                                      }
                                      System.out.print("\n");
                                    }
                                  
                                  
                                  
            }
}


    
    
    
    


    
    

