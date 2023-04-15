package practice_Algorithm.twoPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Jumong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int ingredient =  Integer.parseInt(br.readLine());//°©¿Ê Àç·áÀÇ ¼ö
		int num =  Integer.parseInt(br.readLine());//°©¿ÊÀÌ ¸¸µé¾îÁö´Â ¼ö
		int[] list = new int[ingredient];
		int count=0;
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<ingredient;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list);
		
		for(int i=0; i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]+list[j]==num) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		

	}

}
