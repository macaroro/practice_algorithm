package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//������ ������� ȣ���(Recursive ) 4���� �ڽ� ���� �����ϴ� ��� 
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
	
		if(checkNum(a,b,size)) {//���� �簢���� ���ڰ� ��� ���ٸ� ���� �߰�
			sb.append(list[a][b]);
			return;
		}
		
		
		 int newSize = size/2;
		 
		 sb.append('(');
		 QuadTree(a, b, newSize);//2��и�(���� ��)
		 QuadTree(a, b+newSize, newSize);//1��и�(������ ��)
		 QuadTree(a+newSize, b, newSize);//3��и�(���� �Ʒ�)
		 QuadTree(a+newSize, b+newSize, newSize);//4��и�(������ �Ʒ�)
		 
		 sb.append(')');
	}

	private static boolean checkNum(int a, int b, int size) {
		int value = list[a][b];//ù��° ���� ����
		
	
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
