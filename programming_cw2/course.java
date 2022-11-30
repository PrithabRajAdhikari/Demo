package programming_cw2;


/**
 * The course class is the parent class of Academic course class and non academic course class.
 *
 * @author (prithab raj adhikari)
 * @version (a version number or a date)
 */
public class course
{
    //Attributes of course class
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    /*
     * defining constructor of course class
     */
    public course(String courseID,String courseName, int duration)
    { 
        this. courseID = courseID;
        this. courseName=courseName;
        this. duration = duration;
        this.courseLeader = " ";
    }
      //Accessor method--Getters method  
    public String getcourseID()
    {
        return this.courseID;
    }
    
    public String getcourseName()
    {
        return this.courseName;
    }
    
    public int getduration()
    {
        return this.duration;
    }
    
    public String getcourseLeader()
    {
        return this.courseLeader;
    }
    //setters method
    public void setcourseLeader(String courseLeader)
    {
        this.courseLeader = courseLeader;
    }
    
    /*defining method to display the details of the course class
     * courseID , course name, duration, courseleader.
     */
    public void Display()
    {
        System.out.println("The ID is"+getcourseID());
        System.out.println("The name of the course is"+getcourseName());
        System.out.println("The duration of course is"+getduration());
        if(courseLeader!=" ")
        {
            System.out.println("The leader of the course is"+getcourseLeader());
        }
        }
    }

