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
		
		
		//�迭�� ����(override, �� ������ ����)
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				//���� ���������� ���ٸ�
				if(o1[1]==o2[1]) {
					//���� ������ ���Ͽ� ������������
					return o1[0]-o2[0];
				}
				//�װ� �ƴ϶�� ��������� �������� ����
				return o1[1]-o2[1];
			}
		});
		
		int count=0;
		int end=0;
		
		for(int i=0;i<meeting;i++) {
			//���� ����ð��� ���� �ð��� ���ų� �۴ٸ�
			if(end<=time[i][0]) {
				end=time[i][1];//����ð��� ����
				count++;//�׸��� Ƚ���� ����
			}
		}
		
	
		System.out.println(count);
		

	}

}
