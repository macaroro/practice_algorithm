package practice_Algorithm.four.rithmetic.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AVG {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	int count = Integer.parseInt(br.readLine());
	int[] list = new int[count];
	long max=0;
	long sum=0;
	
	st = new StringTokenizer(br.readLine()," ");
	for(int i=0;i<count;i++) {
		list[i] = Integer.parseInt(st.nextToken());
	}
	
	for(int i=0;i<list.length;i++) {
		if(max<list[i]) {
			max = list[i];
		};
		
		sum += list[i];
	}
	
	System.out.println(sum*100.0/max/count);
	}

}
