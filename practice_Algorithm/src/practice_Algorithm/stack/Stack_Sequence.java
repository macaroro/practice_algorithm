package practice_Algorithm.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
 
//1847
public class Stack_Sequence {
	public static void main(String[] args) throws IOException {
		
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
		
		
		
	/*	while(N -- > 0) {
			
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				// start + 1���� �Է¹��� value ���� push�� �Ѵ�.
				for(int i = start + 1; i <= value; i++) {
					stack.push(i);
					sb.append('+').append('\n');	// + �� �����Ѵ�. 
				}
				start = value; 	// ���� push �� ���� ���������� �����ϱ� ���� ���� �ʱ�ȭ 
			}
			
			// top�� �ִ� ���Ұ� �Է¹��� ���� ���� ���� ���  
			//peek:Stack�� �� ������ ��ü�� �������� �ʰ� ��ȯ�մϴ�
			else if(stack.peek() != value) {
				System.out.println("NO");
				return;		// �Ǵ� System.exit(0); ���� ��ü�ص� ��. 
			}
			
			stack.pop();
			sb.append('-').append('\n');
			
		}
		
		System.out.println(sb);*/
	}
}