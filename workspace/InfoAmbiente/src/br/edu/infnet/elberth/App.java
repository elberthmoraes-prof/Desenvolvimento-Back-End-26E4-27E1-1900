package br.edu.infnet.elberth;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {		
		
		//WHILE - DO..WHILE - FOR - FOR..EACH
		
		Scanner in = new Scanner(System.in);
		
		int numero = 0;
		int i = 10;
		System.out.println("antes");
		while(numero != i){
			System.out.println("Informe um número: ");
			numero = in.nextInt();
		}
		System.out.println("depois");
		
		i = 20;
		do {
			System.out.print("Informe um número: ");
			numero = in.nextInt();
		} while (numero != i);
		System.out.println("terminou");
//		
//		System.out.println("Elberth Moraes");
//		System.out.println("Elberth Moraes");
//		System.out.println("Elberth Moraes");
//		System.out.println("Elberth Moraes");
//		System.out.println("Elberth Moraes");
//		System.out.println("Elberth Moraes");
//		System.out.println("Elberth Moraes");
//		System.out.println("Elberth Moraes");
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Informe a sua idade: ");
//		int idade = in.nextInt();
//		
//		if(idade < 0) {
//			System.err.println("Por favor!! Informe um número positivo ("+idade+")");
//			return;
//		}
//		
//		if(idade <= 17) {
//			System.out.println("baby");
//		} else if (idade <= 29) {
//			System.out.println("teen");
//		} else {
//			System.out.println("velho");
//		}
//		
//		System.out.println("Idade: " + idade);
		
//		int hora = 19;
//		int minuto = 30;
//		
//		int duracaoEmMinutos = hora * 60 + minuto;
//		
//		System.out.println(duracaoEmMinutos);
//		
//		System.out.println("1) os.name " + System.getProperty("os.name"));
//		System.out.println("2) sun.cpu.isalist " + System.getProperty("sun.cpu.isalist"));
//		System.out.println("3) java.vm.vendor " + System.getProperty("java.vm.vendor"));		
//		System.getProperties().list(System.out);
		
	}
}
