public class MinCostPath{

  public static void main(String[] args){
    int cost[][]= {{1, 2, 3},
                   {4, 8, 2},
                   {1, 5, 3}};

    System.out.println(minCostPath(cost, 2, 2));
  }

  static int min(int x, int y, int z){
    if(x<y && x<z){
      return x;
    }
    if(y<x && y<z){
      return y;
    }
    if(z<y && z<x){
      return x;
    }
    return x;
  }

  static int minCostPath(int[][] input, int m , int n){
    int[][] dpArray = new int[m+1][n+1];
    dpArray[0][0] = input[0][0];
    //col
    for(int i=1;i<=m;i++){
      dpArray[i][0] = dpArray[i-1][0]+input[i][0];
    }
    //row
    for(int j=1;j<=n;j++){
      dpArray[0][j] = dpArray[0][j-1]+input[0][j];
    }
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m;j++){
        dpArray[i][j] = min(dpArray[i-1][j-1],dpArray[i-1][j],dpArray[i][j-1])+input[i][j];
      }
    }
    return dpArray[m][n];
  }

  //maximum path sum in a triangle ---->Similar approach

}
