
public class Numero {

	private int valor;
	public Numero(int valor) {
		// TODO Auto-generated constructor stub
		this.setValor(valor);
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String toString() {
		if(valor % 5 == 0 && valor % 3 == 0) {
			return "FizzBuzz";
		}else if(valor % 3 == 0){
			return "Fizz";
		}else if(valor % 5 == 0) {
			return "Buzz";
		}else {
			return String.valueOf(valor);
		}
		
	}
	public static void imprimirRango(int inferior, int superior) {
		StringBuffer salida = new StringBuffer();
		Numero numero;
		for (int k = inferior; k <= superior; k++) {
			numero = new Numero(k);
			salida.append(numero);
			salida.append("\n");
		}
		System.out.print(salida);
	}

}
