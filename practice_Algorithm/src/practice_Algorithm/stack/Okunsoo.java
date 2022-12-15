package practice_Algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//17298
public class Okunsoo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		int[] list = new int[num];//���ڵ��� ���� �迭
		int[] an = new int[num];//������ ���� �迭
		Stack<Integer> stack = new Stack<>();//�ε����� ����
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<num;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		stack.push(0);//������ ��������Ƿ� �ϴ� 0�� �־���(�迭 �ε��� 0)		
		for(int i=1;i<num;i++) {
			while(!stack.isEmpty()&&list[stack.peek()]<list[i]) {//������ ��� ���� �ʰ� ���ڸ� ���� �迭���� ���ÿ� ���� ���� �ִ� ���ڿ� �� ���� �ε����� ���� ���Ͽ� 
				                                                 //�۴ٸ� ������ �ִ� �迭�� list[i]���� �־���
				an[stack.pop()]=list[i];
			}
			stack.push(i);//while���� ������ i�� �־���
		}
		
		while(!stack.empty()) {//���� for���� ������ ���� ���ÿ� ���� �����ִٸ� �� ����
			                   //�� �� ���� �ε����� ���� �迭�� -1�� ����
			an[stack.pop()]=-1;
		}
		
		for(int n: an) {//����迭�� ���
			sb.append(n).append(" ");
		}
		System.out.println(sb);
		

	}

}
