import java.util.*;
import java.lang.*;

public class GraphImplementation{



  static void addEdge(Graph graph, Integer src, Integer dest){
    if(src > graph.v || dest > graph.v){
      System.out.println("Given Value out of range");
      return;
    }
    LinkedList<Integer> slist = graph.adjList.get(src);
    slist.add(dest);
    LinkedList<Integer> dlist = graph.adjList.get(dest);
    dlist.add(src);
  }





  static void printGraph(Graph graph){
    for(Map.Entry<Integer,LinkedList<Integer>> mapObj : graph.adjList.entrySet()){
      LinkedList<Integer> list = mapObj.getValue();
      Integer key = mapObj.getKey();
      System.out.println(key);
      for(Integer edges : list){
        System.out.println(edges + "-->");
      }
    }
  }




  public static void bfs(Graph graph, int val){
    //TODO
  }




  public static void dfs(Graph graph, int start){
    boolean[] visited = new boolean[graph.v];
    dfsUtil(graph,start,visited);
  }




  public static void dfsUtil(Graph graph, int start, boolean[] visited){
    Iterator<Integer> itr = graph.adjList.get(start).iterator();
    System.out.println(start);
    visited[start] = true;
    while(itr.hasNext()){
      if(!visited[itr.next()]){
        dfsUtil(graph,itr.next(),visited);
      }
    }
  }

  public static boolean isDirected(Graph graph){
    //TODO
    return false;
  }

  public boolean isCyclic(Graph graph){
    //TODO
    return false;
  }

  public static boolean shortestPath(Graph graph, Integer src, Integer dest){
    //TODO
    return false;
  }

  public static boolean dijkstras(Graph graph, Integer src, Integer dest){
    //TODO
    return false;
  }

  public static void main(String[] args){
    int v = 5;
    Graph graph = new Graph(v);
    addEdge(graph,0,1);
    addEdge(graph,0,4);
    addEdge(graph,1,2);
    addEdge(graph,1,3);
    addEdge(graph,1,4);
    addEdge(graph,2,3);
    addEdge(graph,3,4);
    //printGraph(graph);
    dfs(graph,0);
  }
}

class Graph{

  int v;
  Map<Integer,LinkedList<Integer>> adjList;

  public Graph(int v){
    this.v=v;
    adjList = new HashMap<Integer,LinkedList<Integer>>(v);
    for(int i=0;i<=v;i++){
      adjList.put(i,new LinkedList<Integer>());
    }
  }

}
