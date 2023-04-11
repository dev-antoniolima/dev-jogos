package oo;

public class Main extends Player {
	
	private String corPele = "Branca";
	private int[] numeros;
	public static final int VIDA_MAX = 100;
	
	// Método Construtor
	public Main(int n1, int n2) {
		super(n1,n2);
		this.vidaInicial = 200;
	}
	
	public static void main(String[] args) {
	Main m = new Main(100,200);
	System.out.println(m.corPele);
	System.out.println(m.VIDA_MAX);
		}
	
	}