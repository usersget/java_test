package gghrjg;

import java.util.Scanner; 
@SuppressWarnings("resource")
public class Jisuabji {


public static void main(String[] args) {
	
	int first,two;String  fuhao;float three;
	Scanner reader = new Scanner(System.in);
	System.out .print("请输入第一个数 :");
	first= reader.nextInt();
	System.out .print("请输入运算符 :");
	fuhao= reader.next();
	System.out .print("请输入第二个数 :");
    two =reader. nextInt();
    fangfa();
    switch(fuhao) {
    case "*":  three = first*two;
	  System.out .print( +first+"*"+two+"="+three );break;
    case "/":  three= first/two;
	  System.out .print( +first+"/"+two+"="+three );break;
    case "-" :three= first-two;
	  System.out .print( +first+"-"+two+"="+three );break; 
    case "+":three= first+two;
	  System.out .print( +first+"+"+two+"="+three );break;
    case "%" :three= first%two;
	  System.out .print( +first+"%"+two+"="+three );break;
    }
    
  }  
public static void fangfa() {
	System.out.println("计算中请稍后");
	for(int e=0;e<=10000000;e++) {
		System.out.print("");
	}
	
}

}

