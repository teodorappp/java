package isp.lab6.exercise1;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
class Student {
    private String name;
    private int id;
    private Map<String, Integer> grades;

    public Student(String name, int id, Map<String, Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grades=" + grades +
                '}';
    }
}
public class StudentGradeManagementSystem {
    public boolean students;
    List<Student> students;

    public StudentGradeManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        Student student1 = student;
        students.new (student);
    }

    public void removeStudent(Student student) {
        students.removeStudent(student);
    }

    public void updateStudent(Student oldStudent, Student newStudent) {
        int index = students.indexOf(oldStudent);
        students.set(index, newStudent);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}



