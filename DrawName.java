/*
This program will draw the name 'Marco' using the Turtle class
*/

public class DrawName
{
  public static void main (String[] args)
  {
    World w = new World();
    
    //This draws the letter M
    Turtle m = new Turtle(20, 440, w);
    m.forward(400);
    m.turnRight();
    m.forward(44);
    m.turnRight();
    m.forward(250);
    m.backward(250);
    m.turnLeft();
    m.forward(44);
    m.turnRight();
    m.forward(400);
    m.hide();
    
    //This draws the letter A
    Turtle a = new Turtle(148, 440, w);
    a.forward(400);
    a.turnRight();
    a.forward(88);
    a.turnRight();
    a.forward(400);
    a.backward(200);
    a.turnRight();
    a.forward(88);
    a.hide();
    
    //This draws the letter R
    Turtle r = new Turtle(276, 440, w);
    r.forward(400);
    r.turnRight();
    r.forward(88);
    r.turnRight();
    r.forward(200);
    r.turnRight();
    r.forward(88);
    r.moveTo(364,440);
    r.hide();
    
    //This draws the letter C
    Turtle c = new Turtle(492, 40, w);
    c.turn(270);
    c.forward(88);
    c.turnLeft();
    c.forward(400);
    c.turnLeft();
    c.forward(88);
    c.hide();
    
    //This draws the letter O
    Turtle o = new Turtle(532, 440, w);
    o.setColor(java.awt.Color.red);
    o.forward(400);
    o.turnRight();
    o.forward(88);
    o.turnRight();
    o.forward(400);
    o.turnRight();
    o.forward(88);
    o.hide();
  }
}