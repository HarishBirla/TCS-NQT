import java.util.*;
import java.util.Scanner;
 public class codingKaro {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String input = sc.nextLine();
          String[] s = input.split(",");
          int nums[] = new int [s.length];
          for(int i = 0; i < nums.length; i++){
              nums[i] = Integer.parseInt(s[i]);
          }
         System.out.println(containsDups(nums));

     }

     private static boolean containsDups(int[] nums) {
         HashSet<Integer>set = new HashSet<>();
         for(int ele : nums){
             set.add(ele);
         }
         if(nums.length == set.size())return false;
         return true;
     }
 }
