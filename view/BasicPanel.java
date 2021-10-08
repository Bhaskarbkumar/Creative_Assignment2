package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class BasicPanel {
    
    private JFrame window;
   
    private JTextField answerField = new JTextField(20);
    private JButton buyButton = new JButton("Buy");
    private JButton nextButton = new JButton("Next");
    private JButton cashbackButton = new JButton("Cashback");

    private BasicCanvas canvas;



    public BasicPanel(JFrame window){
        this.window= window;
    }

    public void init(){
        Container cp = window.getContentPane();
         
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,1));
        cp.add(BorderLayout.SOUTH,southPanel);

        JPanel south1 = new JPanel();
        south1.add(nextButton);
        southPanel.add(south1);

        JPanel south2 = new JPanel();
        south2.add(buyButton);
        southPanel.add(south2);

        JPanel south3 = new JPanel();
        south2.add(cashbackButton);
        southPanel.add(south3);

        canvas = new BasicCanvas(this);
        cp.add(BorderLayout.CENTER,canvas);

        nextButton.addActionListener(event-> {
            // String[] abd = new String[] {"949","810"};
            // for (int i=0;i<abd.length;i++) {
             //  if(abd[i].equals(phoneNum)){
 
                 window.getContentPane().removeAll();
                 var panel = new DataPanel(window);
                 panel.init();
                 window.pack();
                 window.revalidate(); 
            // }
           //else{
             //JOptionPane.showMessageDialog(menuPanel.getWindow(), "No question presented yet");
            //System.out.println("x");
            //}
         //}
         });

}


}

