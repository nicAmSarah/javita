package exerciciosJava;

import java.util.Scanner;

public class roomExercise {

	public static void main(String[] args) {

		int A, B, C, D;
		int diferenca;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		A = sc.nextInt();
		System.out.println("Digite o segundo numero");
		B = sc.nextInt();
		System.out.println("Digite o terceiro numero");
		C = sc.nextInt();
		System.out.println("Digite o quarto numero");
		D = sc.nextInt();
		
		diferenca = A*B-C*D;
		
		System.out.println(diferenca);
	}

}
