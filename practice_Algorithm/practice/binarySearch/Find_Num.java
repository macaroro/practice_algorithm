package practice_Algorithm.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Find_Num {

	// 정렬된 배열에서 특정 값을 찾는 탐색 알고리즘이다.
	//중간을 기준으로 데이터를 탐색하기 때문에 반드시 데이터가 정렬된 상태로 존재해야 한다.  
	
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
			// 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
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
		 
		int low = 0;					// 탐색 범위의 왼쪽 끝 인덱스
		int high = list.length - 1;	// 탐색 범위의 오른쪽 끝 인덱스
 
		// lo가 hi보다 커지기 전까지 반복한다.
		while(low <= high) {
 
			int mid = (low + high) / 2;	// 중간위치를 구한다.
 
			// key값이 중간 위치의 값보다 작을 경우
			if(key < list[mid]) {
				high = mid - 1;
			}
			// key값이 중간 위치의 값보다 클 경우
			else if(key > list[mid]) {
				low = mid + 1;
			}
			// key값과 중간 위치의 값이 같을 경우
			else {
				return mid;
			}
		}
 
		// 찾고자 하는 값이 존재하지 않을 경우
		return -1;
 
	}
	private static void sort(int[] list) {//오름차순으로 정렬(버블 정렬)
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
