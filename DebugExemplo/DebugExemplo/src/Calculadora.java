
public class Calculadora {
	public float calcular(float a, float b, char operacao) {
		float resultado = 0;
		float maior = 0;
		float menor = 0;
	
		switch (operacao) {
		case '+': {
			resultado = a + b;
			break;
		}
		case '-': {
			
			if(a >= b) {
				maior = a;
				menor = b;

			} else {
				maior = b;
				menor = a;
			}
			resultado = maior - menor;
//			float maior = Math.max(a, b); compara um valor maior entre um e outro
//			float menor = Math.min(a, b); compara o menor 
			break;
		}
		case '/': {
			resultado = a / b;
			if(resultado <= 0) {
				System.out.println("deu zero");
			}
			break;
		}
		case '*': {
			resultado = a * b;
			break;
		}

		}
		return resultado;

	}
}
