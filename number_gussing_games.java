import java.util.Random;
import java.util.Scanner;

class Methods {
    int max, min, num;

    void ran() {
        Random rand = new Random();
        num = rand.nextInt(max - min + 1) + min;

    }

    void getrange(int x, int y) {
        min = x;
        max = y;
        ran();
    }

    void showrange() {
        System.out.println("min : " + min + " to " + "max : " + max);
    }

    void guess(int n) {
        if (n == num) {
            System.out.println(" Correct! You guessed it!");
        } else if (n > num) {
            System.out.println("greater");
        } else {
            System.out.println("lower");
        }
    }
}

public class number_gussing_games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods f = new Methods();
        int gu;
        System.out.println(" Welcome to Number Guessing Game!");

        System.out.println("Give the range : \t");
        System.out.println("Choose difficulty: 1. Easy 2. Medium 3. Hard");
        int level = sc.nextInt();
        if (level == 1)
            f.getrange(1, 10);
        else if (level == 2)
            f.getrange(1, 100);
        else
            f.getrange(1, 1000);

        f.showrange();
        // System.out.println(f.ran());
        while (true) {
            System.out.print("guess the number : ");
            gu = sc.nextInt();

            if (gu == 101) {
                System.out.println(" Exiting the game. The number was: " + f.num);
                break;
            }
            f.guess(gu);
        }

    }
}

