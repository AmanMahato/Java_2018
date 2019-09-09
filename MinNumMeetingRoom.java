import java.util.*;
import java.lang.*;

public class MinNumMeetingRoom {

  public static void main(String[] args) {
    System.out.println("Minimum Number of Meeting Required "+minMeetingRooms(new int[][]{{2,15},{36,45},{9,29},{16,23},{4,9}}));
  }

  public static int minMeetingRooms(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int count = 0;
    for (int[] itv : intervals) {
        if (heap.isEmpty()) {
            count++;
            heap.offer(itv[1]);
        } else {
            if (itv[0] >= heap.peek()) {
                heap.poll();
            } else {
                count++;
            }

            heap.offer(itv[1]);
        }
    }
    return count;
}

}
