//This class is to manage stocks

package mini.market.inventory.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author najwa khairina
 */
public class StockManagement implements ActionListener{

    JTextField item, qty;
    JLabel Item, Qty, print;
    JFrame myFrame;
    StockManagement[] stock;
    
    StockManagement (){
        //crate a new JFRame container
        myFrame = new JFrame("Stock booking");
        
        //Specify FlowLayout for the layout manager
        myFrame.setLayout(new FlowLayout());
        
        //Give the frame an intial size
        myFrame.setSize(500, 600);
        
        //Terminate the program when we close the apps
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Item = new JLabel("Item : ");
        myFrame.add(Item);
        item = new JTextField(40);
        myFrame.add(item);
        
        Qty = new JLabel("Quantity : ");
        myFrame.add(Qty);
        qty = new JTextField(40);
        myFrame.add(qty);
        
        print = new JLabel("");
        
        myFrame.add(print);
                
        //Add action listener
        item.addActionListener(this);
        qty.addActionListener(this);
        
        myFrame.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        print.setText(" Item : " + item.getText() +
                "    Quantity : " + qty.getText());
        }
    
    abstract class allStocks implements ActionListener{
        JButton delete, edit;
        allStocks(){
            myFrame = new JFrame("All Stocks");
        
            //Specify FlowLayout for the layout manager
            myFrame.setLayout(new FlowLayout());
        
            //Give the frame an intial size
            myFrame.setSize(500, 600);
        
            //Terminate the program when we close the apps
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            for(int x = 0; x <= stock.length; x++){
                stock[x] = new StockManagement();
                print.setText(" Item : " + stock[x].item.getText() +
                "    Quantity : " + stock[x].qty.getText());
                
                edit = new JButton("Edit");
                edit.addActionListener(this);
                myFrame.add(edit);
                
            }
            
        }
        
        public void actionPerformed(ActionEvent ae) {
            
        }
    }
    
    /*abstract class stockCalculation implements ActionListener{
        int stockIn = 
        int currentStock = 0;
        currentStock += stockIn;
        
    }*/
}
