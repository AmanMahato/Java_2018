public class FirstOccurance{

  public static void main(String[] args){
    int[] input = new int[]{1,2,3,4,4,4,4,5,6,7};
    int target = 4;
    System.out.println(firstOccurance(input,4));
    System.out.println(lastOccurance(input,4));
  }

  public static int firstOccurance(int[] input,int target){
    int low = 0;
    int high = input.length-1;
    int result = -1;
    while(low<=high){
      int mid = low+((high-low)/2);
      if(input[mid]==target){ //(mid == 0 || input[mid-1]<target) &&
        result = mid;
        high = mid-1;
      } else if(input[mid]>target){
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return result;
  }

  public static int lastOccurance(int[] input,int target){
    int low = 0;
    int high = input.length-1;
    int result = -1;
    while(low<=high){
      int mid = low+((high-low)/2);
      if(input[mid]==target){ //(mid == 0 || input[mid-1]<target) &&
        result = mid;
        low = mid+1;
      } else if(input[mid]>target){
        high = mid - 1;

      } else {
        low = mid + 1;
      }

    }
    return result;
  }

}
