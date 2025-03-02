import java.awt.Color;
import java.awt.Shape; 
import java.awt.Rectangle;
import java.awt.*;
import java.awt.geom.*;
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
    private Ellipse2D.Double circle; 
    private Ellipse2D.Double rectangle; 
    private Color color;
    private ArrayList<Integer> ballBounce; 
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
        ArrayList<Integer> ballBounce = new ArrayList<Integer>(); 
        
        
        // Parameters for canvas and box display
        boxContainer = new Canvas("Box", 600, 600, Color.white); 
        int topWall = 200; 
        int bottomWall = 200;
        int leftWall = 200;
        int rightWall = 200; 
        
        // Creates a box within the canvas
        boxContainer.setVisible(true); 
        boxContainer.draw(new Rectangle
                         (topWall, bottomWall, leftWall, rightWall));
        
        // Parameters for displaying balls
        int diameter = random.nextInt(30);

        int xBallMotion = random.nextInt(200);
        int yBallMotion = random.nextInt(200); 
        
        int ballSpeed = random.nextInt(50); 
        
        ballBounce.add(1);
        ballBounce.add(2); 
        ballBounce.add(3);
        ballBounce.add(4); 
        ballBounce.add(5); 
        
        
        // Displays the balls
        boxContainer.fillCircle(xBallMotion, yBallMotion, diameter);
        
        
        
        
        
    
        
        
        
        // Creates motion at random for balls
        
        
        
    
        
    }
    
    /**
     * Updates each BoxBall in the collection
     *
     * 
     * 
     */
    public void boxBounce ()
    {
      
       
       

    }
    
  
    
    
    
 
}
