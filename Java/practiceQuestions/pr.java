package Java.practiceQuestions;

public class pr {
    private int a;
    public double b;

    public pr(int first, double second) {
        this.a = first;
        this.b = second;
    }

    // new method
    public static void incrementBoth(pr c1) {
        c1.a = c1.a + 1;
        c1.b = c1.b + 1.0;
    }

    public static void main(String[] args) {
        pr c1 = new pr(10, 20.5);
        pr c2 = new pr(10, 31.5);
        // different code below
        incrementBoth(c2);
        System.out.println(c1.a + ", " + c2.a);
    }
}