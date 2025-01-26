import java.util.Scanner;
class ArrayOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = arrayUtility.inputArray();
        System.out.print("Enter the elements  : ");
        int element = sc.nextInt();
        int occurance=noOfOccurance(numArray,element);
        System.out.println("Element occured "+ occurance +" times in array");
    }
    public static int noOfOccurance(int[] numArray,int element)
    {
        int occ=0;
        int i=0;
        while(i<numArray.length)
        {
            if(numArray[i]==element)
            {
                occ++;
            }
            i++;
        }
        return occ;
    }
}