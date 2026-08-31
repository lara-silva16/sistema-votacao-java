package estruturasdecontrole;

    import java.util.scanner;

public class Ex02imc
     public static Ex02mc {
         public static=new Scanner(Sys temin);{


import java.util.Scanner;

         public class CalculoIMC {
             public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in);

                 System.out.print("Digite seu peso (kg): ");
                 double peso = scanner.nextDouble();

                 System.out.print("Digite sua altura (m): ");
                 double altura = scanner.nextDouble();

                 // Cálculo do IMC
                 double imc = peso / (altura * altura);

                 System.out.printf("Seu IMC é: %.2f\n", imc);

                 // Classificação IMC
                 if (imc < 18.5) {
                     System.out.println("Abaixo do peso");
                 } else if (imc < 25) {
                     System.out.println("Peso normal");
                 } else if (imc < 30) {
                     System.out.println("Sobrepeso");
                 } else {
                     System.out.println("Obesidade");
                 }

                 scanner.close();
             }








