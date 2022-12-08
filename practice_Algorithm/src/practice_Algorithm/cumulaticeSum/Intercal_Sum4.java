package practice_Algorithm.cumulaticeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//구간합 구하기
//주어진 수의 합배열은 s[i]=s[i-1]+a[i]
// 구간합은 s[end]-s[start-1]
public class Intercal_Sum4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		
		int num_count = Integer.parseInt(st.nextToken());
		int add_count = Integer.parseInt(st.nextToken());
		
		long[] list = new long[num_count+1];
		
		st = new StringTokenizer(br.readLine()," ");
		list[0]=0;//미리 설정
		for(int i=1;i<=num_count;i++) {
			//배열에 누적합을 저장(list[i]=list[i-1]+넘겨오는 수)
			list[i]=list[i-1]+Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=1;i<=add_count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int start = Integer.parseInt(st.nextToken());//구간합을 시작하는 곳
			int end = Integer.parseInt(st.nextToken());//끝나는 곳
			//구간합은 list[end]-list[start-1]
			sb.append(list[end]-list[start-1]).append("\n");
		}
		
		System.out.println(sb);
		

	}

}
