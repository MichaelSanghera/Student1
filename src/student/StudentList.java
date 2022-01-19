/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author HP
 */
public class StudentList {
    public static void main(String[] args) {
 Student2[] studentList = new Student2[3];
 studentList[0] = new Student2("s1", "Michael Sanghera");
 studentList[1] = new Student2("s2", "John Doe");
 studentList[2] = new Student2("s3", "Jane Doe");
 
 for(int i =0; i < studentList.length;i++){
    System.out.print(studentList[i].getStudentId());
    System.out.print(" ");
    System.out.println(studentList[i].getStudentName());
}
  
}
}
