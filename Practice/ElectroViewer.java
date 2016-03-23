import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * Frame that holds panel and ultimately, displays the movement of charged particles
 * in an electric field.
 * 
 * @author Michael Zhang
 * @version 3/22/2015
 */
public class ElectroViewer extends JFrame
{
    private final int WIDTH = 1000;
    private final int HEIGHT = 1200;
    
    private DrawingPanel panel;
    private ControlPanel controls;
    
    public ElectroViewer()
    {
        canvas = new PhysicsPanel();
        controls = new ControlPanel(canvas);
        
        this.setLayout(new BorderLayout());
        this.add(controls, BorderLayout.SOUTH);
        this.add(canvas, BorderLayout.CENTER);
        
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ElectroViewer frame = new ElectroViewer();
    }
}
