import java.util.*;
import java.lang.*;
public class FlattenBinaryTree{

  static class BinaryTree{

    int val;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int val){
      this.val = val;
      this.left = null;
      this.right = null;
    }

  }
    public static void main(String[] args){
        BinaryTree testObj = new BinaryTree(1);
        testObj.left = new BinaryTree(2);
        testObj.right = new BinaryTree(3);
        //BinaryTree result =flatten(treeObj);
        flatten(testObj);
        //print(result);
        print(testObj);
    }

    static void print(BinaryTree tree){
      if(tree==null) return;
      System.out.println(tree.val);
      print(tree.left);
      print(tree.right);
    }

    //equivalent to pre-order tree traversal
    static BinaryTree flatten(BinaryTree tree){
      Stack stack = new Stack<BinaryTree>();
      stack.push(tree);
      while(!stack.isEmpty()){
        BinaryTree current = stack.pop();
        if(current.right!=null){
          stack.push(current.right);
        }
        if(current.left!= null){
          stack.push(current.left);
        }
        if(!stack.isEmpty()){
          current.right = stack.peek();
        }
        current.left = null;
      }
      return tree;
    }
}
