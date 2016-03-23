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
    private final int WIDTH = 1200;
    private final int HEIGHT = 800;
    
    private final double ANGLE = Math.PI / 6;
    
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
    public void drawFractal(int order, int x1, int y1, int x2, int y2, double new_angle, double prev_thick, Graphics g)
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
            
            if (order >= 8)
                g.setColor(Color.GRAY);
            else
                g.setColor(Color.GREEN);
            ((Graphics2D) g).setStroke(new BasicStroke(prev_thick * DEC_SIZE));
            g.drawLine(x1, y1, x2, y2);
            
            double length = (Math.sqrt(dX * dX + dY * dY)) * DEC_SIZE;
            
            double new_angle_pos = new_angle + ANGLE;
            double new_angle_neg = new_angle - ANGLE;
            
            xPos = x2 - Math.sin(new_angle_pos) * length;
            yPos = y2 - Math.cos(new_angle_pos) * length;
            
            xNeg = x2 - Math.sin(new_angle_neg) * length;
            yNeg = y2 - Math.cos(new_angle_neg) * length;
            
            drawFractal(order - 1, x2, y2, (int) xPos, (int) yPos, new_angle_pos, prev_thick * DEC_SIZE, g);
            drawFractal(order - 1, x2, y2, (int) xNeg, (int) yNeg, new_angle_neg, prev_thick * DEC_SIZE, g);
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
        
        g.setColor(Color.GRAY);
        
        drawFractal(curr_order, WIDTH / 2, HEIGHT, WIDTH / 2, HEIGHT - 200, 0, g);
    }
    
    public void setOrder(int order)
    {
        curr_order = order;
    }
}
