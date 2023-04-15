package practice_Algorithm.Roop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Plus_B_4 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
	
		StringBuilder sb = new StringBuilder();
		String str;
		try {
		    
			while ((str =br.readLine())!=null) {
				st= new StringTokenizer(str," "); 
				int a= Integer.parseInt(st.nextToken());
			    int b= Integer.parseInt(st.nextToken());
				sb.append((a+b)).append('\n');
				  
			}
			System.out.println(sb);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 

	}

}
