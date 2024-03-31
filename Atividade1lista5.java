import java.util.Scanner;
public class Atividade1lista5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaT = 0;
        int contadortempV = 0;

       System.out.println("Digite as 12 temperaturas entre (4 e 10): ");

       for(int i = 1; i <= 12; i++){
        System.out.print("Temperatura " +i+ ": ");
        double temp = scanner.nextDouble();

        if( temp >= 4 && temp <= 10){

         somaT += temp;
         contadortempV++;

        }else{System.out.println("Temperatura inválida. Digite novamente.");
        i--; }

      }

      Double mediaTemp = somaT / contadortempV;
      System.out.print("A média de hoje das temperaturas é: " + mediaTemp);

        scanner.close();
    }
}
