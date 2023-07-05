import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Ministatement extends JFrame {
    String pinnumber;
    Ministatement(String pinnumber){
      this.pinnumber=pinnumber;
      setLayout(null);

      JLabel mini=new JLabel();
      mini.setBounds(20, 140, 400, 200);
      mini.setFont(new Font("System", Font.BOLD, 14));
      mini.setForeground(Color.BLACK);
      add(mini);

      JLabel bank =new JLabel("Indian Bank");
      bank.setBounds(140,20,150,20);
      bank.setFont(new Font("System", Font.BOLD, 20));
      bank.setForeground(Color.BLACK);
      add(bank);

      JLabel card =new JLabel();
      card.setBounds(20,80,300,20);
      card.setFont(new Font("System", Font.BOLD, 14));
      card.setForeground(Color.black);
      add(card);

      JLabel balance =new JLabel();
      balance.setBounds(20,400,320,20);
      balance.setFont(new Font("System", Font.BOLD, 14));
      balance.setForeground(Color.black);
      add(balance);

      try{
        Conn conn=new Conn();
        ResultSet rs=conn.s.executeQuery("select * from login where pin ='"+pinnumber+"'");
        while(rs.next()){
            card.setText("Card Number : "+rs.getString("cardnumber").substring(0, 4)+"-XXXX-"+rs.getString("cardnumber").substring(8));
        }
      }catch(Exception e){
        System.out.println(e);
      }

      try{
        Conn conn=new Conn();
        int bal=0;
        ResultSet rs=conn.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
        while(rs.next()){
            mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
             if (rs.getString("type").equals("Deposit")){
                    bal +=Integer.parseInt(rs.getString("amount"));
                   }else {
                    bal -=Integer.parseInt(rs.getString("amount"));
                   }
        }
        balance.setText("Your Current Account Balance is =  Rs "+bal);
      }catch (Exception e){
        System.out.println(e);
      }

      

      

      setSize(400, 600);
      setLocation(20, 20);
      getContentPane().setBackground(Color.WHITE);
      setVisible(true);

    }
    


    public static void main(String[] args) {
     new Ministatement("");    
    }
}
