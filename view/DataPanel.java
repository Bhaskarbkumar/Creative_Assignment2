package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.DataButtonListener;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class DataPanel {
    
    private JFrame window;
   
    private JTextField answerField = new JTextField(20);
    private JButton buyButton = new JButton("Buy");
    private JButton nextButton = new JButton("Next");
    private JButton exitButton = new JButton("Exit");
    private JButton cashbackButton = new JButton("Cashback");

    private DataCanvas canvas;



    public DataPanel(JFrame window){
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
        south3.add(exitButton);
        southPanel.add(south3);

        JPanel south4 = new JPanel();
        south4.add(cashbackButton);
        southPanel.add(south4);

        canvas = new DataCanvas(this);
        cp.add(BorderLayout.CENTER,canvas);

              
    DataButtonListener listener = new  DataButtonListener(this);
    nextButton.addActionListener(listener);
    buyButton.addActionListener(listener);
    exitButton.addActionListener(listener);

        
    }

    public JButton getNextButton(){
        return nextButton;
    }

    public JButton getExitButton(){
        return exitButton;
    }

    public JButton getCashbackButton(){
        return cashbackButton;
    }


    
    public JFrame getWindow(){
        return window;
    }
      

}


