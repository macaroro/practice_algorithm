package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st; 
		
		int test_Case = Integer.parseInt(br.readLine());
		int[][] list= new int[test_Case][3];
		
		 
		 
		 for(int i=0;i<test_Case;i++) {
			 st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<3;j++) {
				list[i][j]=Integer.parseInt(st.nextToken());
				
			}
		 }
		 
			for (int i = 1; i < test_Case; i++) {
				list[i][0] += Math.min(list[i - 1][1], list[i - 1][2]);
				list[i][1] += Math.min(list[i - 1][0], list[i - 1][2]);
				list[i][2] += Math.min(list[i - 1][0], list[i - 1][1]);
			}
	 
			System.out.println(Math.min(Math.min(list[test_Case - 1][0], list[test_Case - 1][1]), list[test_Case - 1][2]));
		}
		 

	}


