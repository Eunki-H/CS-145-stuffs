import java.awt.*;

/** 
 * This class represents a Giant object which is a type of Critters.
 *
 * @author Eunki Hong
 * @version 10/2/2020
 */
 
public class Giant extends Critter 
{
   private int moves;
   private int moves6;  // The variable that stands for the mutiples of 6.
   private String temStr;  // The variable for the ability to change the character by a regular period.
   
   /** 
    * Default constructor
    */
    
    public Giant()
    {
      this.moves = 0;
      this.moves6 = 0;
    }
  
   /** 
    * This method represents a Giant's moving pattern. 
    * The object tries to infect the other critters if they are in front of the obeject.
    * And then, it hops over the field when there's nothing berfore it.
    * But as an example, when it comes to face with the wall, it turns right. 
    *
    * @param info The pre-set information for the next coding.
    * @return The action a giant would take.
    */
    
    public Action getMove(CritterInfo info) 
    {
      if (info.getFront() == Neighbor.OTHER)
         return Action.INFECT;
      
      else if (info.getFront() == Neighbor.EMPTY)
         return Action.HOP;
         
      else
         return Action.RIGHT;  
    }

   /** 
    * This method represents the color a Giant would be in.
    *
    * @return The color of a giant.
    */
    
    public Color getColor() 
    {
      return Color.GRAY;
    }

    @Override
    public String toString() 
    {
      this.moves++;
      
      if (this.moves%6 == 1)
      {
         this.moves6++;
         
         if (this.moves6%4 == 1)
            this.temStr = "fee";
            
         else if (this.moves6%4 == 2)
            this.temStr = "fie";
         
         else if (this.moves6%4 == 3)
            this.temStr = "foe";
         
         else 
            this.temStr = "fum";
            
         return this.temStr;
      }
      
      else
         return this.temStr;
    }
    
    
}