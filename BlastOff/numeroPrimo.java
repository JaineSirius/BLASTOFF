import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);  
    
            //variaveis
            int numero = 0;
            int x = 2;
            int n = 0;

            //entrada
            System.out.println("Numeros primos");
            
            System.out.println("Digite um numero: ");
            numero = leia.nextInt();

            //processamento
            while( x < numero)
                {
                if (numero % x == 0)
                {
                if(n == 0)
                {
                    System.out.println("\n" + "Não é um número primo!" + "\n" + "Seus múltiplos são: ");
                    System.out.println( x + " ");
                    n++;
                    x++;
                }
                else 
                {
                    System.out.println( x + " ");
                    n++;
                    x++;
                }
                }
                else
                {
                x++;
                }
                }
                if (n == 0)
                {
                    System.out.println("\n" + "É um número primo!");
                }
            
                leia.close();

            }

        }

