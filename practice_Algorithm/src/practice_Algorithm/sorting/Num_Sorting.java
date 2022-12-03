package practice_Algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num_Sorting {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_case = Integer.parseInt(br.readLine());
		int[] list = new int[test_case];

		for (int i = 0; i < test_case; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}

		mergesort(list, 0, list.length - 1);

		
	
		for(int num:list) {
			System.out.println(num);
		}
	}

	// ���� ������ �迭�� ��ҵ��� �ϳ��� �и��ؼ� �ϳ��� �ٽ� ���ļ� ū ���� �ڷ� ������ ����

	private static void mergesort(int[] list, int start, int end) {// �迭���� �и�

		if (start < end) {
			int mid = (start + end) / 2;

			mergesort(list, start, mid);
			mergesort(list, mid + 1, end);

			merge(list, start, mid, end);

		}

	}

	// �и��� �迭�� ��Ĩ
	private static void merge(int[] list, int start, int mid, int end) {

		int i = start;
		int j = mid + 1;
		int temp_index = start;

		int[] temp = new int[list.length];

		while (i <= mid && j <= end) {
			if (list[i] < list[j]) {
				temp[temp_index++] = list[i++];
			} else {
				temp[temp_index++] = list[j++];
			}
		}

		/* ��(����)�κ� �迭�� ���Ұ� �����ִ� ��� */
		while (i <= mid) {
			temp[temp_index++] = list[i++];
		}

		/* ��(������)�κ� �迭�� ���Ұ� �����ִ� ��� */
		while (j <= end) {
			temp[temp_index++] = list[j++];
		}

		for (int index = start; index < temp_index; index++) {
			list[index] = temp[index];
		}
	}

}
