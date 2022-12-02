package practice_Algorithm.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Find_Num {

	// ���ĵ� �迭���� Ư�� ���� ã�� Ž�� �˰����̴�.
	//�߰��� �������� �����͸� Ž���ϱ� ������ �ݵ�� �����Ͱ� ���ĵ� ���·� �����ؾ� �Ѵ�.  
	
	static int[] list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int size = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		list = new int[size];
		for(int i=0;i<size;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}
		sort(list);
		
	   int test_Case = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<test_Case;i++) {
			// ã���� �ϴ� ���� ���� ��� 1, ���� ��� 0�� ����ؾ��Ѵ�.
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		
		System.out.println(sb);
		


	}
	
	public static int binarySearch(int key) {
		 
		int low = 0;					// Ž�� ������ ���� �� �ε���
		int high = list.length - 1;	// Ž�� ������ ������ �� �ε���
 
		// lo�� hi���� Ŀ���� ������ �ݺ��Ѵ�.
		while(low <= high) {
 
			int mid = (low + high) / 2;	// �߰���ġ�� ���Ѵ�.
 
			// key���� �߰� ��ġ�� ������ ���� ���
			if(key < list[mid]) {
				high = mid - 1;
			}
			// key���� �߰� ��ġ�� ������ Ŭ ���
			else if(key > list[mid]) {
				low = mid + 1;
			}
			// key���� �߰� ��ġ�� ���� ���� ���
			else {
				return mid;
			}
		}
 
		// ã���� �ϴ� ���� �������� ���� ���
		return -1;
 
	}
	private static void sort(int[] list) {//������������ ����(���� ����)
		for(int i=0;i<list.length;i++) {
			int temp = 0;
			for(int j=i+1;j<list.length;j++) {
				if(list[i]>list[j]) {
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
		
	}

}
