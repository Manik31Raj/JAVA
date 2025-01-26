import java.util.Scanner;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] numArray = arrayUtility.input2DArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Element to be search : ");
        int element = sc.nextInt();
        boolean isFound = search(numArray, element);
        if (isFound) {
            System.out.println("Element found ");
        } else {
            System.out.println("Element not found ");
        }
    }
    public static boolean search(int[][] numArray, int element) {
        int i = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                if (numArray[i][j] == element) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }}

