package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ordinary_Bag {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		//테스트 케이스
		int n = Integer.parseInt(st.nextToken());
		//최대로 가져 갈 수 있는 무게
		int kg = Integer.parseInt(st.nextToken());
		
		
		int[] weight = new int[n + 1]; // 무게
		int[] value = new int[n + 1]; // 가치
		
		int[] lcs = new int[kg + 1];//무게의 합을 기록하기 위한 배열
		
		//각 물품의 무게와 가치를 배열에 저장
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			weight[i]=Integer.parseInt(st.nextToken());
			value[i]=Integer.parseInt(st.nextToken());
		}
		
		
		//0은 아무 무게도 없으 1부터 시작
		for (int i = 1; i <= n; i++) {
			
			// K부터 탐색하여 담을 수 있는 무게 한계치가 넘지 않을 때까지 반복 
			for (int j = kg; j - weight[i] >= 0; j--) {
				lcs[j] = Math.max(lcs[j], lcs[j - weight[i]] + value[i]);
			}
		}
		System.out.println(lcs[kg]);
	
	}

}
