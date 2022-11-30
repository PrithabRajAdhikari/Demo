package programming_cw2;

 


/**
 * Write a description of class NonAcademicCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class NonAcademicCourse extends course
{
    //defining attributes
    private String InstructorName;
    private int duration;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    //defining cunstructors for Non Academic Course
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID,courseName,duration);
        this.duration= duration;
        this.prerequisite=prerequisite;
        this.startingDate="";
        this.examDate="";
        this.completionDate="";
        this.isRegistered = false;
        this.isRemoved= false;
     }   
    
     //defining corresponding accessor methods
    public String getInstructorName(){
        return InstructorName ;
    } 
    
    public int getDuration(){
        return duration ;
    } 
    
    public String getStartingDate(){
        return startingDate;
        }
        
    public String getCompletionDate(){
        return completionDate;
        }      
        
    public String getExamDate(){
        return examDate;
        } 
    
    public String getPrerequisite(){
        return examDate;
        }     
        
    public boolean getIsRegistered(){
        return isRegistered;
        }      
     
    public boolean getIsRemoved(){
        return isRemoved;
        } 
      
    /*Defining method to set instructorName
     * if the name is not registered it will be registered or a message will appear inthe screen. 
       */    
    public void setInstructorName(String instructorName){
         if (isRegistered == false){
             this.InstructorName = instructorName;       
         }
         else{
            System.out.println("Already registered; Changing the instructor name is not allowed");
            }
    }  
    
    /*defining method to register 
     * instructorName along with starting date completion date and exam date are registered
     * and if they are already registered a suitable message will be shown
       */
    public void register( String courseLeader, String InstructorName, String startingDate, String completionDate, String examDate){
           if (isRegistered == false){
                setInstructorName(InstructorName);
                this.startingDate= startingDate;
                this.completionDate = completionDate;
                this.examDate = examDate;
                this.isRegistered= true;
            }
           else{
               System.out.println("The course has already been registered.");
            } 
    }
    
    /* method to remove the non-academic courses
     * if it is already removed a suitable message will display
       */
    public void remove(){
        if(isRemoved= true){
            super.setcourseLeader("");
            this.InstructorName = "";
            this.startingDate = "";
            this.completionDate = "";    
            this.examDate ="";
            this.isRegistered = false;
            this.isRemoved = true;
        }
        else{
            System.out.println("The course is already removed");
        }
    }
    
    /*defining method to display details of non academic course that includes
     * courseID, coursename and duration if rnot registered then
     * instructor name starting date completion date and exam date is also displayed
       */
    public void display()
    {
        super.Display();
        if (isRegistered == true)
        {
            System.out.println("instructor name is: "+ this.InstructorName);
            System.out.println("starting date is: "+ this.startingDate);
            System.out.println("completion date is: "+ this.completionDate);
            System.out.println("exam date is "+ this.examDate);
        }
    }
}
    


    