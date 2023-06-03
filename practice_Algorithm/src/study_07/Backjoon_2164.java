package study_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//ī�����(queue  �̿�)
public class Backjoon_2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N  = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		//queue�� �ϳ��� �ֱ�
		for(int i=1; i<=N;i++) 
		{
			que.add(i);
		}
		
		//remove:�� ���� ���� ���ְ� �� ���� ��ȯ
		while(que.size()>1) 
		{
			que.remove();
			que.add(que.remove());
			
		}

		System.out.println(que.remove());
	}

}
