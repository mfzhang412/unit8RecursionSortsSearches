import java.awt.*;
import javax.swing.JPanel;

/**
 * Panel for drawing the Fractal Tree Lab
 * 
 * @author Michael Zhang
 * @version 3/16/2016
 */
public class FractalTreePanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private final int WIDTH = 800;
    private final int HEIGHT = 1000;
    
    private final double ANGLE = Math.PI / 3;
    
    private final double DEC_SIZE = .75;
    
    private int curr_order;
    
    /**
     * Default constructor for objects of class FractalTreePanel
     */
    public FractalTreePanel(int currentOrder)
    {
        curr_order = currentOrder;
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
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
    public void drawFractal(int order, int x1, int y1, int x2, int y2, double new_angle, Graphics g)
    {
        double dX, dY, xPos, yPos, xNeg, yNeg;
        
        if (order == 1)
        {
            g.drawLine(x1, y1, x2, y2);
        }
        else
        {
            dX = x2 - x1;
            dY = y2 - y1;
            
            double length = (Math.sqrt(dX * dX + dY * dY)) * DEC_SIZE;
            
            double new_angle_pos = ANGLE + new_angle;
            double new_angle_neg = ANGLE - new_angle;
            
            xPos = Math.sin(new_angle_pos) * length;
            yPos = Math.cos(new_angle_pos) * length;
            
            xNeg = Math.sin(new_angle_neg) * length;
            yNeg = Math.cos(new_angle_neg) * length;
            
            
            drawFractal(order - 1, x2, y2, (int) xPos, (int) yPos, new_angle_pos, g);
            drawFractal(order - 1, x2, y2, (int) xNeg, (int) yNeg, new_angle_neg, g);
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
        
        g.setColor(Color.GREEN);
        
        drawFractal(curr_order, WIDTH / 2, HEIGHT, WIDTH / 2, HEIGHT + 50, 0, g);
    }
    
    public void setOrder(int order)
    {
        curr_order = order;
    }
}
