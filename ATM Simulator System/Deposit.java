import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    JButton deposit,back;
    JTextField amount;
    String pinnumber;

    Deposit(String pinnumber){

        this.pinnumber=pinnumber;
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 880);
        add(image);

        JLabel text=new JLabel("Enter the amount you want to deposit");
        text.setBounds(160, 270, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 15));
        image.add( text);

        amount= new JTextField();
        amount.setBounds(160, 310, 280, 30);
        amount.setForeground(Color.ORANGE);
        amount.setBackground(Color.DARK_GRAY);
        amount.setFont(new Font("System", Font.BOLD, 20));
        image.add(amount);

        deposit=new JButton("Deposit");
        deposit.setBounds(355, 430, 80, 20);
        deposit.addActionListener(this);
        image.add(deposit);

        back=new JButton("Back");
        back.setBounds(355, 460, 80, 20);
        back.addActionListener(this);
        image.add(back);


        setSize(800,830);
        setLocation(400,0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){
            String number =amount.getText();
            Date date=new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
            }
            else {
                  try{
                     Conn conn=new Conn();
                     String query="insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                     conn.s.executeUpdate(query);
                     JOptionPane.showMessageDialog(null, "Rs "+number+" Deposited successfully" );
                     setVisible(false);
                     new Transaction(pinnumber).setVisible(true);
                    } catch (Exception e){
                       System.out.println(e);
                    }
                }


        }
        else if (ae.getSource()==back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);

        }
    }

    public static void main (String args[]){
        new Deposit("");
    }
}