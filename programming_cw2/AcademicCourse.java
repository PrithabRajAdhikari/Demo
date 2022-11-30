package programming_cw2;

 


/**
 * Write a description of class AcademicCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AcademicCourse extends course
{
    //Attributes of class:AcademicCourse
   private String LecturerName;
   private String Level;
   private String Credit;
   private String StartingDate;
   private String CompletionDate;
   private int NumberOfAssesments;
   private boolean isRegistered;
   
    /*
     * Constructor of Academic Course Class which has six parameters.
     */
    AcademicCourse(String CourseID, String CourseName,
    int duration,String level,String Credit,int NumberOfAssesments)
    {
        super(CourseID,CourseName,duration);
        this.Level=level;
        this.Credit=Credit;
        this.NumberOfAssesments=NumberOfAssesments;
        this. LecturerName="";
        this. StartingDate="";
        this.CompletionDate="";
        this.isRegistered= true; 
    }
    
    //accessor method--getters method
    
    public String getlecturerName()
    {
        return this.LecturerName;
    }
    
    public String getlevel()
    {
        return this.Level;
    }
    
    public String getcredit()
    {
        return this.Credit;
    }
    
    public String getstartingdate()
    {
        return this.StartingDate;
    }
    
    public String getcompletiondate()
    {
        return this.CompletionDate;
    }
    
    public int getNumberOfAssessment()
    {
        return this.NumberOfAssesments;
    }
    
    public boolean getisRegistered()
    {
        return this.isRegistered;
    }
    //setters method is defined
      public void setLecturerName(String lecturer)
    {
        this.LecturerName = LecturerName;
    }
    
    public void setNoofassesments(int number)
    {
        this.NumberOfAssesments=NumberOfAssesments;
    }
    
    /*deifining method to register
     * lecturername, startingdate, completiondate
     */
    public void register(String courseLeader,String lecturer,
    String start,String completion)
    {
        if(this.isRegistered ==false)
        { 
            System.out.println("Instructor Name is:" +this.LecturerName);
            System.out.println("Starting date:" + this.StartingDate);
            System.out.println("Completion date:"+this.CompletionDate);
            }
           else if(this.isRegistered==true)
           {
               super. setcourseLeader(courseLeader);
    
               this.LecturerName = lecturer;
               this.StartingDate= start;
               this.CompletionDate = completion;
               this.isRegistered = true;
            }
    }
    
    /*defining method to display the details of academic course class
     * lecturer name, level, credit, startingdate, completiondate, numberofassesments
     */
    public void display()
    {
        super. Display();
        if(this.isRegistered==false)
        {
            System.out.println("Lecturer name is:"+ getlecturerName());
            System.out.println("Level is:"+ getlevel());
            System.out.println("Credit is:"+getcredit());
            System.out.println("Starting Date is:"+getstartingdate());
            System.out.println("Completion Date is:"+getcompletiondate());
            System.out.println("NoofAssesments is:"+getNumberOfAssessment());
        }
    }
}  
