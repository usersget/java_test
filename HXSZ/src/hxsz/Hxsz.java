package hxsz;
import java.util.Scanner;
public class Hxsz {
public static void main(String[] ages) {
	@SuppressWarnings("resource")
	 //回形数格式方阵
	Scanner reader=new Scanner(System.in);
	    System.out.println("请输入回形数组阵的大小");
	    int length =reader.nextInt();
	    int[][] array4 = new int[length][length];
	    int s = length *length;
	    int i,j;
	    i = j = 0;
	    int k =1;//K=1向右，K=2向下，K=3向左，K=4向上,设定4种情况
	    for(int m = 1;m <= s;m++) {//遍历数组元素，依次按照设定角标顺序赋值
	    	if(k == 1) {
	    		if(j < length && array4[i][j] == 0) {
	    			array4[i][j++] = m;//第一行1234----length向右赋值
	    		}else {
	    			k = 2;//赋值完后转到最后一列向下赋值
	    			i++;
	    			j--;
	    			m--;
	    		}
	    	}else if(k == 2) {
	    		if(i < length && array4[i][j] == 0) {
	    			array4[i++][j] = m;//最后一列向下赋值
	    		}else {
	    			k = 3;//赋值完后转到最后一行向左赋值
	    			i--;
	    			j--;
	    			m--;
	    		}
	    		
	    	}else if(k == 3) {
	    		if(j >= 0 && array4[i][j] == 0) {
	    			array4[i][j--] = m;//最后一行向左赋值
	    		}else {
	    			k = 4;//赋值完后转到第一列向上赋值
	    			i--;
	    			j++;
	    			m--;
	    		}
	    	}else if(k == 4) {
	    		if(i >= 0 && array4[i][j] == 0) {
	    			array4[i--][j] = m;//第一列向上赋值
	    		}else {
	    			k = 1;//赋值完后转到第二行向右赋值，开始新的循环，直到所有数组元素都不等于初始值0 ，数组赋值完成
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
	       
	    //方法二
	/*    System.out.println("请输入回形数组阵的大小");
    int length2 = scan.nextInt();
    int[][] array5 = new int[length2][length2];
    int count = 0;//要输入的数据
    int maxX = length2 - 1;//二维数组x轴的最大下标
    int maxY = length2 - 1;//二维数组y轴的最大下标
    int minX = 0;////二维数组x轴的最小下标
    int minY = 0;//二维数组y轴的最小下标
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
