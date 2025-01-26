import java.util.Scanner;

public class exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter the word : ");
            String word=sc.next();
            if(word.equals("exit")||word.equals("Exit")||word.equals("EXIT"))
            {
                break;
            }
        }
        System.out.println("You have successfully exited");
    }
}
