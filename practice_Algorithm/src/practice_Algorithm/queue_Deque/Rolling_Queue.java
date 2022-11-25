package practice_Algorithm.queue_Deque;

import java.io.*;
import java.util.*;

public class Rolling_Queue {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		LinkedList<Integer> deque = new LinkedList<Integer>();

		int count = 0; // 2, 3�� ���� Ƚ�� ���� �� ����

		st = new StringTokenizer(br.readLine(), " ");
		int size = Integer.parseInt(st.nextToken()); // ť�� ũ��(1 ~ N)
		int num = Integer.parseInt(st.nextToken()); // �������� ������ ����

		// ���� �����(1����)
		for (int i = 1; i <= size; i++) {
			deque.offer(i);
		}

		int[] seq = new int[num]; // �̰��� �ϴ� ���� ���� �迭

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<num;i++) {
			int target = deque.indexOf(seq[i]);//�̰� ���� ���� ��ġ ã��
			int half;//���� ���ϴ� ���ڰ� ������� ȸ���ϸ� ����� ����(������ ���� ȸ��)
			
			if(deque.size()%2==0) {
				half = deque.size()/2-1;//���� ����� ¦���� �� �ε����� �򺸴� �ϳ� ���� ��ġ
			}else {
				half = deque.size()/2;
			}
			
			if(target<=half) {//���� target�� �߰����� �տ� ������ 2�� ����(ù��° ���� �ǵڷ�)
				for(int j=0;j<target;j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			}else {//�߰����� �ڶ�� 3��° ���� (�ǵڸ� �� ������)
				for(int j=0;j<deque.size()-target;j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					count++;
				}
			}
			
			deque.pollFirst();	// ������ ������ �� �� ���Ҹ� ����
		}
		
		
		System.out.println(count);

	}

}
