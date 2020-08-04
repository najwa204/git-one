//The class is to save detail of booked items and and confirm delivery

package mini.market.inventory.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author najwa khairina
 */
public class StockBooking implements ActionListener{

    JTextField comp, contName, cont, itemm, qty, prc;
    JLabel company, name, contact, item, quantity, price, print;
    JFrame myFrame;
    StockBooking[] booking;
    
    
    StockBooking(){
        //crate a new JFRame comtainer
        myFrame = new JFrame("Stock booking");
        
        //Specify FlowLayout for the layout manager
        myFrame.setLayout(new FlowLayout());
        
        //Give the frame an intial size
        myFrame.setSize(700, 600);
        
        //Terminate the program when we close the apps
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        company = new JLabel("Company Name : ");
        myFrame.add(company);
        comp = new JTextField(50);
        myFrame.add(comp);
        
        name = new JLabel("Contact Name : ");
        myFrame.add(name);
        contName = new JTextField(50);
        myFrame.add(contName);
        
        contact = new JLabel("Contact Number : ");
        myFrame.add(contact);
        cont = new JTextField(50);
        myFrame.add(cont);
        
        item = new JLabel("Item : ");
        myFrame.add(item);
        itemm = new JTextField(55);
        myFrame.add(itemm);
        
        quantity = new JLabel("quantity : ");
        myFrame.add(quantity);
        qty = new JTextField(55);
        myFrame.add(qty);
        
        price = new JLabel("Price : ");
        myFrame.add(price);
        prc = new JTextField(50);
        myFrame.add(prc);
        
        print = new JLabel("");
        
        myFrame.add(print);
                
        //Add action listener
        comp.addActionListener(this);
        contName.addActionListener(this);
        cont.addActionListener(this);
        itemm.addActionListener(this);
        prc.addActionListener(this);
        qty.addActionListener(this);
        
        myFrame.setVisible(true);
        
    }
        
    public void actionPerformed(ActionEvent ae) {
        print.setText(" Company Name : " + comp.getText() +
                "    Contact Name : " + contName.getText() +
                "    Contact Number : " + cont.getText() +
                "    Item : " + itemm.getText() +
                "    Quantity: " + qty.getText() +
                "    Price : RM" + prc.getText());
        }
    
    abstract class allBookings implements ActionListener{
        JButton delete, edit;
        allBookings(){
            myFrame = new JFrame("All Bookings");
        
            //Specify FlowLayout for the layout manager
            myFrame.setLayout(new FlowLayout());
        
            //Give the frame an intial size
            myFrame.setSize(500, 600);
        
            //Terminate the program when we close the apps
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            for(int x = 0; x <= booking.length; x++){
                booking[x] = new StockBooking();
                print.setText(" Company Name : " + booking[x].comp.getText() +
                "    Contact Name : " + booking[x].contName.getText() +
                "    Contact Number : " + booking[x].cont.getText() +
                "    Item : " + booking[x].itemm.getText() +
                "    Quantity: " + booking[x].qty.getText());
                
                delete = new JButton("Delete");
                delete.addActionListener(this);
                myFrame.add(delete);
                
                edit = new JButton("Edit");
                edit.addActionListener(this);
                myFrame.add(edit);
                
            }
            
        }
        
        public void actionPerformed(ActionEvent ae) {
            
        }
    }
}