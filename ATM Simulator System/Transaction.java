
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class Transaction extends JFrame implements ActionListener{
    JButton deposit,pinchange,balanceenquiry,fastcash,exit,withdrawl,ministatement;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber=pinnumber;

        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 880);
        add(image);

        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(180, 270, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 15));
        image.add( text);

        deposit=new JButton("Deposit");
        deposit.setBounds(160, 350, 120, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawl=new JButton("Cash Withdrawl");
        withdrawl.setBounds(310, 350, 130, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        fastcash=new JButton("Fast Cash");
        fastcash.setBounds(160, 390, 120, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement=new JButton("Mini Statement");
        ministatement.setBounds(310, 390, 130, 30);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange=new JButton("Pin Change");
        pinchange.setBounds(160, 430, 120, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balanceenquiry=new JButton("Balance Enquiry");
        balanceenquiry.setBounds(310, 430, 130, 30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        exit=new JButton("Exit");
        exit.setBounds(380, 480, 60, 20);
        exit.addActionListener(this);
        image.add(exit);

        setSize(800,830);
        setLocation(400,0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==exit){
            System.exit(0);
        }else if (ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if (ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if (ae.getSource()==fastcash){
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        }else if (ae.getSource()==pinchange){
            setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        } else if (ae.getSource()==balanceenquiry){
            setVisible(false);
            new Balanceenquiry(pinnumber).setVisible(true);
        } else if (ae.getSource()==ministatement){
            new Ministatement(pinnumber).setVisible(true);
        }

    }

    public static void main (String args[]){
        new Transaction("");
      
    }
}
