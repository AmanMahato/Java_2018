import java.util.*;
import java.lang.*;
public class ArrayToBST{

  static class Node{
    int val;
    Node left,right;
    Node(int val){
      this.val = val;
      left=null;
      right=null;
    }
  }

  static Node root;

  public static void main(String[] args){
    int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};//{2,5,2,16,44};
    Arrays.sort(input);
    root = arrayToBST(input);
    preOrderTreeTraverse(root);
  }

  static Node arrayToBST(int[] input){
    return arrayToBST(input,0,input.length-1);
  }

  static Node arrayToBST(int[] input,int start, int end){
    if(start>end) return null;
    int mid = (start+end)/2;
    Node temp = new Node(input[mid]);
    temp.left = arrayToBST(input,start,mid-1);
    temp.right = arrayToBST(input,mid+1,end);
    return temp;
  }

  static void preOrderTreeTraverse(Node root){
    if(root==null) return;
    System.out.println(root.val);
    preOrderTreeTraverse(root.left);
    preOrderTreeTraverse(root.right);
  }


}
