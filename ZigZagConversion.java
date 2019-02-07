public class ZigZagConversion {

public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        boolean goingDown = false;
        List<StringBuilder> list = new LinkedList<>();
        for(int i=0;i<numRows && i<s.length();i++){
            list.add(new StringBuilder());
        }
        int row = 0;
        for(int i=0;i<s.length();i++){
            list.get(row).append(s.charAt(i));
            if(row==0 || row == numRows-1) goingDown = !goingDown;
            row = goingDown ? row+1 : row-1;
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder sb:list){
            ans.append(sb);
        }
        return ans.toString();
    }

}
