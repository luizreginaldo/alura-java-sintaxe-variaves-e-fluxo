
public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		float outroSalario = 1270.50f;
		System.out.println(outroSalario);
		
		long numeroGrande = 1234567890123456789l;
		System.out.println(numeroGrande);
		
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}

}
