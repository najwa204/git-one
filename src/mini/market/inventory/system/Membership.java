/*
This class is for customer membership
 */
package mini.market.inventory.system;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author najwa khairina
 */
public class Membership implements ActionListener{
    JTextField name, phone, points;
    JLabel Name, Phone, Points, print;
    JFrame myFrame;
    Membership[] member;
    int totalPoints = 0;
    
    Membership (){
        //crate a new JFRame container
        myFrame = new JFrame("Membership");
        
        //Specify FlowLayout for the layout manager
        myFrame.setLayout(new FlowLayout());
        
        //Give the frame an intial size
        myFrame.setSize(500, 600);
        
        //Terminate the program when we close the apps
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Name = new JLabel("Name : ");
        myFrame.add(Name);
        name = new JTextField(40);
        myFrame.add(name);
        
        Phone = new JLabel("Phone Number : ");
        myFrame.add(Phone);
        phone = new JTextField(40);
        myFrame.add(phone);
        
        Points = new JLabel("Points : ");
        myFrame.add(Points);
        points = new JTextField(40);
        myFrame.add(points);
        
        print = new JLabel("");
        
        myFrame.add(print);
                
        //Add action listener
        name.addActionListener(this);
        phone.addActionListener(this);
        
        myFrame.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        print.setText(" Name : " + name.getText() +
                "    Phone Number : " + phone.getText() +
                "    Total Points : " + points.getText() );
        }
    
    abstract class allMembers implements ActionListener{
        JButton delete, edit;
        allMembers(){
            myFrame = new JFrame("All Members");
        
            //Specify FlowLayout for the layout manager
            myFrame.setLayout(new FlowLayout());
        
            //Give the frame an intial size
            myFrame.setSize(500, 600);
        
            //Terminate the program when we close the apps
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            for(int x = 0; x <= member.length; x++){
                member[x] = new Membership();
                print.setText(" Name : " + member[x].name.getText() +
                "    Phone Number : " + member[x].phone.getText() +
                "    Points : " + member[x].points.getText());
                
                edit = new JButton("Edit");
                edit.addActionListener(this);
                myFrame.add(edit);
                
            }
            
        }
        
        public void actionPerformed(ActionEvent ae) {
            
        }
    }
    
}
