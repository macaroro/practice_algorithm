package practice_Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		//0부터 분해합을 해 입력된 값이 나오면 반복문 종료
		
		int result=0;
		for(int i=0;i<num;i++) {
			int sum=0;
			int n=i;
			
			while(n !=0) {//즉 나머지가 0일 경우이다
				sum+=n%10;//각 자리의 합을 더해 sum에 넣고
				n/=10;//숫자 n을 10로 나눈 몫을 다시 while문으로 돌린다.
			}
			
			if(i+sum==num) {
				result=i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
