package practice_Algorithm.dynamic_Programming;

import java.io.*;


public class Padovan_Sequence {
	 static long[] list;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test_case;i++) {
			int num = Integer.parseInt(br.readLine());
			list = new long[num+1];
			
			if(num==1||num==0||num==2) {
				sb.append(1).append("\n");
			}else {
				long re = pado(num);
				sb.append(re).append("\n");
			}
			
		
			
		}
		System.out.println(sb);
		

	}
	
	public static long pado(int num) {
		
			list[0]=1;
			list[1]=1;
			list[2]=1;
		
	
		
		for(int i=3;i<num;i++) {
			list[i]=list[i-3]+list[i-2];
			
		}
		return list[num-1];
		
	}

}
