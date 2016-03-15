import java.awt.*;
import javax.swing.JPanel;

/**
 * Write a description of class FractalTreePanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractalTreePanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private final int WIDTH = 800;
    private final int HEIGHT = 1000;
    
    private final double DEC_SIZE = .75;
    private final double ANGLE = Math.pi / 6;
    
    /**
     * Default constructor for objects of class FractalTreePanel
     */
    public FractalTreePanel()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void drawFractal(int x1, int y1, int x2, int y2, double prev_length)
    {
        if (prev_length  <= 10)
        {
            g.drawLine(x1, y1, x2, y2);
        }
        else
        {
            prev_length = ;
            drawFractal (x1, y1, x2, y2, 
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent (g);
        
        drawFractal(//start x, //start y, //end x, //end y, initial length / percentage);
    }

}
