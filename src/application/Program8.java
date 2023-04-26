package application;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int nPares, soma;
		double media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int vect[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		nPares = 0;
		soma = 0;
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				nPares++;
			}
		}
		
			if (nPares == 0) {
				System.out.println("NENHUM NUMERO PAR");
			}
			else {
				media = soma / nPares;
				
				System.out.printf("\nMEDIA DOS PARES = %.1f" , media);
			}
		
		sc.close();

	}

}
