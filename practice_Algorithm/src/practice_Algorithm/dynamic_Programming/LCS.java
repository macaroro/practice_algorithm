package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class LCS {
 
	//Longest Common Subsequence:�κм����̱� ������ ���� ���̸� �ǳʶپ� ����Ǹ鼭 ���� �� �κ�
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str1 = br.readLine().toCharArray();
		char[] str2 = br.readLine().toCharArray();
		
		int length_1 = str1.length;
		int length_2 = str2.length;
		
		// ������ ǥ���� ���� �ε����� �� �پ� �߰� �� 
		int[][] lcs = new int[length_1 + 1][length_2 + 1];
		
		// 1���� ���� (index 0 �� �������̹Ƿ� 0�� ���� ��������) 
		for(int i = 1; i <= length_1; i++) {
			for(int j = 1; j <= length_2; j++) {
				
				// (i-1)�� (j-1) ��° ���ڰ� ���� ���ٸ�  
				if(str1[i - 1] == str2[j - 1]) {
					// �밢�� �� (i-1, j-1)�� dp�� +1 �� ������ ���� 
					lcs[i][j] = lcs[i - 1][j - 1] + 1;	
				}
				
				// ���� �ʴٸ� ���� ��(i-1)�� ���� ��(j-1)�� �� �� ū ������ ����  
				else {
					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
				}
			}
		}
		System.out.println(lcs[length_1][length_2]);
		
	}
 
}
