package Java;
class car
{
    int year_of_manuf;
    String model;
    String make;

    void displayData()
    {
        System.out.println("Company : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year_of_manuf);

    }

}
public class Class_driver_class {
    public static void main(String[] args) {
    car obj=new car();
    obj.year_of_manuf=1980;
    obj.model="new";
    obj.make="mine!!!";
    obj.displayData();

    }
}