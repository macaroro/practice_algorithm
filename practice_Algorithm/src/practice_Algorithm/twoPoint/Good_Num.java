package practice_Algorithm.twoPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//1253
public class Good_Num {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		long[] a = new long[n];
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n;i++) {
			a[i]= Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(a);
		
		int count = 0;
		for(int i=0;i<n;i++) {
			
			
			long k = a[i];//찾을 수
			int start = 0;//시작점
			int end=n-1;//끝점(배열의 맨 뒤에서 하나씩 줄어들어가게 함)
			
			while(start<end) {//두 포인트가 만나기 전까지
				if(a[start]+a[end]==k) {//두 포인트의 수를 더해서 k와 같다면
					if(start!=i&&end!=i) {//일단 i와 같은수인지 확인(서로 다른수인지를 체크(1,1 안됨)
						count++;
						break;//while문 종료
						
					}else if(start==i) {//만약 k와 같지 않다면 증가
						start++;
					}else if(end==i) {//만약 k와 같지 않다면 감소
						end--;
					}
					
				}else if(a[start]+a[end]>k) {//만약 두수를 더해 k 보다 크다면 end를 감소시킨다
					end--;
				}else {//아니라면 start를 증가
					start++;
				}
				}
			}
			
		System.out.println(count);
			
		}
		

	}


