package testsix;

public class Six {
	//6.����һ������a{1,2,3,9,4,5} ���������е����ֵλ�� �������ֳ�����{1,2,3} {4,5}
		public static void main(String[] args){
			//1.��Ҫһ������
			int[] oldArray = {1,2,3,90,4,5,6,90,4,5,6,7,8};
			//2.��Ѱ���ֵ������λ��-->Ϊ��ͨ�����λ�� ȷ������С����ĳ���
			int max = oldArray[0];//����ĵ�һ��Ԫ��ֵ
			int index = 0;//����ĵ�һ������λ��----(��չ��Ҫһ������������¼�������ֵ������λ��)
			for(int i=1;i<oldArray.length;i++){
				if(oldArray[i]>max){
					max = oldArray[i];
					index = i;
				}
			}
			System.out.println("���ֵΪ:"+max);
			System.out.println("���ֵλ��:"+index);
			//3.��Ҫ����С����ֱ����Ԫ��
			int[] newa = new int[index];
			int[] newb = new int[oldArray.length-index-1];
			//4.�ֱ�����С��������
			for(int i=0;i<newa.length;i++){
				newa[i] = oldArray[i];
			}
			for(int i=0;i<newb.length;i++){
				newb[i] = oldArray[(index+1)+i];
			}
			//4.�ֱ���֤���������� ��һ��
			for(int v:newa){
				System.out.println(v);
			}
			System.out.println("------");
			for(int v:newb){
				System.out.println(v);
			}
		}
	}
