//Find K nearest point --> MicroSoft
import java.util.*;
import java.lang.*;
public class FindKNearestPoint{

  static class Point{
    final int x;
    final int y;
    int distance;
    Point(int x,int y){
      this.x=x;
      this.y=y;
      this.distance=0;
    }
  }

  public static void main(String[] args){
    PriorityQueue<Point> pq = new PriorityQueue<>((p1,p2)->p1.distance-p2.distance);
    Point REFERENCE_POINT = new Point(0,0);
    int k = 3;
    List<Point> list = new LinkedList<>();
    list.add(new Point(1,2));
    list.add(new Point(4,2));
    list.add(new Point(-3,9));
    list.add(new Point(3,0));
    for(Point p:list){
      pq.add(getDistance(p,REFERENCE_POINT));
    }
    for(int i=0;i<k && i<list.size();i++){
      print(pq.poll());
    }
  }

  static void print(Point p){
    System.out.println("("+p.x+","+p.y+")");
  }

  static Point getDistance(Point p1,Point p2 ){
    int dist = (int)(Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2)));
    p1.distance = dist;
    return p1;
  }
}
