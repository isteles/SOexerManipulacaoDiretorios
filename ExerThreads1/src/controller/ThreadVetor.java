package controller;

public class ThreadVetor extends Thread {

	private int vetor[];
	private int valor;

	public ThreadVetor(int valor, int vetor[]) {
		this.valor = valor;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		saida(); 
	}

	private void saida() {

		double tempoinicial;
		double tempofinal;

		if (valor == 1) {
			tempoinicial = System.nanoTime();
			for (int i = 0; i < vetor.length; i++) {

			}

			tempofinal = System.nanoTime();
			tempofinal = tempofinal - tempoinicial;
			tempofinal = (tempofinal / 1e+9);

			System.out.println(tempofinal);

		} else {
			tempoinicial = System.nanoTime();
			for (int i : vetor) {
			}

			tempofinal = System.nanoTime();
			tempofinal = tempofinal - tempoinicial;
			tempofinal = (tempofinal / 1e+9);

			System.out.println(tempofinal);
		}

	}
} 