import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=7;
        int guess;
        do {
            System.out.print("Guess the number between 5 t0 20 : ");
            guess = sc.nextInt();
        }while(guess!=number);
        System.out.println("Your guess is right!!");
    }
}
