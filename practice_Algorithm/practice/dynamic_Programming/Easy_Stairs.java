package practice_Algorithm.dynamic_Programming;

import java.io.*;

//계단수

public class Easy_Stairs {
	
	static int length;
	//뒤에L이 있는것은 자료형 타입을 알려주기 위한 리터럴 문자
	static final long MOD = 1000000000L;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		length = Integer.parseInt(br.readLine());
		
		//2차원 배열에서 앞 부분은 숫자의 자릿수+1(0이 있으므로), 뒤에는 그 자릿수에 오는 0-9까지의 숫자
		long dp[][] = new long[length+1][10];
		
	
		//0번째 자리는 없으니 1부터 시작, 첫번째 자릿수는 경우의 수가 하나이므로 
		//1로 설정해줌
		for (int i = 1; i < 10; i++) {
			dp[1][i]=1;
			
		}
		
		//계단수가 나올 수 있는 경우의 수를 저장
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
			result +=dp[length][i];// 마지막 자리수의 총 경우의 수를 더하면 총 계단수의 합
		}
		
		System.out.println(result%MOD);
		

	}

}
