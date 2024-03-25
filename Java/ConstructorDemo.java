package Java;
class CarEx2 {
    int year;
    String model;
    String make;
    CarEx2(String mo, String ma, int y) {
        year = y;
        model = mo;
        make = ma;
    }
    CarEx2() {
        year = 2010;
        model = "Toyota";
        make = "Innova";
    }
    void displayData() {
        System.out.println("company:" + make);
        System.out.println("model:" + model);
        System.out.println("year of manufacture:" + year);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        CarEx2 obj = new CarEx2("nano","tata",2021);
        CarEx2 obj2 = new CarEx2();
        obj.displayData();
        obj2.displayData();
    }
}
