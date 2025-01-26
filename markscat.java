import java.util.Scanner;

public class markscat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks obtained  : ");
        int marks=sc.nextInt();
        String res=marks>80?"High":(marks>50)? "Moderate": "Low";
        System.out.println("Marks is : "+res);
    }
}
