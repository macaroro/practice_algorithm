package practice_Algorithm.queue_dex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Card2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
	
		
		int front=1;
		int back=num;
		int[] queue = new int[num*2];
		for(int i=1;i<=num;i++) {
			queue[i]=i;
		}
		
		
		while(num-- >1) {
			front++;//바로 포인트를 두번째로 옮겨 뒤로 보낸다
			queue[back+1]=queue[front];
			back++;
			front++;
		}
		
		System.out.println(queue[front]);
		
		

	}

}
