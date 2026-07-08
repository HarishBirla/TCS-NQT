import java.util.*;
public class codingKaro{

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int leftProd [] = new int[nums.length];
        leftProd[0] = 1;
        int rightProd[] = new int[nums.length];
        rightProd[n - 1] = 1;

        for(int i = 1; i < n; i++){
            leftProd[i] = nums[i - 1] * leftProd[i - 1];
        }
        for(int i = n - 2; i >= 0; i--){
            rightProd[i] = nums[i + 1] * rightProd[i + 1];
        }
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = leftProd[i] * rightProd[i];
        }
        return ans;

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s[] = input.split(",");
        int nums[] = new int[s.length];

        for(int i = 0 ; i < nums.length; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        int ans[] = productExceptSelf(nums);
        System.out.println((Arrays.toString(ans)));
    }
}