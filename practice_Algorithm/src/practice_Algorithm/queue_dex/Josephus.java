package practice_Algorithm.queue_dex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
	
		int num = Integer.parseInt(st.nextToken());
		int jump = Integer.parseInt(st.nextToken());
		
		int k=jump;
		
		//offer=>�߰�, poll=>ù��° ���� ��ȯ�ϰ� ���� ������ null,remove=ù��° �� ����
		//peek=>ù��° �� ����
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= num; i++) {
			queue.add(i);
		}
		
		while(queue.size()>1) {
		
			for(int i=0;i<jump-1;i++) {
				queue.offer(queue.poll());
			}
			
			sb.append(queue.poll()).append(", ");
		}
		sb.append(queue.poll());
		System.out.println("<"+sb+">");
		
	

	}

}
