package practice_Algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Meetingroom {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int meeting = Integer.parseInt(br.readLine());
		
		int[][] time = new int[meeting][2];
		for(int i=0;i<meeting;i++) {
			st = new StringTokenizer(br.readLine()," ");
			time[i][0]=Integer.parseInt(st.nextToken());
			time[i][1]=Integer.parseInt(st.nextToken());
			
		}
		
		
		//배열의 정렬(override, 비교 기준을 정함)
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				//만약 종려시점이 같다면
				if(o1[1]==o2[1]) {
					//시작 지점을 비교하여 오름차순으로
					return o1[0]-o2[0];
				}
				//그게 아니라면 종료시점을 기준으로 정렬
				return o1[1]-o2[1];
			}
		});
		
		int count=0;
		int end=0;
		
		for(int i=0;i<meeting;i++) {
			//만약 종료시간이 시작 시간과 같거나 작다면
			if(end<=time[i][0]) {
				end=time[i][1];//종료시간을 대입
				count++;//그리고 횟수를 증가
			}
		}
		
	
		System.out.println(count);
		

	}

}
