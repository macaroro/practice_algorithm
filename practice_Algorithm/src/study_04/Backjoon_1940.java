package study_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//�������Ͱ� Ư¡
public class Backjoon_1940 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int M  = Integer.parseInt(br.readLine());//����
        int N = Integer.parseInt(br.readLine());//��
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] list = new int[M];
        
        for(int i=0;i<M;i++) {
        	list[i] = Integer.parseInt(st.nextToken());//����
        }
        
        int cnt = 0;
        for(int start=0; start<M; start++)  {
            int sum = 0;
            int end = start+1;

            while (end<M) {
                sum = list[start];
                sum += list[end++];
                if (sum == N) {
                    cnt++;
                    break;
                }
            }

        }

        System.out.println(cnt);

    }
        
	}


