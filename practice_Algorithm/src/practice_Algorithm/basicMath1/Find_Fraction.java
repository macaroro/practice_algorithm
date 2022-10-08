package practice_Algorithm.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_Fraction {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//문제: 대각선 별로 생각해야됨
		//대각선 칸의 분모와 분자를 더한 값(a)이 짝수이거나 그 대각선의 칸(a-1)의 개수가 홀수이면↗
		//대각선 칸의 분모와 분자를 더한 값(b)이 홀수이거나 그 대각선의 칸(b-1)의 개수가 짝수이면↙
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
 
		int cross_count = 1;//대각선의 칸의 개수
		int prev_count_sum = 0;//지나온 총 칸의 개수(입력한 숫자의 번째의 분수가 있는 대각선 제외)
 
		while (true) {
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (num <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 블럭의 개수 - (num 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					//-1은 분모의 수는 최대 분자와 분모의 합-1이므로 존재
					// 분모는 num 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_count - (num - prev_count_sum - 1)) + "/" + (num - prev_count_sum));
					break;
				} 
				
				else {	// 대각선의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((num - prev_count_sum) + "/" + (cross_count - (num - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}

	}

}
