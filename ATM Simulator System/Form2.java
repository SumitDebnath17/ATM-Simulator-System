import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Form2 extends JFrame implements ActionListener {
   JTextField panTextField,adharTextField;
   JButton next,previous;
   JRadioButton syes,sno,es,eno;
   JComboBox religion,category,income,educationq,occupation;
   String formno;
   Form2(String formno){
      this.formno=formno;
      setLayout(null);

    setTitle("APPLICATION FORM"); 

    JLabel additionalDetails = new JLabel("Page 2: Additional Details");
    additionalDetails.setFont(new Font("Raleway", Font.BOLD, 30));
    additionalDetails.setBounds(200, 20, 600, 50);
    additionalDetails.setForeground(Color.red);
    add(additionalDetails);

    JLabel rel = new JLabel("Religion :");
    rel.setFont(new Font("Arial", Font.BOLD, 20));
    rel.setBounds(100, 120, 100, 30);
    rel.setForeground(Color.MAGENTA);
    add(rel);
    
    String valReligion[]={"Hinduism","Islam","Christianity","Sikhism","Buddhism","Jainism"};
    religion= new JComboBox<>(valReligion);
    religion.setFont(new Font("Arial", Font.BOLD, 18));
    religion.setBounds(300, 120, 350, 30); 
    religion.setBackground(Color.LIGHT_GRAY);
    religion.setForeground(Color.BLACK); 
    add(religion);

    
    JLabel cat = new JLabel("Category :");
    cat.setFont(new Font("Arial", Font.BOLD, 20));
    cat.setBounds(100, 170, 200, 30);
    cat.setForeground(Color.MAGENTA);
    add(cat);

    String valCat[]={"General","OBC","SC","ST","Other"};
    category= new JComboBox<>(valCat);
    category.setBounds(300, 170, 350, 30); 
    category.setFont(new Font("Arial", Font.BOLD, 18));
    category.setBackground(Color.LIGHT_GRAY);
    category.setForeground(Color.BLACK); 
    add(category);

    JLabel incom = new JLabel("Income :");
    incom.setFont(new Font("Arial", Font.BOLD, 20));
    incom.setBounds(100, 220, 200, 30);
    incom.setForeground(Color.MAGENTA);
    add(incom);

    String valIncome[]={"Null","< 1,00,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
    income= new JComboBox<>(valIncome);
    income.setBounds(300, 220, 350, 30);
    income.setFont(new Font("Arial", Font.BOLD, 18));
    income.setForeground(Color.black);
    income.setBackground(Color.LIGHT_GRAY);
    add(income);

    JLabel edu = new JLabel("Educational ");
    edu.setFont(new Font("Arial", Font.BOLD, 20));
    edu.setBounds(100, 290, 200, 30);
    edu.setForeground(Color.MAGENTA);
    add(edu);
    JLabel education = new JLabel("Qualification :");
    education.setFont(new Font("Arial", Font.BOLD, 20));
    education.setBounds(100, 320, 200, 30);
    education.setForeground(Color.MAGENTA);
    add(education);

    String eduval[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
    educationq= new JComboBox<>(eduval);
    educationq.setBounds(300, 320, 350, 30); 
    educationq.setFont(new Font("Arial", Font.BOLD, 18));
    educationq.setBackground(Color.LIGHT_GRAY);
    educationq.setForeground(Color.black); 
    add(educationq);

    JLabel sc = new JLabel("Senior Citizen :");
    sc.setFont(new Font("Arial", Font.BOLD, 20));
    sc.setBounds(100, 370, 200, 30);
    sc.setForeground(Color.MAGENTA);
    add(sc);

    syes= new JRadioButton("Yes");
    syes.setBounds(300, 370, 100, 30);
    syes.setFont(new Font("Arial", Font.BOLD, 18));
    syes.setBackground(Color.LIGHT_GRAY);
    syes.setForeground(Color.BLACK);
    add(syes);
    sno= new JRadioButton("No");
    sno.setBounds(450, 370, 100, 30);
    sno.setFont(new Font("Arial", Font.BOLD, 18));
    sno.setBackground(Color.LIGHT_GRAY);
    sno.setForeground(Color.BLACK);
    add(sno);
    ButtonGroup seniGroup= new ButtonGroup();
    seniGroup.add(syes);
    seniGroup.add(sno);
    

    JLabel occ = new JLabel("Occupation :");
    occ.setFont(new Font("Arial", Font.BOLD, 20));
    occ.setBounds(100, 420, 200, 30);
    occ.setForeground(Color.MAGENTA);
    add(occ);

    String occval[]={"Salarified","Self-Employed","Bussiness","Student","Retired","Others"};
    occupation= new JComboBox<>(occval);
    occupation.setBounds(300, 420, 350, 30);
    occupation.setFont(new Font("Arial", Font.BOLD, 18)); 
    occupation.setBackground(Color.LIGHT_GRAY);
    occupation.setForeground(Color.black); 
    add(occupation);

    JLabel pan = new JLabel("PAN Number :");
    pan.setFont(new Font("Arial", Font.BOLD, 20));
    pan.setBounds(100, 470, 200, 30);
    pan.setForeground(Color.MAGENTA);
    add(pan);

    panTextField=new JTextField();
    panTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    panTextField.setBounds(300, 470, 350, 30);
    panTextField.setBackground(Color.LIGHT_GRAY);
    panTextField.setForeground(Color.BLACK);  
    add(panTextField);

    JLabel adhar = new JLabel("Aadhar Number :");
    adhar.setFont(new Font("Arial", Font.BOLD, 20));
    adhar.setBounds(100, 520, 200, 30);
    adhar.setForeground(Color.MAGENTA);
    add(adhar);

    adharTextField=new JTextField();
    adharTextField.setFont(new Font("Raleway", Font.BOLD, 18));
    adharTextField.setBounds(300, 520, 350, 30);  
    adharTextField.setBackground(Color.LIGHT_GRAY);
    adharTextField.setForeground(Color.BLACK);
    add(adharTextField);

    JLabel exisaccnt = new JLabel("Existing Account :");
    exisaccnt.setFont(new Font("Arial", Font.BOLD, 20));
    exisaccnt.setBounds(100, 570, 200, 30);
    exisaccnt.setForeground(Color.MAGENTA);
    add(exisaccnt);

    es= new JRadioButton("Yes");
    es.setBounds(300, 570, 100, 30);
    es.setFont(new Font("Arial", Font.BOLD, 18));
    es.setBackground(Color.LIGHT_GRAY);
    es.setForeground(Color.BLACK);
    add(es);
    eno= new JRadioButton("No");
    eno.setBounds(450, 570, 100, 30);
    eno.setFont(new Font("Arial", Font.BOLD, 18));
    eno.setBackground(Color.LIGHT_GRAY);
    eno.setForeground(Color.BLACK);
    add(eno);
    ButtonGroup eGroup= new ButtonGroup();
    eGroup.add(es);
    eGroup.add(eno);

    next=new JButton("NEXT");
    next.setBackground(Color.BLUE);
    next.setForeground(Color.white);
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBounds(570, 650, 80, 20);
    next.addActionListener(this);
    add(next);

    previous=new JButton("PREVIOUS");
    previous.setBackground(Color.BLUE);
    previous.setForeground(Color.white);
    previous.setFont(new Font("Raleway", Font.BOLD, 14));
    previous.setBounds(100, 650, 120, 20);
    previous.addActionListener(this);
    add(previous);


    getContentPane().setBackground(Color.DARK_GRAY);

    setSize(750,800);
    setLocation(380,10);
    setVisible(true);
   }

   public void actionPerformed(ActionEvent ae){
      String sreligion=(String)religion.getSelectedItem();
      String scategory=(String)category.getSelectedItem();
      String sincome=(String)income.getSelectedItem();
      String seducationq=(String)educationq.getSelectedItem();
      String soccupation=(String)occupation.getSelectedItem();
      String pan=panTextField.getText();
      String adhar=adharTextField.getText();
      String sc = null ;
      if (syes.isSelected()){
         sc="Yes";
      } else if(sno.isSelected()){
         sc="No";
      } 
      String exisaccnt =null;
      if (es.isSelected()){
         exisaccnt="Yes";
      } else if(eno.isSelected()){
         exisaccnt="No";
      } 
      try{

         if(ae.getSource()==previous){
            setVisible(false);
            new Form1().setVisible(true);
         }else{
         
         Conn c= new Conn();
         String query="insert into signup1 values('"+sreligion+"','"+scategory+"','"+sincome+"','"+seducationq+"','"+soccupation+"','"+pan+"','"+adhar+"','"+sc+"','"+exisaccnt+"')";
         c.s.executeUpdate(query);
        
         setVisible(false);
         new Form3(formno).setVisible(true);
         }

      } catch (Exception e){
         System.out.println(e);
         
      }
   }
   
    public static void main(String[] args) {
          new Form2("");
   }
}

