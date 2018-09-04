public class RecursiveSolutions{

  public static void main(String[] args){
    System.out.println(nthFactorial(0));
    System.out.println(nthFactorial(1));
    System.out.println(nthFactorial(2));
    System.out.println(nthFactorial(3));
    System.out.println(getFactorial(4));
  }

  public static int getFactorial(int n){
    if(n==1 || n==0) return 1;
    return(n*getFactorial(n-1));
  }

  public static int nthFactorial(int num){
    if(num==0 || num == 1) return 1;
    return (nthFactorial(num-1)+nthFactorial(num-2));
  }


}
