package practice_Algorithm.cumulaticeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Intercal_Sum4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		
		int num_count = Integer.parseInt(st.nextToken());
		int add_count = Integer.parseInt(st.nextToken());
		
		int[] list = new int[num_count+1];
		
		st = new StringTokenizer(br.readLine()," ");
		list[0]=0;
		for(int i=1;i<=num_count;i++) {
			//배열에 누적합을 저장
			list[i]=list[i-1]+Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=1;i<=add_count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			//지정 구간의 누적함은 가장 마지막 도착지의 누적합에
			//시작 시점보다 한칸 아래의 누적합을 빼면 얻을 수 있음
			sb.append(list[end]-list[start-1]).append("\n");
		}
		
		System.out.println(sb);
		

	}

}
