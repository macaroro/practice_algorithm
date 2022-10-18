package practice_Algorithm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSort1 {

	
	static int[] list, tmp;
	static int count = 0;//배열을 비교한 횟수
	static int result = -1;
	static int num;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());//배열의 사이즈
		num = Integer.parseInt(st.nextToken());//배열이 num번째 저장되는 수
		
		st = new StringTokenizer(br.readLine());
		
		list = new int[test_case];//배열을 만들어줌
		for(int i = 0; i < test_case; i++) {
			list[i] = Integer.parseInt(st.nextToken());//배열에 넣을 숫자들을 정의
		}
		tmp = new int[test_case];//임시 배열을 사이즈 같이 만든다
		merge_sort(list, 0, test_case - 1);//배열을 둘로 나눠서 비교하는것이 합병정렬
										   //리스트의 중간값을 찾아야 함
		System.out.println(result);
		
	}
	
	public static void merge_sort(int[] list, int p, int r) {
		//int p는 배열이 시작되는 0, int r은  배열의 끝
		if (count > num) return ;
		if (p < r) {
			int q = (p + r) / 2;
			merge_sort(list, p, q);//배열의 시작인 0부터 중간까지
			merge_sort(list, q + 1, r);//배열의 중간부터 끝가지
			merge(list, p, q, r);//병합
		}
	}
	
	public static void merge(int[] list, int p, int q, int r) {
		int i = p;//시작점
		int j = q + 1;//중간점 +1
		int t = 0;
		
		while (i <= q && j <= r) {//배열의 숫자 크기 비교
			if(list[i] <= list[j]) {
				tmp[t] = list[i];
				i++;
			}else {
				tmp[t] = list[j];
				j++;
			}
			t++;
		}
		
		while (i <= q) // 왼쪽 배열 부분이 남은 경우
			tmp[t++] = list[i++];

		while (j <= r) // 오른쪽 배열 부분이 남은 경우
			tmp[t++] = list[j++];

		i = p;
		t = 0;
		while (i <= r) { // 결과를 list에 저장
			count++;
			if (count == num) {
				result = tmp[t];
				break;
			} 
			list[i++] = tmp[t++];
		}
	}

}
