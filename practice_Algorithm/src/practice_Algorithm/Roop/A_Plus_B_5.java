package practice_Algorithm.Roop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_Plus_B_5 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int a;
		int b;
		StringBuilder sb = new StringBuilder();
		try {
		    
			while (true) {
				st= new StringTokenizer(br.readLine()," "); 
				a= Integer.parseInt(st.nextToken());
			    b= Integer.parseInt(st.nextToken());

				if(a==0&b==0) {
					br.close();
					break;
				}
				sb.append((a+b)).append('\n');
				  
			}
			System.out.println(sb);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 

	}


}
