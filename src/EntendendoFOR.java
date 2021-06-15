import java.util.Scanner;

public class EntendendoFOR {

	public static void main(String[] args) {
		int contador;		
		Scanner leitor= new Scanner(System.in);
				int n,res;
				contador=0;
				System.out.println("Você quer calcular a tabuada de qual número?");
				n=leitor.nextInt();
				leitor.close();
				System.out.println("");
				System.out.println("Calculando a tabuada do " + n);
				for (contador=0; contador<=10;contador++) {
					res = n * contador;
					System.out.println(n+ "x" + contador + " = " + res);
				}
				System.out.println("");
				System.out.println("Valores da tabuada do " + n);
				
				}	
	}


