import java.util.*;
public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter second number : ");
        int num2=sc.nextInt();
        maxNum(num1,num2);
        minNum(num1,num2);
    }
    public static void maxNum(int num1,int num2)
    {
        int greaterNumber=num1>num2 ? num1 : num2;
        System.out.println(greaterNumber+" is greatest number.");
    }
    public static void minNum(int num1,int num2)
    {
        int smallestNumber=num1<num2 ? num1 : num2;
        System.out.println(smallestNumber+" is smallest number.");
    }
}
