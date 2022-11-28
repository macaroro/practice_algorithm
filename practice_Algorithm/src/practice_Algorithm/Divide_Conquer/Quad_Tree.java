package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//공간을 재귀적인 호출로(Recursive ) 4개의 자식 노드로 분할하는 방법 
public class Quad_Tree {
	
	public static int[][] list;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		list = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < size; j++) {
				list[i][j] = str.charAt(j) - '0';
			}
		}
		QuadTree(0, 0, size);
		System.out.println(sb);
	}

	private static void QuadTree(int a, int b, int size) {
	
		if(checkNum(a,b,size)) {//만약 사각형의 숫자가 모두 같다면 숫자 추가
			sb.append(list[a][b]);
			return;
		}
		
		
		 int newSize = size/2;
		 
		 sb.append('(');
		 QuadTree(a, b, newSize);//2사분면(왼쪽 위)
		 QuadTree(a, b+newSize, newSize);//1사분면(오른쪽 위)
		 QuadTree(a+newSize, b, newSize);//3사분면(왼쪽 아래)
		 QuadTree(a+newSize, b+newSize, newSize);//4사분면(오른쪽 아래)
		 
		 sb.append(')');
	}

	private static boolean checkNum(int a, int b, int size) {
		int value = list[a][b];//첫번째 숫자 기준
		
	
		for(int i=a; i<a+size;i++) {
			for(int j=b; j<b+size;j++) {
				if(value != list[i][j]) {
					return false;
				}
			}
		}
			
		
		return true;
	}

}
