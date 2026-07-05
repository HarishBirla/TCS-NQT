import java.util.*;
import java.util.Scanner;
 public class codingKaro {

     public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
         String input = sc.nextLine();
         String[] s = input.split(" ");
         int nums[] = new int[s.length];

         for(int i = 0; i < nums.length; i++){
             nums[i] = Integer.parseInt(s[i]);
         }
         System.out.println(maxProfit(nums));
     }

     private static int maxProfit(int[] nums) {
         int minPrice = Integer.MAX_VALUE;
         int maxProfit = 0;

         for(int i = 0; i < nums.length; i++){
             minPrice = Math.min(minPrice , nums[i]);

             int profit = nums[i] - minPrice;
             maxProfit = Math.max(profit ,maxProfit);
         }
         return maxProfit;
     }
 }