package practice_Algorithm.Roop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_Plus_B_8 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int a;
		int b;
		try {
			int count = Integer.parseInt(br.readLine());
			
			for (int i = 1; i <= count; i++) {
			st= new StringTokenizer(br.readLine()," "); 
			a= Integer.parseInt(st.nextToken());
		    b= Integer.parseInt(st.nextToken());
		    
		    bw.write("Case #"+i+": ");
			bw.write(a + " + " + b + " = ");
			bw.write((a+b) + "\n");
			}
			
			br.close();
			bw.flush();
			bw.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 

	}

}



