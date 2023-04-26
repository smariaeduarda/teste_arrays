package application;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, maiorIdade, posMaior;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String name[] = new String[n];
		int age[] = new int[n];
		
		for (int i = 0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
		}
		
		maiorIdade = age[0];
		posMaior = 0;
		
		for (int i = 0; i < n; i++) {
			if (age[i] > maiorIdade) {
				maiorIdade = age[i];
				posMaior = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: "+ name[posMaior] );
		
		
		sc.close();

	}

}
