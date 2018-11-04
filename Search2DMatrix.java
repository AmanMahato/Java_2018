//Search in 2D Matrix where rows and columns are in ascending order.

public class Search2DMatrix{

  public static void main(String[] args){

  }

//Basically we are doing Binary Search across rows and column
  public boolean searchMatrix(int[][] matrix, int target) {
   if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
   int row = 0;
   int column = matrix[0].length-1;
   while(row<matrix.length && column>=0){
      if(matrix[row][column]==target){
          return true;
      }else if(matrix[row][column]>=target){
          column--;
      } else if(matrix[row][column]<target){
          row++;
      }
   }
   return false;
 }

 }

/*[[1,2,3,4],
 [5,6,7,8],
 [9,10,11,12],
]*/
