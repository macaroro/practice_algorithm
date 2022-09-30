package practice_Algorithm.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Avg {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int subject = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		
		for (int i = 0; i <subject; i++) {
			int score = Integer.parseInt(st.nextToken());
			list.add(score);		
		}
		float max = Collections.max(list);
		
		float fabricateScore=0;
		for (int i = 0; i <list.size(); i++) {
			fabricateScore += (list.get(i)/max*100);	
		}
		
		
		
	System.out.print( fabricateScore/subject);

	}

}
