import java.lang.*;
import java.util.*;

class Tree{
  int value;
  Tree left;
  Tree right;
  Tree(int value){
    this.value = value;
    this.left = null;
    this.right = null;
  }
}

public class TreeNodeCount{

  public static void main(String[] args){
    Tree tree = new Tree(1);
    tree.left = new Tree(2);
    tree.right = new Tree(3);
    tree.left.left = new Tree(4);
    tree.left.right = new Tree(5);
    //System.out.println(getCount(tree));
    //System.out.println(getHeight(tree));
    //inOrderTraverse(tree);
    //preOrderTraverse(tree);
    //postOrderTraverse(tree);
    printTreeByBfs(tree);
    }

    public static int getCount(Tree root){
      if(root == null) return 0;
      return (getCount(root.left) + 1 + getCount(root.right));
    }

    public static int getHeight(Tree root){
      if(root == null) return 0;
      return Math.max(getHeight(root.left)+1,1+getHeight(root.right));
    }

    public static void inOrderTraverse(Tree root){
      if(root == null) return;
      inOrderTraverse(root.left);
      System.out.println(root.value);
      inOrderTraverse(root.right);
    }

    public static void preOrderTraverse(Tree root){
      //TODO
      if(root == null) return;
      System.out.println(root.value);
      preOrderTraverse(root.left);
      preOrderTraverse(root.right);
    }

    public static void postOrderTraverse(Tree node){
      //TODO
      if(node == null) return;
      postOrderTraverse(node.left);
      postOrderTraverse(node.right);
      System.out.println(node.value);
    }

    public static Tree reverseTree(Tree tree){
      //TODO
      return null;
    }

    public static void printTreeByBfs(Tree tree){
      Queue<Tree> queue = new LinkedList<>();
      queue.add(tree);
      while(!queue.isEmpty()){
        Tree removedNode = queue.poll();
        System.out.println(removedNode.value);
        if(removedNode.left!=null){
          queue.add(removedNode.left);
        }
        if(removedNode.right!=null){
          queue.add(removedNode.right);
        }
      }
    }

}
