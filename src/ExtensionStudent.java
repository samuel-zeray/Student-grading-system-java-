// Concrete class representing an Undergraduate student
class ExtensionStudent extends Student {
    private double[] grades; // Array to store grades for each subject

    // Constructor
  public ExtensionStudent(String studentID, String studentName, String studentYear, String studentGender,String studentDepartment,String studentEmail, double[] grades) {
        super(studentID,studentName,studentYear,studentGender,studentDepartment,studentEmail);
        this.grades = grades;
    }


    // Implementation of abstract method to calculate GPA
    @Override
    public double calculateGPA() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
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