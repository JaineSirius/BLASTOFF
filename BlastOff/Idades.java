import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);  
			
			//variaveis
			int i=0;
			int j=0;
			int k=0;
			int x=0; 
            int y=0;
			
			//entradas
			System.out.println("Idade 1:");
			i = leia.nextInt();

			System.out.println("Idade 2:");
			j = leia.nextInt();

			System.out.println("Idade 3:");
			k = leia.nextInt();

            System.out.println("Idade 4:");
            x = leia.nextInt();
            
            System.out.println("Idade 5:");
            y = leia.nextInt();
			
			//processamento
			int mediaIdade = ((i + j + k + x + y) / 5) ;
			
			//saida
			System.out.printf("A media de idades é:  " + mediaIdade);
	
			leia.close();
	}

}