/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author HP
 */
public class PartTimeStudent extends Student2 {
    private int numCourses;
  
    public PartTimeStudent(String studentId,String studentName,int numCourses){
        super(studentId,studentName);
        this.numCourses= numCourses;
               }
    public int numCourses() {
        return numCourses;
    }

    public void numCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
