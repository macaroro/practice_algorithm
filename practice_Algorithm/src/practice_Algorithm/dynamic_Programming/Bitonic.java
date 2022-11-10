package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
// 바이토닉의 경우 특정 값을 기준으로 왼쪽 부분은 오름차순, 오른쪽 부분은 내림차순인 수열 또는 그러한 부분 순환이동을 말한다
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
		    
			// 0 ~ i 이전 원소들 탐색
			for(int j = 0; j < i; j++) {
		    
				// j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 j번째 dp+1 값보다 작은경우
				if(list[j] < list[i] && r_dp[i] < r_dp[j] + 1) {
					r_dp[i] = r_dp[j] + 1;	// j번째 원소의 +1 값이 i번째 dp가 된다.
				}
			}
		}
	}
 
 
	
	static void LDS() {
 
		// 뒤에서부터 시작 
		for (int i = test_case - 1; i >= 0; i--) {
			l_dp[i] = 1;
			
			// 맨 뒤에서 i 이전 원소들을 탐색 
			for (int j = test_case - 1; j > i; j--) {
				
				// i번째 원소가 j번째 원소보다 크면서 i번째 dp가 j번째 dp+1 값보다 작은경우 
				if (list[j] < list[i] && l_dp[i] < l_dp[j] + 1) {
					l_dp[i] = l_dp[j] + 1;	// j번쨰 원소의 +1이 i번쨰 dp값이 됨
				}
			}
		}
	
	}
}