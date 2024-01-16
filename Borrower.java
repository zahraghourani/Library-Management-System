package library;

public class Borrower {
    //attributes
    private static int studentId=0;
    private String studentName;
    private int contactNumber;
    //constructors
    public Borrower(String studentName, int contactNumber){
        this.studentName=studentName;
        this.contactNumber=contactNumber;
    }
    //getters and setters
    public static int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    //toString method
    @Override
    public String toString() {
        return "Borrower informations:\nID: "+studentId+"\nStudent name: "+studentName+"\nContact number: "+contactNumber;
    }
}