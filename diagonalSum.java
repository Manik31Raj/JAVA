public class diagonalSum {
    public static void main(String[] args) {
        int[][] numArray = arrayUtility.input2DArray();
        arrayUtility.display2DArray(numArray);
        long sum1=sumOfLeft(numArray);
        System.out.println("Left Diagonal Sum of array is : "+sum1);
        long sum2=sumOfRight(numArray);
        System.out.println("Right Diagonal Sum of array is : "+sum2);
        long sum=diaSum(numArray);
        System.out.println("Diagonal Sum of array is : "+sum);

    }
    public static long diaSum(int[][] numArray)
    {
        long leftSum=sumOfLeft(numArray);
        long rightSum=sumOfRight(numArray);
        long sum=leftSum+rightSum;
        if(numArray.length %2 !=0)
        {
            int ind=numArray.length/2;
            sum-=numArray[ind][ind];
        }
        return sum;
    }
   public static long sumOfLeft(int[][] numArray)
   {
       long sum=0;
       int i=0;
       while(i<numArray.length)
       {
           sum+=numArray[i][i];
           i++;
       }
       return sum;
   }
    public static long sumOfRight(int[][] numArray)
    {
       long sum=0;
       int i=0;
       while(i<numArray.length)
       {
           int col=numArray.length -1-i;
           sum+=numArray[i][col];
           i++;
       }
       return sum;
    }
}
