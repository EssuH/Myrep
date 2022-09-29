import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.println("Hello there!");

    Scanner fromKey = new Scanner(System.in);
        System.out.print("Please type in your name: ");
        String name = fromKey.nextLine();
        System.out.println("Hello " + name);

        Scanner as = new Scanner(System.in);
        System.out.print("Please type in your age: ");
        String age = as.nextLine();
        System.out.println(age + " is a great number! It feels like i have known you for years " + name);

    }
}