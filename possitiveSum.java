import java.util.Scanner;

public class possitiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = arrayUtility.inputArray();
        long possSum=possitiveSum(numArray);
        arrayUtility.displayArray(numArray);
        System.out.println("\nPossitive sum of array is : "+possSum);
    }
    public static long possitiveSum(int[] numArray)
    {
        long sum=0;
        for(int i=0;i<numArray.length;i++)
        {
            if(numArray[i]>0)
            {
                sum+=numArray[i];
            }
        }
        return sum;
    }
}
