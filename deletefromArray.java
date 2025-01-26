import java.util.Scanner;

public class deletefromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = arrayUtility.inputArray();
        System.out.print("Enter the elements to delete : ");
        int numToDel = sc.nextInt();
        int[] newArr=deleteNumber(numArray,numToDel);
        System.out.print("New Array si  : ");
        arrayUtility.displayArray(newArr);

    }
    public static int[] deleteNumber(int[] numArray,int numToDel)
    {
         int occ=ArrayOcc.noOfOccurance(numArray,numToDel);
         if(occ==0)
         {
             return numArray;
         }
         int newSize=numArray.length-occ;
         int[] newArr=new int[newSize];


         int i=0,j=0;
         while(i<numArray.length)
         {
             if(numArray[i]!=numToDel)
             {
                 newArr[j]=numArray[i];
                 j++;
             }
             i++;
         }
         return newArr;
    }
}
