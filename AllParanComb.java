// Java program to print all combinations of balanced parentheses
import java.io.*;
import java.lang.*;
import java.util.*;

public class AllParanComb {

	public static void main(String[] args){
		List<String> result = new AllParanComb().generateParenthesis(3);
	}

public List<String> generateParenthesis(int n) {
			 List<String> list = new ArrayList<String>();
			 backtrack(list, "", 0, 0, n);
			 return list;
	 }

	 public void backtrack(List<String> list, String str, int open, int close, int max){

			 if(str.length() == max*2){
				 	 System.out.println(str);
					 list.add(str);
					 return;
			 }

			 if(open < max)
					 backtrack(list, str+"(", open+1, close, max);
			 if(close < open)
					 backtrack(list, str+")", open, close+1, max);
	 }

 }
