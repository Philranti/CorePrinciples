package za.ac.cput.project;

public class Student extends Person {
    private int studentId;
    private String course;


    public Student(int studentId, String course){

        this.studentId = studentId;
        this.course = course;


    }

    public String getName(){
        return super.getName();
    }

    public String getSurname(){
        return super.getSurname();
    }


    public int getAge(){
        return super.getAge();
    }

    public double getStudentId(){
        return studentId;
    }

    public String getCourse(){
        return course;
    }


    public String toString(){
        return super.toString()+ "\nStudent number:"+studentId +"\nCourse:"+course;
    }
}
