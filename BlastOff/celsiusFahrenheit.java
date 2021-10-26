import java.util.Scanner;

public class celsiusFahrenheit {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);  
	
			//variaveis
            int cel;

            //entrada
            System.out.println("Conversor de temperatura");

            System.out.println("Digite a temperatura celsius: ");
            cel = leia.nextInt();

            //processamento
            int fah = ((cel * 9/5) + 32);

            //saida
            System.out.println("A temperatura em Fahrenheit é: " + fah );

            leia.close();
            
    }
}
