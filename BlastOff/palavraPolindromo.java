import java.util.Scanner;

public class palavraPolindromo{
public static void main(String[]args) {

    Scanner leia = new Scanner(System.in);
    
    //variaveis
    String palavra ;
    String palindromo = "";

    //entradas
    System.out.println("Digite uma palavra ou frase:");
    palavra = leia.nextLine();
    
    //saida
    for(int i = palavra.length() -1; i >= 0; i--){
        
        palindromo += palavra.charAt(i);

    }
    
    if(palindromo.equals(palavra)) {
        System.out.print("É um palíndromo!" + "\n" + palindromo);
    }
    else {
        System.out.print("Não é um palíndromo!" + "\n" + palindromo);
        
    }
    leia.close();
}

}