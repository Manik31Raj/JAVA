import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;

public class palindromeArray {
    public static void main(String[] args) {
        int[] numArray = arrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArray);
        if (isPalin) {
            System.out.println("Array is Plaindrome ");
        } else {
            System.out.println("Array is not a Palindrome");
        }
    }

    public static boolean isPalindrome(int[] numArray) {
        int i = 0;
        while (i < numArray.length / 2) {
            if (numArray[i] != numArray[(numArray.length - 1) - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}

