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

	// 병합 정렬을 배열의 요소들을 하나로 분리해서 하나씩 다시 합쳐서 큰 수는 뒤로 보내는 정렬

	private static void mergesort(int[] list, int start, int end) {// 배열들을 분리

		if (start < end) {
			int mid = (start + end) / 2;

			mergesort(list, start, mid);
			mergesort(list, mid + 1, end);

			merge(list, start, mid, end);

		}

	}

	// 분리한 배열을 합칩
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

		/* 앞(왼쪽)부분 배열에 원소가 남아있는 경우 */
		while (i <= mid) {
			temp[temp_index++] = list[i++];
		}

		/* 뒤(오른쪽)부분 배열에 원소가 남아있는 경우 */
		while (j <= end) {
			temp[temp_index++] = list[j++];
		}

		for (int index = start; index < temp_index; index++) {
			list[index] = temp[index];
		}
	}

}
