package application;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media;
		
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		
		String name[] = new String[n];
		double notas1[] = new double[n];
		double notas2[] = new double[n];
		
		for (int i =0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos Aprovados:");
	
		for (int i =0; i < n; i++) {
			media = (notas1[i] + notas2[i]) / 2;
			if(media > 6.0) {
				System.out.println(name[i]);
			}
		}
		
		
		
		sc.close();

	}

}
