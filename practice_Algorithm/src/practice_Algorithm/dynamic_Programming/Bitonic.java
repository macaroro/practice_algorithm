package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
// ��������� ��� Ư�� ���� �������� ���� �κ��� ��������, ������ �κ��� ���������� ���� �Ǵ� �׷��� �κ� ��ȯ�̵��� ���Ѵ�
public class Bitonic {
	
	static int test_case;
	static int[] list;
	static int[] r_dp;
	static int[] l_dp;
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		test_case = Integer.parseInt(br.readLine());
		
		r_dp = new int[test_case];	// LIS
		l_dp = new int[test_case];	// LDS
		list = new int[test_case];
		
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		for (int i = 0; i < test_case; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
 
		LIS();
		LDS();
		
		int max = 0;
		for(int i = 0; i < test_case; i++) {
			if(max < r_dp[i] + l_dp[i]) {
				max = r_dp[i] + l_dp[i];
			}
		}
 
		System.out.println(max - 1);
	}
 
	
	
	static void LIS() {
 
		for(int i = 0; i < test_case; i++) {
			r_dp[i] = 1;
		    
			// 0 ~ i ���� ���ҵ� Ž��
			for(int j = 0; j < i; j++) {
		    
				// j��° ���Ұ� i��° ���Һ��� �����鼭 i��° dp�� j��° dp+1 ������ �������
				if(list[j] < list[i] && r_dp[i] < r_dp[j] + 1) {
					r_dp[i] = r_dp[j] + 1;	// j��° ������ +1 ���� i��° dp�� �ȴ�.
				}
			}
		}
	}
 
 
	
	static void LDS() {
 
		// �ڿ������� ���� 
		for (int i = test_case - 1; i >= 0; i--) {
			l_dp[i] = 1;
			
			// �� �ڿ��� i ���� ���ҵ��� Ž�� 
			for (int j = test_case - 1; j > i; j--) {
				
				// i��° ���Ұ� j��° ���Һ��� ũ�鼭 i��° dp�� j��° dp+1 ������ ������� 
				if (list[j] < list[i] && l_dp[i] < l_dp[j] + 1) {
					l_dp[i] = l_dp[j] + 1;	// j���� ������ +1�� i���� dp���� ��
				}
			}
		}
	
	}
}