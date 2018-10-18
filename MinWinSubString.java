//Minimum Window Substring

public class MinWinSubString {

    public static void main(String[] args){
      System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        int lenMain = s.length();
        int lenTarget = t.length();
        if(lenMain<lenTarget) return "";
        int[] main = new int[256];
        int[] target = new int[256];
        for(int i=0;i<lenTarget;i++){
            target[t.charAt(i)]++;
        }
        int count=0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int startingPoint =-1;
        for(int j=0;j<lenMain;j++){
            main[s.charAt(j)]++;
            if(target[s.charAt(j)]!=0 && target[s.charAt(j)]>=main[s.charAt(j)]){
                count ++;
            }
            //Found window,
            if(count==lenTarget){
                while(target[s.charAt(start)]==0 || main[s.charAt(start)]>target[s.charAt(start)]){
                    if(main[s.charAt(start)]>target[s.charAt(start)]) {
                        main[s.charAt(start)]--;
                    }
                    start++;
                }
                int winLen = j-start+1;
                if(winLen<minLen){
                    minLen = winLen;
                    startingPoint = start;
                }
            }
        }

        return (startingPoint == -1 ? "" : s.substring(startingPoint,startingPoint+minLen));

    }
}
