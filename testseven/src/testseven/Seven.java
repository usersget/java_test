package testseven;

public class Seven {
	//*7.����һ������a{1,2,3,0,0,4,5,0,6,0,7} ȥ�������е�0Ԫ�� (����һ�������� �̵� ����Ԫ��������)
		public static void main(String[] args){
			//1.��Ҫһ������
			int[] oldArray = new int[]{1,2,3,0,0,4,5,0,6,0,7};
			//2.��Ѱԭ�����еķ���Ԫ�ظ���--->����ȷ��������ĳ���
			int count = 0;//��¼ԭ�����з������
			for(int i=0;i<oldArray.length;i++){
				if(oldArray[i]!=0){
					count++;
				}
			}
			System.out.println("ԭ�������Ԫ�صĸ���:"+count);
			//3.����һ���µ����� װԭ�����еķ���Ԫ��
			int[] newArray = new int[oldArray.length-4];//��չ˼·��--->���Դ���һ���㹻��������
			//4.��ԭ�����з���Ԫ��������  ������������
			int index = 0;//����������������仯
			for(int i=0;i<oldArray.length;i++){
				if(oldArray[i]!=0){
					newArray[index++] = oldArray[i];
					//index++;
				}
			}
			//5.�������Ҿ���û������  ɾ��
			oldArray = null;
			//5.��֤�����鿴һ��
			for(int v:newArray){
				System.out.println(v);
			}
		}
	}
