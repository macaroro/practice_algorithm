package practice_Algorithm.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class OX {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		
		String[] list = new String[count];
		
		for (int i = 0; i <count; i++) {
			list[i]=br.readLine();
		}
		
		for (int i = 0; i <count; i++) {
			int serise = 0;
			int sum = 0;
			
			for(int j=0; j<list[i].length(); j++) {
				if(list[i].charAt(j)=='O'){
					serise++;
				}else {
					serise=0;
				}
				sum+=serise;
			}
			
		}
		
		System.out.println(sb);
		
		
	}

}
