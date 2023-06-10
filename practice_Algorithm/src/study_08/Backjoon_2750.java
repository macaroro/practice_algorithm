package study_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//버블정렬로
public class Backjoon_2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] list = new int[N];
		
		for(int i=0;i<N;i++) 
		{
			list[i] = Integer.parseInt(br.readLine());
			
		}
		
		for(int i=0;i<N-1;i++) 
		{
			for(int j=0;j<N-1-i;j++) 
			{
				if(list[j]>list[j+1]) 
				{
					int tmp =list[j];
					list[j]=list[j+1];
					list[j+1]=tmp;
				}
				
			}
		}
		for(int i=0; i<list.length;i++) 
		{
			System.out.println(list[i]);
		}
	}

}
