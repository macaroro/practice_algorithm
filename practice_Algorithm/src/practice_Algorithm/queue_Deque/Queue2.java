package practice_Algorithm.queue_Deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
//queue�� ���� ���°��� ���� ����
public class Queue2 {
 
	static int[] queue = new int[2000000];	// ����� ���� 2,000,000�� �ȳ��� 
	
	static int size = 0;	
	static int front = 0;
	static int back = 0;
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st;
		int test_Case = Integer.parseInt(br.readLine());
		
 
		while(test_Case-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()){
			case "push": push(Integer.parseInt(st.nextToken())); break;
			case "pop" : pop(); break;
			case "size" : size(); break;
			case "empty" : empty(); break;
			case "front" : front(); break;
			case "back" : back(); break;
			
			}
		}
		System.out.println(sb);
	}
	
	static void push(int n) {
		queue[back] = n;//back�� �� �������� ���� ���� ��Ÿ��
		back++;
		size++;
	}
	
	static void pop() {
		if(size == 0) {
			sb.append(-1).append('\n');
		}
		else {
			sb.append(queue[front]).append('\n');	// �� ���� ���Ҹ� ��� 
			size--;
			front++;	// front�� ����Ű�� ��ġ 1 ���� (�պκ��� ������ ���� ������ �� ����)
		}
	}
	
	static void size() {
		sb.append(size).append('\n');
	}
	
	static void empty() {
		if(size == 0) {
			sb.append(1).append('\n');
		}
		else sb.append(0).append('\n');
	}
	
	static void front() {
		if(size == 0) { 
			sb.append(-1).append('\n');
		}
		else {
			sb.append(queue[front]).append('\n');	 // �� ���� ���� ��� 
		}
	}
	
	static void back() {
		if(size == 0) {
			sb.append(-1).append('\n');
		}
		else {
			sb.append(queue[back - 1]).append('\n');	// �� ���� ���� ��� 
		}
	}
 
}
