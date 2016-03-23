import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author Michael Zhang
 * @version 3/22/2016
 */
public class ControlPanel extends JPanel
{
    private JButton positive;
    private JButton negative;
    
    private DrawingPanel panel;
    
    public ControlPanel(DrawingPanel panel)
    {
        this.panel = panel;
        
        this.positive = new JButton("Positively charged particle");
        this.negative = new JButton("Negatively charged particle");
        
        this.add(positive);
        this.add(negative);
        
        ChooserListenerPos listenerPos = new ChooserListenerPos();
        ChooserListenerNeg listenerNeg = new ChooserListenerNeg();
        
        positive.addActionlistener(listenerPos);
        negative.addActionListener(listenerNeg);
    }

    public class ChooserListenerPos implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            panel.chooseParticle("Pos");
        }
    }

    public class ChooserListenerNeg implements Actionlistener
    {
        public void actionperformed(ActionEvent e)
        {
            panel.chooseparticle("Neg");
        }
    }
}
