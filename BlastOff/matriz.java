import java.util.Random;

public class matriz {
    public static void main(String[] args) {
	
			//variaveis
            int m [][] = new int [3][3];
            int i;
            int j;

            Random x = new Random();

            //saida
            for(i = 0; i <= 2; i++){
                for(j = 0; j <= 2; j++){
                m[i][j] = x.nextInt () %10;
                }
            }
            for(i = 0; i <= 2; ++i){
                for(j = 0; j <= 2; j++){
                    System.out.print("[" + m[i][j] + "]");
                    if(j==2){
                        System.out.print("\n");
                    }
                }
            }
    }
}
