package sz;
//@SuppressWarnings("resource")����ٱ���
public class Szer {
     public static void main(String[] args) {
    	 dongtai();
     }

	private static void dongtai() {
		// TODO �Զ����ɵķ������
		//��ά���鴴��
		int[][] ayy =new int[4][];
		for(int i=0;i<ayy.length;i++) {
			ayy[i]=new int[i+1];
			for(int j=0;j<ayy.length;j++) {
				ayy[i][j]=i+j;
				
			}
		}
		//��ά�������
		System.out.print("��ά�������");
		for(int i=0;i<ayy.length;i++ ) {
			for(int j=0;j<ayy.length;j++ ) {
				System.out.print(ayy[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
