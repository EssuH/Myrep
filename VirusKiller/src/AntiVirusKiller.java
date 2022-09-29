import java.util.Scanner;

public class AntiVirusKiller {

    public static void main(String[]args) throws InterruptedException{

    String Rygsæk[] = {"- Mac-Attack", "- Free PC scan", "- ALTF4", "- Kold Tyrker"};
    String Virus[] = {"- MacVirus","- Falsk alarm", "- Pop-up reklame", "- Hacker-angreb"};


    System.out.println("Velkommen til Virus Killer!");

    Thread.sleep(3000);

        System.out.println("Her er dine våben:");
        System.out.println(Rygsæk[0]);
        System.out.println(Rygsæk[1]);
        System.out.println(Rygsæk[2]);
        System.out.println(Rygsæk[3]);

    Thread.sleep(3000);

    System.out.println("Dog er vi ikke alene...");

    Thread.sleep(4000);

    System.out.println("Der er fjender i blandt os!");
        Thread.sleep(2000);
        System.out.println(Virus[0]);
        Thread.sleep(2000);
        System.out.println(Virus[1]);
        Thread.sleep(2000);
        System.out.println(Virus[2]);
        Thread.sleep(2000);
        System.out.println(Virus[3]);

        Thread.sleep(4000);

    System.out.println("Kill them fast baby!!!");

    System.out.println("Get Ready!");
        Thread.sleep(1000);
    System.out.println("3");
        Thread.sleep(1000);
    System.out.println("2");
        Thread.sleep(1000);
    System.out.println("1");
        Thread.sleep(1000);
    for(int i=0;i<3;i++) {
        System.out.println("KILL!!!");
    }

    long startTime = System.currentTimeMillis();

    System.out.println(Virus[2]);

    Scanner s = new Scanner(System.in);
    s.next();
    long stopTime = System.currentTimeMillis();
    long reactionTime = startTime - stopTime;
    System.out.println("Din reaktionstid i milli-sekunder: "); //i ms for at gøre det sjovere :)
    System.out.println(reactionTime);

    //if statement here for more difficulty -> if(reactionTime<10000) do this -->
    long startTime1 = System.currentTimeMillis();

    System.out.println(Virus[0]);

    new Scanner(System.in);
    s.next();
    long stopTime1 = System.currentTimeMillis();
    reactionTime = startTime1 - stopTime1;
    System.out.println("Din reaktionstid i milli-sekunder: ");
    System.out.println(reactionTime);

    System.out.println("SÅDAN HABEBE! Det var 2 ud af 4");
    }
}
