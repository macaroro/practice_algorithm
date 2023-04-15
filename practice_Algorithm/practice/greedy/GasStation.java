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
		long minPrice= price[0];	// ���� ������ ���� �� ���� �ּ� ��� 
 
		for(int i = 0; i < city - 1; i++) {
			
			/*
			 *  ���� �����Ұ� ���� �������� �⸧������ �� ���
			 *  minCost�� �������ش�. 
			 */
			if(price[i] < minPrice) {
				minPrice = price[i];
			}
			
			sum += (minPrice * distance[i]);
		}
		
		System.out.println(sum);

	}

}
