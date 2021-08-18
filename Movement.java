/*
Practice assignments and objects.

This program will create several turtles and run a few movements with each of them. 

Then it will show how many movements each turtle did and the information about the final location of each one.
 */
public class Movement
{
  public static void main(String [] args)
  {
    // Definition of primitives and objects
    int countJose = 0;
    int countAnna = 0;
    int countJohn = countAnna;
    World w = new World();
    
    Turtle jose = new Turtle(100, 50, w); // Creates a turtle in w at (x,y) (100,50)     
    Turtle anna = new Turtle(50, 100, w); // Creates a turtle in w at (x,y) (50,100)     
    Turtle john = anna;

    // Make some movements with the turtles and stores in the corresponding "count" how many movements we have done with each turtle
    john.turn(90); 
    countJohn = countJohn + 1;
    
    anna.turn(90); 
    countAnna = countAnna + 1;
    
    jose.turn(90); 
    countJose = countJose + 1;
    jose.forward(100); 
    countJose = countJose + 1;
    
    // Display how many movements we have run with each turtle
    System.out.println("Movements done by Jose: ");
    System.out.println(countJose);
    System.out.println("Movements done by Anna: ");
    System.out.println(countAnna);
    System.out.println("Movements done by John: ");
    System.out.println(countJohn);
    
    // Display info about the turtles
    System.out.println("Current information about Jose location: ");
    System.out.println(jose);
    System.out.println("Current information about Anna location: ");
    System.out.println(anna);
    System.out.println("Current information about John location: ");
    System.out.println(john);
  }
} 
