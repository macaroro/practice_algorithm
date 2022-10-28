package practice_Algorithm.number_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FashionKing {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int test_case = Integer.parseInt(br.readLine());	// �׽�Ʈ ���̽� 
 
		while (test_case-- > 0) {
			
			HashMap<String, Integer> hm = new HashMap<>();	// <����, ����>
			
			int wear = Integer.parseInt(br.readLine());	// �Է¹޴� ���� ����
			
			while (wear-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
				st.nextToken();	// �� �̸��� �ʿ� ���� 
				
				String kind = st.nextToken();	// �� ���� 
 
				/**
				 * �ش� ������ ���� �ؽøʿ� �������
				 * �ؽøʿ� ����Ǿ��ִ� �ش� ������ ������ +1 ������Ų��.
				 *
				 * �ش� ������ ���� �ؽøʿ� ���� ���
				 * �ش� ������ ���� 1�� �ִ´�.
				 */
				
				if (hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind) + 1);
				} 
				else {
					hm.put(kind, 1);
				}
			}
 
			int result = 1;
 
			/**
			 * �� �Դ� ��츦 ����Ͽ� �� ������ ���� ������ +1 ���� ����
			 * �����־�� �Ѵ�.
			 */
			for (int val : hm.values()) {
				result *= (val + 1);
			}
			// �˸��� ���¸� �������־�� �ϹǷ� �������� -1�� ����.
			sb.append(result - 1).append('\n');
 
		}
		System.out.println(sb);
	}
		

	}


