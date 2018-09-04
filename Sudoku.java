public class Sudoku{

  public static void main(String[] args){
    int[][] input = new int[3][];
    input[0] = new int[]{1,2,0};
    input[1] = new int[]{0,1,0};
    input[2] = new int[]{0,0,1};
    sudoku(input);
  }

private static void sudoku(int[][] mat) {
int n = mat.length;
int col=0;
for (int i = 0; i < n; i++) {
col =0;
if (i == 0) {
while (col < n) {
mat[i][col] = col;
col++;
}
}
else {
while(col<n) {
System.out.println(col);
if (col+1 < n) {
mat[i][col] = mat[i-1][col+1];
col++;
}
else {
mat[i][col] = mat[i-1][0];
break;
}
}
}

}

for (int i=0;i<n;i++) {
for (int j=0;j<n;j++) {
System.out.print(mat[i][j]);
}
System.out.println();
}
}

}
