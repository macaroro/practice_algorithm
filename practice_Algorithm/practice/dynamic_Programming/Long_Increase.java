package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Long_Increase {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int size = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		

		int[] dp = new int[size];
		int[] list = new int[size];
 
		for(int i=0;i<size;i++) {
			list[i]= Integer.parseInt(st.nextToken());
		}


		for(int i = 0; i < size; i++) {
			dp[i] = 1;
		    
			// 0 ~ i ���� ���ҵ� Ž��
			for(int j = 0; j < i; j++) {
		    
				// j��° ���Ұ� i��° ���Һ��� �����鼭 i��° dp�� j��° dp+1 ������ �������
				if(list[j] < list[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;	// j��° ������ +1 ���� i��° dp�� �ȴ�.
				}
			}
		}
		
		int max=0;
		
		for(int num: dp) {
			if(max<num) {
				max=num;
			}
		}
		System.out.println(max);
		

	}

}
