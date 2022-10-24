package practice_Algorithm.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LittlePrince {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int test_Case=Integer.parseInt(br.readLine());
		
		while(test_Case-->0) {//출발지와 도착지의 좌ㅠㅛ
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			
			int n=Integer.parseInt(br.readLine());//행성 개수
			
			int count=0;//행성 진입/ 이탈
			
			
			for(int i=0;i<n;i++) {
				st=new StringTokenizer(br.readLine());
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				int r=Integer.parseInt(st.nextToken());//행성의 반지름
				
				//시작점이 행성 안에 있는지 판별 (안에 있으면 false, 밖에 있으면 true)
				boolean flag1=false;
				//도착점이 행성 안에 있는지 판별 
				boolean flag2=false;
				
				//피타고라스 생각했을 때 r이 빗변 -> 우변이 좌변보다 작은 경우에 행성 밖에 있는 경우 
				if(Math.pow(x1-x, 2)+Math.pow(y1-y, 2)>Math.pow(r, 2)) flag1=true;
				if(Math.pow(x2-x, 2)+Math.pow(y2-y, 2)>Math.pow(r, 2)) flag2=true;
				
				
				//시작점과 도착점이 다른 곳에 있는 경우에 시작점 -> 도착점으로 갈 때 경계선을 지나기 때문에 answer을 더해준다 
				if(flag1!=flag2) count++;
			}
			
			System.out.println(count);
		}	
	}

}
