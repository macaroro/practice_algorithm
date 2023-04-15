package practice_Algorithm.queue_Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;



public class Find_Min {

	//11003
	//����  ���� ������ ���԰� ������ ��� ������ �ڷ� ������ �� ����
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb  = new StringBuilder();
		
		int num = Integer.parseInt(st.nextToken());//���ڵ��� ����
		int sliceSize = Integer.parseInt(st.nextToken());//�����̽� ũ��
		
		Deque<Node> de = new LinkedList<>();//�� ����
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i =0;i<num;i++) {
			int now = Integer.parseInt(st.nextToken());//�� ���ڵ��� ��
			
			//���� ���� ��� ���� �ʰ� ���� ������ ���� ���� ���°� ���� ũ�ٸ� 
			//���� �������� �ִ°��� ����
			while(!de.isEmpty()&&de.getLast().value>now) {
				de.removeLast();
			}
			
			de.addLast(new Node(now,i));//���� ���� �ε��� ����
			
			if(de.getFirst().index<=i-sliceSize) {
				de.removeFirst();
			}//���� ���� �ε����� �������� �ִ� �ε����� ũ�Ⱑ 3�ʰ���� 
			//�տ����� ����
			sb.append(de.getFirst().value).append(" ");
			//���� �տ� �ִ� ���� �ּڰ� �̹Ƿ� �� ���� ���� ����
		}
		
		System.out.println(sb);
		

	}
	
	static class Node{//deque�� ����� ���� ����
		public int value;
		public int index;
		
		Node(int value, int index){
			this.index = index;
			this.value = value;
		}
		
	}

}
