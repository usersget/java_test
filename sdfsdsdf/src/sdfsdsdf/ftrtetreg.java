package sdfsdsdf;

public class ftrtetreg {
	public int yy() {
		int a=7;int m =9;int c = a+m;
		return c;
	}
	public static void main(String[] args) {
		ftrtetreg tt=new ftrtetreg ();
		int b = tt.yy();System.out.println("�����"+b);
		int[] a= {0,1,5,6,8,200,9,4,140,110,52};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]) {
				max = a[i];
			}
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.err.println("������"+max);
		System.err.println("��С����"+min);
	}
}
	


