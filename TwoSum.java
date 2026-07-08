import java.util.*;
import java.util.Scanner;
 public class codingKaro {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter target : ");
         int target = sc.nextInt();
         System.out.println("Enter the length : ");
         int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < n ; i++) {
             arr[i] = sc.nextInt();
         }

         int [] ans = twoSum(arr , target);
//         System.out.print("[");
//         for(int i = 0; i < ans.length; i++){
//             System.out.print(ans[i] + " ");
//         }
//         System.out.println("]");
         System.out.println(Arrays.toString(ans));


     }

     private static int[] twoSum(int[] arr, int target) {
         HashMap<Integer , Integer> map = new HashMap<>();
         for(int i = 0; i < arr.length; i++){
             map.put(arr[i] , i);
         }
         for(int i = 0 ;i < arr.length; i++){
             int rem = target - arr[i];
             if(map.containsKey(rem) && map.get(rem) != i){
                 return new int[]{i , map.get(rem)};
             }
         }
         return new int[]{-1 , -1};

     }
 }