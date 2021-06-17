import java.util.Scanner;

public class ExercicioRodizio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		String nome, setor,diasemana="";
		int placa,meiodetransporte;
		Scanner leitor= new Scanner(System.in);
		System.out.println("Por favor, qual o seu Nome?");
		nome=leitor.next();
		System.out.println("Por favor, qual o seu Setor?");
		setor=leitor.next();
		System.out.println("Por favor,Selecione o meio de Transporte 1- Carros  e 2- Onibus ?");
		meiodetransporte=leitor.nextInt();
		switch(meiodetransporte){
		case 1:
			System.out.println("Qual o último dígito numérico da placa do seu carro");
			placa=leitor.nextInt();
			switch(placa){
				case 1:
				case 2:
				diasemana ="segunda-feira";
				break;
				case 3:
				case 4:
				diasemana ="terça-feira";
				break;
				case 5:
				case 6:
				diasemana ="quarta-feira";
				break;
				case 7:
				case 8:
				diasemana ="quinta-feira";
				break;
				case 9:
				case 0:
				diasemana ="sexta-feira";
				break;
			    }
			
		case 2:
			System.out.println("rodízio não se aplica");
			break;
		   
		default :
	    System.out.println("rodízio não se aplica");
	    }
		
		if(meiodetransporte==1) {
		System.out.println("Olá "+ nome+"("+ setor+")" +"-seu dia de rodízio é: "+ diasemana ) ;
		}
		
		}
}
