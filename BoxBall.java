import java.awt.Color;

/**
 * BoxBall models a ball that moves inside a box at random. The ball also 
 * bounces off the walls so that the ball always stays inside the box. 
 *
 * Emily Lubonty
 * 02-24-25
 */

public class BoxBall
{
    // instance variables - replace the example below with your own
    private Canvas boxContainer; 

    /**
     * Constructor for objects of class BoxBall
     */
    public BoxBall()
    {
        // initialise instance variables
        boxContainer = new Canvas("Box", 600, 500); 
        int rightWall = 200;
        int leftWall = 200; 
        int bottomWall = 200;
        int topWall = 200; 
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void boxBounce ()
    {
       int ground = 400; 
       
       boxContainer.setVisible(true); 
       
       
    }
}
