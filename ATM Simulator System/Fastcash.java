import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import javax.swing.*;



public class Fastcash extends JFrame implements ActionListener{
    JButton deposit,pinchange,balanceenquiry,fastcash,exit,withdrawl,ministatement;
    String pinnumber;
    Fastcash(String pinnumber){
        this.pinnumber=pinnumber;

        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 880);
        add(image);

        JLabel text=new JLabel("SELECT  WITHDRAWL  AMOUNT");
        text.setBounds(180, 270, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 15));
        image.add( text);

        deposit=new JButton("Rs 100");
        deposit.setBounds(160, 350, 120, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawl=new JButton("Rs 500");
        withdrawl.setBounds(310, 350, 130, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        fastcash=new JButton("Rs 1000");
        fastcash.setBounds(160, 390, 120, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement=new JButton("Rs 2000");
        ministatement.setBounds(310, 390, 130, 30);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange=new JButton("Rs 5000");
        pinchange.setBounds(160, 430, 120, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balanceenquiry=new JButton("Rs 10000");
        balanceenquiry.setBounds(310, 430, 130, 30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        exit=new JButton("Back");
        exit.setBounds(370, 480, 70, 20);
        exit.addActionListener(this);
        image.add(exit);

        setSize(800,830);
        setLocation(400,0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==exit){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }else {
            String amount =((JButton) ae.getSource()).getText().substring(3);
            Conn c= new Conn();
            try{
               ResultSet rs =c.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
               int balance =0;
               while (rs.next()){
                   if (rs.getString("type").equals("Deposit")){
                    balance +=Integer.parseInt(rs.getString("amount"));
                   }else {
                    balance -=Integer.parseInt(rs.getString("amount"));
                   }

               }

               if (ae.getSource ()!=exit && balance< Integer.parseInt(amount)){
                  JOptionPane.showMessageDialog(null, "Insufficient Balance");
                  return;
               }

               Date date= new Date();
               String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Rs "+ amount +" Debited Successfully");

               setVisible(false);
               new Transaction(pinnumber).setVisible(true);

            }catch (Exception e){
                System.out.println(e);
            }
        }

    }

    public static void main (String args[]){
        new Fastcash("");
      
    }
}
