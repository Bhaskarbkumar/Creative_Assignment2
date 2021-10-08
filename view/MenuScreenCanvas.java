package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.JPanel;

public class MenuScreenCanvas extends JPanel {
    public static int WIDTH = 300;
    public static int HEIGHT = 300;
    
    private MenuScreen pane;

    public MenuScreenCanvas(MenuScreen pane){
              this.pane = pane;
              setPreferredSize(new Dimension(WIDTH,HEIGHT));
              setBackground(Color.YELLOW);
              
    }

@Override

public void paintComponent(Graphics g) {
       super.paintComponent(g);

       Graphics2D g2 = (Graphics2D) g;

           g2.setColor(Color.BLUE);
           g2.setFont(new Font("Courier", Font.ITALIC,80));
           g2.drawString("My Jio App",500,300);
}
}
