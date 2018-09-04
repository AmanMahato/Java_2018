import java.lang.*;
import java.util.*;

public class Delete { //implements Iterable<Integer> {



  public static void main(String[] args){
    //Delete del = new Delete(new String[]{"Aman","Kumar","Mahato"}, new Integer[]{1,2,3});
    //del.forEach(x->System.out.println(x));
    List<Integer> list = new LinkedList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5}));
    //for(Integer single:list){
      //list.remove(single);
    //}
    Iterator<Integer> itr = list.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
      itr.remove();
    }
    System.out.println(list.size());
  }

}
