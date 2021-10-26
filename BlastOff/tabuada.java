import java.util.Scanner;

public class tabuada {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);  
	
			//variaveis
            int x = 0;
            int tabuada ; 
            
            //entrada
            System.out.println("Tabuada do 0 ao 10");
            System.out.println("Digite o numero da tabuada: ");
            tabuada = leia.nextInt();

            //saida
            for(x = 1; x <= 10; x++){
            int resultado = ( x * tabuada);
            System.out.print(x + " x " + tabuada + " = " + resultado + "\n");

            leia.close();
        
        } 
    
        }
}
