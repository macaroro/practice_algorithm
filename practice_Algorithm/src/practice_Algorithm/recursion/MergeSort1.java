package practice_Algorithm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSort1 {

	
	static int[] list, tmp;
	static int count = 0;//�迭�� ���� Ƚ��
	static int result = -1;
	static int num;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());//�迭�� ������
		num = Integer.parseInt(st.nextToken());//�迭�� num��° ����Ǵ� ��
		
		st = new StringTokenizer(br.readLine());
		
		list = new int[test_case];//�迭�� �������
		for(int i = 0; i < test_case; i++) {
			list[i] = Integer.parseInt(st.nextToken());//�迭�� ���� ���ڵ��� ����
		}
		tmp = new int[test_case];//�ӽ� �迭�� ������ ���� �����
		merge_sort(list, 0, test_case - 1);//�迭�� �ѷ� ������ ���ϴ°��� �պ�����
										   //����Ʈ�� �߰����� ã�ƾ� ��
		System.out.println(result);
		
	}
	
	public static void merge_sort(int[] list, int p, int r) {
		//int p�� �迭�� ���۵Ǵ� 0, int r��  �迭�� ��
		if (count > num) return ;
		if (p < r) {
			int q = (p + r) / 2;
			merge_sort(list, p, q);//�迭�� ������ 0���� �߰�����
			merge_sort(list, q + 1, r);//�迭�� �߰����� ������
			merge(list, p, q, r);//����
		}
	}
	
	public static void merge(int[] list, int p, int q, int r) {
		int i = p;//������
		int j = q + 1;//�߰��� +1
		int t = 0;
		
		while (i <= q && j <= r) {//�迭�� ���� ũ�� ��
			if(list[i] <= list[j]) {
				tmp[t] = list[i];
				i++;
			}else {
				tmp[t] = list[j];
				j++;
			}
			t++;
		}
		
		while (i <= q) // ���� �迭 �κ��� ���� ���
			tmp[t++] = list[i++];

		while (j <= r) // ������ �迭 �κ��� ���� ���
			tmp[t++] = list[j++];

		i = p;
		t = 0;
		while (i <= r) { // ����� list�� ����
			count++;
			if (count == num) {
				result = tmp[t];
				break;
			} 
			list[i++] = tmp[t++];
		}
	}

}
