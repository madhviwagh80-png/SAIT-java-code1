
// CourseStudent.java
class CourseStudent {
    // Private variables (Encapsulation)
    private String studentName;
    private String courseName;
    private double courseFee;
    private double discountPercent;

    // Setter Methods to assign values
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    // Getter Methods
    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    // Getter method to calculate the final payable fee
    public double getFinalFee() {
        return courseFee - (courseFee * discountPercent / 100);
    }
}

// Main class to test the implementation
public class StudentEnrollmentSystem {
    public static void main(String[] args) {
        // Create an object of CourseStudent
        CourseStudent student = new CourseStudent();

        // Assign values using setters
        student.setStudentName("Madhvi wagh");
        student.setCourseName("Core Java");
        student.setCourseFee(1200.0);
        student.setDiscountPercent(15.0); // 15% discount

        // Print the details using getters
        System.out.println("--- Student Enrollment Details ---");
        System.out.println("Student Name : " + student.getStudentName());
        System.out.println("Course Name  : " + student.getCourseName());
        System.out.println("Final Fee    : $" + student.getFinalFee());
    }
}
