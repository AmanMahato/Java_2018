import java.lang.*;
import java.util.*;

public class Practice {

  public static void main(String[] args){
    printAllPrime(20);
  }

  static void printAllPrime(int n){
    boolean[] prime = new boolean[n+1];
    Arrays.fill(prime,true);
    for(int i=2;i*i<=n;i++){
      if(prime[i]){
        for(int j=2*i;j<=n;j=j+i){
          prime[j] = false;
        }
      }
    }
    for(int k=2;k<=n;k++){
      if(prime[k]){
        System.out.println(k);
      }
    }
  }

}
