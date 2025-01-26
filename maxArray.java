import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = arrayUtility.inputArray();

        int max=Integer.MIN_VALUE;
        for(int num:numArray)
        {
            if(max<num){
                max=num;
            }
        }
        System.out.println("Maximum number is : "+max);
    }
}
