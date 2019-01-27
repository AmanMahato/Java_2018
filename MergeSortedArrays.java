import java.util.*;
import java.lang.*;

public class MergeSortedArrays{

  static class Node implements Comparable<Node>{
    int val;
    int array;
    int index;

    Node(int val,int array,int index){
      this.val = val;
      this.array = array;
      this.index = index;
    }

    @Override
    public int compareTo(Node o){
      return (this.val-o.val);
    }
  }

  public static void main(String[] args){
    int[][] input = new int[3][];
    input[0] = new int[]{-6,4,98,1234};
    input[1] = new int[]{0,3,7,8888};
    input[2] = new int[]{-9,2};;
    int[] result = getSortedArray(input);
    System.out.println("Printing the sorted array");
    System.out.println();
    for(int i:result){
      System.out.println(i);
    }
    System.out.println();
    System.out.println("Printing the kth largest element: ",getKthLargest(new int[]{9,4,883,23343,1,354,-98,422},3));
  }

  public static int getKthLargest(int[] input, int k){
    //build min heap of size k
    //pass the element from k+1 to n-1 , where n is input size
    //return root of the heap

  }

  public static int[] getSortedArray(int[][] input){
    if(input==null || input.length==0) return input[0];
    int totalSize = 0;
    PriorityQueue<Node> queue = new PriorityQueue<>();
    for(int i=0;i<input.length;i++){
      totalSize = totalSize+input[i].length;
      queue.add(new Node(input[i][0],i,0));
    }
    int i = 0;
    int[] result = new int[totalSize];
    while(!queue.isEmpty()){
      Node popped = queue.poll();
      result[i++] = popped.val;
      if(popped.array<input.length && popped.index+1<input[popped.array].length){
        queue.add(new Node(input[popped.array][popped.index+1],popped.array,popped.index+1));
      }
    }
    return result;
  }


}
