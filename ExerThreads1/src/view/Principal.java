package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		
		
		int vetor[] = new int[1000];
	
		for (int i = 1; i < vetor.length; i++) { 
			vetor[i] = (int) (Math.random() * (100 - 1) + 1); 
		}
		
		int valor = 1;
		ThreadVetor t = new ThreadVetor(valor, vetor);
		t.start();
		
		valor = 2;
		t = new ThreadVetor (valor, vetor);
		t.start();
		
		
		
			}
		
		} 


