import java.util.Scanner;

public class numeroFatorial{
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);  

        //variaveis
        int numero = 0;
        int fatorial = 1;
        int x = 1;

        //entrada
        System.out.println("Numeros fatoriais");
        
        System.out.println("Digite um numero: ");
        numero = leia.nextInt();

        //processamento
        fatorial = fatorial * x; 

        //saida
        for(x = 1; x <= numero; x++){
        System.out.print("O fatorial de " + numero + " é " + fatorial );
        leia.close();
         }
   
    }

}