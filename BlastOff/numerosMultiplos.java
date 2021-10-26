import java.util.Scanner;

public class numerosMultiplos {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);  
	
			//variaveis
            int numero1; 
            int numero2; 

            //entradas
            System.out.println("Numeros multiplos");

            System.out.println("Informe o primeiro numero: ");
            numero1 = leia.nextInt();

            System.out.println("Informe o segundo numero: ");
            numero2 = leia.nextInt();

            //processamento
            int multiplo = numero1 % numero2 ;

            if (multiplo == 0){
                System.out.println("O numero " + numero1 + " é multiplo de " + numero2 + ".");
            }
                else{
                System.out.println("O numero " + numero1 + " não é multiplo de " + numero2 + ".");
                
            }
   
            leia.close();

        }

}