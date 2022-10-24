package practice_Algorithm.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MelonField {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int melon =Integer.parseInt(br.readLine());
		int[] list = new int[6];
		
		int maxGaro=0;
		int maxSero=0;
		
		int way;
		int loc1 = 0;
		int loc2 = 0;
		
		
		for(int i=0;i<6;i++) {
			st = new StringTokenizer(br.readLine()," ");
			 way = Integer.parseInt(st.nextToken());
			list[i] = Integer.parseInt(st.nextToken());
			
			if((way==1||way==2)&&maxGaro<list[i]) {
				maxGaro=list[i];
				loc1=i;
			}else if((way==3||way==4)&&maxSero<list[i]) {
				maxSero=list[i];
				loc2=i;
				
			}
			
		}
		
		  int right,left,emptyWidth,emptyHeight;
		  
		   if(loc1+1==6)right=0;
		    else right=loc1+1;
		    
		    if(loc1-1==-1)left=5;
		    else left=loc1-1;
		    //빈 사각형의 세로 길이
		    emptyHeight=Math.abs(list[right]-list[left]);

		    if(loc2+1==6)right=0;
		    else right=loc2+1;
		    
		    if(loc2-1==-1)left=5;
		    else left=loc2-1;
		    //빈 사각형의 가로 길이
		    emptyWidth=Math.abs(list[right]-list[left]);

		    System.out.println(((maxGaro*maxSero)-(emptyHeight*emptyWidth)) * melon);

	}

}
