import java.util.Scanner;

public class forEachOCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = arrayUtility.inputArray();
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int occurance=noOfOccurance(numArray,num);
        System.out.println("your number "+num+" was found "+occurance+" times in array.");
    }
    public static int noOfOccurance(int[] numArray,int num)
    {
        int occ=0;
        for(int x:numArray)
        {
            if(x==num)
            {
                occ++;
            }
        }
        return occ;
    }
}
