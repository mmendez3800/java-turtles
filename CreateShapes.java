/*
This program will create various shapes using the Turtle class
*/ 

public class CreateShapes
{
  public static void main (String[] args) 
  {
    //This is the world created for the turtles
    World w = new World();
    
    //This turtle creates the smallest green-colored shape within all of the other shapes
    Turtle m = new Turtle(318, 250, w);
    m.drawShape(25);
    m.hide();
    
    //This turtle creates the cyan-colored shape surrounding the green-colored shape
    Turtle a = new Turtle(310, 285, w);
    a.drawShape(40);
    a.hide();
    
    //This turtle creates the magenta-colored shape surrounding the cyan-colored and green-colored shape
    Turtle r = new Turtle(300, 330, w);
    r.drawShape(60);
    r.hide();
    
    //This turtle creates the gray-colored shape surrounding all of the other shapes
    Turtle c = new Turtle(290, 375, w);
    c.drawShape(80);
    c.hide();
  }
}