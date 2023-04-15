package practice_Algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Representative_Value2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] list = new int[5];
		
		for(int i=0;i<list.length;i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(list);
		
		int sum = 0;
		
		for(int num:list) {
			sum+=num;
		}
		
		int avg = sum/5;
		
		System.out.println(avg);
		System.out.println(list[2]);
	}

}
