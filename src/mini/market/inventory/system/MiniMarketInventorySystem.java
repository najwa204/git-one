/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.market.inventory.system;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author najwa khairina 
 */
public class MiniMarketInventorySystem implements ActionListener{
    
    MiniMarketInventorySystem(){
        JFrame myFrame;
        
        //crate a new JFRame comtainer
        myFrame = new JFrame("Mini Market Inventory");
        
        //Specify FlowLayout for the layout manager
        myFrame.setLayout(new FlowLayout());
        
        //Give the frame an intial size
        myFrame.setSize(500, 500);
        
        //Terminate the program when we close the apps
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton stockbooking = new JButton("New Booking");
        JButton stockmanagement = new JButton("Stock Management");
        
        //Add action listener
        stockbooking.addActionListener(this);
        stockmanagement.addActionListener(this);
        
        //Add the button to the content frame
        myFrame.add(stockbooking);
        myFrame.add(stockmanagement);
        
        //Create a text-based panel
        JLabel myLabel = new JLabel("");
        
        //Add the label to the frame
        myFrame.add(myLabel);
        
        //Display the frame
        myFrame.setVisible(true);
    }
        
        //Handle the button
        public void actionPerformed(ActionEvent ae) {
            if(ae.getActionCommand().equals("New Booking"))
                runNewBooking();
            else
                runStockManagement();
        }
        
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            new MiniMarketInventorySystem();
            }
        });
    }
    
    public void runNewBooking(){
        StockBooking booking = new StockBooking();
    }
    
    public void runStockManagement(){
        StockManagement booking = new StockManagement();
    }

}