package study_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon_1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	// ����� ����� ����
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];//�Էµ� ���� ����
		boolean b = true;
		int start = 1;
		
		for(int i=0;i<n;i++) {
			list[i] = Integer.parseInt(br.readLine());//list�� ����
		}
		
		for(int i=0;i<list.length;i++) {
			int num = list[i];//�迭�� ���� ���� ��
			if(num>=start) {//���� list�� ���� ���� 1���� �����ϴ� start�� ���Ͽ� 
				            //num�� start���� ũ�ų� ���Ƹ�
				while(num>=start) {//�迭�� �ִ� ����ŭ start�� ++���� ���ÿ� ����
					stack.push(start++);
					sb.append("+").append("\n");
				}
				stack.pop();//�׸��� num�� ���ü� �ֵ��� pop��
				sb.append("-").append("\n");
				
			}else {//���� num�� start���� ���ٸ�
				int end = stack.pop();//�� ���� �����ϰ� end�� ����
				if(end<num) {//������ ���� ��� ���� ���� ������ �� ���� ���ٸ�  no ���(���Դ� ���� ���� ���� �����Ƿ�)
					System.out.println("NO");
					b = false;
					break;
				}else {
					sb.append("-").append("\n");
				}
				
				
			}
		}
		
		if(b) {
			System.out.println(sb);
		}
		
		

	
	}

}
