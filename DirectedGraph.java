import java.util.*;
import java.lang.*;

class GraphNode{

  int v;
  List<List<Integer>> adj;

  GraphNode(int vertex){
    this.v = vertex;
    this.adj = new LinkedList<>();
    for(int i=0;i<v;i++){
      adj.add(new LinkedList<Integer>());
    }
  }

    void addEdgeDirected(int s, int d){
      adj.get(s).add(d);
    }

    void addEdgeUndirected(int s, int d){
      adj.get(s).add(d);
      adj.get(d).add(s);
    }

  }

public class DirectedGraph{

  static final int GRAPH_SIZE = 4;
  static GraphNode graphDirected;
  static GraphNode graphUndirected;
  static GraphNode topologicalSort;

  public static void main(String[] args){
    graphDirected = new GraphNode(GRAPH_SIZE);
    graphDirected.addEdgeDirected(0, 1);
    graphDirected.addEdgeDirected(0, 2);
    graphDirected.addEdgeDirected(1, 2);
    graphDirected.addEdgeDirected(2, 0);
    graphDirected.addEdgeDirected(2, 3);
    graphDirected.addEdgeDirected(3, 3);

    graphUndirected = new GraphNode(GRAPH_SIZE+1); //+1 to make it compatible with the example from GeeksFOrGeeks
    graphUndirected.addEdgeUndirected(1, 0);
    graphUndirected.addEdgeUndirected(0, 2);
    graphUndirected.addEdgeUndirected(2, 0);
    graphUndirected.addEdgeUndirected(0, 3);
    graphUndirected.addEdgeUndirected(3, 4);

    topologicalSort = new GraphNode(GRAPH_SIZE+2);
    topologicalSort.addEdgeDirected(5, 2);
    topologicalSort.addEdgeDirected(5, 0);
    topologicalSort.addEdgeDirected(4, 0);
    topologicalSort.addEdgeDirected(4, 1);
    topologicalSort.addEdgeDirected(2, 3);
    topologicalSort.addEdgeDirected(3, 1);

    System.out.println("BFS-------------------------");
    bfs(2);
    System.out.println("DFS-------------------------");
    dfs(2);
    System.out.println("The graph is cyclic?: "+isCyclicDirected(graphDirected));
    System.out.println("The graph is cyclic?: "+isCyclicDirected(graphUndirected));
    System.out.println("Topological Sort-------------");
    topologicalSort(topologicalSort);
  }

  public static void bfs(int source){
    Queue<Integer> queue = new LinkedList<>();
    queue.add(source);
    boolean[] visited = new boolean[GRAPH_SIZE];
    visited[source] = true;
    while(!queue.isEmpty()){
        source = queue.poll();
        System.out.println(source+" ");
        Iterator<Integer> itr = graphDirected.adj.get(source).iterator();
        while(itr.hasNext()){
          int i = itr.next();
          if(!visited[i]){
            visited[i] = true;
            queue.add(i);
          }
        }
    }
  }

  public static void dfs(int source){
    boolean[] visited = new boolean[GRAPH_SIZE];
    dfsUtil(source,visited);
  }

  public static void dfsUtil(int source, boolean[] visited){
    visited[source] = true;
    System.out.println(source);
    Iterator<Integer> itr = graphDirected.adj.get(source).iterator();
    while(itr.hasNext()){
      int i = itr.next();
      if(!visited[i]){
        visited[i] = true;
        dfsUtil(i,visited);
      }
    }
  }

//Done using backedge check
  public static boolean isCyclicDirected(GraphNode node){
    boolean[] visited = new boolean[GRAPH_SIZE];
    boolean[] recStack = new boolean[GRAPH_SIZE];
    for(int i=0;i<GRAPH_SIZE;i++){
      //if(!visited[i]){
        if(isCyclicDirectedUtil(node,i,visited,recStack)){
          return true;
        }
      //}
    }
    return false;
  }

  public static boolean isCyclicDirectedUtil(GraphNode node, int i, boolean[] visited, boolean[] recStack){
    if(recStack[i]) return true;
    if(visited[i]) return false;
    visited[i] = true;
    recStack[i] = true;
    Iterator<Integer> itr = node.adj.get(i).iterator();
    while(itr.hasNext()){
      int j = itr.next();
      //if(!visited[j]){
        if(isCyclicDirectedUtil(node, j, visited, recStack)){
          return true;
        }
      // }
    }
    recStack[i] = false;
    return false;
  }

//done using parent check
  public static boolean isCyclicUndirected(GraphNode node){
    boolean[] visited = new boolean[GRAPH_SIZE+1];
    for(int i=0;i<GRAPH_SIZE+1;i++){
      if(!visited[i]){
        if(isCyclicUndirectedUtil(node,i,visited,-1)){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean isCyclicUndirectedUtil(GraphNode node, int i, boolean[] visited, int parent){
    visited[i] = true;
    Iterator<Integer> itr = node.adj.get(i).iterator();
    while(itr.hasNext()){
      int j = itr.next();
      if(!visited[j]){
        if(isCyclicUndirectedUtil(node, j, visited, i)) return true;
      } else if(j != parent){
        return true;
      }
    }
    return false;
  }

//Only possible for Directed Asylic Graph (DAG) and always starts from the node wiht zero degree (No incoming edge)
  public static void topologicalSort(GraphNode node){
      boolean[] visited = new boolean[GRAPH_SIZE+2];
      Stack<Integer> stack = new Stack<>();
      for(int i=0;i<GRAPH_SIZE+2;i++){
        if(!visited[i]){
          topologicalSortUtil(node, i, visited, stack);
        }
      }
      while(!stack.isEmpty()){
        System.out.println(stack.pop());
      }
  }

  public static void topologicalSortUtil(GraphNode node, int i, boolean[] visited, Stack<Integer> stack){
      visited[i] = true;
      Iterator<Integer> itr = node.adj.get(i).iterator();
      while(itr.hasNext()){
        int j = itr.next();
        if(!visited[j]){
          topologicalSortUtil(node, j, visited, stack);
        }
      }
      stack.push(new Integer(i)); //i--> is the current vertex of individual recursive call
  }

}
