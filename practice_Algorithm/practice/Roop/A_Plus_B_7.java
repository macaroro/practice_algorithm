package practice_Algorithm.Roop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class A_Plus_B_7 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			int count = Integer.parseInt(br.readLine());
			
			for (int i = 1; i <= count; i++) {
				String[] str = br.readLine().split(" ");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				int plus = a+b;
				bw.write("Case #"+i+":"+" "+plus+"\n");
			}
			
			
			bw.flush();
			bw.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 

	}

}



