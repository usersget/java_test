package hxsz;
import java.util.Scanner;
public class Hxsz {
public static void main(String[] ages) {
	@SuppressWarnings("resource")
	 //��������ʽ����
	Scanner reader=new Scanner(System.in);
	    System.out.println("���������������Ĵ�С");
	    int length =reader.nextInt();
	    int[][] array4 = new int[length][length];
	    int s = length *length;
	    int i,j;
	    i = j = 0;
	    int k =1;//K=1���ң�K=2���£�K=3����K=4����,�趨4�����
	    for(int m = 1;m <= s;m++) {//��������Ԫ�أ����ΰ����趨�Ǳ�˳��ֵ
	    	if(k == 1) {
	    		if(j < length && array4[i][j] == 0) {
	    			array4[i][j++] = m;//��һ��1234----length���Ҹ�ֵ
	    		}else {
	    			k = 2;//��ֵ���ת�����һ�����¸�ֵ
	    			i++;
	    			j--;
	    			m--;
	    		}
	    	}else if(k == 2) {
	    		if(i < length && array4[i][j] == 0) {
	    			array4[i++][j] = m;//���һ�����¸�ֵ
	    		}else {
	    			k = 3;//��ֵ���ת�����һ������ֵ
	    			i--;
	    			j--;
	    			m--;
	    		}
	    		
	    	}else if(k == 3) {
	    		if(j >= 0 && array4[i][j] == 0) {
	    			array4[i][j--] = m;//���һ������ֵ
	    		}else {
	    			k = 4;//��ֵ���ת����һ�����ϸ�ֵ
	    			i--;
	    			j++;
	    			m--;
	    		}
	    	}else if(k == 4) {
	    		if(i >= 0 && array4[i][j] == 0) {
	    			array4[i--][j] = m;//��һ�����ϸ�ֵ
	    		}else {
	    			k = 1;//��ֵ���ת���ڶ������Ҹ�ֵ����ʼ�µ�ѭ����ֱ����������Ԫ�ض������ڳ�ʼֵ0 �����鸳ֵ���
    			i++;
    			j++;
    			m--;
	    	    }
	    	    }
	    }
	    for (int n = 0; n < array4.length; n++) {
	    	for (int l = 0; l < array4[n].length; l++) {
	    		System.out.print(array4[n][l] + " ");
		}   
	        System.out.println();
	}
	       
	    //������
	/*    System.out.println("���������������Ĵ�С");
    int length2 = scan.nextInt();
    int[][] array5 = new int[length2][length2];
    int count = 0;//Ҫ���������
    int maxX = length2 - 1;//��ά����x�������±�
    int maxY = length2 - 1;//��ά����y�������±�
    int minX = 0;////��ά����x�����С�±�
    int minY = 0;//��ά����y�����С�±�
    while(minX <= maxX) {
         for (int x = minX; x <= maxX; x++) {
			array5[minY][x] = ++count;
		 }
    	 minY++;
    	 for (int y = minY; y <= maxY; y++) {
				array5[y][maxX] = ++count;
			 }
	     maxX--;
	     for (int x = maxX; x >= minX; x--) {
				array5[maxY][x] = ++count;
			 }
	     maxY--;
	     for (int y = maxY; y >= minY; y--) {
				array5[y][minX] = ++count;
			 }
		 minX++;	
    }
       
    for (int n1 = 0; n1 < array5.length; n1++) {
	    	for (int l1 = 0; l1 < array5[n1].length; l1++) {
	    		System.out.print(array5[n1][l1] + " ");
		}   
	        System.out.println();
	}*/
}
}
