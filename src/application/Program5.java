package application;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posMaior;
		double numMaior;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double vect[] = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		numMaior = vect[0];
		posMaior = 0;
		
		for (int i=0; i<n; i++) {
			if (vect[i] > numMaior) {
				numMaior = vect[i];
				posMaior = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f%n", numMaior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posMaior);
		
		sc.close();

	}

}
