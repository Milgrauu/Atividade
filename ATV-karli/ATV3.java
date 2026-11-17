 import java.util.Scanner;

public class ATV3 {

    public static void main(String[] args) {
	   double notaUm;
	   double notaDois;
	   double notaTres;
	   Scanner entrada = new Scanner(System.in);
       System.out.print("Informe 3 número: ");
       notaUm = entrada.nextDouble();
	   notaDois = entrada.nextDouble();
	   notaTres = entrada.nextDouble();
	   double media = (notaUm + notaDois + notaTres )/3;
	   System.out.print("media: " + media);
	   
	}
}