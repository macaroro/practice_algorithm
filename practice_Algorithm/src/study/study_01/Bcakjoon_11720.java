package study.study_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷�
public class Bcakjoon_11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int count_num = Integer.parseInt(br.readLine());
		String add_num = String.valueOf(br.readLine());
		int sum=0;
		
	    char[] ch = add_num.toCharArray();

	    //char�� int ������ �ٲٷ��� �ƽ�Ű �ڵ带 �̿�('0'�� �����)
	    for(int i = 0; i < ch.length; i++) 
	    {
	    	 sum += ch[i]-'0';
	    }
	        System.out.println(sum);

		
}
}
