import java.util.*;
import java.lang.*;
public class Test {
    public int[] primesum(int A) {
        List<Integer> allPrime = new ArrayList<>();
        for(int i = 2; i<=A;i++){
            if(isPrime(i)){
                allPrime.add(i);
            }
        }
        return (isSum(allPrime,A));
    }

    public boolean isPrime(int num){
        int count = 0;
        for(int i =1;i<=num/2;i++){
            if(num%i==0) count ++;
        }
        return(count==1);
    }

    public int[] isSum(List<Integer> pair,int target){
        int pairLen = pair.size();
        for(int i = 0;i<pairLen-1;i++){
            if((pair.get(i)*2)==target) {
                return new int[]{pair.get(i),pair.get(i)};
            }
            for(int j = i+1; j<pairLen;j++){
                if((pair.get(i)+pair.get(j)) == target ){
                    return new int[]{pair.get(i),pair.get(j)};
                }
            }
        }
        return new int[]{0,0};
    }

    public int search(int[] nums, int target) { //i/p : -1,0,3,5,9,12 -->9
    if(nums.length==0 || nums==null) return -1;
    //Arrays.sort(nums); -->Assuming Input will already be sorted
    int result = -1;
    int low = 0;
    int high = nums.length-1;
    while(low<=high){
        int mid = low+(high-low)/2;
        System.out.println(mid);
        if(nums[mid]==target){
            return mid;
        } else if(target>nums[mid]){
            low = mid+1;
        } else {
            high = mid-1;
        }
    }
    return result;
}

    public static void main(String[] args){
      Test test = new Test();
      //int[] result = test.primesum(7);
      //System.out.println(result[0]+" "+result[1]);
      System.out.println("Binary Search: "+test.search(new int[]{-1,0,3,5,9,12},9));
    }
}
