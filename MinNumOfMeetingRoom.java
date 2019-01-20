public class MinNumOfMeetingRoom{

  static class Interval implements Comparable<Interval>{
    int x;
    int y;

    Interval(int x, int y){
      this.x=x;
      this.y=y;
    }

    @Override
    public int compare(Interval i1, Interval i2){
      return (i1.x-i2.x);
    }

  }

  public static void main(String[] args){
      Interval[] p1 = new Interval[]{new Interval(),new Interval(),new Interval()};
      Interval[] p2 = new Interval[]{new Interval(),new Interval(),new Interval()};
      Interval[] p3 = new Interval[]{new Interval(),new Interval(),new Interval()};
      Interval[] p4 = new Interval[]{new Interval(),new Interval(),new Interval()};
      List<Interval[]> input = new LinkedList<>();
      input.add(p1);
      input.add(p2);
      input.add(p3);
      input.add(p4);
      int result = getMinRoom(input);
      System.out.println(result);
  }

  static int getMinRoom(List<Interval[]> input){
    for(Interval[] individualObj:input){
      //TODO
    }
  }

}
