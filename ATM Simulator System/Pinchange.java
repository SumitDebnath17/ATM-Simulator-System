import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pinchange extends JFrame implements ActionListener {
    JButton change,back;
    JTextField pin,repin;
    String pinnumber;

   Pinchange(String pinnumber){
      this.pinnumber=pinnumber;
      setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 880);
        add(image);

        JLabel text=new JLabel("CHANGE YOUR PIN");
        text.setBounds(220, 270, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 15));
        image.add( text);

        JLabel pintext=new JLabel("New PIN :");
        pintext.setBounds(150, 310, 300, 35);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD, 15));
        image.add(pintext);

        pin=new JTextField();
        pin.setBounds(305, 310, 150, 25);
        pin.setFont(new Font("System", Font.BOLD, 15));
        image.add(pin);

        JLabel repintext=new JLabel("Re-Enter New PIN :");
        repintext.setBounds(150, 350, 300, 35);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD, 15));
        image.add(repintext);

        repin=new JTextField();
        repin.setBounds(305, 350, 150, 25);
        repin.setFont(new Font("System", Font.BOLD, 15));
        image.add(repin);

        change =new JButton("Change");
        change.setBounds(350, 450, 100, 20);
        change.addActionListener(this);
        image.add(change);

        back=new JButton("Back");
        back.setBounds(350, 475, 100, 20);
        back.addActionListener(this);
        image.add(back);

        setSize(800,830);
        setLocation(400,0);
        setUndecorated(true);
        setVisible(true);
   } 

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
            try{
            String npin=pin.getText();
            String rpin=repin.getText(); 

              if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter PIN");
                return;
              } if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "Please re-enter PIN");
                return;
              }if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
              }

             Conn conn=new Conn();
             String query1="update login set pin ='"+rpin+"' where pin ='"+pinnumber+"'";
             String query2="update bank set pin ='"+rpin+"' where pin ='"+pinnumber+"'";
             String query3="update signup3 set pin ='"+rpin+"' where pin ='"+pinnumber+"'";

             conn.s.executeUpdate(query1);
             conn.s.executeUpdate(query2);
             conn.s.executeUpdate(query3);

             JOptionPane.showMessageDialog(null, "PIN changed successfully");

             setVisible(false);
             new Transaction(rpin).setVisible(true);
        
            }catch(Exception e){
                 System.out.println(e);
            }
        }else{
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
    }
    public static void main (String args[]){
    new Pinchange("");
   }
}
