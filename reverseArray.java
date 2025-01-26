public class reverseArray {
    public static void main(String[] args) {
        int[] numArray = arrayUtility.inputArray();
        reverse(numArray);
        System.out.println("Reverse array is : ");
        arrayUtility.displayArray(numArray);

    }
    public static void reverse(int[] arr)
    {
        int i=0;
        while(i<arr.length/2 )
        {
            int swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            i++;
        }
    }
}
