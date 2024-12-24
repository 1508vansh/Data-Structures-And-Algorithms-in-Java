import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = { 'r', 'p', 's' };
        Random rand = new Random();
        System.out.println("Welcome to the rock, paper & scissors game");
        System.out.println(
                "For this game you will play with computer & you are supposed to write r or s or p means rock , scissors or paper");
        System.out.println("It's your chance write r, p or s");
        char x = sc.next().charAt(0);
        int a = rand.nextInt(0, 2);
        if (x == 'r' && arr[a] == 's') {
            System.out.println("Computer's move was " + arr[a]);
            System.out.println("You won");
        } else if (x == 'r' && arr[a] == 'p') {
            System.out.println("Computer's move was " + arr[a]);
            System.out.println("Computer won");
        } else if (x == 's' && arr[a] == 'r') {
            System.out.println("Computer's move was " + arr[a]);
            System.out.println("Computer won");
        } else if (x == 's' && arr[a] == 'p') {
            System.out.println("Computer's move was " + arr[a]);
            System.out.println("You won");
        } else if (x == 'p' && arr[a] == 'r') {
            System.out.println("Computer's move was " + arr[a]);
            System.out.println("You won");
        } else if (x == 'p' && arr[a] == 's') {
            System.out.println("Computer's move was " + arr[a]);
            System.out.println("Computer won");
        } else {
            System.out.println("Computer's move was also " + arr[a]);
            System.out.println("Match tied");
        }
    }
}