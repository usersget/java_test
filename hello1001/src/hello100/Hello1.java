package hello100;

import java.util.Scanner;

public class Hello1 {
     public static void main(String[] arges) {
    		Machine m  = new Machine();
    		Scanner reader=new Scanner(System.in);
    	    System.out.println("请输入充值金额");
    	    int t =reader.nextInt();
    		m.insertCash( 5 );
    		m.insertCash( t);
    		m.insertCash( 50);
    		
    		// 按一下按钮
    		int coins = m.exchange();
    		System.out.println("拿到了" + coins + "个游戏币");

     }
}
