public class LongestValidParenthsis{

  public static void main(String[] args){

  }

  public int longestValidParenthsis(String str){
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='('){
        stack.push(i);
      } else {
        if(stack.isEmpty()){
          stack.push(i);
          continue;
        }
        if(stack.peek()=='('){
          stack.pop();
        } else {
          stack.push(i);
        }
      }
    }
    int localMax = str.length();
    if(stack.isEmpty()) return localMax;
    int result = 0;
    while(!Stack.isEmpty()){
      result = Math.max(localMax-stack.peek(),result);
      localMax = stack.pop();
    }
    return result-1;
  }
}
