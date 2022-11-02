package practice_Algorithm.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class Operator {

	public static int max = Integer.MIN_VALUE;	// 최댓값 
	public static int min = Integer.MAX_VALUE;	// 최솟값 
	public static int[] operator = new int[4];	// 연산자 개수 
	public static int[] list;					// 숫자 
	public static int  test_case;						// 숫자의 개수
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		test_case = Integer.parseInt(br.readLine());
		list = new int[test_case];
 
		// 숫자 입력 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < test_case; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
 
		// 연산자 입력 
		//인덱스가 0이면 덧셈 이렇게 나오게..
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		
		dfs(list[0],1);
		System.out.println(max);
		System.out.println(min);

	}

	private static void dfs(int num, int index) {
		
		if(index==test_case) {//숫자를 다 썻으면 최소값 최댓값 비교
		   max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for(int i=0;i<operator.length;i++) {
			
		
			//연산자가 하나 이상이라면
			if(operator[i]>0) {
				
				operator[i]--;// 연산자를 하나 감소시킴
				
				switch (i) {//0이면 +, 1이면-, 2이면 *, 3이면 /
			
				case 0: dfs(num+list[index],index+1);	  break;
				case 1: dfs(num-list[index],index+1);  	 break;
				case 2: dfs(num*list[index],index+1);  	 break;
				case 3: dfs(num/list[index],index+1);  	break;
				}
		
				operator[i]++;
				
			}
			
		}
		
	}

}
