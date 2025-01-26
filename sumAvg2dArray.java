public class sumAvg2dArray {
    public static void main(String[] args) {
        int[][] numArray = arrayUtility.input2DArray();
        long sum=sum(numArray);
        double avg=average(numArray);
        System.out.println("Sum of array is : "+sum);
        System.out.println("Average of array is : "+avg);
    }
    public static long sum(int[][] numArray)
    {
        long sum=0;
        int i=0;
        while(i<numArray.length)
        {
            int j=0;
            while(j<numArray[i].length)
            {
                sum+=numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double average(int[][] numArray)
    {
        if(numArray.length==0)
        {
            return 0;
        }
        long sum=sum(numArray);
        double avg=(int)sum/(numArray.length*numArray[0].length);
        return avg;
    }
}
