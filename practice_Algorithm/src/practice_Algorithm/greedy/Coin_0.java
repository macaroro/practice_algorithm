package practice_Algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin_0 {

	//그리디 알고리즘:선택의 순간마다 당장 눈앞에 보이는 최적의 상황만을 쫓아 최종적인 해답에 도달하는 방법이다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int coin = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		
		int[] list = new int[coin];
		for(int i=0;i<coin;i++) {
			list[i]= Integer.parseInt(br.readLine());
		}


		int count=0;
		//배열은 0부터 시작하니 i는 coin-1
		for(int i=coin-1;i>=0;i--) {
			if(list[i]<=price) {//지정된 가격보단 아래의 코인을 봐야함
				count +=(price/list[i]);//코인의 가격은 오름차순으로 되므로 맨 뒤에가 가장 가격이 큼
				                        //뒤에서 부터 오니 처음에 걸린 수가 가장 큼
				                        //가장 큰 가격으로 나눈 몫을 횟수에 넣고 그 나머지를 다시 price로
				price=price%list[i];
			}
		}
		

		System.out.println(count);
		
	}

}
