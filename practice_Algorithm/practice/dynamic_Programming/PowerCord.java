package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class PowerCord {

	static Integer[] dp;
	static int[][] wire;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int cord = Integer.parseInt(br.readLine());
		
		
		dp = new Integer[cord];
		//���δ� a,b�ΰ�
	    wire= new int[cord][2];
		
		for(int i = 0; i < cord; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			wire[i][0] = Integer.parseInt(st.nextToken());
			wire[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// ù ��° ����(A������)�� �������� ������������ ��
		Arrays.sort(wire, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
	int max = 0;
		
		/*
		 *  i��° A������ �������� ���ᰡ���� ���� Ž��
		 *  �� �ִ� ã��
		 */
		 
		for(int i = 0; i < cord; i++) {
			max = Math.max(recur(i), max);
		}
		
		// ���� ���� - ���� 
		System.out.println(cord - max);
		
	}
	
	
	static int recur(int N) {
		
		// Ž������ �ʾҴ� ��ġ��� 
		if(dp[N] == null) {
			
			dp[N] = 1;	// �ּڰ� 1�� �ʱ�ȭ 
			
			// A�� N��°�� ������ ������� �� 
			for(int i = N + 1; i < dp.length; i++) {
				
				/*
				 *  A�������� N��° ������ ����Ǿ��ִ� B�����뺸�� A�� i��°
				 *  �������� ������ �̾��� B�����밡 �ڿ� ���� ��� 
				 *  ������ ��ġ�� �� ���� 
				 */
				if(wire[N][1] < wire[i][1]) {
					// ���� ������ ������ ����� �� �� ū ���� dp�� �����Ѵ�.
					dp[N] = Math.max(dp[N], recur(i) + 1);
				}
			}
		}
		return dp[N];
	}
		
		

		
	}


