import java.awt.Color;
import java.awt.Shape; 
import java.awt.Rectangle;
import java.awt.geom.*;
import java.awt.Graphics2D;
import java.util.Random; 
import java.util.ArrayList;

/**
 * BoxBall models a ball that moves inside a box at random. The ball(s) also 
 * bounce off the walls so that the ball always stays inside the box. 
 *
 * Emily Lubonty
 * 02-24-25
 */

public class BoxBall
{
    private Canvas boxContainer; 
    private Random xBallMotion;
    private Random yBallMotion;
    private Graphics2D graphic; 
    private Color color;
    private int diameter;
    private int rgb; 
    
    
    /**
     * Constructor for objects of class BoxBall.
     * 
     * Creates a canvas with a box already visible. 
     */
    public BoxBall()
    {   
        Random random = new Random();
        
        // Parameters for canvas and box display
        boxContainer = new Canvas("Box", 600, 600, Color.white); 
        int topWall = 200; 
        int bottomWall = 200;
        int leftWall = 200;
        int rightWall = 200; 
        
        // Parameters for displaying balls
        
        int diameter = random.nextInt(20);
        int xBallMotion = random.nextInt(500);
        int yBallMotion = random.nextInt(500); 
        int rgb = random.nextInt(150); 
        
        // Displays the balls
        boxContainer.fillCircle(xBallMotion, yBallMotion, diameter); 
        
        
        
        // Creates a box within the canvas
        boxContainer.setVisible(true); 
        boxContainer.draw(new Rectangle
                         (topWall, bottomWall, leftWall, rightWall));
                         
        // Creates motion at random for balls
        
        
        
    
        
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
