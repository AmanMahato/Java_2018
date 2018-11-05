public class BalanParanGen{
  public static void main(String[] args){
    generate(3);
  }

  static void generate(int n){
    generate("",0,0,n);
  }

  static void generate(String str,int open,int close, int max){
    if(str.length()==2*max){
      System.out.println(str);
      return;
    }
    if(open<max){
      generate(str+"(",open+1,close,max);
    }
    if(close<open){
      generate(str+")",open,close+1,max);
    }
  }
}
