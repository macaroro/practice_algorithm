package practice_Algorithm.twoPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_Add5 {

	//2018
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num =  Integer.parseInt(br.readLine());
		
		int start=1;
		int end=1;
		int count=1;//end가 15일때도 포함되니 미리 설정
		int sum=1;
		
		while(end !=num) {
			
			if(sum==num) {//숫자를 더한 수가 num이랑 같다면 count 증가하고 end 포인트 증가
				count++;
				end++;
				sum=sum+end;//sum 값 변겅
			}else if(sum>num) {//sum이 num 보다 크다면 
				sum = sum-start;//시작점을 바꿔야하니 sum에서 기존에 start를 빼고 end는 나둠
				start++;//그리고 다음 start로 넘어감
			}else {
				end++;
				sum = sum+end;//sum이 num 보다 작다면 계속 end를 더해주고 하나씩 늘림
				
			}
			
			
			
		}
		
		System.out.println(count);
		
	}

}
