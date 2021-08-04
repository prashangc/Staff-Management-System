
        import java.awt.Color;
        import java.awt.Font;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import javax.swing.*;
        import java.util.ArrayList;
        
        class INGNepal implements ActionListener
            {
                private JFrame frame1;
                
            private JPanel panel1;
                
            private JLabel heading1,heading2,write1,write2,write3,write4,write5,write6,write7,write8,write9,
                write10,type1,type2,type3,type4,type5,type6,type7,type8,type9,type10,type11,type12; 
                
            private JTextField box1,box2,box4,box5,box6,box7,box9,box10,
                empty1,empty2,empty4,empty5,empty6,empty7,empty9,empty10,empty11,empty12; 
                
                private JComboBox box3,empty3,cmbYear,cmbMonth,cmbDay,cmbYear2,cmbMonth2,cmbDay2;           
                           
                private JButton button1,button2,button3,button4,button5,button6,button7;  
                
               
                
                
                
                int vacancy;
                int vacancy_no;
                String designation;
                String job_type,cmb,cmb_part;
                int working_hour;
                int salary;
                String working_shift;
                int wages_per_hour;
                String staffName;
                String appointedBy;
                String qualification;
                String joiningDate,year,month,day,year2,month2,day2;
                
                  ArrayList<StaffHire> array_list =new ArrayList<>();
                /*
                 * 
                 * 
                 * 
                 * 
                 */
                
                
                
                public void m1(){
                frame1 = new JFrame("form");
                panel1=new JPanel();
                frame1.setBounds(100,20,1200,690);// Bounds helps to set the size and location of the tab at once
                panel1.setLayout(null);
            
                /*
                 * 
                 * 
                 * 
                 * "Full Time Staff Hire"
                 * 
                 * 
                 * 
                 */
                heading1=new JLabel();
                heading1.setText("For full time staff hire");
                heading1.setBounds(250,10,305,50);
                Font topic=new Font("Arial",Font.BOLD,20);
                heading1.setFont(topic);
                panel1.add(heading1);    
            
                /*
                 * 
                 * 
                 * JLabel of Full Time Staff Hire
                 * 
                 * 
                 */
                write1=new JLabel();
                write1.setText("Vacancy no.");
                write1.setBounds(15,70,100,25);
                panel1.add(write1);  
            
                
                write2=new JLabel();
                write2.setText("Designation");
                write2.setBounds(15,110,100,25);
                panel1.add(write2); 
                
                write3=new JLabel();
                write3.setText("Job Type");
                write3.setBounds(15,150,100,25);
                panel1.add(write3);
                
                write4=new JLabel();
                write4.setText("Salary");
                write4.setBounds(15,190,100,25);
                panel1.add(write4);
                
                write5=new JLabel();
                write5.setText("working_hour");
                write5.setBounds(15,230,100,25);
                panel1.add(write5);
                
                write6=new JLabel();
                write6.setText("Staff name");
                write6.setBounds(370,70,100,25);
                panel1.add(write6);
                
                write7=new JLabel();
                write7.setText("Qualification");
                write7.setBounds(370,110,100,25);
                panel1.add(write7);
                
                write8=new JLabel();
                write8.setText("Joining Date");
                write8.setBounds(370,150,100,25);
                panel1.add(write8);
                
                write9=new JLabel();
                write9.setText("Appointed By");
                write9.setBounds(370,190,100,25);
                panel1.add(write9);
            
                write10=new JLabel();
                write10.setText("Vacancy no.");
                write10.setBounds(370,225,100,25);
                panel1.add(write10);
                    
            
                
                /*
                 * 
                 * 
                 * 
                 * JTextField of Full Time
                 * 
                 * 
                 * 
                 */
                
                box1=new JTextField();
                box1.setBounds(140,70,160,25);
                panel1.add(box1);
                
                box2=new JTextField();
                box2.setBounds(140,110,160,25);
                panel1.add(box2);
                
                /*
                String cmb[]={"Full Time", "Part Time"};
                box3= new JComboBox(cmb);
                */
               
               box3 = new JComboBox<>(new String[] {"Full Time", "Part Time" });
                box3.setBounds(140,150,160,25);
                panel1.add(box3);
               
                box4=new JTextField();
                box4.setBounds(140,190,160,25);
                panel1.add(box4);
                
                box5=new JTextField();
                box5.setBounds(140,230,160,25);
                panel1.add(box5);
                
                box6=new JTextField ();
                box6.setBounds(530,70,160,25);
                panel1.add(box6);
                
                box7=new JTextField();
                box7.setBounds(530,110,160,25);
                panel1.add(box7);
                
 
                
                cmbYear = new JComboBox<>(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012" , "2013","2014","2015","2016","2017","2018","2019","2020","2021"});
                 cmbYear.setBounds(530,150,60,30);
                 panel1.add(cmbYear);
            
                
                 
                 cmbMonth= new JComboBox<>(new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"});
                 cmbMonth.setBounds(593,150,50,30);
                 panel1.add(cmbMonth);
                
                
                cmbDay= new JComboBox<>(new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
                cmbDay.setBounds(650,150,39,30);
                panel1.add(cmbDay);
                
                
                box9=new JTextField();
                box9.setBounds(530,190,160,25);
                panel1.add(box9);
                
                box10=new JTextField();
                box10.setBounds(530,225,160,25);
                panel1.add(box10);
                  /*
                 * 
                 * 
                 * 
                 * 
                 * Button of Full Time
                 * 
                 * 
                 * 
                 */ 
                
              
                
                
                button1=new JButton("Add Full Time");  
                button1.setBounds(80,270,160,25);
                button1.addActionListener(this);
                panel1.add(button1);
                
                button2=new JButton("Appoint");  
                button2.setBounds(470,270,160,25);
                button2.addActionListener(this);
                panel1.add(button2);
                
                /*
                 * 
                 * 
                 * 
                 * Part Time Staff Hire
                 * 
                 *on
                 */
                
                heading2=new JLabel();
                heading2.setText("For part time staff hire");
                heading2.setBounds(250,300,300,50);
                Font topic2=new Font("Arial",Font.BOLD,20);
                heading2.setFont(topic2);
                panel1.add(heading2);
                /*
                 * 
                 * 
                 * 
                 * 
                 * Jlabel of part time
                 * 
                 * 
                 */
                type1=new JLabel();
                type1.setText("Vacancy no.");
                type1.setBounds(15,370,100,25);
                panel1.add(type1);  
            
                
                type2=new JLabel();
                type2.setText("Designation");
                type2.setBounds(15,410,100,25);
                panel1.add(type2); 
                
                type3=new JLabel();
                type3.setText("Job Type");
                type3.setBounds(15,450,100,25);
                panel1.add(type3);
                
                type4=new JLabel();
                type4.setText("Shift");
                type4.setBounds(15,490,100,25);
                panel1.add(type4);
                
                type5=new JLabel();
                type5.setText("working_hour");
                type5.setBounds(15,530,100,25);
                panel1.add(type5);
                
                type6=new JLabel();
                type6.setText("Wages per hour");
                type6.setBounds(15,570,100,25);
                panel1.add(type6);
                
                type7=new JLabel();
                type7.setText("Staff Name");
                type7.setBounds(370,400,100,25);
                panel1.add(type7);
                
                type8=new JLabel();
                type8.setText("Joining Date");
                type8.setBounds(370,440,100,25);
                panel1.add(type8);
                
                type9=new JLabel();
                type9.setText("Appointed By");
                type9.setBounds(370,480,100,25);
                panel1.add(type9);
            
            
            
                type10=new JLabel();
                type10.setText("Qualification");
                type10.setBounds(370,520,100,25);
                panel1.add(type10);
                
                
                type11=new JLabel();
                type11.setText("Vacancy no.");
                type11.setBounds(370,560,100,25);
                panel1.add(type11);
                
                type12=new JLabel();
                type12.setText("Vacancy no.");
                type12.setBounds(820,260,100,25);
                panel1.add(type12);
                /*
                 * 
                 * 
                 * 
                 * JTextField of Part Time
                 * 
                 * 
                 * 
                 */
                
                empty1=new JTextField();
                empty1.setBounds(140,370,160,25);
                panel1.add(empty1);
                
                empty2=new JTextField();
                empty2.setBounds(140,410,160,25);
                panel1.add(empty2);
                
                /*empty3=new JTextField();
                empty3.setBounds(140,450,160,25);
                panel1.add(empty3);
                */
               
               
                 empty3 = new JComboBox<>(new String[] {"Full Time", "Part Time" });
                empty3.setBounds(140,450,160,25);
                panel1.add(empty3);
                
                
                
                empty4=new JTextField();
                empty4.setBounds(140,490,160,25);
                panel1.add(empty4);
                
                empty5=new JTextField();
                empty5.setBounds(140,530,160,25);
                panel1.add(empty5);
                
                empty6=new JTextField();
                empty6.setBounds(140,570,160,25);
                panel1.add(empty6);
                
                empty7=new JTextField();
                empty7.setBounds(530,400,160,25);
                panel1.add(empty7);
                /*
                empty8=new JTextField();
                empty8.setBounds(530,440,160,25);
                panel1.add(empty8);
                */
                cmbYear2 = new JComboBox<>(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012" , "2013","2014","2015","2016","2017","2018","2019","2020","2021"});
                cmbYear2.setBounds(530,440,60,30);
                 panel1.add(cmbYear2);
            
                cmbMonth2= new JComboBox<>(new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"});
                 cmbMonth2.setBounds(593,440,50,30);
                 panel1.add(cmbMonth2);
                
                cmbDay2= new JComboBox<>(new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
                cmbDay2.setBounds(650,440,39,30);
                panel1.add(cmbDay2);
                
                
                empty9=new JTextField();
                empty9.setBounds(530,480,160,25);
                panel1.add(empty9);
                
                empty10=new JTextField();
                empty10.setBounds(530,520,160,25);
                panel1.add(empty10);
                
                empty11=new JTextField();
                empty11.setBounds(530,560,160,25);
                panel1.add(empty11);
                
                empty12=new JTextField();
                empty12.setBounds(950,260,160,25);
                panel1.add(empty12);
    
                  /*
                 * 
                 * 
                 * 
                 * 
                 * Button of  Part Time
                 * 
                 * 
                 * 
                 */ 
                
                button3=new JButton("Add Part Time");  
                button3.setBounds(80,610,160,25);
                button3.addActionListener(this);
                panel1.add(button3);
                
                button4=new JButton("Appoint");  
                button4.setBounds(470,610,160,25);
                button4.addActionListener(this);
                panel1.add(button4);
                
                button5=new JButton("Terminate part time");  
                button5.setBounds(890,300,160,25);
                button5.addActionListener(this);
                panel1.add(button5);
                
                
                /*
                 * 
                 * 
                 * Button at the last
                 * 
                 * 
                 * 
                 */
                button6=new JButton("Clear");  
                button6.setBounds(740,360,200,35);
                button6.addActionListener(this);
                panel1.add(button6);
                
                button7=new JButton("Display");  
                button7.setBounds(950,360,200,35);
                button7.addActionListener(this);
                panel1.add(button7);
     
                
                
                /*
                 * 
                 * 
                 * 
                 * 
                 * 
                 */
                //frame.setTitle("Form1");// gives title to the tab
                //frame.setSize(600,460); // gives size of the tab
                //frame.setLocation(450,100); //gives location of the tab
                frame1.add(panel1);
                
                frame1.setResizable(false);// cannot resize the tab when  false
                frame1.setVisible(true); // making the tab visible
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button1){
                
            try{
            vacancy=Integer.parseInt(box1.getText());
            designation=box2.getText();
            job_type=(box3.getSelectedItem()).toString();
            salary=Integer.parseInt(box4.getText());
            working_hour=Integer.parseInt(box5.getText());
                   
            
            boolean isDuplicateVacancy=false;
            for(StaffHire var:array_list)
        {
            if(var.getVacancy_number()==vacancy){
                isDuplicateVacancy=true;
                break;
            }
        }   
            if(isDuplicateVacancy==false)
            {
                FullTimeStaffHire full_time_obj = new FullTimeStaffHire(vacancy,designation,job_type,salary,working_hour);
                 array_list.add(full_time_obj);
                 JOptionPane.showMessageDialog(frame1,"Vacancy for full time added.");
            }
            
            else
            {
                JOptionPane.showMessageDialog(frame1,"Vacancy for full time is already added.");
               
            }
            
            
        }catch(Exception ee)
        {
            JOptionPane.showMessageDialog(frame1,"Invalid fields");
            
        }
    }
      
               
            if(e.getSource()==button3){
                
            try{
            vacancy=Integer.parseInt(empty1.getText());
            designation=empty2.getText();
            cmb_part=(empty3.getSelectedItem()).toString();
            job_type=cmb_part;
            wages_per_hour=Integer.parseInt(empty6.getText());
            working_hour=Integer.parseInt(empty5.getText());
            working_shift=empty4.getText();
         
            boolean isDuplicateVacancy=false;
            for(StaffHire var:array_list)
        {
            if(var.getVacancy_number()==vacancy){
                isDuplicateVacancy=true;
                break;
            }
        }   
            if(isDuplicateVacancy==false)
            {
                 PartTimeStaffHire part_time_obj = new PartTimeStaffHire(vacancy,designation,job_type,working_hour,wages_per_hour,working_shift);
                 array_list.add(part_time_obj);
                 JOptionPane.showMessageDialog(frame1,"Vacancy for part time added.");
            }
            else
            {
                JOptionPane.showMessageDialog(frame1,"Vacancy for part time is already added.");
            
            }
            
        }catch(Exception ee)
        {
            JOptionPane.showMessageDialog(frame1,"Invalid fields");
            
        }
    }
     if(e.getSource()==button2){
                
    try
    {
           vacancy=Integer.parseInt(box10.getText());
            staffName=box6.getText();
            qualification=box7.getText();
            year=(cmbYear.getSelectedItem()).toString();
            month=(cmbMonth.getSelectedItem()).toString();
            day=(cmbDay.getSelectedItem()).toString();
            joiningDate=year+month+day;
            appointedBy=box9.getText();
         
            boolean vacancyFound=false;
            for(StaffHire ob:array_list){
            if(ob.getVacancy_number()==vacancy){
               
                vacancyFound=true;
            if(ob instanceof FullTimeStaffHire){
                FullTimeStaffHire h=(FullTimeStaffHire)ob;
                
                if(h.getJoined()==true){
    
                      JOptionPane.showMessageDialog(frame1,"Staff has been already hired.");
    }
    else
    {
    h.FullTimeStaff_Hire(staffName,joiningDate,qualification,appointedBy);
                   
    JOptionPane.showMessageDialog(frame1,"Staff has been successfully hired.");
    break;
    }
    }
    else
    {
    JOptionPane.showMessageDialog(frame1,"Vacancy from part time staff hire has been entered !!!");
    break;
    }
    }
    }
    if(vacancyFound==false)
    {
    JOptionPane.showMessageDialog(frame1,"invalid vacancy.");
    }
    }
    
    
    catch(Exception ee)
    {
        JOptionPane.showMessageDialog(frame1,"please enter proper values.");
    }
            
    }
     if(e.getSource()==button4){
                
    try
    {
           vacancy=Integer.parseInt(empty11.getText());
            staffName=empty7.getText();
            qualification=empty10.getText();
            year2=(cmbYear2.getSelectedItem()).toString();
            month2=(cmbMonth2.getSelectedItem()).toString();
            day2=(cmbDay2.getSelectedItem()).toString();
            joiningDate=year2+month2+day2;
            
            appointedBy=empty9.getText();
         
            boolean vacancyFound=false;
            boolean Staff_nameFound=false;
            
            for(StaffHire ob_p:array_list){
            if(ob_p.getVacancy_number()==vacancy)
            {
               
                vacancyFound=true;
            if(ob_p instanceof PartTimeStaffHire){
                PartTimeStaffHire g=(PartTimeStaffHire)ob_p;
                
                if(g.getJoined()==true){
    
                      JOptionPane.showMessageDialog(frame1,"Staff has been already hired.");
    }
    else
    {
    g.Hire_PartTimeStaff(staffName,joiningDate,qualification,appointedBy);
                   
    JOptionPane.showMessageDialog(frame1,"Staff has been successfully hired.");
    break;
    }
    }
    else
    {
    JOptionPane.showMessageDialog(frame1,"vacancy for full time has been entered.");
    break;
    }
    }
    }
    if(vacancyFound==false)
    {
    JOptionPane.showMessageDialog(frame1,"invalid vacancy.");
    }
    }
    
    
    catch(Exception ee)
    {
        JOptionPane.showMessageDialog(frame1,"please enter proper values.");
    }
            
    }
      if(e.getSource()==button5){
            try
            {
                
           vacancy=Integer.parseInt(empty12.getText());
    
           boolean vacancyFound=false;
    
            for(StaffHire ob_t:array_list){
    
            if(ob_t.getVacancy_number()==vacancy){
               
                vacancyFound=true;
            if(ob_t instanceof PartTimeStaffHire){
                
              PartTimeStaffHire  l=(PartTimeStaffHire)ob_t;
                
                if(l.getJoined()==false){
            
                        
                      JOptionPane.showMessageDialog(frame1,"Staff has been already terminated.");
                break;
        }
    else {
         l.Terminate_Staff();      
    JOptionPane.showMessageDialog(frame1,"Staff has been terminated.");
    break;
    }
    }
    else
    {
    JOptionPane.showMessageDialog(frame1,"Vacancy from full time staff hire has been entered !!!");
    break;
    }
    }
    }
    
          if(vacancyFound==false)
    {
    JOptionPane.showMessageDialog(frame1,"invalid vacancy.");
    }
    }        catch(Exception ee){
                    JOptionPane.showMessageDialog(frame1,"Please enter valid vacancy.");
    
            }
    }
    if(e.getSource()==button6){
                        box1.setText("");
                        box2.setText("");
                        box3.setSelectedIndex(0);
                        box4.setText("");
                        box5.setText("");
                        box6.setText("");
                        box7.setText("");
                        cmbYear.setSelectedIndex(0);
                        cmbMonth.setSelectedIndex(0);
                        cmbDay.setSelectedIndex(0);
                        box9.setText("");
                        box10.setText("");
                        empty1.setText("");
                        empty2.setText("");
                        empty3.setSelectedIndex(0);
                        empty4.setText("");
                        empty5.setText("");
                        empty6.setText("");
                        empty7.setText("");
                        cmbYear2.setSelectedIndex(0);
                        cmbMonth2.setSelectedIndex(0);
                        cmbDay2.setSelectedIndex(0);
                        empty9.setText("");
                        empty10.setText("");
                        empty11.setText("");
                        empty12.setText("");
                    }
if(e.getSource()==button7)
{
    for(StaffHire var:array_list){ //iterating array list
    if(var instanceof FullTimeStaffHire){
        FullTimeStaffHire x=(FullTimeStaffHire)var;
        x.Display();
    }
    if(var instanceof PartTimeStaffHire){
        PartTimeStaffHire z=(PartTimeStaffHire)var;
        z.Display();
    }
}
}
}
public static void main(String[] args)
{
    INGNepal b= new INGNepal();
    b.m1();
 }
}