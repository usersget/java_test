package tiyi;

public class ty {
	//*1.������������a{1,2,3,4}  b{5,6,7,8} �����������ڵ�Ԫ�ض�Ӧλ�û���
		public static void main(String[] args){
			//1.������������
		    int[] a = {1,2,3,4};
			int[] b = {5,6,7,8,9,0};
			//2.Ԫ�ض�Ӧλ�õĻ���  ----  ÿһ�ν�����������  ���Ĵ�
			//��ʽ��  ֱ�ӽ�������a��b�е���������(��ַ) û��ѭ��һ�θ㶨�� ���ܳ�������
			int[] temp = a;
			a = b;
			b = temp;
			//��ʽһ  ���������ж�Ӧ��Ԫ��(ѭ�������ö�� �ܳ��ȵ�����)
	        /*for(int i=0;i<a.length ;i++){//Ϊ�˿����Ĵ�
				int x = b[i];
				b[i] = a[i];
				a[i] = x;
			}*/
			//3.�ֱ������������Ԫ�ؿ�һ��
			for(int v:a){
				System.out.println(v);
			}
			System.out.println("--------");
			for(int v:b){
				System.out.println(v);
			}
		}
	}