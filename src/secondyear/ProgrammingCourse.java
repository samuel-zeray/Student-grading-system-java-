package secondyear;
import java.util.*;

public class ProgrammingCourse extends Course {
    public static final int creditHour=5;
     public ProgrammingCourse(String courseCode,String courseName) {
         super(courseCode,courseName);
     }
     @Override
     public double getPoints(){
     String[] grades={"A+","A","A-","B+","B","B-","C+","C","C-","D","F"};
     double[] points={4,4,3.75,3.5,3,2.75,2.5,2,1.75,1.5,1,0};
     int index= Arrays.asList(grades).indexOf(getGrade());
     return points[index]*creditHour;
     }
}
