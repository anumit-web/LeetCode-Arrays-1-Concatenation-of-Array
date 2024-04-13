/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
  
    public static void main (String[] args) {
        System.out.println ("Concatenation of Array");

        Solution solution = new Solution();
        
        int[] nums1 = {1,2,1};
        int[] nums1_new =  solution.getConcatenation(nums1);
        System.out.println(Arrays.toString(nums1_new));

        int[] nums2 = {1,3,2,1};
        int[] nums2_new =  solution.getConcatenation(nums2);
        System.out.println(Arrays.toString(nums2_new));

    }
}
