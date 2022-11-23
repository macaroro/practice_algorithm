package practice_Algorithm.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
 
public class Stack_Sequence {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	// ����� ����� ����
		
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		int start = 0;
		
		// N �� �ݺ�
		
		
		while(N -- > 0) {
			
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
		
		System.out.println(sb);
	}
}