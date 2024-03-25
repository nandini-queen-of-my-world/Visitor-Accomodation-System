package Java.InheritanceQuestions;
/*Write a program of your choice showing how ‘super’ keyword can be used to
differentiate the members of superclass from the members of subclass. The program
should also show how to invoke the superclass constructor from subclass using ‘super’
keyword */
class Vehicle {
    protected String name;
    protected int year;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String name, int year, String model) {
        super(name, year); // invoke superclass constructor
        this.model = model;
    }

    public void printDetails() {
        super.printDetails(); // call superclass method
        System.out.println("Model: " + model);
    }
}

public class q8 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020, "Camry");
        myCar.printDetails();
    }
}
