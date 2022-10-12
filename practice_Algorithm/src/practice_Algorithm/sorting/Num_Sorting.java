package practice_Algorithm.sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Num_Sorting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		int[] list = new int[test_case];
		
		for(int i=0; i<test_case;i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(list);
		
		for(int i =0; i<list.length;i++) {
			
			System.out.println(list[i]);
		}
		

	}

}
