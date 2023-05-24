package isp.lab6.exercise1;

import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
public class Exercise1 {
        public static void main(String[] args) {
    StudentGradeManagementSystem system = new StudentGradeManagementSystem();

    Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 8);
        grades1.put("Romanian", 9);
        grades1.put("English", 10);
    Student student1 = new Student("Alina", 1001, grades1);
        system.addStudent(student1);

        system.removeStudent(student1);

    Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 9);
        grades2.put("Romanian", 10);
        grades2.put("English", 8);
    Student student2 = new Student("Vlad", 1002, grades2);
        system.updateStudent(student1, student2);

    Student student3 = system.findStudentById(1002);
    double averageGrade = student3.calculateAverageGrade();
        System.out.println("Average grade for " + student3.getName() + ": " + averageGrade);

        System.out.println(system.students);
}
}
