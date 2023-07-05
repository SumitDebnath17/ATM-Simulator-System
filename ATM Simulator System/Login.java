
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
  
    Login() {
    
      setTitle("AUTOMATED TELLER MACHINE");      //title of jframe

      setLayout(null);

      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\logo.jpg"));          //get image from destop location and name this i1
      Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);     // get image from i1 and scale or resize this image and name i2
      ImageIcon i3= new ImageIcon(i2);                                                         //  now convert i2 in a imageIcon and name i3
      JLabel label= new JLabel(i3);                                                            
      label.setBounds(180, 13, 100, 100);                                   //    location of image
      add(label);                                                                           //     add in jframe

      JLabel text = new JLabel("Welcome to ATM");                                            // text
      text.setFont(new Font("Osward", Font.BOLD, 38));                                 //  font style, size, bold
      text.setBounds(300, 50, 400, 40);                                        //   location of text
      text.setForeground(Color.RED);
      add(text);

      JLabel cardno = new JLabel("Card No : ");                                                 // text
      cardno.setFont(new Font("Raleway", Font.BOLD, 28));                                 // font style, size, bold
      cardno.setBounds(150, 150, 400, 40);                                        //  location of text
      cardno.setForeground(Color.BLUE);
      add(cardno);

      cardTextField=new JTextField();                                                           // create text field
      cardTextField.setBounds(320, 150, 320, 40);                             //  location of text field
      cardTextField.setFont(new Font("Arial", Font.BOLD, 18));                      // font ,size,bold of user text
      cardTextField.setForeground(Color.BLACK);
      add(cardTextField );                                                                   //   add in jframe

      JLabel pin = new JLabel("PIN : ");                                                     // text
      pin.setFont(new Font("Raleway", Font.BOLD, 28));                                 //  font style, size, bold
      pin.setBounds(150, 200, 400, 40);                                        //   location of text
      pin.setForeground(Color.BLUE);
      add(pin);

      pinTextField=new JPasswordField();                                               //  text field for pin
      pinTextField.setBounds(320, 200, 320, 40);
      pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
      add(pinTextField );

      login = new JButton("SIGN IN");
      login.setBounds(320, 280, 120, 30);
      login.setBackground(Color.YELLOW);
      login.setForeground(Color.RED);
      login.addActionListener(this);                                             //for action input of this button
      add(login);

      clear = new JButton("CLEAR");
      clear.setBounds(520, 280, 120, 30);
      clear.setBackground(Color.YELLOW);
      clear.setForeground(Color.RED);
      clear.addActionListener(this);                                          //for action input of this button
      add(clear);

      signup = new JButton("SIGN UP");
      signup.setBounds(320, 340, 320, 30);
      signup.setBackground(Color.YELLOW);
      signup.setForeground(Color.RED);
      signup.addActionListener(this);                                          //for action input of this button
      add(signup);
      
      getContentPane().setBackground(Color.LIGHT_GRAY);        // color of jframe

      setSize(800,480);
      setMinimumSize(new Dimension(300, 400));                    // size of jframe
      setVisible(true);
      setLocation(350, 200);                      // location of jframe
    } 

    public void actionPerformed (ActionEvent ae){                 //action performed which is given by action input button
      if(ae.getSource()==clear){                                 // check which button call
        cardTextField.setText("");
        pinTextField.setText("");
      }else if (ae.getSource()==login){
        Conn conn=new Conn();
        String cardnumber= cardTextField.getText();
        String pinnumber = pinTextField.getText();
        String query= "select * from login where cardnumber = '"+cardnumber+"' and pin ='"+pinnumber+"'";
        try{
          ResultSet rs =conn.s.executeQuery(query);
          if(rs.next()){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
          }else{
            JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
          }

        }catch(Exception e){
          System.out.println(e);
        }

      }else if (ae.getSource()==signup){
        setVisible(false);
        new Form1().setVisible(true);
      }
    }

    public static void main (String args []) {
    new Login();
  }    
    
}