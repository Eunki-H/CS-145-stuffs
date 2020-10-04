import java.util.*;

public class Chapter10Day2
{
   public static void main(String[] args)
   {
      /*
      List<Integer> myList = new ArrayList<Integer>();
      
      Integer x;
      
      x = 7;   // This equal sign, magically changed an int into an Integr, a primitive to a Object.
      
      int y;
      
      y = x 
      
      System.out.println(y); 
      */
      
      /*
      Integer a = 127;  
      Integer b = 127;     
      Integer x = 128; 
      Integer y = 128;  
                
      System.out.println(a);     
      System.out.println(b);     
      System.out.println(a == b);
           
      System.out.println(x);     
      System.out.println(y);     
      System.out.println(x == y);
      
      // only ~ 127, preset. If you want to compare, you should use a certain different method.
      */
      
      List<String> myList = new ArrayList<>();
      
      List<Integer> myList2 = new LinkedList<>();
      
      // Bad
      
      List<Character> myList3;
      
      myList = new ArrayList<>(); // The <> does't work!
      
      // Do some stuff with myList
      
      List<String> myList2 = new ArrayList<>(myList);
      
      //////////////////////
      Set<String> my List = new TreeSet<>(); // also works!
      
      
            
      
   }
}


public class Classroom 
{
   private List<Students> Students;
   
   public Classroom()
   {
      students = new ArrayList<Students>(); // <> - bad
   }
}



