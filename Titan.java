import java.awt.*;

/** 
 * This class represents a Titan object which is a type of Giant.
 *
 * @author Eunki Hong
 * @version 10/2/2020
 */
 
public class Titan extends Giant 
{
   private boolean polar;
   
   /** 
    * Default constructor
    */
    
    public Titan()
    {
      // nothing
    }
  
   /** 
    * This method represents a Titan's moving pattern.
    * The object tries to infect the other critters if they are in front of the obeject.
    * And then, it hops over the field when there's nothing berfore it.
    * But as an example, when it comes to face with the wall, it turns left.  
    *
    * @param info The pre-set information for the next coding.
    * @return The action a titan would take.
    */
    
    public Action getMove(CritterInfo info) 
    {
      if (info.getFront() == Neighbor.OTHER)
         return Action.INFECT;
      
      else if (info.getFront() == Neighbor.EMPTY)
         return Action.HOP;
         
      else
         return Action.LEFT;  
    }

   /** 
    * This method represents the color a Titan would be in.
    * The color changes, depending on the character of a titan.
    *
    * @return The color of a titan.
    */
    
    public Color getColor() 
    {
      if (super.toString() == "fee" || super.toString() == "foe") 
         return Color.BLACK;
         
      else 
         return Color.WHITE;
    }


}