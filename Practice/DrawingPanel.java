import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JColorChooser;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author Michael Zhang
 * @version 3/22/2016
 */
public class DrawingPanel extends JPanel
{
    private ArrayList<Particle> list;
    
    private ClickListener click;
    
    private String currParticle;
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        list = new ArrayList<Particle>();
        click = new ClickListener();
        this.addMouseListener(click);
    }

    public chooseParticle(String charge)
    {
        if ("Pos".equals(charge))
            currParticle = "+";
        else
            currParticle = "-";
    }
    
    public void paintComponenet(Graphics g)
    {
        super.paintComponenet(g);
        for(Particle part: list)
        {
            part.draw();
        }
    }
    
    public class ClickListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            int x = this.getX();
            int y = this.getY();
            Particle part = new Particle(x, y);
            
            repaint();
        }
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    }
}
