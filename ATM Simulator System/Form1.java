import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.Random;


public class Form1 extends JFrame implements ActionListener {
   long random;
   JTextField nameTextField,fnameTextField ,dobTextField,mailTextField,phTextField,addressTextField,cityTextField,distTextField,stateTextField,pinTextField;
   JButton next;
   JRadioButton male,female,other,others,married,unmarried;
   JDateChooser dateChooser ;
   Form1(){

    setLayout(null);

    setTitle("APPLICATION FORM"); 

    Random ran= new Random();
    long random=Math.abs((ran.nextLong() % 9000L)+1000L);

    JLabel formno=new JLabel("Form Number : "+ random);
    formno.setFont(new Font("Rakeway", Font.BOLD, 30));
    formno.setBounds(200, 20, 600, 50);
    formno.setForeground(Color.orange);
    add(formno);

    JLabel personalDetails = new JLabel("Page 1: Personal Details");
    personalDetails.setFont(new Font("Raleway", Font.BOLD, 18));
    personalDetails.setBounds(240, 60, 500, 30);
    personalDetails.setForeground(Color.red);
    add(personalDetails);

    JLabel name = new JLabel("Name :");
    name.setFont(new Font("Arial", Font.BOLD, 20));
    name.setBounds(100, 120, 100, 30);
    name.setForeground(Color.MAGENTA);
    add(name);

    nameTextField=new JTextField();
    nameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    nameTextField.setBounds(300, 120, 350, 30); 
    nameTextField.setBackground(Color.LIGHT_GRAY);
    nameTextField.setForeground(Color.blue); 
    add(nameTextField);

    JLabel fname = new JLabel("Father's Name :");
    fname.setFont(new Font("Arial", Font.BOLD, 20));
    fname.setBounds(100, 170, 200, 30);
    fname.setForeground(Color.MAGENTA);
    add(fname);

    fnameTextField=new JTextField();
    fnameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    fnameTextField.setBounds(300, 170, 350, 30); 
    fnameTextField.setBackground(Color.LIGHT_GRAY);
    fnameTextField.setForeground(Color.blue); 
    add(fnameTextField);

    JLabel dob = new JLabel("Date of Birth :");
    dob.setFont(new Font("Arial", Font.BOLD, 20));
    dob.setBounds(100, 220, 200, 30);
    dob.setForeground(Color.MAGENTA);
    add(dob);

    dateChooser=new JDateChooser();
    dateChooser.setBounds(300, 220, 350, 30);
    dateChooser.setForeground(Color.BLUE);
    dateChooser.setBackground(Color.LIGHT_GRAY);
    add(dateChooser);

    JLabel gender = new JLabel("Gender :");
    gender.setFont(new Font("Arial", Font.BOLD, 20));
    gender.setBounds(100, 270, 200, 30);
    gender.setForeground(Color.MAGENTA);
    add(gender);

    male=new JRadioButton("Male");
    male.setBounds(300, 270, 100, 30);
    male.setFont(new Font("Raleway", Font.BOLD, 15));
    male.setForeground(Color.BLUE);
    male.setBackground(Color.LIGHT_GRAY);
    add(male);
    female=new JRadioButton("Female");
    female.setBounds(425, 270 , 100, 30);
    female.setFont(new Font("Raleway", Font.BOLD, 15));
    female.setForeground(Color.BLUE);
    female.setBackground(Color.LIGHT_GRAY);
    add( female );
    other= new JRadioButton("Others");
    other.setBounds(550, 270, 100, 30);
    other.setFont(new Font("Raleway", Font.BOLD, 15));
    other.setForeground(Color.BLUE);
    other.setBackground(Color.LIGHT_GRAY);
    add(other);

    ButtonGroup gendergroup= new ButtonGroup();
    gendergroup.add(male);
    gendergroup.add(female);
    gendergroup.add(other);

    JLabel mail = new JLabel("Email Address :");
    mail.setFont(new Font("Arial", Font.BOLD, 20));
    mail.setBounds(100, 320, 200, 30);
    mail.setForeground(Color.MAGENTA);
    add(mail);

    mailTextField=new JTextField();
    mailTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    mailTextField.setBounds(300, 320, 350, 30); 
    mailTextField.setBackground(Color.LIGHT_GRAY);
    mailTextField.setForeground(Color.blue); 
    add(mailTextField);

    JLabel ph = new JLabel("Phone Number :");
    ph.setFont(new Font("Arial", Font.BOLD, 20));
    ph.setBounds(100, 370, 200, 30);
    ph.setForeground(Color.MAGENTA);
    add(ph);

    phTextField=new JTextField();
    phTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    phTextField.setBounds(300, 370, 350, 30);  
    phTextField.setBackground(Color.LIGHT_GRAY);
    phTextField.setForeground(Color.blue);
    add(phTextField);

    JLabel marital = new JLabel("Marital Status :");
    marital.setFont(new Font("Arial", Font.BOLD, 20));
    marital.setBounds(100, 420, 200, 30);
    marital.setForeground(Color.MAGENTA);
    add(marital);

    married=new JRadioButton("Married");
    married.setBounds(300, 420, 100, 30);
    married.setFont(new Font("Raleway", Font.BOLD, 15));
    married.setForeground(Color.BLUE);
    married.setBackground(Color.LIGHT_GRAY);
    add(married);
    unmarried=new JRadioButton("Unmarried");
    unmarried.setBounds(420, 420, 110, 30);
    unmarried.setFont(new Font("Raleway", Font.BOLD, 15));
    unmarried.setForeground(Color.BLUE);
    unmarried.setBackground(Color.LIGHT_GRAY);
    add(unmarried);
    others= new JRadioButton("Others");
    others.setBounds(550, 420, 100, 30);
    others.setFont(new Font("Raleway", Font.BOLD, 15));
    others.setForeground(Color.BLUE);
    others.setBackground(Color.LIGHT_GRAY);
    add(others);

    ButtonGroup maritalgroup= new ButtonGroup();
    maritalgroup.add(married);
    maritalgroup.add(unmarried);
    maritalgroup.add(others);

    JLabel address = new JLabel("Address :");
    address.setFont(new Font("Arial", Font.BOLD, 20));
    address.setBounds(100, 470, 200, 30);
    address.setForeground(Color.MAGENTA);
    add(address);

    addressTextField=new JTextField();
    addressTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    addressTextField.setBounds(220, 470, 430, 30);
    addressTextField.setBackground(Color.LIGHT_GRAY);
    addressTextField.setForeground(Color.blue);  
    add(addressTextField);

    JLabel city = new JLabel("City :");
    city.setFont(new Font("Arial", Font.BOLD, 20));
    city.setBounds(100, 520, 200, 30);
    city.setForeground(Color.MAGENTA);
    add(city);

    cityTextField=new JTextField();
    cityTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    cityTextField.setBounds(220, 520, 130, 30);  
    cityTextField.setBackground(Color.LIGHT_GRAY);
    cityTextField.setForeground(Color.blue);
    add(cityTextField);

    JLabel dist = new JLabel("District :");
    dist.setFont(new Font("Arial", Font.BOLD, 20));
    dist.setBounds(380, 520, 200, 30);
    dist.setForeground(Color.MAGENTA);
    add(dist);

    distTextField=new JTextField();
    distTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    distTextField.setBounds(500, 520, 150, 30); 
    distTextField.setBackground(Color.LIGHT_GRAY);
    distTextField.setForeground(Color.blue); 
    add(distTextField);

    JLabel state = new JLabel("State :");
    state.setFont(new Font("Arial", Font.BOLD, 20));
    state.setBounds(100, 570, 200, 30);
    state.setForeground(Color.MAGENTA);
    add(state);

    stateTextField=new JTextField();
    stateTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    stateTextField.setBounds(220, 570, 130, 30);  
    stateTextField.setBackground(Color.LIGHT_GRAY);
    stateTextField.setForeground(Color.blue);
    add(stateTextField);

    JLabel pin = new JLabel("Pin Code :");
    pin.setFont(new Font("Arial", Font.BOLD, 20));
    pin.setBounds(380, 570, 200, 30);
    pin.setForeground(Color.MAGENTA);
    add(pin);

    pinTextField=new JTextField();
    pinTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    pinTextField.setBounds(500, 570, 150, 30); 
    pinTextField.setBackground(Color.LIGHT_GRAY);
    pinTextField.setForeground(Color.blue); 
    add(pinTextField);

    next=new JButton("NEXT");
    next.setBackground(Color.BLUE);
    next.setForeground(Color.white);
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBounds(570, 650, 80, 20);
    next.addActionListener(this);
    add(next);


    getContentPane().setBackground(Color.DARK_GRAY);

    setSize(750,800);
    setLocation(380,10);
    setVisible(true);
   }

   public void actionPerformed(ActionEvent ae){
      String formno=""+ random;
      String name=nameTextField.getText();
      String fname=fnameTextField.getText();
      String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
      String mail=mailTextField.getText();
      String ph=phTextField.getText();
      String address=addressTextField.getText();
      String city=cityTextField.getText();
      String dist=distTextField.getText();
      String pin=pinTextField.getText();
      String state=stateTextField.getText();
      String gender = null ;
      if (male.isSelected()){
         gender="Male";
      } else if(female.isSelected()){
         gender="Female";
      } else if(other.isSelected()){
         gender="Others";
      }
      String marital =null;
      if (married.isSelected()){
         marital="Married";
      } else if(unmarried.isSelected()){
         marital="Unmarried";
      } else if(others.isSelected()){
         marital="Others";
      }

      try{
        if (name.equals("")){
         JOptionPane.showMessageDialog(null,  "Name is Required");
        }else if (fname.equals("")){
         JOptionPane.showMessageDialog(null,  "Father's Name is Required");
        }else if (dob.equals("")){
         JOptionPane.showMessageDialog(null,  "Date of Birth is Required");
        }else if (mail.equals("")){
         JOptionPane.showMessageDialog(null,  "Email is Required");
        }else if (ph.equals("")){
         JOptionPane.showMessageDialog(null,  "Phone Number is Required");
        }else if (address.equals("")){
         JOptionPane.showMessageDialog(null,  "Address is Required");
        }else if (city.equals("")){
         JOptionPane.showMessageDialog(null,  "City is Required");
        }else if (state.equals("")){
         JOptionPane.showMessageDialog(null,  "State is Required");
        }else if (dist.equals("")){
         JOptionPane.showMessageDialog(null,  "District is Required");
        }else if (pin.equals("")){
         JOptionPane.showMessageDialog(null,  "Pincode is Required");
        }else {
         Conn c= new Conn();
         String query="insert into signup values('"+name+"','"+fname+"','"+dob+"','"+gender+"','"+mail+"','"+ph+"','"+marital+"','"+address+"','"+city+"','"+dist+"','"+state+"','"+pin+"')";
         c.s.executeUpdate(query);

         setVisible(false);
         new Form2(formno).setVisible(true);
        

         
      }
        
      } catch (Exception e){
         System.out.println(e);
         
      }
   }
   
    public static void main(String[] args) {
          new Form1();
   }
}
