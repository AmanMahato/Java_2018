import java.util.*;
import java.lang.*;

public class BSTIterator{

  static class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
      this.val = val;
      left=null;
      right=null;
    }
  }

  static Stack<Node> stack = new Stack<>();

  BSTIterator(Node node){
    pushAll(node);
  }

  public static boolean hasNext(){
    return !stack.isEmpty();
  }

  public static int next(){
    Node temp = stack.pop();
    pushAll(temp.right);
    return temp.val;
  }

  static void pushAll(Node node){
    for(;node!=null;stack.push(node),node=node.left);
  }

}
