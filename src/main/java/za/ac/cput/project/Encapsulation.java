package za.ac.cput.project;

public class Encapsulation {
    private int studentNumber ;
    private String studentName;
    private String course;


   public Encapsulation(int num, String nm, String co){
       this.studentNumber = num;
       this.studentName = nm;
       this.course = co;

   }

    public int getStudentNum() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public String toString(){
       return "Student Number:"+studentNumber +"Student Name:"+studentName +"Student course"+course;
    }
}

