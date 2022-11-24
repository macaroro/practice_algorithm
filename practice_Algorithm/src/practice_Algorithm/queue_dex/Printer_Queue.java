package practice_Algorithm.queue_dex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Printer_Queue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st; 
		
		int test_case = Integer.parseInt(br.readLine());	
		
		while(test_case-->0) {
			st = new StringTokenizer(br.readLine()," ");
			int num = Integer.parseInt(st.nextToken());//������ ����
			int point = Integer.parseInt(st.nextToken());//0���� �����ؼ� �Է��� �ε����� �߿䵵�� ���°�� ó���Ǵ°�
			
			LinkedList<int[]> queue = new LinkedList<>();	// Queue�� Ȱ�� �� ���Ḯ��Ʈ
			st = new StringTokenizer(br.readLine());
 
			for (int i = 0; i < num; i++) {
				// {�ʱ� ��ġ, �߿䵵}
				queue.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
			}
 
			int count = 0;	// ��� Ƚ��
			
			while (!queue.isEmpty()) {	// �� ���̽��� ���� �ݺ���, ť�� ��������
				
				int[] front = queue.poll();	// ���� ù ����
				boolean isMax = true;	// front ���Ұ� ���� ū ���������� �Ǵ��ϴ� ����
				
				// ť�� �����ִ� ���ҵ�� �߿䵵�� �� 
				for(int i = 0; i < queue.size(); i++) {
					
					// ó�� ���� ���Һ��� ť�� �ִ� i��° ���Ұ� �߿䵵�� Ŭ ��� 
					if(front[1] < queue.get(i)[1]) {
						
						// ���� ���� �� i ������ ���ҵ��� �ڷ� ������.
						queue.offer(front);
						for(int j = 0; j < i; j++) {
							queue.offer(queue.poll());
						}
						
						// front���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� false�� �ϰ� Ž���� ��ħ
						isMax = false;
						break;
					}
				}
				
				// front ���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� ���� �ݺ������� �Ѿ
				if(isMax == false) {
					continue;
				}
				
				// front ���Ұ� ���� ū ���ҿ����Ƿ� �ش� ���Ҵ� ����ؾ��ϴ� ������.
				count++;
				if(front[0] == point) {	// ã���� �ϴ� ������� �ش� �׽�Ʈ���̽� ����
					break;
				}
 
			}
 
			sb.append(count).append('\n');
 
		}
		System.out.println(sb);
	}

}
