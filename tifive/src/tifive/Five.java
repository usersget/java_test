package tifive;

public class Five {
	//5.������������a{1,2,3}  b{4,5} �ϲ��������� (����һ���µ�����5����)
		public static void main(String[] args){
			//1.������������
			int[] a = {1,2,3};
			int[] b = {4,5};
			//2.��Ϊ���鳤��һ��ȷ�� �����ٴθı�  ��Ҫ����һ���µ�����
			int[] newArray = new int[a.length+b.length];//ֻ�г��� Ԫ��Ĭ��ֵ0
			//3.˼·��:��Ҫ������������
		/*	for(int i=0;i<newArray.length;i++){
				if(i<a.length){//�����������λ�û�û��a���鳤������ķ�Χ
					newArray[i] = a[i];
				}else{
					newArray[i] = b[i-a.length];
				}
			}*/
			//3.˼·һ:�ֱ�a��b�����е�Ԫ�ش�����������
			
			for(int i=0;i<a.length;i++){//������a����Ԫ�ش����������� 
				newArray[i] = a[i];
			}//  newArray--->{1,2,3,0,0}
			for(int i=0;i<b.length;i++){//��b����Ԫ��ȡ���� �������������λ��
				newArray[a.length+i] = b[i];
			}//  newArray--->{1,2,3,4,5}
			
			//4.��֤һ�¿�һ��
			for(int v:newArray){
				System.err.println(v);
			}
		}
	}
