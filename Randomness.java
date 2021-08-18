/*
Practice random number generation.

This program creates a turtle and calls the methods that will make it move following a certain path.

It will make the path different every time you run the program.
*/

import java.util.*;

public class Randomness
{
  public static void main(String [] args)
  {
    // Declare and initialize our variables
    World w = new World();
    Turtle jose = new Turtle(200, 200, w); // Creates a turtle in w at (x,y) (200,200)     
    Random generator = new Random();
    int value = 0;
    
    // Assigns a new random number to the variable "value" before calling each method before using it
    value = generator.nextInt(50);
    jose.forward(value);
    
    value = generator.nextInt(50);
    jose.turn(value);
    
    value = generator.nextInt(50);
    jose.forward(value);
    
    value = generator.nextInt(50);
    jose.turn(value);
    
    value = generator.nextInt(50);
    jose.forward(value);
    
    value = generator.nextInt(50);
    jose.turn(value);
  }
} 
