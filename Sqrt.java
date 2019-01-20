public class Sqrt{

  public static void main(String[] args){
    System.out.println(getSqrt(9));
  }

  public static int getSqrt(int input){
    int start = 1;
    int end = input;
    while(start<=end){
      int mid = start+(end-start)/2;
      int temp = mid*mid;
      if(temp == input){
        return mid;
      } else if(temp>input){
        end = mid-1;
      } else {
        start = mid+1;
      }
    }
    return 1;
  }

}
