package practice_Algorithm.function;

public class SelfNumber {

	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];//10001�� �迭�� �� �� �ֵ��ΰ���
		for(int i=1;i<10001;i++) {
			int selfnum=d(i);//selfnum���� �Ʒ� ������� �Լ��� ���ư� ����� �־��ش�
			if(selfnum<=10000) {
				arr[selfnum]=true;
			}//�� ���� 10000���� ������ true
			//�� ���� �ڸ��� �迭�� ���� �ȴ�
		}
		for(int i=1;i<=10000;i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
			//�׷��ٸ� selfnumber�� ������� �ſ��� ���� �ڸ��� �ǹǷ�
			//����ִ� �ڸ��� �迭�� �ڸ� ��ȣ�� ���� ���� �ȴ�.
		}
	
	}

	
	private static int d(int num) {
		int sum = num;//�޾ƿ� ���� num�� sum�� �־��ش�
		while(num!=0) {//num�� 0�� �ƴҶ� ���� ��� �ݺ�
			
			sum+=num%10;//sum�� ó�� �޾ƿ� num�� 10���� ���� �������� ���� �´�.(���� �ڸ�)
			            //�Ʒ��� �������� 0�� �ƴ϶�� �ٽ� �� ���� 10���� ���� �������� �����´�(�����ڸ�)
			
			num/=10;//�̹��� 10���� ���� ���� �ٽ� num�� �־� �ش� ���� 0�� �ƴ϶��
			        //�ݸ���� �ٽ� �ݺ��Ͽ� ���� 0�϶� ���� ��
	
		}
		return sum;
	}
}
