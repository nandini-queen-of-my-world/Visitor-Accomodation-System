package Java.practiceQuestions;
import java.util.ArrayList;
import java.util.Scanner;
/*Write a Java program to create a class called "School" with attributes for students,
teachers, and classes, and methods to add and remove students and teachers,
 and to create classes. */
public class Q6 {
    private ArrayList<String> students;
    private ArrayList<String> teachers;
    private ArrayList<String> classes;

    public Q6() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println("Student " + studentName + " added successfully.");
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println("Student " + studentName + " removed successfully.");
        } else {
            System.out.println("Student " + studentName + " not found.");
        }
    }

    public void addTeacher(String teacherName) {
        teachers.add(teacherName);
        System.out.println("Teacher " + teacherName + " added successfully.");
    }

    public void removeTeacher(String teacherName) {
        if (teachers.contains(teacherName)) {
            teachers.remove(teacherName);
            System.out.println("Teacher " + teacherName + " removed successfully.");
        } else {
            System.out.println("Teacher " + teacherName + " not found.");
        }
    }

    public void createClass(String className) {
        classes.add(className);
        System.out.println("Class " + className + " created successfully.");
    }

    public static void main(String[] args) {
       Q6 schoolObj = new Q6();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nSchool Management");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Add teacher");
            System.out.println("4. Remove teacher");
            System.out.println("5. Create class");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume the new line character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = sc.nextLine();
                    schoolObj.addStudent(studentName);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    studentName = sc.nextLine();
                    schoolObj.removeStudent(studentName);
                    break;
                case 3:
                    System.out.print("Enter teacher name: ");
                    String teacherName = sc.nextLine();
                    schoolObj.addTeacher(teacherName);
                    break;
                case 4:
                    System.out.print("Enter teacher name: ");
                    teacherName = sc.nextLine();
                    schoolObj.removeTeacher(teacherName);
                    break;
                case 5:
                    System.out.print("Enter class name: ");
                    String className = sc.nextLine();
                    schoolObj.createClass(className);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}

