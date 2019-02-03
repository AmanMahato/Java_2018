public class {

public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    makeZero(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void makeZero(char[][] grid, int i, int j){
        if(i>grid.length-1 || i<0 || j>grid[0].length-1 || j<0 || grid[i][j]!='1') return;
        grid[i][j] = '0';
        makeZero(grid,i+1,j);
        makeZero(grid,i-1,j);
        makeZero(grid,i,j+1);
        makeZero(grid,i,j-1);
    }
}
