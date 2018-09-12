import java.util.*;
import java.lang.*;

public class AllPrimeTest{

  public static void main(String[] args){
    allPrime(10);
  }

  static void allPrime(int n){
    boolean[] boo = new boolean[n+1];
    Arrays.fill(boo,true);
    for(int i=2;i*i<=n;i++){
      for(int j=2*i;j<=n;j+=i){
        if(boo[j]){
          boo[j] = false;
        }
      }
    }
    for(int i=2;i<=n;i++){
      if(boo[i]){
        System.out.println(i);
      }
    }
  }


}
