package exerciciosJava;

import java.util.Scanner;

public class SecondExercise {

	public static void main(String[] args) {
		int n1;
		int n2;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número");
		n2 = sc.nextInt();
		
		result = n1 + n2;
		
		System.out.println("A soma de " + n1 + " e " + n2 + " é " + result + "!");

		sc.close();
	}

}
