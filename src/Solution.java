//import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "madam";
        Scanner scanner = new Scanner(mockInput);
        String s = scanner.next();
        scanner.close();
        System.out.println(s);
        
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        String reverseString = stringBuilder.toString();

        if (s.equals(reverseString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}