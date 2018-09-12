import java.lang.*;
import java.util.*;

public class AllPrime{

  public static void main(String[] args){
    prime(5);
  }

  public static void prime(int n){
    boolean[] pri = new boolean[n+1];
    Arrays.fill(pri,true);
    for(int i=2;i*i<=n;i++){
      if(pri[i]==true){
        for(int j=2*i;j<=n;j=j+i){
          pri[j] = false;
        }
      }
    }
    for(int i=2;i<=n;i++){
      if(pri[i]==true){
        System.out.println(i+" ");
      }
    }
  }

}
