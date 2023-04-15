package practice_Algorithm.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rectangle_Escape {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//x���� ����, y���� ����
		
		int x = Integer.parseInt(st.nextToken());//����
		int y = Integer.parseInt(st.nextToken());//����
		
		int w = Integer.parseInt(st.nextToken());//���簢���� ������ ����
		int h = Integer.parseInt(st.nextToken());//���簢���� ������ ����
		
		int min1 = Math.min(x, w-x);
		int min2=Math.min(y, h-y);
		
		int min3=Math.min(min1, min2);
		System.out.println(min3);
		
	}

}
