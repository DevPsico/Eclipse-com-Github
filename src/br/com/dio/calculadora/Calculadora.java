package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor. ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo valor. ");
		b = scan.nextInt();
		
		System.out.println("Resultado da soma: " + somar(a, b));
		
		System.out.println("Resultado da subtração: " + subtrair(a, b));
		
		System.out.println("Resultado da Multiplicação: " + multiplicar(a, b));
		
		System.out.println("Resultado da divisão: " + dividir(a, b));
	}
	
	public static int somar(int a, int b) {
		
		return a+b;	
	}
	
	public static int subtrair(int a, int b) {
		
		return a-b;
	}
	
	public static int multiplicar(int a, int b) {
		
		return a*b;	
	}
	
	public static double dividir(double a, double b) {
		
		return a/b;
	}
}