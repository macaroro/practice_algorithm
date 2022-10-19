package practice_Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int test_case = Integer.parseInt(st.nextToken());
		int hap = Integer.parseInt(st.nextToken());
		
		int[] list = new int[test_case];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i =0;i<test_case;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		int result=0;
		int temp=0;
		
		for(int i=0;i<test_case-2;i++) {//카드 3장의 합이므로 n-2
			if(list[i]>hap) continue;
			
			for(int j=i+1;j<test_case-1;j++) {
				if(list[i]+list[j]>hap) continue;
				

				for(int k=j+1;k<test_case;k++) {
					 temp=list[i]+list[j]+list[k];
					
					if(temp==hap) result=list[i]+list[j]+list[k];
					
					if(result<temp&&temp<hap) {
						result=temp;
					}
				}
			}
		}
		
		System.out.println(result);

	}

}
