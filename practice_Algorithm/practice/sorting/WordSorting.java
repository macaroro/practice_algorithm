package practice_Algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class WordSorting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		
		String[] list = new String[test_case];
		
		for(int i=0;i<test_case;i++) {
			list[i]=br.readLine();
		}
		
		Arrays.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} 
				// 그 외의 경우 
				else {
					return o1.length() - o2.length();
				}
			}

		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(list[0]).append('\n');
		
		for(int i=0;i<test_case;i++) {
			if (!list[i].equals(list[i - 1])) {
				sb.append(list[i]).append('\n');
			}
		}
		System.out.println(sb);
	}

}
