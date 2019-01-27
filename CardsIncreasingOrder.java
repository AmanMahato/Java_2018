import java.lang.*;
import java.util.*;

public class CardsIncreasingOrder {

  public static void main(String[] args){

    int[] result = new int[]{17,13,11,2,3,5,7};
    deckRevealedIncreasing(result);
    //for(int i:deckRevealedIncreasing(result)){
      //System.out.println(i);
    //}
  }

  //copied
  public static int[] deckRevealedIncreasing_bkup(int[] deck) {
        int N = deck.length;
        Deque<Integer> index = new LinkedList();
        for (int i = 0; i < N; ++i)
            index.add(i);
        int[] ans = new int[N];
        Arrays.sort(deck);
        for (int card: deck) {
          //System.out.println(card);
          System.out.println(index.pollFirst());
            ans[index.pollFirst()] = card;
            if (!index.isEmpty())
                index.add(index.pollFirst());
        }
        return ans;
    }

    //self
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); //nlog(n)
        Queue<Integer> queue = new LinkedList<>();
        int size = deck.length;
        for(int i=0;i<size;i++){
            queue.add(i);
        }
        int[] ans = new int[size];
        for(int card:deck){
            ans[queue.poll()] = card;
            if(!queue.isEmpty()){
                queue.add(queue.poll());
            }

        }
        return ans;
    }

}
