package Java;

interface Shapes
{
    int sides=4;
    int max=10;
    void draw();
    void display();
}
class Square implements Shapes
{
    public void draw()
    {
        System.out.println("Drawing a squre");
    }
    public void display()
    {
         int slides=10;
        System.out.println(sides);
    }
}

public class interface_demo {
    public static void main(String[] args)
    {
        Square obj=new Square();
        obj.draw();
        obj.display();
    }
}
