package Session9;

import java.util.ArrayList;

public class Student {
    private String id;
    private String fullName;
    private int age;
    private double gpa;
    private static int count = 0;
    public final double MIN_GPA = 0.0;
    public final double MAX_GPA = 4.0;


    public Student(String id, int age, String fullName, double gpa) {
        this.id = id;
        this.age = age;
        this.fullName = fullName;
        this.gpa = gpa;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void printInfo() {
        System.out.println("*********STUDENT LIST********");
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student st1 = new Student("SV001", 18, "Vu Minh Trung", 2.9);
        Student st2 = new Student("SV002", 19, "Nguyen Van A", 2.3);
        Student st3 = new Student("SV003", 20, "Nguyen Van B", 2.7);

        Student[] students = new Student[10];
        int size = 0;
        students[size++] = st1;
        students[size++] = st2;
        students[size++] = st3;
        for (int i = 0; i < size; i++) {
            students[i].printInfo();
        }
        System.out.println("Tong so sinh vien duoc tao: " + Student.getCount());
    }
}
