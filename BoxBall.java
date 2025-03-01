import java.awt.Color;
import java.awt.Shape; 
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.util.Random; 
import java.util.ArrayList;

/**
 * BoxBall models a ball that moves inside a box at random. The ball also 
 * bounces off the walls so that the ball always stays inside the box. 
 *
 * Emily Lubonty
 * 02-24-25
 */

public class BoxBall
{
    private Canvas boxContainer; 
    private ArrayList<Color> ballColor;
    private Random speed; 
    private Random position; 
    private Random randomColor; 
    private String boxColor; 
    private Graphics2D graphic; 
    
    
    /**
     * Constructor for objects of class BoxBall
     */
    public BoxBall()
    {
        boxContainer = new Canvas("Box", 600, 500, Color.white); 
        int topWall = 200; 
        int bottomWall = 200;
        int leftWall = 200;
        int rightWall = 200; 
        
        boxContainer.setVisible(true); 
        boxContainer.draw(new Rectangle
                         (topWall, bottomWall, leftWall, rightWall));
        
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void boxBounce ()
    {
    
       
       

    }
    
  
    
    
    
 
}
