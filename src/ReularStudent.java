
class ReularStudent extends Student {
   private double[] courseScore; // Array to store grades for each course

    // Constructor
    public ReularStudent(String studentID, String studentName, String studentYear, String studentGender,String studentDepartment,String studentEmail, double[] courseScore) {
        super(studentID,studentName,studentYear,studentGender,studentDepartment,studentEmail);
        this.courseScore = courseScore;
    }

    // Implementation of abstract method to calculate GPA
    @Override
    public double calculateGPA() {
        double total = 0;
        for (double grade : courseScore) {
            total += grade;
        }
        return total / courseScore.length;
    }

    // Implementation of abstract method to calculate CGPA
    @Override
    public double calculateCGPA() {
        // Example calculation based on credit hours and points earned
        if (getCreditHoursEarned() == 0) {
            return 0.0; // Avoid division by zero
        }
        return getPointsEarned() / (double) getCreditHoursEarned();
    }
}