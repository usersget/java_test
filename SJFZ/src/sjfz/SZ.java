package sjfz;

public class SZ {
	public static void main(String[] ages) {
	//����һ������Ϊ6��int��һά���飬Ҫ�������Ԫ��ֵ��1-30֮�䣬�����ֵ��Ҫ�����Ԫ�ز�ͬ
	//��ʽһ�����ظ�ֵ��ͨ��i--���е�ǰѭ��
     int[] a = new int[6]; 
	     for (int i = 0; i < a.length; i++) {
		a[i] = (int)(Math.random() * 30 );//Ԫ�ظ�ֵ�����������Χ[0,1����չ��[0,30)�������Ϊ�����ͣ���ҪǿתΪint��
		/* for (int j = 0; j < i; j++) {
		 if(a[i] == a[j]) {//�ж��Ƿ��ظ�
	    i--;//����ظ������¿�ʼ����ѭ��
	    break; //����ظ�������ǰѭ��    
		 }
	  }*/
	}
	for (int u = 0;u< a.length;u++) {
		System.out.print(a[u] + " ");//�����������Ԫ��
	}
	System.out.println("\n");
	}}
