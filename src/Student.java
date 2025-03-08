abstract class Student{
    private String studentID;
    private String studentName;
    private String studentEmail;
    private String studentYear;
    private String studentGender;
    private String studentDepartment;
    private int creditHoursEarned;
    private int pointsEarned;

    public Student(String studentID, String studentName, String studentYear, String studentGender,String studentDepartment,String studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentYear = studentYear;
        this.studentGender = studentGender;
        this.creditHoursEarned = 0;
        this.pointsEarned = 0;
        this.studentDepartment=studentDepartment;
        this.studentEmail=studentEmail;
    }
    
    public abstract double calculateGPA();
    public abstract double calculateCGPA();
    
    public String getStudentID() {
        return studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getStudentYear() {
        return studentYear;
    }
    
    public String getStudentGender() {
        return studentGender;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }
    public int getCreditHoursEarned() {
        return creditHoursEarned;
    }

    public void setCreditHoursEarned(int creditHoursEarned) {
        this.creditHoursEarned = creditHoursEarned;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
}