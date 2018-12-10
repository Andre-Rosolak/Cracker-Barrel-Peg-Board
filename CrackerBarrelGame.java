/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackerbarrelgame;

/**
 *
 * @author Drae
 */
public class CrackerBarrelGame {
    //this class represents a move on a pin
    public static class move{
      
        int grab;   //represent the pin grabbed
        int over;   //represents the pin that the other pin is going over
        int dest;   //represents the destinatione where the grabbed pin is going
        boolean done; //represents if the move was done or not
        
        //constructor
        public move(int grab,
        int over,
        int dest,
        boolean done)
        {
          this.grab = grab;
          this.over = over;
          this.dest = dest;
          this.done = done;  
        }
        //get functions for variables
        public int getGrab()
        {
            return grab;
        }
        public int getOver()
        {
            return over;
        }
        public int getDest()
        {
            return dest;
        }
        public boolean getDone()
        {
            return done;
        }
    }
        //this function prints out the triangle based on the boolean array
        public static void printTriangle(boolean[] p) 
    { 
        // outer loop to handle number of rows 
        //  n in this case 
        //int spaces = 4;
        for (int i=0; i<15; i++) 
        { 
            if(i==0)
            { 
                System.out.print("    "); 
            } 
            if(i == 1)
            {
                System.out.println();
                System.out.print("   ");
            }
            if(i == 3)
            {
                System.out.println();
                System.out.print("  ");
            }
            if(i == 6)
            {
                System.out.println();
                System.out.print(" ");
            }
            if(i == 10)
            {
                System.out.println();
            }
            if(p[i] == false)
            {
                System.out.print("0 ");
            }
            else
            {
                System.out.print("1 ");
            }
            if(i == 14)
            {
                System.out.println();
            }
            
        } 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //represents if a pin is in a spot or not
        boolean[] pin = {false, true, true, true, true, true, true, true, true, true, true, true, true, true, true}; 
        //intstantiating the array of moves
        move[] moves = new move[13];
        //these are all the moves to complete the game
        moves[0] = new move(3, 1, 0, false);
        moves[1] = new move(5, 4, 3, false);
        moves[2] = new move(0, 2, 5, false);
        moves[3] = new move(6, 3, 1, false);
        moves[4] = new move(9, 5, 2, false);
        moves[5] = new move(11, 7, 4, false);
        moves[6] = new move(12, 8, 5, false);
        moves[7] = new move(1, 4, 8, false);
        moves[8] = new move(2, 5, 9, false);
        moves[9] = new move(14, 9, 5, false);
        moves[10] = new move(5, 8, 12, false);
        moves[11] = new move(13, 12, 11, false);
        moves[12] = new move(10, 11, 12, false);
        System.out.println("---This is step 0---");
        //printing the initial state
        printTriangle(pin);
        for(int s = 0; s < 13; s++)
        {
            int pingrabbed = moves[s].getGrab();
            int pinover = moves[s].getOver();
            int pindest = moves[s].getDest();
            
            pin[pingrabbed] = false;
            pin[pinover] = false;
            pin[pindest] = true;
            
            System.out.println("---This is step " + (s+1) +"---");
            //calling the print function to print the current state
            printTriangle(pin);
        }
    }
    
}
