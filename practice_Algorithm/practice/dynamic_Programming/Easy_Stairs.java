package practice_Algorithm.dynamic_Programming;

import java.io.*;

//��ܼ�

public class Easy_Stairs {
	
	static int length;
	//�ڿ�L�� �ִ°��� �ڷ��� Ÿ���� �˷��ֱ� ���� ���ͷ� ����
	static final long MOD = 1000000000L;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		length = Integer.parseInt(br.readLine());
		
		//2���� �迭���� �� �κ��� ������ �ڸ���+1(0�� �����Ƿ�), �ڿ��� �� �ڸ����� ���� 0-9������ ����
		long dp[][] = new long[length+1][10];
		
	
		//0��° �ڸ��� ������ 1���� ����, ù��° �ڸ����� ����� ���� �ϳ��̹Ƿ� 
		//1�� ��������
		for (int i = 1; i < 10; i++) {
			dp[1][i]=1;
			
		}
		
		//��ܼ��� ���� �� �ִ� ����� ���� ����
		for(int i=2;i<=length;i++) {
			for(int j=0;j<10;j++) {
				if(j==9) {
					dp[i][9]=dp[i-1][8]%MOD;
				}else if(j==0){
					dp[i][0]=dp[i-1][1]%MOD;
				}else {
					dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%MOD;
				}
			}
		}
		
		long result=0;
		for(int i=0;i<10;i++) {
			result +=dp[length][i];// ������ �ڸ����� �� ����� ���� ���ϸ� �� ��ܼ��� ��
		}
		
		System.out.println(result%MOD);
		

	}

}
