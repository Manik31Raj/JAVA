import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements  : ");
        int size=sc.nextInt();
        int[] numArray=new int[size];
        int i=0;
        while(i<size)
        {
            System.out.print("Enter element no " + (i+1) +" : ");
            numArray[i]=sc.nextInt();
            i++;
        }
        return numArray;
    }
    public static int[][] input2DArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row=sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col=sc.nextInt();
        int[][] numArray=new int[row][col];
        int i=0;
        while(i<row)
        {
            int j=0;
            while(j<col)
            {
                System.out.print("Enter element no " +i+" row ans "+j+" col : ");
                numArray[i][j]=sc.nextInt();
                j++;
            }

            i++;
        }
        return numArray;
    }
    public static void displayArray(int[] numArray)
    {
        int i=0;
        while(i<numArray.length)
        {
            System.out.print(numArray[i] + " ");
            i++;
        }
    }
    public static void display2DArray(int[][] numArray)
    {
        int i=0;
        while(i<numArray.length)
        {
            int j=0;
            while(j<numArray[i].length)
            {
                System.out.print(numArray[i][j]+" ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }

}
