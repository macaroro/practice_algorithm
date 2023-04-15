package practice_Algorithm.tow_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Add {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[x][y];
		int[][] b = new int[x][y];
		
		for(int i=0;i<a.length;i++) {
			st = new StringTokenizer(br.readLine()," ");
			a[i][0]=Integer.parseInt(st.nextToken());
			a[i][1]=Integer.parseInt(st.nextToken());
			a[i][2]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<b.length;i++) {
			st = new StringTokenizer(br.readLine()," ");
			b[i][0]=Integer.parseInt(st.nextToken());
			b[i][1]=Integer.parseInt(st.nextToken());
			b[i][2]=Integer.parseInt(st.nextToken());
		}
		
	
	  
	    for(int i =0 ; i < x; i++) {
	    	for(int j = 0; j < y; j++) {
	    		sb.append((a[i][j] + b[i][j]) + " ");
	    	}
	    	sb.append("\n");
	    }
	    
	    System.out.println(sb.toString());
		 
		
		
		
		
	}

}
