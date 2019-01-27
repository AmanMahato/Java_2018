//LeetCode # 79
//Given a 2D board and a word, find if the word exists in the grid.
//The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring.
//The same letter cell may not be used more than once.
//board =
//[
  //['A','B','C','E'],
  //['S','F','C','S'],
  //['A','D','E','E']
//]
//Given word = "ABCCED", return true.
//Given word = "SEE", return true.
//Given word = "ABCB", return false.

public class WordSearch{

  char[][] input; //What will happen if we pass this as a variable inside the main method.

  WordSearch(){
    input = new char[][]{{'A','B','C','E'},
                         {'S','F','C','S'},
                         {'A','D','E','E'}};
  }

  public static void main(String[] args){
    WordSearch obj1 = new WordSearch();
    WordSearch obj2 = new WordSearch();
    WordSearch obj3 = new WordSearch();
    System.out.println("ABCCED exists: "+obj1.exist(obj1.input,"ABCCED"));
    System.out.println("SEE exists: "+obj2.exist(obj2.input,"SEE"));
    System.out.println("ABCB exists: "+obj3.exist(obj3.input,"ABCB"));
  }

  public boolean exist(char[][] board, String word) {
      for(int i=0;i<board.length;i++){
          for(int j=0;j<board[i].length;j++){
              if(dfs(board,word,i,j,0)){
                  return true;
              }
          }
      }
      return false;
  }

  public boolean dfs(char[][] board, String word, int i, int j, int k){
      int outerLen = board.length;
      int innerLen = board[0].length;
      if(i<0 || j<0 || i>=outerLen || j>=innerLen) return false;
      if(board[i][j]==word.charAt(k)){
          char temp = board[i][j];
          board[i][j] = '*';
          if(k==word.length()-1) return true;
          if(dfs(board,word,i-1,j,k+1) || dfs(board,word,i+1,j,k+1) || dfs(board,word,i,j-1,k+1) || dfs(board,word,i,j+1,k+1)){
              return true;
          }
          board[i][j] = temp;
      }
      return false;
  }

}



//Much easier to understand
class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,i,j,0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int k){
        if(k==word.length()) return true;
        int outer = board.length;
        int inner = board[0].length;
        if(i>=0 && i<outer && j>=0 && j<inner && board[i][j] == word.charAt(k)){
            char temp = board[i][j];
            board[i][j] = '*';
            if(dfs(board,word,i-1,j,k+1) || dfs(board,word,i+1,j,k+1) || dfs(board,word,i,j-1,k+1) || dfs(board,word,i,j+1,k+1)) return true;
            board[i][j] = temp;
        }
        return false;
    }


}
