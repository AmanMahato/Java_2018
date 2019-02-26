//Largest Number formtation from a list of number and return o/p as String

import java.util.*;
import java.lang.*;

public class LargestNumber {

public String largestNumber(int[] nums) {
     if(nums.length==0 || nums == null) return "";
     int len = nums.length;
     String[] strInp = new String[len];
     for(int i=0;i<len;i++){
         strInp[i] = String.valueOf(nums[i]);
     }
     Comparator<String> comparator= new Comparator<String>(){
         @Override
         public int compare(String s1, String s2){
             String s11 = s1+s2;
             String s22 = s2+s1;
             return s22.compareTo(s11);
         }
     };
     StringBuilder sb = new StringBuilder();
     Arrays.sort(strInp,comparator);
     if(strInp[0].equals("0")){
         return "0";
     }
     for(String str:strInp){
         sb.append(str);
     }
     return sb.toString();
 }

}

[5,6,3,6]-->6653
