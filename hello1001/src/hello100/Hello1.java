package hello100;

import java.util.Scanner;

public class Hello1 {
     public static void main(String[] arges) {
    		Machine m  = new Machine();
    		Scanner reader=new Scanner(System.in);
    	    System.out.println("�������ֵ���");
    	    int t =reader.nextInt();
    		m.insertCash( 5 );
    		m.insertCash( t);
    		m.insertCash( 50);
    		
    		// ��һ�°�ť
    		int coins = m.exchange();
    		System.out.println("�õ���" + coins + "����Ϸ��");

     }
}
