package practice_Algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AgeSorting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int test_case = Integer.parseInt(br.readLine());
		
		String[][] list = new String[test_case][2];
		for(int i = 0;i<test_case;i++) {
			st = new StringTokenizer(br.readLine()," ");
		    list[i][0] = st.nextToken();//나이
		    list[i][1] = st.nextToken();//이름
			
		}
		
		Arrays.sort(list, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
	
		for(int i = 0 ; i< test_case ; i++) {
			System.out.println(list[i][0] + " " + list[i][1]);
		}

	}

}
