package gghrjg;

import java.util.Scanner; 
@SuppressWarnings("resource")
public class Jisuabji {


public static void main(String[] args) {
	
	int first,two;String  fuhao;float three;
	Scanner reader = new Scanner(System.in);
	System.out .print("�������һ���� :");
	first= reader.nextInt();
	System.out .print("����������� :");
	fuhao= reader.next();
	System.out .print("������ڶ����� :");
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
	System.out.println("���������Ժ�");
	for(int e=0;e<=10000000;e++) {
		System.out.print("");
	}
	
}

}

