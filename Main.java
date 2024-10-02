import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        SettersGetters obj = new SettersGetters();
        Stories obj1 = new Stories();

        System.out.println("Welcome to Freshmen Frontier!");
        //hero, health, mana, money, exp
        System.out.print("Choose a character to play:");
        int hero = scan.nextInt();
        String[] character = {"BSIT", "BSN", "BSCRIM"};
        int[] health = {100, 150, 200};
        int[] mana = {100, 150, 200};
        int[] money = {0, 0, 0};
        int[] exp = {0, 0, 0};

        System.out.println("kaon ko tae");

        System.out.println("another testing part 2!");

        switch (hero) {
            case 1:
                obj.setCharacter(character[0], health[1], mana[0], money[0], exp[0]);
                break;
            case 2:
                obj.setCharacter(character[1], health[0], mana[1], money[1], exp[1]);
                break;
            case 3:
                obj.setCharacter(character[2], health[2], mana[2], money[2], exp[2]);
                break;
            default:
                System.out.print("Your input is NOT on the options!");
                break;
        }
        System.out.print(obj.getName());
        System.out.println(obj.getStats());

        if (hero == 2) {
            obj1.crimBackstory();
        }
    }
}