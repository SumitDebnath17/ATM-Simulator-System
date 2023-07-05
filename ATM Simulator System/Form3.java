import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class Form3 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel,previous;
    String formno;
    Form3(String formno){
    this.formno=formno;
    setLayout(null);
    setTitle("APPLICATION FORM"); 

    JLabel l1 = new JLabel("Page 3: Account Details");
    l1.setFont(new Font("Raleway", Font.BOLD, 30));
    l1.setBounds(200, 20, 600, 50);
    l1.setForeground(Color.red);
    add(l1);

    JLabel type = new JLabel("Account Type :");
    type.setFont(new Font("Arial", Font.BOLD, 25));
    type.setBounds(100, 120, 200, 30);
    type.setForeground(Color.MAGENTA);
    add(type);

    r1= new JRadioButton("Saving Account");
    r1.setBounds(100, 160, 280, 25);
    r1.setFont(new Font("Arial", Font.BOLD, 18));
    r1.setBackground(Color.DARK_GRAY);
    r1.setForeground(Color.ORANGE);
    add(r1);
    r2= new JRadioButton("Fixed Deposit Account");
    r2.setBounds(420, 160, 280, 25);
    r2.setFont(new Font("Arial", Font.BOLD, 18));
    r2.setBackground(Color.DARK_GRAY);
    r2.setForeground(Color.ORANGE);
    add(r2);
    r3= new JRadioButton("Current Account");
    r3.setBounds(100, 200, 280, 25);
    r3.setFont(new Font("Arial", Font.BOLD, 18));
    r3.setBackground(Color.DARK_GRAY);
    r3.setForeground(Color.ORANGE);
    add(r3);
    r4= new JRadioButton("Recurring Deposit Account");
    r4.setBounds(420, 200, 280, 25);
    r4.setFont(new Font("Arial", Font.BOLD, 18));
    r4.setBackground(Color.DARK_GRAY);
    r4.setForeground(Color.ORANGE);
    add(r4);
    ButtonGroup seniGroup= new ButtonGroup();
    seniGroup.add(r1);
    seniGroup.add(r2);
    seniGroup.add(r3);
    seniGroup.add(r4);

    JLabel card = new JLabel("Card Number :");
    card.setFont(new Font("Arial", Font.BOLD, 25));
    card.setBounds(100, 250, 200, 30);
    card.setForeground(Color.MAGENTA);
    add(card);

    JLabel number = new JLabel("XXXX-XXXX-XXXX");
    number.setFont(new Font("Arial", Font.BOLD, 25));
    number.setBounds(300, 250, 300, 30);
    number.setForeground(Color.yellow);
    add(number);

    JLabel pin = new JLabel("PIN Number :");
    pin.setFont(new Font("Arial", Font.BOLD, 25));
    pin.setBounds(100, 300, 200, 30);
    pin.setForeground(Color.MAGENTA);
    add(pin);

    JLabel pnumber = new JLabel("XXXX");
    pnumber.setFont(new Font("Arial", Font.BOLD, 25));
    pnumber.setBounds(300, 300, 300, 30);
    pnumber.setForeground(Color.yellow);
    add(pnumber);

    JLabel services = new JLabel("Services Required :");
    services.setFont(new Font("Arial", Font.BOLD, 25));
    services.setBounds(100, 350, 250, 30);
    services.setForeground(Color.MAGENTA);
    add(services);

    c1= new JCheckBox("ATM  Card");
    c1.setBounds(100, 390, 280, 25);
    c1.setFont(new Font("Arial", Font.BOLD, 18));
    c1.setBackground(Color.DARK_GRAY);
    c1.setForeground(Color.GREEN);
    add(c1);
    c2= new JCheckBox("Email & SMS Alert");
    c2.setBounds(420, 390, 280, 25);
    c2.setFont(new Font("Arial", Font.BOLD, 18));
    c2.setBackground(Color.DARK_GRAY);
    c2.setForeground(Color.GREEN);
    add(c2);
    c3= new JCheckBox("Cheque Book");
    c3.setBounds(100, 430, 280, 25);
    c3.setFont(new Font("Arial", Font.BOLD, 18));
    c3.setBackground(Color.DARK_GRAY);
    c3.setForeground(Color.GREEN);
    add(c3);
    c4= new JCheckBox("Internet Banking");
    c4.setBounds(420, 430, 280, 25);
    c4.setFont(new Font("Arial", Font.BOLD, 18));
    c4.setBackground(Color.DARK_GRAY);
    c4.setForeground(Color.GREEN);
    add(c4);
    c5= new JCheckBox("Mobile Banking");
    c5.setBounds(100, 470, 280, 25);
    c5.setFont(new Font("Arial", Font.BOLD, 18));
    c5.setBackground(Color.DARK_GRAY);
    c5.setForeground(Color.GREEN);
    add(c5);
    c6= new JCheckBox("E-Statement");
    c6.setBounds(420, 470, 280, 25);
    c6.setFont(new Font("Arial", Font.BOLD, 18));
    c6.setBackground(Color.DARK_GRAY);
    c6.setForeground(Color.GREEN);
    add(c6);

    c7= new JCheckBox("I hereby declared that the above entered details are correct to the best of my knowledge.");
    c7.setBounds(100, 600, 600, 15);
    c7.setFont(new Font("Arial", Font.BOLD, 13));
    c7.setBackground(Color.DARK_GRAY);
    c7.setForeground(Color.CYAN);
    add(c7);

    submit=new JButton("SUBMIT");
    submit.setBackground(Color.BLUE);
    submit.setForeground(Color.white);
    submit.setFont(new Font("Raleway", Font.BOLD, 14));
    submit.setBounds(570, 650, 100, 20);
    submit.addActionListener(this);
    add(submit);

    cancel=new JButton("CANCEL");
    cancel.setBackground(Color.BLUE);
    cancel.setForeground(Color.white);
    cancel.setFont(new Font("Raleway", Font.BOLD, 14));
    cancel.setBounds(100, 650, 100, 20);
    cancel.addActionListener(this);
    add(cancel);

    previous=new JButton("PREVIOUS");
    previous.setBackground(Color.BLUE);
    previous.setForeground(Color.white);
    previous.setFont(new Font("Raleway", Font.BOLD, 14));
    previous.setBounds(300, 650, 120, 20);
    previous.addActionListener(this);
    add(previous);
    

    getContentPane().setBackground(Color.DARK_GRAY);
    setSize(750,800);
    setLocation(380,10);
    setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
     if(ae.getSource()==submit){
        String accounttype=null;
        if(r1.isSelected()){
            accounttype="Saving Account";
        }else if(r2.isSelected()){
            accounttype="Fixed Deposit account";
        }else if(r3.isSelected()){
            accounttype="Current Account";
        }else if(r4.isSelected()){
            accounttype="Recurring Deposit Account";
        }
        Random random=new Random();
        String cardnumber= ""+Math.abs((random.nextLong() % 900000000000L)+100000000000L);
        String pinnumber=""+Math.abs((random.nextLong() % 9000L)+1000L);
         
        String facility ="";
        if(c1.isSelected()){
            facility=facility+" ATM  Card";
        }else if(c2.isSelected()){
            facility=facility+" Email & SMS Alert";
        }else if(c3.isSelected()){
            facility=facility+" Cheque Book";
        }else if(c4.isSelected()){
            facility=facility+" Internet Banking";
        }else if(c5.isSelected()){
            facility=facility+" Mobile Banking";
        }else if(c6.isSelected()){
            facility=facility+" E-Statement";
        }

         try{
            
           Conn c= new Conn();
           String query1= "insert into signup3 values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
           c.s.executeUpdate(query1);
           String query2= "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
           c.s.executeUpdate(query2);

           JOptionPane.showMessageDialog(null, "Card Number: "+ cardnumber+ "\n PIN: "+ pinnumber);

           setVisible(false);
           new Login().setVisible(true);
            
         }catch (Exception e){
            System.out.println(e);
         }
        

     } else if(ae.getSource()==previous){
        setVisible(false);
        new Form2(formno).setVisible(true);
     }else if(ae.getSource()==cancel){
        setVisible(false);
        new Login().setVisible(true);

     }
    }
    public static void main(String args[]){
        new Form3("");
    }
    
}
