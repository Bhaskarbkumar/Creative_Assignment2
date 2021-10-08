package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.DataPanel;
import view.MenuScreen;

public class DataButtonListener implements ActionListener{

    private DataPanel panel;

    public DataButtonListener(DataPanel panel){
        this.panel = panel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if(button == panel.getCashbackButton()) {
            JOptionPane.showMessageDialog(panel.getWindow(), "No cashbacks offered");
            
        }
        else if (button == panel.getExitButton()){
            panel.getWindow().getContentPane().removeAll();
            var menu = new MenuScreen(panel.getWindow());
            menu.init();
            panel.getWindow().pack();
            panel.getWindow().revalidate();
    }
}
    
}
