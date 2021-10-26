import java.util.Scanner;

public class partidaFutebol {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);  
	
			//variaveis
			int horaInicial = 0; 
            int minutosInicial = 0;
			int horaFinal = 0;
            int minutosFinal = 0;
			
			//entradas
			System.out.println("Duração da partida: ");

			System.out.println("Horario inicial: ");
            System.out.println("Horas: ");
			horaInicial = leia.nextInt();
            System.out.println("Minutos: ");
            minutosInicial = leia.nextInt();

			System.out.println("Horario termino: ");
			System.out.println("Horas: ");
            horaFinal = leia.nextInt();
            System.out.println("Minutos: ");
            minutosFinal = leia.nextInt();

            //processamento
            int duracaoHoras = (horaInicial - horaFinal);
            int duracaoMinutos = (minutosInicial - minutosFinal);

			//saidas
            System.out.println("A partida durou " + duracaoHoras + " horas e " + duracaoMinutos + " Minutos.");      
            
            leia.close();

        }
}