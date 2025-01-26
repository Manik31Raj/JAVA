import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter second number : ");
        int num2=sc.nextInt();
        System.out.println("Choose the operation you want to perform \n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");
        System.out.print("Your Selection : ");
        int option=sc.nextInt();
        switch(option)
        {
            case 1 -> System.out.println(num1+" + "+num2+" = "+ (num1+num2));
            case 2 -> System.out.println(num1+" - "+num2+" = "+ (num1-num2));
            case 3 -> System.out.println(num1+" * "+num2+" = "+ (num1*num2));
            case 4 -> System.out.println(num1+" / "+num2+" = "+ (num1/num2));
            default -> System.out.println("Invalid selection ");
        }
    }
}
