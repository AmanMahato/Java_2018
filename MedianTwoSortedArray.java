import java.util.*;
import java.lang.*;

public class MedianTwoSortedArray{

  public static void main(String[] args){
    int[] input1 = new int[]{1,2,3,4};
    int[] input2 = new int[]{5,6,7,8,9,10};
    System.out.println(median(input1,input2));
  }

  public static double median(int[] array1, int[] array2){
    if(array1.length>array2.length){
      median(array2,array1);
    }
    int len1 = array1.length;
    int len2 = array2.length;
    int low = 0;
    int high = len1;
    while(low<=high){
      int partition1 = (low+high)/2;
      int partition2 = (len1+len2+1)/2-partition1;

      //int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
      //int minRightX = (partitionX == x) ? Integer.MAX_VALUE : input1[partitionX];
      //int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
      //int minRightY = (partitionY == y) ? Integer.MAX_VALUE : input2[partitionY];
      int maxLeftArray1 = (partition1 == 0) ? Integer.MIN_VALUE : array1[partition1-1];
      int minRightArray1 = (partition1 == len1) ? Integer.MAX_VALUE : array1[partition1];
      int maxLeftArray2 = (partition2 == 0) ? Integer.MIN_VALUE : array2[partition2-1];
      int minRightArray2 = (partition2 == len2) ? Integer.MAX_VALUE : array2[partition2];

      if(maxLeftArray1<=minRightArray2 && maxLeftArray2<=minRightArray1){
        if((len1+len2)%2==0){
          //even
          return (double)((Math.max(maxLeftArray1,maxLeftArray2)+Math.max(minRightArray1,minRightArray2))/2);
        } else{
          //odd
          return (double)Math.max(maxLeftArray1,maxLeftArray2);
        }
      } else if (maxLeftArray1>minRightArray2) {
        high = partition1-1;
      } else {
        low = partition1+1;
      }
    }
    return -1000000.0;
  }

}
