public class Pow{

  public static void main(String[] args){
      System.out.println(findPow(2,3));
  }

  public static int findPow(int x,int y){
    if(y==0) return 1;
    int temp = findPow(x,(y/2));
    if(y%2==0){
      return temp*temp;
    } else{
      if(y>0){
        return x*temp*temp;
      } else {
        return ((temp*temp)/x);
      }
    }
  }

}
