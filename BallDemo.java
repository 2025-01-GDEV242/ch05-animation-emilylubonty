import java.awt.Color;
import java.util.HashSet;
import java.awt.Rectangle;


/**
 * BallDemo - a short demonstration showing animation with the 
 * Canvas class. Simulates multiple bouncing balls within a box
 *
 * @author Emily Lubonty
 * @version 3-6-2025
 */

public class BallDemo   
{
    private Canvas myCanvas;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
        HashSet<Integer> ballNumber = new HashSet<Integer>();
        ballNumber.add(30); 
        
        int rightWall = 200;
        int leftWall = 200;
        int topWall = 200;
        int bottomWall = 200;
    
    }

    /**
     * Simulates bouncing balls within a box. 
     */
    public void boxBounce()
    {
        
        int ground = 400;   // position of the ground line

        
        myCanvas.setVisible(true);

        // create and show the balls
        BoxBall ballNumber = new BoxBall(30, myCanvas); 
        ballNumber.draw();

        // make them bounce
        boolean finished =  false;
        while (!finished) {
            myCanvas.wait(50);           // small delay
            ballNumber.move();
            // stop once ball has travelled a certain distance on x axis
            if(ballNumber.getXPosition() >= 200 || ballNumber.getXPosition() >= 200) {
                finished = true;
            }
        }
    }
}
