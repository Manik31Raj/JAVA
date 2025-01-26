

public class isSorted {
    public static void main(String[] args) {
        int[] numArray = arrayUtility.inputArray();
        boolean isInc=isIncreasing(numArray);
        boolean isDec=isDecreasing(numArray);
        if(isInc || isDec)
        {
            System.out.println("Array is sortd");
        }
        else {
            System.out.println("Array is not sortd");
        }
    }
    public static boolean isIncreasing(int[] numArray)
    {
        int i=1;
        while(i<numArray.length)
        {
            if(numArray[i]<numArray[i-1])
            {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] numArray)
    {
        int i=1;
        while(i<numArray.length)
        {
            if(numArray[i]>numArray[i-1])
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
