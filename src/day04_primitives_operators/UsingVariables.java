package day04_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		
		
		int num1, num2, num3;
		
		num1 = 100;
		num2 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num2 = 200;
		num1 = num2;
		num3 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		int apples = 25;
		int kiwis = apples;
		int mangoes = 55;
		kiwis = mangoes;
		
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangoes);
		
	}

}
