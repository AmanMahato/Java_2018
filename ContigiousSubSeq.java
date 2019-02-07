//2. Given an unsorted array of positive integers, and a value. Return True/False if a contiguous sequence of numbers can sum upto that value.
import java.util.*;
import java.lang.*;

public class ContigiousSubSeq{

  public static void main(String[] args){
    System.out.println(isPossible(new int[]{1,2,3,4,5},9));
  }

  public static boolean isPossible(int[] input, int value){
    //Arrays.sort(input);
    for(int i=0;i<input.length;i++){
      int sum = 0;
      int j = i;
      while(sum<value && j<input.length){
        sum = sum + input[j++];
        if(sum == value) return true;
      }
    }
    return false;
  }
}

//copied from GeeksForGeeks
int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++)
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum)
            {
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
            curr_sum = curr_sum + arr[i]; 

        }

        System.out.println("No subarray found");
        return 0;
    }
