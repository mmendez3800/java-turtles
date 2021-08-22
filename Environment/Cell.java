import java.awt.Color;

/**
 * Class that references a cell in a map (similar to a pixel in a picture). A cell has an x and y
 * location (coordinates) in a map/grid. Top left corner is (0,0). Bottom right corner is (width-1,height-1)
 */
public class Cell
{

  ////////////////////////// fields ///////////////////////////////////

  /** the x location of this Cell in the map (0,0) is top left */
  private int x;

  /** the y location of this Cell in the map (0,0) is top left */
  private int y;

  /** color of this cell */
  private Color cellColor;

  /** color of the border of this cell */
  private Color borderColor;

  /** the content of this cell (i.e. 0 = empty, 1 = food, 2 = coin, 3 = trap, 4 = poison) */
  private int contentType;

  ////////////////////// constructors /////////////////////////////////

  /**
   * A constructor that takes the x and y coordinates
   * @param newX the x location of the Cell in the map
   * @param newY the y location of the Cell in the map
   */
  public Cell(int newX, int newY)
  {
    // set the x location
    this.x = newX;

    // set the y location
    this.y = newY;

    // the default color of a Cell is white
    this.cellColor = Color.WHITE;

    // the default color of the border of a Cell is black
    this.borderColor = Color.BLACK;

    // the default value of the content type is 0
    this.contentType = 0;
  }

  /**
   * A constructor that takes the x and y coordinates, the color of the cell, and the content within the cell
   * @param newX the x location of the Cell in the map
   * @param newY the y location of the Cell in the map
   * @param newColor the color of a Cell in the map
   * @param newType the type of content within a Cell in the map
   */
  public Cell(int newX, int newY, Color newColor, int newType)
  {
    // set the x location
    this.x = newX;

    // set the y location
    this.y = newY;

    // set the color of a Cell
    this.cellColor = newColor;

    // the default color of the border of a Cell is black
    this.borderColor = Color.BLACK;

    // this if statement is executed if a valid value of newType is given
    if(0 <= newType && newType <= 4)
    {
      // set the content within a Cell
      this.contentType = newType;
    }

    // this else statement is executed if an invalid value of newType is given
    else
    {
      System.out.println("The value of the last parameter is not a valid input and will not be recognized. The value must be between 0 and 4.");
      this.contentType = 0;
    }
  }

  ///////////////////////// methods //////////////////////////////

  /**
   * Method to get the x location of this Cell.
   * @return the x location of the Cell in the map
   */
  public int getX()
  {
    return x;
  }

  /**
   * Method to set the x location of this Cell.
   */
  public void setX(int newX)
  {
    this.x = newX;
  }

  /**
   * Method to get the y location of this Cell.
   * @return the y location of the Cell in the map
   */
  public int getY()
  {
    return y;
  }

  /**
   * Method to set the y location of this Cell.
   */
  public void setY(int newY)
  {
    this.y = newY;
  }

   /**
   * Method to get the color of this Cell.
   * @return the color of the Cell
   */
  public Color getCellColor()
  {
    return cellColor;
  }

   /**
   * Method to set the color of this Cell.
   */
  public void setCellColor(Color newColor)
  {
    this.cellColor = newColor;
  }

  /**
   * Method to get the border color of this Cell.
   * @return the color of the border of the Cell
   */
  public Color getBorderColor()
  {
    return borderColor;
  }

  /**
   * Method to set the color of the border of this Cell.
   */
  public void setBorderColor(Color newBorderColor)
  {
    this.borderColor = newBorderColor;
  }

  /**
   * Method to get the type of content of this Cell.
   * @return the type of content of the Cell
   */
  public int getContentType()
  {
    return contentType;
  }

  /**
   * Method to set the type of content of this Cell.
   */
  public boolean setContentType(int newType)
  {
    boolean result = false;

    // this if statement is executed if a valid value of newType is given
    if(0 <= newType && newType <= 4)
    {
      this.contentType = newType;
      result = true;
    }

    // this else statement is executed if an invalid value of newType is given
    else
    {
      System.out.println("Incorrect contentType value passed , contentType must be a number from 0 to 4. contentType will not be updated.");
      result = true;
    }
    return result;
  }

  /**
   * Method to return a string with information about this Cell
   * @return a string with information about this cell
   */
  public String toString()
  {
    // this if statement is executed if the value of contentType is 0
    if(this.contentType == 0)
    {
      return "Cell with coordinates (" + this.x + ", " + this.y + "). This cell is a standard empty cell";
    }

    // this else if statement is executed if the value of contentType is 1
    else if(this.contentType == 1)
    {
      return "Cell with coordinates (" + this.x + ", " + this.y + "). This cell contains food!";
    }

    // this else if statement is executed if the value of contentType is 2
    else if(this.contentType == 2)
    {
      return "Cell with coordinates (" + this.x + ", " + this.y + "). This cell contains a coin!";
    }

    // this else if statement is executed if the value of contentType is 3
    else if(this.contentType == 3)
    {
      return "Cell with coordinates (" + this.x + ", " + this.y + "). This cell contains a trap!";
    }

    // this else if statement is executed if the value of contentType is 4
    else if(this.contentType == 4)
    {
      return "Cell with coordinates (" + this.x + ", " + this.y + "). This cell contains poison!";
    }

    // this else statement is executed if an invalid value of contentType is given
    else
    {
      return "Incorrect contentType value passed, contentType must be a number from 0 to 4";
    }
  }
}
