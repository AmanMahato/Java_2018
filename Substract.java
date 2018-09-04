public class Substract{

  public static void main(String[] args){
    System.out.println(substract(7,24));
  }

  //Non Recursive
  public static int substract(int x, int y){
    while(y!=0){
      int borrow = (~x&y);
      x=x^y;
      y=borrow<<1;
    }
    return x;
  }


}
