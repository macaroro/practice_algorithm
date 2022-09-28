package practice_Algorithm.Roop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Speed_A_Plus_B {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<>();
		
		try {
			int count = Integer.parseInt(br.readLine());
			
			
			
			for (int i = 0; i < count; i++) {
				String[] str = br.readLine().split(" ");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				list.add(a);
				list.add(b);
				
			}
			
			for (int i = 0; i < list.size(); i+=2) {
				int x= list.get(i);
				int y= list.get(i+1);
				int plus = x+y;
				bw.write(plus+"\n");
			
				
			}
			
			
			bw.flush();
			bw.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 

	}

}
