import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Write a description of abstract class Particle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Particle
{
    /** description of instance variable x (add comment for each instance variable) */
    public Point2D.Double center;

    /**
     * Default constructor for objects of class Particle
     */
    public Particle(Point2D.Double c)
    {
        center = c;
    }
    
    public 
    
    /**
     * An example of an abstract method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public abstract int sampleAbstractMethod(int y);

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
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
