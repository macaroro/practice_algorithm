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
			
			
			long k = a[i];//ã�� ��
			int start = 0;//������
			int end=n-1;//����(�迭�� �� �ڿ��� �ϳ��� �پ���� ��)
			
			while(start<end) {//�� ����Ʈ�� ������ ������
				if(a[start]+a[end]==k) {//�� ����Ʈ�� ���� ���ؼ� k�� ���ٸ�
					if(start!=i&&end!=i) {//�ϴ� i�� ���������� Ȯ��(���� �ٸ��������� üũ(1,1 �ȵ�)
						count++;
						break;//while�� ����
						
					}else if(start==i) {//���� k�� ���� �ʴٸ� ����
						start++;
					}else if(end==i) {//���� k�� ���� �ʴٸ� ����
						end--;
					}
					
				}else if(a[start]+a[end]>k) {//���� �μ��� ���� k ���� ũ�ٸ� end�� ���ҽ�Ų��
					end--;
				}else {//�ƴ϶�� start�� ����
					start++;
				}
				}
			}
			
		System.out.println(count);
			
		}
		

	}


