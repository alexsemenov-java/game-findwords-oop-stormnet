import java.util.Scanner;

public class Player {

    private String name;

    public Player() {

        System.out.println("Enter your name, please!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        name = input;
    }

    public String getName() {
        return name;
    }
}
