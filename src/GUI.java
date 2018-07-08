import javax.swing.*;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame
{
    public static void createFrame()
    {
        //defining the JMenu items
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Monthly Finance Summary");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu aboutMenu = new JMenu("Help");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        JMenuItem aboutMenuItem = new JMenuItem("About");

        panel.setLayout(new FlowLayout());

        //setting up the JFrame and components
        frame.add(panel);

        //menu bar stuff
        menuBar.add(fileMenu);
        menuBar.add(aboutMenu);

        fileMenu.add(exitMenuItem);
        aboutMenu.add(aboutMenuItem);

        //action listeners
        exitMenuItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                System.exit(0);
            }
        });

        //action listeners
        aboutMenuItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                 JOptionPane.showMessageDialog(null, "Created By Robert Ly © 2018");
            }
        });

        //frame stuff
        frame.add(menuBar);
        frame.setJMenuBar(menuBar);
        frame.setSize(800,800);
        frame.setVisible(true);

    }
}