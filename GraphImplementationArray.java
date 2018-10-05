import java.util.*;
import java.lang.*;

public class GraphImplementationArray{

    int v;
    List<Integer>[] adjList;

    GraphImplementationArray(int v){
      this.v=v;
      adjList = new LinkedList<>()[v];
      for(int i=0;i<v;i++){
        adjList[i] = new LinkedList<Integer>();
      }

    static void addEdge(int source, int destination){
      if(source>=v || destination>=v){
        System.out.println("Value Out of Range");
        return;
      }
      adjList[source].add(destination);
    }
  }

  public static void main(String[] args){
    GraphImplementationArray graph = new GraphImplementationArray(4);
    addEdge(0,1);
    addEdge(0,2);
    addEdge(1,2);
    addEdge(2,3);
    addEdge(3,3);
  }

  public static bfs(int startingNode){
    boolean[] bool = new boolean[v];
    LinkedList<Integer> list = new LinkedList<>();
    bool[startingNode] = true;
    while(!list.isEmpty()){
      GraphNode temp = graphNode.poll();
      System.out.println(temp)
      if(bool[graphNode])
    }
  }

  public static void dfs(GraphNode graphNode, int startingNode){

  }

  static void dfs(){

  }

}
