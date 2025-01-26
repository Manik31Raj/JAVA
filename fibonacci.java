import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements to be printed : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.print(fibonacciSeries(i) + " ");
        }
    }
    public static int fibonacciSeries(int position)
    {
        if(position==1)
        {
            return 0;
        }
        if(position==2)
        {
            return 1;
        }
        return fibonacciSeries(position-1)+fibonacciSeries(position-2);
    }
}
