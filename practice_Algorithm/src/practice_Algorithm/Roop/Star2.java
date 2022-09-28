package practice_Algorithm.Roop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Star2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
		int count= Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= count; i++) {
			for(int j=1;j<=count-i;j++){
				bw.write(" ");
			}
			for(int k=1;k<=i;k++){
				bw.write("*");
			}
			bw.write("\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 

	}

}



