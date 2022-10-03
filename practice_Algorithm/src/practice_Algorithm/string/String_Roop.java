package practice_Algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class String_Roop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int test_case = Integer.parseInt(br.readLine());

		
		for(int i=0; i<test_case;i++) {
		st=new StringTokenizer(br.readLine()," ");
		int count = Integer.parseInt(st.nextToken());
		String str = st.nextToken();
	
		for(int k=0; k<str.length();k++) {
			for(int x = 0; x<count;x++) {
				System.out.print(str.charAt(k));
			}
			
	}
		System.out.println();

	}
	

}
}
