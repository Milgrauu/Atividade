import java.util.Scanner;

public class ATV4 {

    public static void main(String[] args) {
	   double metros;
	   Scanner entrada = new Scanner(System.in);
       System.out.print("Informe 1 número em metros: ");
       metros = entrada.nextDouble();
	   double centimetros = metros * 100;
	   System.out.print("metros em centimetros: " + centimetros);
	   
	}
}