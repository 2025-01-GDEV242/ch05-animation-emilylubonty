import java.awt.*;
import java.awt.geom.*;
import java.util.HashSet;
import java.util.Random; 


/**
 * Class BoxBall - Creates graphics for the bouncing balls and the box. Coordinates how the balls move 
 * at random and their positions.
 *
 * This movement can be initiated by repeated calls to the "move" method.
 * 
 * @author Emily Lubonty
 *
 * @version 3-6-2025
 */

public class BoxBall
{
    // private static final int GRAVITY = 3;  // effect of gravity
    private int ballDegradation = 2;
    private Ellipse2D.Double circle;
    private int diameter;
    private int xPosition;
    private int yPosition;
    // private final int groundPosition;      // y position of ground
    private Canvas canvas;
    private int ySpeed;                // initial downward speed
    private Color color; 

    /**
     * Constructor for objects of class BoxBall
     *
     * @param xPos  the horizontal coordinate of the balls
     * @param yPos  the vertical coordinate of the balls
     * @param ballDiameter  the diameter (in pixels) of the balls
     * @param ballColor  the color of the balls
     * @param groundPos  the position of the ground (where the wall will bounce)
     * @param drawingCanvas  the canvas to draw the balls on
     * @param r,g,b the colors for the balls
     */
    public BoxBall(int ballDiameter, 
                    Canvas drawingCanvas)
    {
        Random random = new Random();
        
        //Creates random RGB colors
        int r = random.nextInt(256); 
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        
        Color ballColor = new Color(r,g,b);
        ballColor = color; 
        
        diameter = ballDiameter;
        
        canvas = drawingCanvas; 
        
        //Parameters for ball position and speed
        int ySpeed = random.nextInt();
        int yPosition = random.nextInt(); 
        int xPosition = random.nextInt(); 
        int ballDegradation = random.nextInt();
       
        
    }

    /**
     * Draw the balls and the box at their current positions onto the canvas.
     **/
    public void draw()
    {

        int rightWall = 200;
        int leftWall = 200;
        int topWall = 200;
        int bottomWall = 200;
    
        canvas.setForegroundColor(color);
        canvas.fillCircle(xPosition, yPosition, diameter);
        canvas.fillRectangle(topWall, bottomWall, leftWall, rightWall); 
        
    }
    
    /**
     * Erases the balls at their current positions.
     **/
    public void erase()
    {
        canvas.eraseCircle(xPosition, yPosition, diameter);
    }    

    /**
     * Move the balls according to their positions and speed, redraws when finished.
     **/
    public void move()
    {
        // remove from canvas at the current position
        erase();
            
        // compute new position
        Random random = new Random(); 
        
        int bottomWall = 200;  
        
        
        ySpeed += 5; 
        xPosition = random.nextInt(200); 
        yPosition = random.nextInt(200);  
        
        // check if it has hit the ground
        if (yPosition >= (bottomWall - diameter) && ySpeed > 0) {
            yPosition = (int)(bottomWall - diameter);
            ySpeed = -ySpeed + ballDegradation;
        }

        // draw again at new position
        draw();
    }    

    /**
     * return the horizontal position of this ball
     */
    public int getXPosition()
    {
        return xPosition;
    }

    /**
     * return the vertical position of this ball
     */
    public int getYPosition()
    {
        return yPosition;
    }

}