package practice_Algorithm.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class Operator {

	public static int max = Integer.MIN_VALUE;	// �ִ� 
	public static int min = Integer.MAX_VALUE;	// �ּڰ� 
	public static int[] operator = new int[4];	// ������ ���� 
	public static int[] list;					// ���� 
	public static int  test_case;						// ������ ����
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		test_case = Integer.parseInt(br.readLine());
		list = new int[test_case];
 
		// ���� �Է� 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < test_case; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
 
		// ������ �Է� 
		//�ε����� 0�̸� ���� �̷��� ������..
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		
		dfs(list[0],1);
		System.out.println(max);
		System.out.println(min);

	}

	private static void dfs(int num, int index) {
		
		if(index==test_case) {//���ڸ� �� ������ �ּҰ� �ִ� ��
		   max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for(int i=0;i<operator.length;i++) {
			
		
			//�����ڰ� �ϳ� �̻��̶��
			if(operator[i]>0) {
				
				operator[i]--;// �����ڸ� �ϳ� ���ҽ�Ŵ
				
				switch (i) {//0�̸� +, 1�̸�-, 2�̸� *, 3�̸� /
			
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
