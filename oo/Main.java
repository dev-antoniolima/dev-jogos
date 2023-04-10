package oo;

public class Main {
	
	private String corPele = "Branca";
	private int[] numeros;
	public static final int VIDA_MAX = 100;
	
	// Método Construtor
	public Main() {
		System.out.println("Classe criada");
		numeros = new int[300];
	}
	
	public static void main(String[] args) {
	Main m = new Main();
	System.out.println(m.corPele);
	System.out.println(m.VIDA_MAX);
		}
	
	}