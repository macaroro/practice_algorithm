package practice_Algorithm.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Over_Than_AVG {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st; 	
		int test_Case = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i <test_Case; i++) {
			st = new StringTokenizer(br.readLine()," ");	
			int student = Integer.parseInt(st.nextToken());
			
			double sum=0;
			
			for(int j = 0; j<student;j++) {
			int score = Integer.parseInt(st.nextToken());
			list.add(score);
			sum +=score;
			
			}	
			double avg = (sum/student);
			double overAvg = 0;
			
			for(int j = 0 ; j < student ; j++) {
				if(list.get(j) > avg) {
					overAvg++;
				}
			}
			
			System.out.printf("%.3f%%\n",(overAvg/student)*100);
		}
	
		
	}

}



