package view;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.BasicPlan;
import model.DataPlan;
import model.PlanDatabase;

public class DataCanvas extends JPanel {

    private DataPanel panel;

    public DataCanvas(DataPanel panel){
        this.panel=panel;
        setPreferredSize(new Dimension(500,400));
        setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2= (Graphics2D) g;
       

       
        
        DataPlan q = new DataPlan("2GB","$450", "unlimited", "unlimited",  "84 days");
       
        q.render(g2);
        //q1.render(g3);
        //q2.render(g4);
        
        //}
}
}

