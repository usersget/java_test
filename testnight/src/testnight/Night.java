package testnight;

public class Night {
	//8.����һ������ �洢2-100֮�������(����)
		public static void main(String[] args){
			//˼·һ:�ռ�ռ��С  ִ��Ч����
			//0.ͨ��һ����ǧ��ѭ����Ѱһ��---count
			//1.����һ������  ����(�պõ� û��һ���ռ����)
			//2.ͨ��һ����ǧ��ѭ����Ѱ����  ����������������

			//˼·��:ִ��Ч�ʸ� �ռ�ռ�ô�
			//0.����һ���㹻��������
			//1.ͨ����ǧ��ѭ��������  ����������������
			//2.����������������  ���沿��0Ԫ��ȥ��


			int[] primeNumberArray = new int[50];
			int index = 0;//��¼�������������仯   ͬʱ��¼�����ĸ���
			for(int num=2;num<=100;num++){
				boolean b = false;//��ʶ  ������¼�����״̬
				for(int i=2;i<=num/2;i++){//��2--8֮����Ѱ����û��������������������
					if(num%i==0){//������������������� ֤��num��������
						//System.out.println(num+"��������");
						b = true;//�����������(�ҵ����� ֤���������� �ı��ʶ)
						break;
					}
				}
				if(!b){//�����ʶ�������һ�� ֤��ѭ���ڵ�if����û��ִ�й�  !b <===> b==false
					//System.out.println(num+"������");
					primeNumberArray[index++] = num;				
				}
			}//{2,3,5,7,11,13,17,19,23,29...........0,0,0,0,0,0,0,0,0}
			int[] newArray = new int[index];
			for(int i=0;i<newArray.length;i++){
				newArray[i] = primeNumberArray[i];
			}
			primeNumberArray = null;//
			System.err.print("������");
			for(int v:newArray){
			
				System.out.println("������:"+v);
			}

			/*
			//0.��Ѱ2-100֮�������ĸ���--->ȷ������ĳ���
			int count = 0;//������¼�����ĸ���
			for(int num=2;num<=100;num++){
				boolean b = false;//��ʶ  ������¼�����״̬
				for(int i=2;i<=num/2;i++){//��2--8֮����Ѱ����û��������������������
					if(num%i==0){//������������������� ֤��num��������
						//System.out.println(num+"��������");
						b = true;//�����������(�ҵ����� ֤���������� �ı��ʶ)
						break;
					}
				}
				if(!b){//�����ʶ�������һ�� ֤��ѭ���ڵ�if����û��ִ�й�  !b <===> b==false
					//System.out.println(num+"������");
					count++;
					
				}
			}
			System.out.println("������Ѱ,2-100֮�������ĸ���Ϊ:"+count);
			//1.����һ������  ������
			int[] primeNumberArray = new int[count];
			//2.��Ѱ2-100֮�������  ���ҵ�����������������
			int index = 0;//����һ���µı���  ��¼��������������仯
			for(int num=2;num<=100;num++){
				boolean b = false;//��ʶ  ������¼�����״̬
				for(int i=2;i<=num/2;i++){//��2--8֮����Ѱ����û��������������������
					if(num%i==0){//������������������� ֤��num��������
						//System.out.println(num+"��������");
						b = true;//�����������(�ҵ����� ֤���������� �ı��ʶ)
						break;
					}
				}
				if(!b){//�����ʶ�������һ�� ֤��ѭ���ڵ�if����û��ִ�й�  !b <===> b==false
					//System.out.println(num+"������");
					primeNumberArray[index++] = num;
				}
			}
			//3.������յ�������֤һ��
			for(int v:primeNumberArray){
				System.out.println(v);
			}

			*/
		}
	}
