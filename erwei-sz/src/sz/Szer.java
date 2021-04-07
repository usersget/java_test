package sz;
//@SuppressWarnings("resource")处理假报错
public class Szer {
     public static void main(String[] args) {
    	 dongtai();
     }

	private static void dongtai() {
		// TODO 自动生成的方法存根
		//二维数组创建
		int[][] ayy =new int[4][];
		for(int i=0;i<ayy.length;i++) {
			ayy[i]=new int[i+1];
			for(int j=0;j<ayy.length;j++) {
				ayy[i][j]=i+j;
				
			}
		}
		//二维数组遍历
		System.out.print("二维数组输出");
		for(int i=0;i<ayy.length;i++ ) {
			for(int j=0;j<ayy.length;j++ ) {
				System.out.print(ayy[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
