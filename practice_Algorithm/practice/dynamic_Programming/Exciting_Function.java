package practice_Algorithm.dynamic_Programming;

import java.io.*;
import java.util.StringTokenizer;

public class Exciting_Function {
	
	//문제에서 주어진 w(a,b,c)의 재귀함수를 이용하고
	//이를 동적 계획법으로 수정(메모이제이션)
	
	/*
	 * 함수 w에서 a, b, c 중 20이 넘어가게 되면 w(20, 20, 20)을 호출하고,
	 * 0 이하일 경우는 1을 반환하기 때문에
	 * 각 배열의 크기가 21 (0~20)을 넘기지 않는다.
	 */
	static int[][][] list = new int[21][21][21];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a==-1&&b==-1&&c==-1) {
				break;
			
			}
			
			sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a ,b ,c)).append('\n');
		}
		
		System.out.println(sb);
		
		
	}
	
	static int w(int a, int b, int c) { 
		
		if(0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20&&list[a][b][c] != 0) {
			return list[a][b][c];
		}
		
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
			
		if(a > 20 || b > 20 || c > 20) {
			return list[20][20][20]=w(20, 20, 20);
		}
			
		if(a < b && b < c) {
			return list[a][b][c]=w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}
		
		return list[a][b][c]= w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
	}

}
