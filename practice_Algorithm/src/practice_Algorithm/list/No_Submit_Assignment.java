package practice_Algorithm.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_Submit_Assignment {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] list = new boolean[31];
		
		for(int i=1;i<=28;i++) {
			  int n = Integer.parseInt(br.readLine());
	          list[n] = true;
			
		}
		
		for(int i=1;i<=30;i++) {
			  if(!list[i]) {
				  System.out.println(i);
			  }
			
		}
		
	
		
		

	}

}
