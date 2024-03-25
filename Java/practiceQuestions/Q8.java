package Java.practiceQuestions;
/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' 
classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone 
number, address and salary to an employee and manager by objecting both classes and printing the 
same. */
class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Q8 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John";
        employee.age = 30;
        employee.phoneNumber = "1234567890";
        employee.address = "123 Main St, Anytown USA";
        employee.salary = 50000.0;
        employee.specialization = "Software Development";

        Manager manager = new Manager();
        manager.name = "Jane";
        manager.age = 40;
        manager.phoneNumber = "0987654321";
        manager.address = "456 High St, Anytown USA";
        manager.salary = 80000.0;
        manager.department = "Marketing";

        System.out.println("Employee:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}
