package practice_Algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num_Sorting2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	
	List<Integer> list = new ArrayList<>();
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test_case;i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num);
		}
	
		Collections.sort(list);
		for(int i =0; i<list.size();i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
		
	}

}
