import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = x.nextLine();
        System.out.println("Hello " + name);
    }
}
