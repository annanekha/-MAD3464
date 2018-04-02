/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annanekhashabu
 */
public class ReservationSystem {
    
    
     int[] seats ;
   int count;

  ReservationSystem()
  {
      for (int i = 0; i < seats.length ; i++)
      {
       seats[i] = 0 ;
      }
  }
   
 
  void assignSeatCapacity(int no)        
  {
     
      this.count = no;
  }
 
  void assignSeat(int seat_number)
  {
      if (seats[seat_number]==0)
      this.seats[seat_number] = 1;
  }
    
    
}
