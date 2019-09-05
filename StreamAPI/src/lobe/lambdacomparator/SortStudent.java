/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobe.lambdacomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author GoTraining
 */
public class SortStudent {
     private static List<Student> student=new ArrayList<>();
      private static List<Student> studentsort= getStudents();
     public static void main(String[] args) {  
         //sort students by name
   student.sort(Comparator.comparing(e->e.getName()));
   System.out.print(studentsort);
    
}
    private static List<Student>  getStudents(){
        student.add(new Student(1,"lobe",12,"computer"));
        student.add(new Student(2,"serge",17,"electrical"));
        student.add(new Student(3,"nyoh",18,"networks"));
        student.add(new Student(4,"bryan",20,"physics"));
            return student;    
     }
}
