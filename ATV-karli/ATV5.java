import java.util.Scanner;

public class ATV5 {

    public static void main(String[] args) {
	   int idade;
	   Scanner entrada = new Scanner(System.in);
       System.out.print("Informe sua idade: ");
       idade = entrada.nextInt();
	   int dias = idade * 365;
	   System.out.print("Sua idade em dias: " + dias);
	   
	}
}