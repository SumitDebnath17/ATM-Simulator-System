import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Balanceenquiry extends JFrame implements ActionListener{
    JButton back;
    String pinnumber;
    Balanceenquiry(String pinnumber){
     this.pinnumber=pinnumber;
     setLayout(null);

     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(800, 900, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(0, 0, 800, 880);
     add(image);

      Conn c= new Conn();
      int balance =0;
            try{
               ResultSet rs =c.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
               
               while (rs.next()){
                   if (rs.getString("type").equals("Deposit")){
                    balance +=Integer.parseInt(rs.getString("amount"));
                   }else {
                    balance -=Integer.parseInt(rs.getString("amount"));
                   }

               }
            } catch(Exception e){
                System.out.println(e);
            } 
            
     JLabel text=new JLabel("Your Curent Account Balance is Rs "+ balance);
     text.setBounds(140, 360, 300, 35);
     text.setForeground(Color.WHITE);
     text.setFont(new Font("System", Font.BOLD, 15));
     image.add( text);      

     back=new JButton("Back");
     back.setBounds(350, 475, 100, 20);
     back.addActionListener(this);
     image.add(back);

     setSize(800,830);
     setLocation(400,0);
     setUndecorated(true);
     setVisible(true);
    }
    public void  actionPerformed(ActionEvent ae){
      setVisible(false);
      new Transaction(pinnumber).setVisible(true);
    }


    public static void main (String args[]){
        new Balanceenquiry("");
    }
}
