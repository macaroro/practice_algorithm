package practice_Algorithm.cumulaticeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Human_Computer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		char[] chs = br.readLine().toCharArray();
		
		int q = Integer.parseInt(br.readLine());
		int[] list = new int[chs.length];
		
		int count=0;
		for(int i=0;i<list.length;i++) {
		
			if(chs[i]=='a') {
				count++;
			}
	
			list[i]=count;
		}
		
		
		for(int i=0;i<q;i++) {
			st = new StringTokenizer(br.readLine()," ");
			String a = st.nextToken();
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			if(start==0) {
				sb.append(list[end]).append("\n");
			}else {
				sb.append(list[end]-list[start-1]).append("\n");
			}
		
		}
		
		System.out.println(sb);
		
		

	}


}
