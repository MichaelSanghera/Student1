
package student;

/**
 *Jan 26,2022
 * @author Michael Sanghera
 */
public class Student2 {
    private String studentId;
    private String studentName;
    private String address;
    
    
    public Student2(String studentId,String studentName) {
        this.studentId= studentId;
        this.studentName= studentName;
        
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String studentName) {
        this.address = address;
}
}
