package titwo;

public class TT {
	//2.����һ������a{1,2,3,4,5,6} ����������е�Ԫ��ͷβ��Ӧ����λ��
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6};
		for(int i=0;i<array.length/2;i++){//���ƽ����Ĵ��� ���鳤�ȵ�һ��
			int x = array[i];
			array[i] = array[(array.length-1)-i];
			array[(array.length-1)-i] = x;
		}
		for(int v:array){
			System.out.println(v);
		}
	}
}

