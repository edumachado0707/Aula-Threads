package controller;

public class ProcessosController {
	private int n;
	private int [] vet;
	
	public ThreadVetor(int n, int [] vet) {
		this.n = n;
		this.vet = vet;
	}
	
	@Override
	public void run() {
		percorre();
	}
	
	private void percorre() {
		int x;
		double initTime = System.nanoTime();
		if(this.n % 2 == 0) {
			for (int=0; i< this.vet.length; i++) {
				x = vet[i];
				}
		}else {
				for(int var:this.vet) {
					x=var;
				}
		}
		double time = (System.nanoTime() - initTime)/(Math.pow(10, 9));
		System.out.println("O tempo foi de " + time + "s para percorrer.");
}
