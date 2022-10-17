package practice_Algorithm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_Of_Recursion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0;i<test_case;i++) {
			String str = br.readLine();
			int[] num  =isPalindrome(str);
			sb.append(num[0]).append(" ").append(num[1]).append("\n");
		}

		System.out.println(sb);
}   
	static int count=0;
	 public static int[] recursion(String s, int l, int r){
		   
			count++;
	        if(l >= r) return new int[] {1,count};
	        else if(s.charAt(l) != s.charAt(r)) return  new int[] {0,count};
	        else {
	        
	        	return recursion(s, l+1, r-1);
	        
	        }
	    }
	    public static int[] isPalindrome(String s){
	    	count=0;
	        return recursion(s, 0, s.length()-1);
	    }

}
