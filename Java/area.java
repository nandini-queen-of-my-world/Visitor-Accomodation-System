package Java;
class Shape
{
    int length,breadth,area;
    Shape(int length, int breadth)
    {
        this.length=length;
      this.breadth=breadth;
        area=1;
    }
    void area()
    {
        area = length*breadth;
        System.out.println("area is :"+area);
    }
}

public class area {
    public static void main(String[] args) {
        Shape obj=new Shape(10,20);
        obj.area();

    }
}
