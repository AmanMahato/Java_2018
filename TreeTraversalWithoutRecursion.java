import java.util.*;
import java.lang.*;

public class TreeTraversalWithoutRecursion{

  static class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  public static void main(String[] args){
    Node test = new Node(1);
    test.left = new Node(2);
    test.right = new Node(3);
    test.left.left = new Node(4);
    test.left.right = new Node(5);
    test.right.left = new Node(6);
    System.out.println("post order ------");
    postOrderTraverse(test);
    //System.out.println("in order ------");
    //inOrderTraverse(test);
    System.out.println("pre order ------");
    preOrderTraverse(test);
  }

  public static void preOrderTraverse(Node node){ //(node, left, right)
    if(node == null) return;
    Stack<Node> nodeStack = new Stack<Node>();
    nodeStack.push(node);
    while (!nodeStack.isEmpty()) {
       Node mynode = nodeStack.pop();
       System.out.println(mynode.val);
       if (mynode.right != null) {
           nodeStack.push(mynode.right);
       }
       if (mynode.left != null) {
           nodeStack.push(mynode.left);
       }
   }
  }

  public static void inOrderTraverse(Node node){ //(left, node, right)
    if(node == null) return;
    Stack<Node> stack = new Stack<>();
    Node current = node;
    while(current!=null || stack.size()>0){
      while(current!=null){
        stack.push(current);
        current = current.left;
      }
      current = stack.pop();
      System.out.println(current.val);
      current = current.right;
    }
  }

  public static void postOrderTraverse(Node node){ //left, right, node
    if(node == null) return;
    Stack<Node> stack1 = new Stack<>();
    Stack<Node> stack2 = new Stack<>();
    stack1.push(node);
    while(!stack1.isEmpty()){
      Node temp = stack1.pop();
      stack2.push(temp);
      if(temp.left!=null){
        stack1.push(temp.left);
      }
      if(temp.right!=null){
        stack1.push(temp.right);
      }
    }
    while(!stack2.isEmpty()){
      System.out.println(stack2.pop().val);
    }
  }


//copied
  public void postOrderItrOneStack(Node root){
    Node current = root;
    Deque<Node> stack = new LinkedList<>();
    while(current != null || !stack.isEmpty()){
        if(current != null){
            stack.addFirst(current);
            current = current.left;
        }else{
            Node temp = stack.peek().right;
            if (temp == null) {
                temp = stack.poll();
                System.out.print(temp.data + " ");
                while (!stack.isEmpty() && temp == stack.peek().right) {
                    temp = stack.poll();
                    System.out.print(temp.data + " ");
                }
            } else {
                current = temp;
            }
        }
    }
}

}
