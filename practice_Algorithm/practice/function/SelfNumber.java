package practice_Algorithm.function;

public class SelfNumber {

	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];//10001의 배열이 들어갈 수 있도로갛고
		for(int i=1;i<10001;i++) {
			int selfnum=d(i);//selfnum에는 아래 만들어진 함수가 돌아간 결과를 넣어준다
			if(selfnum<=10000) {
				arr[selfnum]=true;
			}//그 수가 10000보다 작으면 true
			//그 수에 자리의 배열이 차게 된다
		}
		for(int i=1;i<=10000;i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
			//그렇다면 selfnumber는 만들어진 매열에 없는 자리가 되므로
			//비어있는 자리에 배열의 자리 번호를 가져 오면 된다.
		}
	
	}

	
	private static int d(int num) {
		int sum = num;//받아온 숫자 num을 sum에 넣어준다
		while(num!=0) {//num이 0이 아닐때 까지 계속 반복
			
			sum+=num%10;//sum에 처음 받아온 num을 10으로 나눈 나머지를 가져 온다.(일의 자리)
			            //아래의 구문에서 0이 아니라면 다시 그 수를 10으로 나눈 나머지를 가져온다(십의자리)
			
			num/=10;//이번엔 10으로 나눈 몫을 다시 num에 넣어 준다 이후 0이 아니라면
			        //반목분을 다시 반복하여 몫이 0일때 가지 함
	
		}
		return sum;
	}
}
