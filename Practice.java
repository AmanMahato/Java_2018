import java.lang.*;
import java.util.*;

class TreeNode{

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val){
    this.val = val;
    this.left = null;
    this.right = null;
  }

}

public class Practice {

  public static void main(String[] args){
    //printAllPrime(20);
  }

//Prime
  static void printAllPrime(int n){
    boolean[] prime = new boolean[n+1];
    Arrays.fill(prime,true);
    for(int i=2;i*i<=n;i++){
      if(prime[i]){
        for(int j=2*i;j<=n;j=j+i){
          prime[j] = false;
        }
      }
    }
    for(int k=2;k<=n;k++){
      if(prime[k]){
        System.out.println(k);
      }
    }
  }


  //flatten BT
  static Node flattnBT(Node node){
    if(node == null) return Node;
    Stack<Node> stack = new Stack<>();
    stack.push(Node);
    while(!stack.isEmpty()){
      Node temp = stack.pop();
      if(temp.right!=null){
        stack.push(temp.right);
      }
      if(temp.left!=null){
        stack.push(temp.left);
      }
      if(!stack.isEmpty()){
        temp.right = stack.peek();
      }
      temp.left = null;
    }
    return temp;
  }

}
