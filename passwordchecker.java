import java.util.*;
public class passwordchecker {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String password;
       do{
           System.out.print("Enter the Password : ");
           password=sc.next();
       }while(!isValid(password));
        System.out.println("Thanks for entering valid password ");
    }
    public static boolean isValid(String password)
    {
        return password.length()>6;
    }
}
