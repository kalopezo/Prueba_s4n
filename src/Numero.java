
public class Numero {

	private int valor;
	public Numero(int valor) {
		this.setValor(valor);
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String toString() {
		try {
			if(valor % 5 == 0 && valor % 3 == 0) {
				return "FizzBuzz";
			}else if(valor % 3 == 0){
				return "Fizz";
			}else if(valor % 5 == 0) {
				return "Buzz";
			}else {
				return String.valueOf(valor);
			}
		}catch(NullPointerException e){
			 return "Valor del número nulo.";
		}catch(Exception e) {
			return "Error " + e;
		}
	}
		
	public static void imprimirRango(int inferior, int superior) {
		try {
			StringBuffer salida = new StringBuffer();
			Numero numero;
			for (int k = inferior; k <= superior; k++) {
				numero = new Numero(k);
				salida.append(numero);
				salida.append("\n");
			}
			System.out.print(salida);
		}catch(NullPointerException e){
			 System.out.println("Valor del número nulo.");
		}catch(Exception e) {
			System.out.println("Error " + e);
		}
	}

}
