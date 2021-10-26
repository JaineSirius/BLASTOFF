import java.util.Scanner;

public class consumoMedio{

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);  

            //variaveis
			int a = 0; //distancia
            int b = 0; //combustivel

            //Entradas
            System.out.println("Consumo médio");

            System.out.println("Digite a distancia percorrida (KM): ");
            a = leia.nextInt();

            System.out.println("Digite o combustivel gasto (Litros): ");
            b = leia.nextInt();

            //Processamento
            int mediaConsumo = ( a/b );

            //Saida
            System.out.println("O consumo médio desse automóvel foi de " + mediaConsumo + " KM/L.");
    
            leia.close();
        }
}