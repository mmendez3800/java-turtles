import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 */
public class Turtle extends SimpleTurtle
{
  private ArrayList<Double> movements;
  private ArrayList<Double> turns;
  
  public ArrayList<Double> getMovements() {
    return movements;
  }

  public ArrayList<Double> getTurns() {
    return turns;
  }

  private void initializeLists() {
    movements = new ArrayList<Double>();
    turns = new ArrayList<Double>();
  }
  
  ////////////////// constructors ///////////////////////
  
  public Turtle (int x, int y) 
  {
    // let the parent constructor handle it
    super(x,y);
    initializeLists();
  }
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
    initializeLists();
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
    initializeLists();
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
    initializeLists();
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
    initializeLists();
  }  
  
  /////////////////// methods ///////////////////////

  public void forward(double pixels) {
    super.forward((int) pixels);
    movements.add(pixels);
  }
  
  public void backward(double pixels) {
    super.backward((int) pixels);
    movements.add(-pixels);
  }
  
  public void forward(int pixels) {
    this.forward((double)pixels);
  }
  
  public void turn(double degrees) {
    super.turn(degrees);
    turns.add(degrees);
  }
  
  public void turnLeft()
  {
   this.turn(-90);
  }
  
  public void turnRight()
  {
    this.turn(90);
  }

  public void drawShape (int size)
  {
    //This loop creates the shape eight times
    for(int x=0; x<8; x++)
    {
    this.forward(size);
    this.turn(-135);
    this.forward(size);
    this.turnRight();
    this.forward(size);
    this.turnRight();
    }
  }

  /*
   * Method to MOVE the turtle to the Cell with coordinates x,y
   */
  public void moveToCell(Cell aCell)
  {
    this.moveTo(aCell.getX()*40+20, aCell.getY()*40+20);
  }

  /*
   * Method to turn the turtle to FACE Cell with coordinates x,y
   */
  public void turnToFaceCell(Cell aCell)
  {
    // we compute the direction where we want the turtle to face
    this.turnToFace(aCell.getX()*40+20, aCell.getY()*40+20);
  }

  /*
   * Method that makes the turtle follow a given path
   */
  public void followPath(Cell[] path)
  {
    boolean pathCompleted = true;
    Scanner reader = new Scanner(System.in);
    String anykey;

    for (int nC=0; nC<path.length; nC++)
    {
      this.turnToFaceCell(path[nC]);
      this.moveToCell(path[nC]);
    }
  }
  
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }

} // this } is the end of class Turtle, put all new methods before this
