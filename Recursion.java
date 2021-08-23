/*
This program will prompt shapes to be created by Turtles through recursion
*/

public class Recursion
{
  /** 
    * This method creates a spiral of a certain size and shape
    * @param turtle The turtle which will draw the spiral
    * @param initialLength The length of the first line segment the turtle draws
    * @param angle The amount of degrees the turtle will turn before drawing the next line segment
    * @param multiplier The number used to either increase or decrease each new line segment the turtle draws
    * */
  public void spiral(Turtle turtle, double initialLength, int angle, double multiplier)
  {
    // This if statement stops the method when multiplier < 1 and when initialLength < 1
    if(multiplier < 1 && initialLength < 1)
    {
      return;
    }
    
    // This else if statement stops the method when multiplier > 1 and when initialLength > 200
    else if(multiplier > 1 && initialLength > 200)
    {
      return;
    }
    
    // We make the turtle move forward an amount of pixels and then turn a certain number of degrees
    turtle.forward(initialLength);
    turtle.turn(angle);
    
    // The method calls upon itself to create a new line segment, thus causing the recursion
    spiral(turtle, initialLength * multiplier, angle, multiplier);
  }
  
  /**
    * This method creates a tree with a certain number of branches and trunk of a certain length, with each additional
    * branch being half of the length of the previous branch
    * @param turtle The turtle used to draw the tree
    * @param trunkLength The length of the first branch (the trunk of the tree)
    * @param height The number of branches the tree will have going down one path
    * */
  public void tree(Turtle turtle, int trunkLength, int height)
  { 
    // This if statement stops the method when height < 1
    if(height < 1)
    {
      return;
    }
    
    // We make the turtle move forward an amount of pixels and then turn -45 degrees
    turtle.forward(trunkLength);
    turtle.turn(-45);
    
    // The method calls upon itself to create the left branches
    tree(turtle, (int) (trunkLength * 0.5), height - 1);
    
    // We make the turtle turn 90 degrees and then call the method upon itself to create the right branches
    turtle.turn(90);
    tree(turtle, (int) (trunkLength * 0.5), height - 1);
    
    // We make the turtle turn -45 degrees and move backward an amount of pixels to return it to its original position
    turtle.turn(-45);
    turtle.backward(trunkLength);
  }
  
  /** The main method which will test the spiral method and tree method */
  public static void main( String[] args )
  {
    // We create a new TurtleRecursion object
    Recursion tr = new Recursion();
    
    // We create a World, place a Turtle in the created world at a specified location, and call the tree method 
    World world1 = new World();
    Turtle turtle = new Turtle(world1.getWidth() / 2, world1.getHeight(), world1);
    tr.tree(turtle, 256, 7);
    
    // We create a World, place a Turtle in the created world, and call the spiral method
    World world2 = new World();
    Turtle turtle2 = new Turtle(world2);
    tr.spiral(turtle2, 1, -45, 1.1);
  }
}
