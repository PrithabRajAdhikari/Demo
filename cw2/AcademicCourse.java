import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;
  
class AcademicCourse
    extends JFrame
    implements ActionListener {

    private Container p;
    private JLabel title;
    private JLabel CourseID;
    private JTextField Course_ID;
    private JLabel CourseName;
    private JTextField Course_Name;
    private JLabel CourseLeader;
    private JTextField Course_Leader;
    private JLabel LecturerName;
    private JTextField Lecturer_Name;
    private JLabel Level;
    private JTextField level;
    private JLabel Credit;
    private JTextField credit;
    private JLabel InstructorName;
    private JTextField Instructor_Name;
    private JLabel NoOfAssessments;
    private JComboBox No_Of_Assessments;
    private JLabel StartDate;
    private JComboBox date_1;
    private JComboBox month_1;
    private JComboBox year_1;
    private JLabel CompletionDate;
    private JComboBox date_2;
    private JComboBox month_2;
    private JComboBox year_2;
    private JLabel examdate;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JCheckBox term;
    private JLabel Duration;
    private JComboBox duration;
    private JButton Display;
    private JButton Clear;
    private JLabel res;
    private JTextArea resadd;
    private JTextArea tout;
    
    private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String years[]
        = { "2020","2021","2022","2023" };
            
    private String Cduration[]
        = {"6 months","1 year","2 year","3 year"};
        
    private String Assessments[]
        = {"1","2","3","4"};
        
  
    
    public AcademicCourse()
    {
        setTitle("Course Registration");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        
        p = getContentPane();
        p.setLayout(null);
  
        title = new JLabel("Academic Course");
        title.setFont(new Font("Arial", Font.PLAIN, 40));
        title.setSize(500, 30);
        title.setLocation(300, 30);
        p.add(title);
  
        CourseID = new JLabel("Course ID");
        CourseID.setFont(new Font("Arial", Font.PLAIN, 20));
        CourseID.setSize(100, 20);
        CourseID.setLocation(100, 100);
        p.add(CourseID);
  
        Course_ID = new JTextField();
        Course_ID.setFont(new Font("Arial", Font.PLAIN, 15));
        Course_ID.setSize(150, 20);
        Course_ID.setLocation(250, 100);
        p.add(Course_ID);
        
        CourseName = new JLabel("Course Name");
        CourseName.setFont(new Font("Arial", Font.PLAIN, 20));
        CourseName.setSize(250, 20);
        CourseName.setLocation(100, 150);
        p.add(CourseName);
  
        Course_Name= new JTextField();
        Course_Name.setFont(new Font("Arial", Font.PLAIN, 15));
        Course_Name.setSize(150, 20);
        Course_Name.setLocation(250, 150);
        p.add(Course_Name);
        
        CourseLeader = new JLabel("Course Leader");
        CourseLeader.setFont(new Font("Arial", Font.PLAIN, 20));
        CourseLeader.setSize(150, 20);
        CourseLeader.setLocation(550, 150);
        p.add(CourseLeader);
  
        Course_Leader = new JTextField();
        Course_Leader.setFont(new Font("Arial", Font.PLAIN, 15));
        Course_Leader.setSize(150, 20);
        Course_Leader.setLocation(700, 150);
        p.add(Course_Leader);
        
        LecturerName = new JLabel("Lecturer Name");
        LecturerName.setFont(new Font("Arial", Font.PLAIN, 20));
        LecturerName.setSize(150, 20);
        LecturerName.setLocation(100, 200);
        p.add(LecturerName);
  
        Lecturer_Name = new JTextField();
        Lecturer_Name.setFont(new Font("Arial", Font.PLAIN, 15));
        Lecturer_Name.setSize(150, 20);
        Lecturer_Name.setLocation(250, 200);
        p.add(Lecturer_Name);
        
        Level = new JLabel("Level");
        Level.setFont(new Font("Arial", Font.PLAIN, 20));
        Level.setSize(150, 20);
        Level.setLocation(100, 250);
        p.add(Level);
  
        level = new JTextField();
        level.setFont(new Font("Arial", Font.PLAIN, 15));
        level.setSize(150, 20);
        level.setLocation(250, 250);
        p.add(level);
        
        Credit = new JLabel("Credit");
        Credit.setFont(new Font("Arial", Font.PLAIN, 20));
        Credit.setSize(150, 20);
        Credit.setLocation(550, 250);
        p.add(Credit);
  
        credit = new JTextField();
        credit.setFont(new Font("Arial", Font.PLAIN, 15));
        credit.setSize(150, 20);
        credit.setLocation(700, 250);
        p.add(credit);
        
        NoOfAssessments = new JLabel("Assessments");
        NoOfAssessments.setFont(new Font("Arial", Font.PLAIN, 20));
        NoOfAssessments.setSize(200, 20);
        NoOfAssessments.setLocation(550, 200);
        p.add(NoOfAssessments);
  
        No_Of_Assessments = new JComboBox(Assessments);
        No_Of_Assessments.setFont(new Font("Arial", Font.PLAIN, 15));
        No_Of_Assessments.setSize(150, 20);
        No_Of_Assessments.setLocation(700, 200);
        p.add(No_Of_Assessments);
        
       InstructorName = new JLabel("Instructor Name");
       InstructorName.setFont(new Font("Arial", Font.PLAIN, 20));
       InstructorName.setSize(150, 20);
       InstructorName.setLocation(100, 300);
        p.add( InstructorName);
  
       Instructor_Name = new JTextField();
       Instructor_Name.setFont(new Font("Arial", Font.PLAIN, 15));
       Instructor_Name.setSize(150, 20);
       Instructor_Name.setLocation(250, 300);
        p.add(Instructor_Name);
  
        examdate = new JLabel("Exam Date");
        examdate.setFont(new Font("Arial", Font.PLAIN, 20));
        examdate.setSize(150, 20);
        examdate.setLocation(300, 400);
        p.add(examdate);
  
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(60, 20);
        date.setLocation(450, 400);
        p.add(date);
  
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(510, 400);
        p.add(month);
  
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(570, 400);
        p.add(year);
        
        StartDate = new JLabel("Start Date");
        StartDate.setFont(new Font("Arial", Font.PLAIN, 20));
        StartDate.setSize(150, 20);
        StartDate.setLocation(100, 350);
        p.add(StartDate);
  
        date_1 = new JComboBox(dates);
        date_1.setFont(new Font("Arial", Font.PLAIN, 15));
        date_1.setSize(60, 20);
        date_1.setLocation(200, 350);
        p.add(date_1);
  
        month_1 = new JComboBox(months);
        month_1.setFont(new Font("Arial", Font.PLAIN, 15));
        month_1.setSize(60, 20);
        month_1.setLocation(260, 350);
        p.add(month_1);
  
        year_1 = new JComboBox(years);
        year_1.setFont(new Font("Arial", Font.PLAIN, 15));
        year_1.setSize(60, 20);
        year_1.setLocation(320, 350);
        p.add(year_1);
        
        CompletionDate = new JLabel("Completion Date");
        CompletionDate.setFont(new Font("Arial", Font.PLAIN, 20));
        CompletionDate.setSize(200, 20);
        CompletionDate.setLocation(550, 350);
        p.add(CompletionDate);
  
        date_2 = new JComboBox(dates);
        date_2.setFont(new Font("Arial", Font.PLAIN, 15));
        date_2.setSize(60, 20);
        date_2.setLocation(700, 350);
        p.add(date_2);
  
        month_2 = new JComboBox(months);
        month_2.setFont(new Font("Arial", Font.PLAIN, 15));
        month_2.setSize(60, 20);
        month_2.setLocation(760, 350);
        p.add(month_2);
  
        year_2 = new JComboBox(years);
        year_2.setFont(new Font("Arial", Font.PLAIN, 15));
        year_2.setSize(60, 20);
        year_2.setLocation(820, 350);
        p.add(year_2);
        
        Duration = new JLabel("Course Duration");
        Duration.setFont(new Font("Arial", Font.PLAIN, 20));
        Duration.setSize(500, 20);
        Duration.setLocation(550, 100);
        p.add(Duration);
        
        duration= new JComboBox(Cduration);
        duration.setFont(new Font("Arial", Font.PLAIN, 15));
        duration.setSize(100, 20);
        duration.setLocation(720, 100);
        p.add(duration);
        
        term = new JCheckBox("Do you want to register?");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(100, 450);
        p.add(term);
  
  
        Display= new JButton("Display");
        Display.setFont(new Font("Arial", Font.PLAIN, 15));
        Display.setSize(150, 30);
        Display.setLocation(300, 500);
        Display.addActionListener(this);
        p.add(Display);
  
        Clear = new JButton("Clear");
        Clear.setFont(new Font("Arial", Font.PLAIN, 15));
        Clear.setSize(150, 30);
        Clear.setLocation(500, 500);
        Clear.addActionListener(this);
        p.add(Clear);
        
           tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(900, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        p.add(tout);
        
  
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 600);
        p.add(res);
  
  
        setVisible(true);
    }
  
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == Display) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Course ID : "
                      + Course_ID.getText() + "\n"
                      + "Course name : "
                      + Course_Name.getText() + "\n";
                                String data2
                    = "Exam Date : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
                      
                                  String data3
                    = "Start Date : "
                      + (String)date_1.getSelectedItem()
                      + "/" + (String)month_1.getSelectedItem()
                      + "/" + (String)year_1.getSelectedItem()
                      + "\n";
                      
                                  String data4
                    = "Completion Date : "
                      + (String)date_2.getSelectedItem()
                      + "/" + (String)month_2.getSelectedItem()
                      + "/" + (String)year_2.getSelectedItem()
                      + "\n";
                      
                      String data5
                    = "Course leader : "
                      + Course_Leader.getText() + "\n"
                      + "Lecturer name : "
                      + Lecturer_Name.getText() + "\n";
                      
                      String data6= "Credit: "
                      + credit.getText() + "\n"
                      + "Level: "
                      + level.getText() + "\n";
                      
                      String data7
                    = "Instructor Name : "
                      + Instructor_Name.getText() + "\n";
                     
                
                String data8= "Duration"
                + (String)duration.getSelectedItem() + "\n";
                
                
                String data9= "Assessments"
                + (String)No_Of_Assessments.getSelectedItem() + "\n";
                
                 tout.setText(data + data2 + data3 + data4 + data5 + data6 + data7 + data8 + data9);
                tout.setEditable(false);

                
                
                res.setText("Academic Course Registered");
            }
        }
  
        else if (e.getSource() == Clear) {
            String def = "";
            Course_ID.setText(def);
            Course_Name.setText(def);
            Course_Leader.setText(def);
            Lecturer_Name.setText(def);
            level.setText(def);
            credit.setText(def);
            Instructor_Name.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            date_1.setSelectedIndex(0);
            month_1.setSelectedIndex(0);
            year_1.setSelectedIndex(0);
            date_2.setSelectedIndex(0);
            month_2.setSelectedIndex(0);
            year_2.setSelectedIndex(0);
            duration.setSelectedIndex(0);
            No_Of_Assessments.setSelectedIndex(0);
            tout.setText(def);
             res.setText(def);
        }
    }
}
 