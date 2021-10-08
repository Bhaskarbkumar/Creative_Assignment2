

package view;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Scanner;

import model.PlanDatabase;
import model.Mobile;
import view.BasicPanel;

import java.awt.GridLayout;
import java.lang.reflect.Array;
import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.Dimension;

public class MenuScreen {
    
    private JFrame window;

    Scanner login = new Scanner(System.in);

    ArrayList<Mobile> mob;

    private MenuScreenCanvas canvas;
    private JTextField numField = new JTextField(30);
    private JButton proceedButton = new JButton("Proceed");
    private JPanel menuPanel;

    public MenuScreen(JFrame window){
        this.window = window;
    }

    String phoneNum=login.next();

   // public JFrame getWindow(){
        //return window;
    //}

    public void init(){

        Container cp = window.getContentPane();

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout((new GridLayout(1,1)));
        menuPanel.setPreferredSize(new Dimension(50,50));
        menuPanel.add(new JLabel("Enter your phone number: "));
        menuPanel.add(numField);
        numField.setEditable(true);
        menuPanel.add(proceedButton);

        canvas = new MenuScreenCanvas(this);

        cp.add(BorderLayout.CENTER,canvas);
 
        cp.add(BorderLayout.SOUTH,menuPanel);

        //long response=menuPanel.getAnswerField().getText();

        proceedButton.addActionListener(event-> {
           // String[] abd = new String[] {"949","810"};
           // for (int i=0;i<abd.length;i++) {
            //  if(abd[i].equals(phoneNum)){

                window.getContentPane().removeAll();
                var panel = new BasicPanel(window);
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

public JTextField getNumField(){
    return numField;
}


}



