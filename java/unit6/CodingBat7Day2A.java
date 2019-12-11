import java.util.*;
public class CodingBat7Day2A {
// method returns the maximum value in the array
    public static int max(int[] nums) {
        int max = nums[0];
        
        for(int i=0;i<nums.length;i++)
            if(nums[i]>max) max=nums[i];
        
        return max;
    }
 // method returns the minimum value in the array   
    public static int min(int[] nums) {
        int min = nums[0];
        
        for(int i=nums.length-1;i>=0;i--)
            if(nums[i]<min) min=nums[i];
        
        return min;
    }
 // method returns the distance (abs.value) between 
 //max and min values in the array   
    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        
        for(int i=nums.length-1;i>=0;i--)
            if(nums[i]<min) min=nums[i];
        
        for(int i=0;i<nums.length;i++)
            if(nums[i]>max) max=nums[i];
        
        return Math.abs(max-min);
    }
 // method returns the median value (the array must be in order!) in the array   
    public static double median(int[] nums) {
        Arrays.sort(nums);
        double median;
        if(nums.length%2!=0) median = nums[nums.length/2];
        else median = (nums[nums.length/2-1]+nums[nums.length/2])/2.0;
        return median;
    }
// method returns true if the array contains at least 
//one negative value, false otherwise    
    public static boolean containsNegative(int[] nums) {
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=Math.abs(nums[i])) return true;
        return false;
    }
    
    //***************************************
    //do not change anything below this comment
    //***************************************
    public static void test(String method, int[] nums, int expected, int result) {
        System.out.print("Testing " + method + " with input " + Arrays.toString(nums) + "... ");
        if (expected == result) {
          System.out.println("PASSED");
        }
        else {
           System.out.println("Expected " + expected + " but was " + result);
        }
    }
    public static void test2(String method, int[] nums, boolean expected, boolean result) {
        System.out.print("Testing " + method + " with input " + Arrays.toString(nums) + "... ");
        if (expected == result) {
          System.out.println("PASSED");
        }
        else {
           System.out.println("Expected " + expected + " but was " + result);
        }
    }
    public static void test3(String method, int[] nums, double expected, double result) {
        System.out.print("Testing " + method + " with input " + Arrays.toString(nums) + "... ");
        if (Math.abs(expected -result)<.00000001) {
          System.out.println("PASSED");
        }
        else {
           System.out.println("Expected " + expected + " but was " + result);
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 2, 1};
        test("max()", nums1, 4, max(nums1));
        int[] one = {7};
        test("max()", one, 7, max(one));
        int[] negatives = {-3, -4, -2, -7, -6};
        test("max()", negatives, -2, max(negatives));
        System.out.println();
        
        test("min()", nums1, 1, min(nums1));
        test("min()", one, 7, min(one));
        test("min()", negatives, -7, min(negatives));
        System.out.println();
        
        test("bigDiff()", nums1, 3, bigDiff(nums1));
        test("bigDiff()", one, 0, bigDiff(one));
        test("bigDiff()", negatives, 5, bigDiff(negatives));
        System.out.println();
        
        test3("median()", one, 7, median(one));
        test3("median()", negatives, -4, median(negatives));
        int[] odd = {3, 8, 1};
        test3("median()", odd, 3, median(odd));
        int[] evenSame = {3, 7, 9, 7};
        test3("median()", evenSame, 7, median(evenSame));
        int[] evenAvg = {1, 2, 4, 3};
        test3("median()", evenAvg, 2.5, median(evenAvg));
        
        System.out.println();
        
        test2("containsNegative()", nums1, false, containsNegative(nums1));
        test2("containsNegative()", negatives, true, containsNegative(negatives));
        int[] negOrder = {1, 4, -2, 11};
        test2("containsNegative()", negOrder, true, containsNegative(negOrder));
    }
}
