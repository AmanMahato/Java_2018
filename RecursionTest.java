public class RecursionTest{

  public static void main(String[] args){
    new RecursionTest().printNum(2,1);
  }

  public void printNum(int upto,int starting){
    if(upto==0) return;
    //if(upto>0){
      System.out.println(starting++);
      printNum(--upto,starting); //NOTE: If you put upto-- instead, it will cause stack overflow
    //}
  }

}
