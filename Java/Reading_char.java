package Java;
import java.io.IOException;
public class Reading_char {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("enter any character and press ENTER");
        ch=(char)System.in.read();
        System.out.println("The entered key is "+ch);
    }
}
