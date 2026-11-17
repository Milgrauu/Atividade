import java.util.Scanner;

public class ATV6 {

    public static void main(String[] args) { 
	   String nome;
	   int idade;
	   boolean ativa; 
	   Scanner entrada = new Scanner(System.in);
	   System.out.print("Informe seu nome: ");
	   nome = entrada.nextLine();
       System.out.print("Informe sua idade: ");
       idade = entrada.nextInt();
	   System.out.print("Informe se sua conta esta ativa(true ou false): ");
	   ativa = entrada.nextBoolean();
	   System.out.print("nome: " + nome + ", idade:" + idade + ", conta ativa:" + ativa);
	   
	}
}
