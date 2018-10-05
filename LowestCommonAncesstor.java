//if BST
public class LowestCommonAncesstor{

  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data = data;
      left = null;
      right = null;
    }
  }

  public static void main(String[] args){
      Node testObj = new Node(20);
      testObj.left = new Node(8);
      testObj.left.left = new Node(4);
      testObj.left.right = new Node(12);
      testObj.left.right.left = new Node(10);
      testObj.left.right.right = new Node(14);
      testObj.right = new Node(22);
      System.out.println(getLCA(testObj,10,14).data);
      System.out.println(getLCA(testObj,14,8).data);
      System.out.println(getLCA(testObj,10,22).data);
  }

  static Node getLCA(Node node, int val1, int val2){
    if(node==null) return null;
    if(val1>node.data && val2>node.data){
      return getLCA(node.right,val1, val2);
    }
    if(val1<node.data && val2<node.data) {
      return  getLCA(node.left,val1,val2);
    }
    return node;
  }
}
