package practice_Algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Sortinside {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int num = Integer.parseInt(br.readLine());
		int length = (int)(Math.log10(num)+1);
		
		int div = num;
		Integer[] list = new Integer[length];
		
		for(int i=0;i<length;i++) {
			list[i]=(int) (div/Math.pow(10, ((length-1))-i));
			
			div%=Math.pow(10, ((length-1)-i));
	
		}
		
		Arrays.sort(list,Collections.reverseOrder());
		
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]);
		}
		
				
		
	}

}
