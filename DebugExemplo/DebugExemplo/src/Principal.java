import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Log meuLogger = new Log("Log.txt");
		try {
		meuLogger.logger.setLevel(Level.FINE);
//		meuLogger.logger.info("Log de informação");
//		meuLogger.logger.warning("Log de Aviso");
//		meuLogger.logger.severe("Log Severo");
		
		} catch(Exception ex) {
			meuLogger.logger.info("Exception"+ ex.getMessage());
			ex.printStackTrace();
		}
		
		
		try (Scanner leitura = new Scanner(System.in)) {
			Calculadora c = new Calculadora();
			float a = 0, b = 0, resultado = 0;
			String operador;
			System.out.println("Calculadora");
			meuLogger.logger.info("Ininiciando a calculadora");
			do {
				System.out.println("Insira o operador +, -, *, /");
				operador = leitura.nextLine();
			} while (!(operador.contains("+") || operador.contains("-") || operador.contains("*")
					|| operador.contains("/")));

			System.out.println("Insira o 1o valor");
			a = leitura.nextFloat();
			System.out.println("Insira o 2o valor");
			b = leitura.nextFloat();

			resultado = c.calcular(a, b, operador.charAt(0));
			System.out.println("O resultado de " + a + " " + operador + " " + b + " É: " + resultado);
			
			meuLogger.logger.info("O resultado da calculadora ficou assim "+ resultado);
		}
		
	}

}
