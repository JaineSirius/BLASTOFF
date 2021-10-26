import java.util.Scanner;

public class menorNumero {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);  
	
			//variaveis
			int a = 0;
			int b = 0;
			int c = 0;
			
			//entradas
			System.out.println("Mostrar o menor numero ");

			System.out.println("Digite o primeiro numero: ");
			a = leia.nextInt();

			System.out.println("Digite o segundo numero: ");
			b = leia.nextInt();

			System.out.println("Digite o terceiro numero: ");
			c = leia.nextInt();

			//saidas
				if (a <= b && a <= c) {
					System.out.println("O menor numero é :" + a);
				}
				else  if (b <= a && b <= c) {
					System.out.println("O menor numero é :" + b);
				}
				else  if (c <= a && c <= b) {
					System.out.println("O menor numero é :" + c);
		}

		leia.close();

	}

}