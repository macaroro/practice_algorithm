package practice_Algorithm.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fourht_Dot {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[]  x= new int[3];
		int[]  y= new int[3];
		
		for(int i=0;i<3;i++) {
			st = new StringTokenizer(br.readLine()," ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i]= Integer.parseInt(st.nextToken());
		}
		
		int four_x=0;
		int four_y=0;
		
		if(x[0]==x[1]) {
			four_x=x[2];
		}else if(x[0]==x[2]){
			four_x=x[1];
		}else {
			four_x=x[0];
		}
		
		if(y[0]==y[1]) {
			four_y=y[2];
		}else if(y[0]==y[2]){
			four_y=y[1];
		}else {
			four_y=y[0];
		}
		System.out.println(four_x+" "+four_y);
		
		

	}

}
