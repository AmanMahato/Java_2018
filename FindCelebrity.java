import java.lang.*;
import java.util.*;
//neeed tp be fixed
public class FindCelebrity{

  static int MATRIX[][] = { { 0, 0, 1, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 } };

  public static void main(String[] args){
    int n = 4;
		int result = findCelebrity(n);
		if (result == -1)
		{
			System.out.println("No Celebrity");
		}
		else
			System.out.println("Celebrity ID " + result);
  }

  public static boolean knows(int a, int b){
    return(MATRIX[a][b] == 1 ? true:false);
  }

  public static int findCelebrity(int n){
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<n;i++){
      stack.push(i);
    }
    while(stack.size()>1){
      int first = stack.pop();
      int second = stack.pop();
      if(knows(first,second)){
        stack.push(second);
      } else {
        stack.push(first);
      }
    }
    int last = stack.pop();
    System.out.println(last);
    for(int i=0;i<n;i++){
      if((i!=last && knows(last,i)) || !knows(i,last)){
        return -1;
      }
    }
    return last;
  }

}
