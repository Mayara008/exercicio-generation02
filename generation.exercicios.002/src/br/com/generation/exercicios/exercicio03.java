package br.com.generation.exercicios;

//3. Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:

import java.util.Scanner;

public class exercicio03 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria Infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria Adulto");

		ler.close();
		
		}
	}
}

