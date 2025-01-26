import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        if(isPrime(number))
        {
            System.out.println("Number is prime ");
        }else{
            System.out.println("Number is not prime");
        }
    }
    public static boolean isPrime(int number)
    {
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}