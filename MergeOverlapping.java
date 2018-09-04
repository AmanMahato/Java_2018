import java.util.*;
import java.lang.*;

public class MergeOverlapping{

  static class Interval{
    int start;
    int end;

    Interval(int start, int end){
      this.start = start;
      this.end = end;
    }
  }

  public static void main(String[] args){
    Interval[] interval = new Interval[]{new Interval(8,3),new Interval(2,6),new Interval(1,10),new Interval(15,18)};
    Arrays.sort(interval, new Comparator<Interval>() {
    @Override
    public int compare(Interval o1, Interval o2) {
        return Integer.compare(o1.start, o2.start);
    }
});
    mergeOverlapping(interval);
    for(Interval intervalObj:interval){
      System.out.println("[ "+intervalObj.start+" "+intervalObj.end+" ]");
    }
    //printArray(input); //TODO
  }

  public static void mergeOverlapping(Interval[] input){
    Stack<Interval> stack = new Stack<>();
    //if(input.size<1) throw new InvalidArgumentException;
    stack.push(input[0]);
    for(int i=1;i<input.length;i++){
      Interval popped = stack.peek();
      if(popped.end<input[i].end){
        stack.push(input[i]);
      } else if(popped.end>input[i].end){
        Interval temp = stack.pop();
        temp.end = input[i].end;
        stack.push(temp);
      }
    }
  }

}
