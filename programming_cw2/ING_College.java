package programming_cw2;


import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
  
 public class ING_College implements ActionListener {
     //Declaring Variables
     JFrame frame;
     JPanel panel1,panel2;
     JLabel title;
     JLabel title2;
     JLabel CourseID,CourseID1;
     JTextField Course_ID,Course_ID1;
     JLabel CourseName,CourseName1;
     JTextField Course_Name,Course_Name1;
     JLabel CourseLeader,CourseLeader1;
     JTextField Course_Leader,Course_Leader1;
     JLabel LecturerName;
     JTextField Lecturer_Name;
     JLabel Level;
     JTextField level;
     JLabel Credit;
     JTextField credit;
     JLabel P1;
     JTextField p1;
     JLabel InstructorName;
     JTextField Instructor_Name;
     JLabel NoOfAssessments;
     JTextField No_Of_Assessments;
     JLabel S1,S2;
     JComboBox date_1;
     JComboBox month_1;
     JComboBox year_1;
     JLabel C1,C2;
     JComboBox date_2;
     JComboBox month_2;
     JComboBox year_2;
     JLabel E1;
     JComboBox date;
     JComboBox month;
     JComboBox year;
     JCheckBox term;
     JCheckBox term1;
     JLabel Duration,D1;
     JTextField duration,d1;
     JButton Display;
     JButton Clear;
     JButton Add;
     JButton Register;
     JButton Add1;
     JButton Register1;
     JButton Display1;
     JButton Clear1;
     JButton Remove;
     JButton Add_NC;
     JButton Add_C;
     JLabel res;
     JTextArea tout;
     JLabel res1;
     JTextArea tout1;
    
     String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
     String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
     String years[]
        = { "2020","2021","2022","2023" };
            
     
        
        //Creating ArrayList
        ArrayList<course> Array_List = new ArrayList();
      AcademicCourse Academic;
      NonAcademicCourse nonAcademic;
       
  
    //Creating the GUI Method
    public void ING_College()
    {
        frame= new JFrame();
        frame.setTitle("Course Registration");
        frame.setBounds(0, 0, 1300, 700);
        frame.setLayout(null);
        
        /*
         * Acdemic Course
         */
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        Color CPanel1 = new Color(51,153,255);
        panel1.setBackground(CPanel1);
        panel1.setBounds(0, 0, 1400, 700);
        panel1.setVisible(true);
        frame.add(panel1);
  
        title = new JLabel("Academic Course");
        title.setFont(new Font("Arial", Font.PLAIN, 40));
        title.setSize(500, 30);
        title.setLocation(300, 30);
        panel1.add(title);
  
        CourseID = new JLabel("Course ID");
        CourseID.setFont(new Font("Arial", Font.PLAIN, 20));
        CourseID.setSize(100, 20);
        CourseID.setLocation(100, 100);
        panel1.add(CourseID);
  
        Course_ID = new JTextField();
        Course_ID.setFont(new Font("Arial", Font.PLAIN, 15));
        Course_ID.setSize(150, 20);
        Course_ID.setLocation(250, 100);
        panel1.add(Course_ID);
        
        CourseName = new JLabel("Course Name");
        CourseName.setFont(new Font("Arial", Font.PLAIN, 20));
        CourseName.setSize(250, 20);
        CourseName.setLocation(100, 150);
        panel1.add(CourseName);
  
        Course_Name= new JTextField();
        Course_Name.setFont(new Font("Arial", Font.PLAIN, 15));
        Course_Name.setSize(150, 20);
        Course_Name.setLocation(250, 150);
        panel1.add(Course_Name);
        
        CourseLeader = new JLabel("Course Leader");
        CourseLeader.setFont(new Font("Arial", Font.PLAIN, 20));
        CourseLeader.setSize(150, 20);
        CourseLeader.setLocation(550, 300);
        panel1.add(CourseLeader);
  
        Course_Leader = new JTextField();
        Course_Leader.setFont(new Font("Arial", Font.PLAIN, 15));
        Course_Leader.setSize(150, 20);
        Course_Leader.setLocation(720, 300);
        panel1.add(Course_Leader);
        
        LecturerName = new JLabel("Lecturer Name");
        LecturerName.setFont(new Font("Arial", Font.PLAIN, 20));
        LecturerName.setSize(150, 20);
        LecturerName.setLocation(100, 300);
        panel1.add(LecturerName);
  
        Lecturer_Name = new JTextField();
        Lecturer_Name.setFont(new Font("Arial", Font.PLAIN, 15));
        Lecturer_Name.setSize(150, 20);
        Lecturer_Name.setLocation(250, 300);
        panel1.add(Lecturer_Name);
        
        Level = new JLabel("Level");
        Level.setFont(new Font("Arial", Font.PLAIN, 20));
        Level.setSize(150, 20);
        Level.setLocation(100, 200);
        panel1.add(Level);
  
        level = new JTextField();
        level.setFont(new Font("Arial", Font.PLAIN, 15));
        level.setSize(150, 20);
        level.setLocation(250, 200);
        panel1.add(level);
        
        Credit = new JLabel("Credit");
        Credit.setFont(new Font("Arial", Font.PLAIN, 20));
        Credit.setSize(150, 20);
        Credit.setLocation(550, 200);
        panel1.add(Credit);
  
        credit = new JTextField();
        credit.setFont(new Font("Arial", Font.PLAIN, 15));
        credit.setSize(150, 20);
        credit.setLocation(720, 200);
        panel1.add(credit);
        
        NoOfAssessments = new JLabel("Assessments");
        NoOfAssessments.setFont(new Font("Arial", Font.PLAIN, 20));
        NoOfAssessments.setSize(200, 20);
        NoOfAssessments.setLocation(550, 150);
        panel1.add(NoOfAssessments);
  
        No_Of_Assessments = new JTextField();
        No_Of_Assessments.setFont(new Font("Arial", Font.PLAIN, 15));
        No_Of_Assessments.setSize(150, 20);
        No_Of_Assessments.setLocation(720, 150);
        panel1.add(No_Of_Assessments);
        
        S1 = new JLabel("Start Date");
        S1.setFont(new Font("Arial", Font.PLAIN, 20));
        S1.setSize(150, 20);
        S1.setLocation(100, 350);
        panel1.add(S1);
  
        date_1 = new JComboBox(dates);
        date_1.setFont(new Font("Arial", Font.PLAIN, 15));
        date_1.setSize(60, 20);
        date_1.setLocation(200, 350);
        panel1.add(date_1);
  
        month_1 = new JComboBox(months);
        month_1.setFont(new Font("Arial", Font.PLAIN, 15));
        month_1.setSize(60, 20);
        month_1.setLocation(260, 350);
        panel1.add(month_1);
  
        year_1 = new JComboBox(years);
        year_1.setFont(new Font("Arial", Font.PLAIN, 15));
        year_1.setSize(60, 20);
        year_1.setLocation(320, 350);
        panel1.add(year_1);
        
        C1 = new JLabel("Completion Date");
        C1.setFont(new Font("Arial", Font.PLAIN, 20));
        C1.setSize(200, 20);
        C1.setLocation(550, 350);
        panel1.add(C1);
  
        date_2 = new JComboBox(dates);
        date_2.setFont(new Font("Arial", Font.PLAIN, 15));
        date_2.setSize(60, 20);
        date_2.setLocation(700, 350);
        panel1.add(date_2);
  
        month_2 = new JComboBox(months);
        month_2.setFont(new Font("Arial", Font.PLAIN, 15));
        month_2.setSize(60, 20);
        month_2.setLocation(760, 350);
        panel1.add(month_2);
  
        year_2 = new JComboBox(years);
        year_2.setFont(new Font("Arial", Font.PLAIN, 15));
        year_2.setSize(60, 20);
        year_2.setLocation(820, 350);
        panel1.add(year_2);
        
        Duration = new JLabel("Course Duration");
        Duration.setFont(new Font("Arial", Font.PLAIN, 20));
        Duration.setSize(200, 20);
        Duration.setLocation(550, 100);
        panel1.add(Duration);
        
        duration= new JTextField();
        duration.setFont(new Font("Arial", Font.PLAIN, 15));
        duration.setSize(150, 20);
        duration.setLocation(720, 100);
        panel1.add(duration);
        
        Display= new JButton("Display");
        Display.setFont(new Font("Arial", Font.PLAIN, 15));
        Display.setSize(150, 30);
        Display.setLocation(300, 500);
        Display.addActionListener(this);
        panel1.add(Display);
  
        Clear = new JButton("Clear");
        Clear.setFont(new Font("Arial", Font.PLAIN, 15));
        Clear.setSize(150, 30);
        Clear.setLocation(500, 500);
        Clear.addActionListener(this);
        panel1.add(Clear);
        
        Add= new JButton("Add");
        Add.setFont(new Font("Arial", Font.PLAIN, 15));
        Add.setSize(150, 30);
        Add.setLocation(400,250);
        Add.addActionListener(this);
        panel1.add(Add);
        
        Register= new JButton("Register");
        Register.setFont(new Font("Arial", Font.PLAIN, 15));
        Register.setSize(150, 30);
        Register.setLocation(400,400);
        Register.addActionListener(this);
        panel1.add(Register);
        
        term1 = new JCheckBox("Enable Text Area");
        term1.setFont(new Font("Arial", Font.PLAIN, 15));
        term1.setSize(250, 20);
        term1.setLocation(100, 450);
        panel1.add(term1);
        
        
        Add_NC= new JButton("Add Non-Academic Course");
        Add_NC.setFont(new Font("Arial", Font.PLAIN, 15));
        Add_NC.setSize(250, 30);
        Add_NC.setLocation(350, 550);
        Add_NC.addActionListener(this);
        panel1.add(Add_NC);
        
        
        tout1 = new JTextArea();
        tout1.setFont(new Font("Arial", Font.PLAIN, 15));
        tout1.setSize(300, 400);
        tout1.setLocation(900, 100);
        tout1.setLineWrap(true);
        tout1.setEditable(false);
        panel1.add(tout1);
        
        res1 = new JLabel("");
        res1.setFont(new Font("Arial", Font.PLAIN, 20));
        res1.setSize(500, 25);
        res1.setLocation(900, 550);
        panel1.add(res1);
        
        /*
         * Non Academic Course 
         */
        
        
        
        panel2 = new JPanel();
        panel2.setLayout(null);
        Color CPanel2 = new Color(175,255,175);
        panel2.setBackground(CPanel1);
        panel2.setBounds(0, 0, 1400, 700);
        panel2.setVisible(false);
        frame.add(panel2);
        
        title2 = new JLabel("Non Academic Course");
        title2.setFont(new Font("Arial", Font.PLAIN, 40));
        title2.setSize(500, 30);
        title2.setLocation(300, 30);
        panel2.add(title2);
  
        CourseID1 = new JLabel("Course ID");
        CourseID1.setFont(new Font("Arial", Font.PLAIN, 20));
        CourseID1.setSize(100, 20);
        CourseID1.setLocation(100, 100);
        panel2.add(CourseID1);
  
        Course_ID1 = new JTextField();
        Course_ID1.setFont(new Font("Arial", Font.PLAIN, 15));
        Course_ID1.setSize(150, 20);
        Course_ID1.setLocation(250, 100);
        panel2.add(Course_ID1);
        
        CourseName1 = new JLabel("Course Name");
        CourseName1.setFont(new Font("Arial", Font.PLAIN, 20));
        CourseName1.setSize(250, 20);
        CourseName1.setLocation(100, 150);
        panel2.add(CourseName1);
  
        Course_Name1= new JTextField();
        Course_Name1.setFont(new Font("Arial", Font.PLAIN, 15));
        Course_Name1.setSize(150, 20);
        Course_Name1.setLocation(250, 150);
        panel2.add(Course_Name1);
        
        S2 = new JLabel("Start Date");
        S2.setFont(new Font("Arial", Font.PLAIN, 20));
        S2.setSize(150, 20);
        S2.setLocation(100, 300);
        panel2.add(S2);
  
        date_1 = new JComboBox(dates);
        date_1.setFont(new Font("Arial", Font.PLAIN, 15));
        date_1.setSize(60, 20);
        date_1.setLocation(200, 300);
        panel2.add(date_1);
  
        month_1 = new JComboBox(months);
        month_1.setFont(new Font("Arial", Font.PLAIN, 15));
        month_1.setSize(60, 20);
        month_1.setLocation(260, 300);
        panel2.add(month_1);
  
        year_1 = new JComboBox(years);
        year_1.setFont(new Font("Arial", Font.PLAIN, 15));
        year_1.setSize(60, 20);
        year_1.setLocation(320, 300);
        panel2.add(year_1);
        
        C2 = new JLabel("Completion Date");
        C2.setFont(new Font("Arial", Font.PLAIN, 20));
        C2.setSize(200, 20);
        C2.setLocation(550, 300);
        panel2.add(C2);
  
        date_2 = new JComboBox(dates);
        date_2.setFont(new Font("Arial", Font.PLAIN, 15));
        date_2.setSize(60, 20);
        date_2.setLocation(700, 300);
        panel2.add(date_2);
  
        month_2 = new JComboBox(months);
        month_2.setFont(new Font("Arial", Font.PLAIN, 15));
        month_2.setSize(60, 20);
        month_2.setLocation(760, 300);
        panel2.add(month_2);
  
        year_2 = new JComboBox(years);
        year_2.setFont(new Font("Arial", Font.PLAIN, 15));
        year_2.setSize(60, 20);
        year_2.setLocation(820, 300);
        panel2.add(year_2);
        
        E1= new JLabel("Exam Date");
        E1.setFont(new Font("Arial", Font.PLAIN, 20));
        E1.setSize(200, 20);
        E1.setLocation(350, 350);
        panel2.add(E1);
  
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(60, 20);
        date.setLocation(450, 350);
        panel2.add(date);
  
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(510, 350);
        panel2.add(month);
  
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(570, 350);
        panel2.add(year);
        
        InstructorName = new JLabel("Instructor Name");
        InstructorName.setFont(new Font("Arial", Font.PLAIN, 20));
        InstructorName.setSize(150, 20);
        InstructorName.setLocation(100, 250);
        panel2.add(InstructorName);
  
        Instructor_Name = new JTextField();
        Instructor_Name.setFont(new Font("Arial", Font.PLAIN, 15));
        Instructor_Name.setSize(150, 20);
        Instructor_Name.setLocation(250, 250);
        panel2.add(Instructor_Name);
        
         D1 = new JLabel("Course Duration");
        D1.setFont(new Font("Arial", Font.PLAIN, 20));
        D1.setSize(500, 20);
        D1.setLocation(550, 100);
        panel2.add(D1);
        
        d1= new JTextField();
        d1.setFont(new Font("Arial", Font.PLAIN, 15));
        d1.setSize(150, 20);
        d1.setLocation(720, 100);
        panel2.add(d1);
        
        
        CourseLeader1 = new JLabel("Course Leader");
        CourseLeader1.setFont(new Font("Arial", Font.PLAIN, 20));
        CourseLeader1.setSize(500, 20);
        CourseLeader1.setLocation(550, 250);
        panel2.add(CourseLeader1);
        
        Course_Leader1= new JTextField();
        Course_Leader1.setFont(new Font("Arial", Font.PLAIN, 15));
        Course_Leader1.setSize(150, 20);
        Course_Leader1.setLocation(720, 250);
        panel2.add(Course_Leader1);
        
        P1 = new JLabel("Prerequisites");
        P1.setFont(new Font("Arial", Font.PLAIN, 20));
        P1.setSize(500, 20);
        P1.setLocation(550, 150);
        panel2.add(P1);
  
        p1 = new JTextField();
        p1.setFont(new Font("Arial", Font.PLAIN, 15));
        p1.setSize(150, 20);
        p1.setLocation(720, 150);
        panel2.add(p1);
        
        
        Display1= new JButton("Display");
        Display1.setFont(new Font("Arial", Font.PLAIN, 15));
        Display1.setSize(150, 30);
        Display1.setLocation(300, 500);
        Display1.addActionListener(this);
        panel2.add(Display1);
  
        Clear1 = new JButton("Clear");
        Clear1.setFont(new Font("Arial", Font.PLAIN, 15));
        Clear1.setSize(150, 30);
        Clear1.setLocation(500, 500);
        Clear1.addActionListener(this);
        panel2.add(Clear1);
        
        Add1= new JButton("Add");
        Add1.setFont(new Font("Arial", Font.PLAIN, 15));
        Add1.setSize(150, 30);
        Add1.setLocation(400,200);
        Add1.addActionListener(this);
        panel2.add(Add1);
        
        Register1= new JButton("Register");
        Register1.setFont(new Font("Arial", Font.PLAIN, 15));
        Register1.setSize(150, 30);
        Register1.setLocation(400,400);
        Register1.addActionListener(this);
        panel2.add(Register1);
        
        Remove= new JButton("Remove");
        Remove.setFont(new Font("Arial", Font.PLAIN, 15));
        Remove.setSize(150, 30);
        Remove.setLocation(400, 550);
        Remove.addActionListener(this);
        panel2.add(Remove);
        
         Add_C= new JButton(" Academic Course");
        Add_C.setFont(new Font("Arial", Font.PLAIN, 15));
        Add_C.setSize(250, 30);
        Add_C.setLocation(350, 600);
        Add_C.addActionListener(this);
        panel2.add(Add_C);
        
        term = new JCheckBox("Enable Text Area");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(100, 450);
        panel2.add(term);
  

        
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(900, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        panel2.add(tout);
        
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(900, 550);
        panel2.add(res);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }
    
    //Method For The Functionality Of The Buttons
  
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==Add_NC){
            panel1.setVisible(false);
            panel2.setVisible(true);
        }
        
        if(e.getSource()==Add_C){
            panel1.setVisible(true);
            panel2.setVisible(false);
        }
        
            //For Adding Acadeic Course
           if (e.getSource() == Add)
            {
            try{
            String CourseID = Course_ID.getText();
            String CourseName = Course_Name.getText();
            String Credit = credit.getText();
            String Level = level.getText();
            String NoOfAssessments = No_Of_Assessments.getText();
            String Duration = duration.getText();
            boolean isDuplicateCID = false;
            
          if(CourseID.isEmpty() || CourseName.isEmpty() || Credit.isEmpty() || Level.isEmpty() || NoOfAssessments.isEmpty() || Duration .isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter all the text fields!","Error!",JOptionPane.ERROR_MESSAGE);
          }
          else{
                int Duration1 = Integer.parseInt(duration.getText());
                int NoOfAssessments1 = Integer.parseInt(No_Of_Assessments.getText());

                for(course var:Array_List){
                    if(Integer.parseInt(var.getcourseID()) == (Integer.parseInt(CourseID))){
                        isDuplicateCID = true;
                        break;
                    }
                }
                    if(isDuplicateCID == false){
                        Academic = new AcademicCourse(CourseID,CourseName,Duration1,Credit,Level,NoOfAssessments1);
                        Array_List.add(Academic);
                        JOptionPane.showMessageDialog(frame, "Academic Course is now successfully added","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Course ID has been repeated","ERROR!!",JOptionPane.ERROR_MESSAGE);
                }
                }
                }
            catch(Exception A){
                JOptionPane.showMessageDialog(frame,"Please be sure if all the data are inserted correctly","ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
          } 
          //For Registering Academic Course
              else if(e.getSource() == Register){
              try{
                String courseID = Course_ID.getText();
                String courseLeader = Course_Leader.getText();
                String lecturerName = Lecturer_Name.getText();
                String S1=(date_1.getSelectedItem()).toString()+ (month_1.getSelectedItem().toString()) + (year_1.getSelectedItem().toString());
                String C1 =(date_2.getSelectedItem()).toString()+(month_2.getSelectedItem().toString())+(year_2.getSelectedItem().toString());
                boolean isalreadyreg=true;
                for(course var:Array_List){
                    if(var.getcourseID() .equals (courseID)){
                        if(var instanceof AcademicCourse){
                              isalreadyreg=true;
                             AcademicCourse REGaca = (AcademicCourse) var;
                             if(REGaca.getisRegistered() == false){
                                 JOptionPane.showMessageDialog(frame,"Course is already Registered","ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                             else{
                                REGaca.register(courseLeader,lecturerName,S1,C1);
                                JOptionPane.showMessageDialog(frame,"Academic Course has been Registered ","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                                }
                        }
                        else{
                            JOptionPane.showMessageDialog(frame,"Course not Found!","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                      if(!isalreadyreg){
                 JOptionPane.showMessageDialog(frame,"Course ID Invalid","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception A){
                JOptionPane.showMessageDialog(frame,"Please enter the correct details","ERROR",JOptionPane.ERROR_MESSAGE);
            }
             }
             
             //For Displaying The Data Of Academic Course
       
        else if (e.getSource() == Display) {
            if (term1.isSelected()) {
                String data1;
                String data
                    = "Course ID : "
                      + Course_ID.getText() + "\n"
                      + "Course name : "
                      + Course_Name.getText() + "\n";
                   
                      
                                  String data2
                    = "Start Date : "
                      + (String)date_1.getSelectedItem()
                      + "/" + (String)month_1.getSelectedItem()
                      + "/" + (String)year_1.getSelectedItem()
                      + "\n";
                      
                                  String data3
                    = "Completion Date : "
                      + (String)date_2.getSelectedItem()
                      + "/" + (String)month_2.getSelectedItem()
                      + "/" + (String)year_2.getSelectedItem()
                      + "\n";
                      
                      String data4
                    = "Course leader : "
                      + Course_Leader.getText() + "\n"
                      + "Lecturer name : "
                      + Lecturer_Name.getText() + "\n";
                      
                      String data5= "Credit: "
                      + credit.getText() + "\n"
                      + "Level: "
                      + level.getText() + "\n";
                      
                
                String data6= "Duration"
                + (String)duration.getText() + "\n";
                
                
                String data7= "Assessments"
                + (String)No_Of_Assessments.getText() + "\n";
                
                 tout1.setText(data +data5 + data6 + data7+ data2 + data3 + data4 );
                tout1.setEditable(false);

                
                res1.setText("Check if the displayed data is correct");
            }
          }
          
          //For Clearing The Data Of Academic Course From The GUI
    
          else if (e.getSource() == Clear) {
             String def = "";
            Course_ID.setText(def);
            Course_Name.setText(def);
            Course_Leader.setText(def);
            Lecturer_Name.setText(def);
            level.setText(def);
            credit.setText(def);
            term1.setSelected(false);
            date_1 .setSelectedIndex(0);
            month_1 .setSelectedIndex(0);
            year_1 .setSelectedIndex(0);
            date_2 .setSelectedIndex(0);
            month_2 .setSelectedIndex(0);
            year_2 .setSelectedIndex(0);
            duration.setText(def);
            No_Of_Assessments.setText(def);
            tout1.setText(def);
            res1.setText(def);
          }
          
          //Adding Button To Add Non Academic Course
            if (e.getSource() == Add1)
        {
            try{
            String CourseID1 = Course_ID1.getText();
            String CourseName1 = Course_Name1.getText();
            String P1 = p1.getText();
            String D1= d1.getText();
            boolean isDuplicateCID = false;

            if(CourseID1.isEmpty() || CourseName1.isEmpty() || P1.isEmpty() || D1.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter all the text feilds!","Error!",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int Duration1 = Integer.parseInt(d1.getText());
                
                for(course var:Array_List){
                    if(var.getcourseID().equals (CourseID)){
                        isDuplicateCID = true;
                        break;
                    }
                }
                    if(isDuplicateCID == false){
                        nonAcademic = new NonAcademicCourse(CourseID1, CourseName1,Duration1, P1);
                        Array_List.add(nonAcademic);
                        JOptionPane.showMessageDialog(frame, "Non-Academic Course added","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Course ID has been repeated","ERROR!!",JOptionPane.ERROR_MESSAGE);
                }   
            }
        }
            catch(Exception A){
                JOptionPane.showMessageDialog(frame, "Please make sure that all the data are inserted correctly","ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
        }
    
        //Adding Button To Register Non Academic Course
        else if(e.getSource() == Register1){
            try{
                String CourseID1 = Course_ID1.getText();
                String CourseLeader1 = Course_Leader1.getText();
                String InstructorName = Instructor_Name.getText();
                String S2=(date_1.getSelectedItem()).toString()+ (month_1.getSelectedItem().toString()) + (year_1.getSelectedItem().toString());
                String C2 =(date_2.getSelectedItem()).toString()+(month_2.getSelectedItem().toString())+(year_2.getSelectedItem().toString());
                String E1 =(date.getSelectedItem()).toString()+(month.getSelectedItem().toString())+(year.getSelectedItem().toString());
                boolean coursefound = false;
                
                for(course var:Array_List){
                    if(var.getcourseID().equals (CourseID1)){
                        coursefound = true;
                        if(var instanceof NonAcademicCourse){
                             NonAcademicCourse REGnaca = (NonAcademicCourse) var;
                             if(REGnaca.getIsRegistered()== true){
                                 JOptionPane.showMessageDialog(frame,"Course is already Registered","ERROR",JOptionPane.ERROR_MESSAGE);
                            }
                             else{
                                REGnaca.register(CourseLeader1,InstructorName,S2,C2,E1);
                                JOptionPane.showMessageDialog(frame,"Non Academic Course has been Registered Successfully","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        else{
                            JOptionPane.showMessageDialog(frame,"Course not Found!","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                if (!coursefound){
                    JOptionPane.showMessageDialog(frame,"CourseID Invalid","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception A){
                JOptionPane.showMessageDialog(frame,"Please enter valid details","ERROR",JOptionPane.ERROR_MESSAGE);
            }
      }
      
      //To Display Non Academic Course 
      else if (e.getSource() == Display1) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Course ID : "
                      + Course_ID1.getText() + "\n"
                      + "Course name : "
                      + Course_Name1.getText() + "\n";
                   
                      
                                  String data2
                    = "Start Date : "
                      + (String)date_1.getSelectedItem()
                      + "/" + (String)month_1.getSelectedItem()
                      + "/" + (String)year_1.getSelectedItem()
                      + "\n";
                      
                                  String data3
                    = "Completion Date : "
                      + (String)date_2.getSelectedItem()
                      + "/" + (String)month_2.getSelectedItem()
                      + "/" + (String)year_2.getSelectedItem()
                      + "\n";
                      
                      String data4
                    = "Course leader : "
                      + Course_Leader1.getText() + "\n";
                     
                  String data5= "Duration"
                 + (String)d1.getText() + "\n";
                
                
                String data6= "Prerequisites"
                + (String)p1.getText() + "\n";

                 String data7
                    = "Exam Date : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";

                String data8
                    = "Instructor Name : "
                      + Instructor_Name.getText() + "\n";
                      
                tout.setText(data + data5 + data6 + data2 + data3 + data7 + data8 + data4 );
                tout.setEditable(false);
                
                res.setText("Check if the displayed data is correct");
            }
          }
          
          //To Remove Non Academic Course 
            else if(e.getSource() == Remove){
            try{
                String courseID = Course_ID1.getText();
                if(courseID.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please insert the Course ID before removing Course","Error!!!", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    boolean isDuplicateNaCID = false;
                    for(course var:Array_List){
                        if(var.getcourseID().equals (courseID)){
                            isDuplicateNaCID = true;
                            if(var instanceof NonAcademicCourse){
                                nonAcademic = (NonAcademicCourse) var;
                                if(nonAcademic.getIsRemoved()==true){
                                    JOptionPane.showMessageDialog(frame,"Course is already removed","Error", JOptionPane.ERROR_MESSAGE);
                                }
                                else{
                                    nonAcademic.remove();
                                    JOptionPane.showMessageDialog(frame,"Course Removed Successfully","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(frame," Error has occured","ERROR",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                        }
                    }
                    if(!isDuplicateNaCID){
                        JOptionPane.showMessageDialog(frame,"Course ID Invalid ","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException E){
                JOptionPane.showMessageDialog(frame, "check Course ID.","ERROR!!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //To Clear Non Academic Course
    
          else if (e.getSource() == Clear1) {
             String def = "";
            Course_ID1.setText(def);
            Course_Name1.setText(def);
            Course_Leader1.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            Instructor_Name.setText(def);
            date_1.setSelectedIndex(0);
            month_1.setSelectedIndex(0);
            year_1.setSelectedIndex(0);
            date_2.setSelectedIndex(0);
            month_2.setSelectedIndex(0);
            year_2.setSelectedIndex(0);
            d1.setText(def);
            p1.setText(def);
            tout.setText(def);
             res.setText(def);
          }
    }
    public String getCourseID(){
        return Course_ID.getText();
    }

    public String getCourseName(){
        return Course_Name.getText();
    }

    public String getDuration(){
        return duration.getText();
    }

    public String getCourseLeader(){
        return Course_Leader.getText();
    }

    public String getLecturerName(){
        return Lecturer_Name.getText();
    }

    public String getLevel(){
        return level.getText();
    }

    public String getCredit(){
        return credit.getText();
    }

    public String getNoOfAssessments(){
        return No_Of_Assessments.getText();
    }

    public String getS1(){
        return (date_1.getSelectedItem()).toString()+ (month_1.getSelectedItem().toString()) + (year_1.getSelectedItem().toString());
    }

    public String getC1(){
        return (date_2.getSelectedItem()).toString()+ (month_2.getSelectedItem().toString()) + (year_2.getSelectedItem().toString());
    }

    public String getCourseID1(){
        return Course_ID1.getText();
    }

    public String getCourseName1(){
        return Course_Name1.getText();
    }

    public String getCourseLeader1(){
        return Course_Leader1.getText();
    }

    public String getD1(){
        return d1.getText();
    }

    public String getS2(){
        return (date_1.getSelectedItem()).toString()+ (month_1.getSelectedItem().toString()) + (year_1.getSelectedItem().toString());
    }

    public String getC2(){
        return (date_2.getSelectedItem()).toString()+ (month_2.getSelectedItem().toString()) + (year_2.getSelectedItem().toString());
    }

    public String getE1(){
        return (date.getSelectedItem()).toString()+ (month.getSelectedItem().toString()) + (year.getSelectedItem().toString());
    }

    public String getInstructorName(){
        return Instructor_Name.getText();
    }

    public String getP1(){
        return p1.getText();
    }
    
        //Main Method

       public static void main(String args[]){
          ING_College Main=new ING_College();
         Main.ING_College();  
    }
}


