import java.util.Scanner;

public class AvaliacaoAluno {
	
	public static void main(String[] args){
		
		//INPUT - ENTRADA
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = in.nextLine();
		
		System.out.print("Informe a sua idade: ");
		int idade = in.nextInt();
		
		System.out.print("Informe a sua primeira nota: ");
		double primeiraNota = in.nextDouble();

		System.out.print("Informe a sua segunda nota: ");
		double segundaNota = in.nextDouble();
		
		System.out.print("Informe a sua frequencia (%): ");
		double frequencia = in.nextDouble();

		//PROCESSAMENTO
		double media = (primeiraNota + segundaNota) / 2;
			
		boolean suficiente = false;
		if(frequencia >= 75){
			suficiente = true;
		}

		//OUTPUT - SAIDA
		System.out.println("===== SISTEMA DE AVALIACAO ACADEMICA =====");
		System.out.println("Aluno: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Nota 1: " + primeiraNota);
		System.out.println("Nota 2: " + segundaNota);
		System.out.println("Frequencia: " + frequencia + "%");
		System.out.println("Media: " + media);
		System.out.println("Frequencia suficiente? " + (suficiente ? "Sim" : "Nao"));
	}
}