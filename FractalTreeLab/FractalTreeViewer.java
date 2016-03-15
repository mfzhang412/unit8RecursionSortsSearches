import java.awt.*;
import javax.swing.*;

/**
 * Class that allows the user to view the fractal tree
 * 
 * @author Michael Zhang
 * @version 3/15/2016
 */
public class FractalTreeViewer
{
    /** description of instance variable x (add comment for each instance variable) */
    private final int WIDTH = 800;
    private final int HEIGHT = 1000;
    
    private FractalTreePanel panel;
    private JFrame frame;

    /**
     * Default constructor for objects of class FractalTreeViewer
     */
    public FractalTreeViewer()
    {
        // initialise instance variables
        frame = new JFrame();
        
        frame.setTitle("Fractal Tree Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        panel = new FractalTreePanel();
        frame.add(panel);
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
    }
}
