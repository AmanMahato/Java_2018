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

    public static void main(String[] args){
      Test test = new Test();
      int[] result = test.primesum(7);
      System.out.println(result[0]+" "+result[1]);
    }
}
