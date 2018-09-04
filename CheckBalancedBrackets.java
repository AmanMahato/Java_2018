import java.util.Stack;

public class CheckBalancedBrackets{

  public Boolean checkBalanced(String expression){
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<expression.length();i++){
      if(expression.charAt(i)=='(' || expression.charAt(i)=='{' || expression.charAt(i)=='['){
        stack.push(expression.charAt(i));
      }
      if(expression.charAt(i)==')' || expression.charAt(i)=='}' || expression.charAt(i)==']') {
        if(stack.isEmpty()){
          return false;
        } else {
        if(!isMatchingPair(stack.pop(),expression.charAt(i))){
          return false;
      }
    }
  }
  }
  if(stack.isEmpty()){
    return true;
  } else {
    return false;
  }
}

  public Boolean isMatchingPair(Character c1, Character c2){
      if(c1=='(' && c2==')'){
        return true;
      } else if(c1=='{' && c2=='}') {
        return true;
      } else if(c1=='[' && c2 == ']') {
        return true;
      } else {
        return false;
      }
  }

  public static void main(String[] args){
    String input = "([)]";
    if(new CheckBalancedBrackets().checkBalanced(input)){
      System.out.println("Balanced");
    } else {
      System.out.println("Unbalanced");
    }
  }

}
