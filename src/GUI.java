import javax.swing.*;
import java.awt.FlowLayout;

public class GUI extends JFrame
{
    public static void createFrame() {
        //defining the JMenu items
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Monthly Finance Summary");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");

        panel.setLayout(new FlowLayout());

        //setting up the JFrame and components
        frame.add(panel);

        //menu bar stuff
        menuBar.add(menu);

        frame.add(menuBar);
        frame.setSize(800,800);
        frame.setVisible(true);
    }
}