import java.util.Scanner;

public class calculator {
	void add() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of two no is "+c);
	}
	void sub() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println("Substraction of two no is "+c);
	}
	void mul() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("Multipication of two no is "+c);
	}
	void div() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division of two no is "+c);
	}
	void mod() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a%b;
		System.out.println("Modulus of two no is "+c);
	}
	void table() {
		int num;
		System.out.println("enter number ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i =1;i<=10; i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		}
	void power() {
		int base,expo;
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		base=sc.nextInt();
		expo=sc.nextInt();
		long result =1;
		while(expo !=0)
		{result *=base;
		--expo;
		}
		System.out.println("power is "+result);
		}
public static void main(String args[])
{ int no;
Scanner sc = new Scanner(System.in);
	
	calculator one=new calculator();
	while(true) {
		System.out.println("Options \n1.addition\n2.subsraction\n3.Multiplication\n4.Division\n5.Modules\n6.Table\n7.Power");
		no =sc.nextInt();
		switch(no)
		{
		case 1:{one.add();}break;
		case 2:{one.sub();}break;
		case 3:{one.mul();}break;
		case 4:{one.div();}break;
		case 5:{one.mod();}break;
		case 6:{one.table();}break;
		case 7:{one.power();}break;
		default:System.out.println("Wrong input");
		}
	}
	
}
}
	
	

	
