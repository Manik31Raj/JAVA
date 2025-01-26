import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int res=num>=0? num : -num;
        System.out.println("Absolute value of "+ num +" is : " +res);
    }
}
