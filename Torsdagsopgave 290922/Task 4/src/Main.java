import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Now.. What do we have here.. ");

        ArrayList<String> Menu = new ArrayList<>();
        Menu.add("1 - Start");
        Menu.add("2 - Actions");
        Menu.add("3 - Options");
        Menu.add("4 - Close");

        ArrayList<String> Options = new ArrayList<>();
        Options.add("1 - Sound");
        Options.add("2 - Video");
        Options.add("3 - Back");

        ArrayList<String> Actions = new ArrayList<>();
        Actions.add("1 - Start Game");
        Actions.add("2 - Resume Game");
        Actions.add("3 - Pause Game");
        Actions.add("4 - End Game");
        Actions.add("5 - Back");

        System.out.println(Menu);

        Scanner scan = new Scanner(System.in);
        String start;
        start = scan.nextLine();
        System.out.println("Good Choice!");

        if (Objects.equals(start, "1")) {
            System.out.println("Game Starting...");
        }
        if (Objects.equals(start, "2")) {
            System.out.println(Actions);
        }
        if (Objects.equals(start, "3")) {
            System.out.println(Options);
        }


        String start1 = scan.nextLine();

        if (Objects.equals(start1, "5")) {
            System.out.println(Menu);
        }



        }
    }
