package practice_Algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int city = Integer.parseInt(br.readLine());
		 
		st = new StringTokenizer(br.readLine()," ");
		int[] distance =new int[city-1];
		
		
		for(int i=0;i<city-1;i++) {
			distance[i]= Integer.parseInt(st.nextToken());
			
		}
		
		
		st = new StringTokenizer(br.readLine()," ");
		int[] price =new int[city];
		for(int i=0;i<city;i++) {
			price[i]= Integer.parseInt(st.nextToken());
		}
		
	
		
		
		long sum = 0;
		long minPrice= price[0];	// 이전 까지의 과정 중 주유 최소 비용 
 
		for(int i = 0; i < city - 1; i++) {
			
			/*
			 *  현재 주유소가 이전 주유소의 기름값보다 쌀 경우
			 *  minCost를 갱신해준다. 
			 */
			if(price[i] < minPrice) {
				minPrice = price[i];
			}
			
			sum += (minPrice * distance[i]);
		}
		
		System.out.println(sum);

	}

}
