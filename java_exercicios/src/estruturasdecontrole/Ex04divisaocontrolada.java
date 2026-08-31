package estruturasdecontrole;

public class Ex04divisaocontrolada {
}
int a = 9;
int b = 2;

// Divisão Inteira (incorreto se precisar de casas decimais)
int resultadoErrado = a / b; // Resultado: 4

// Divisão Controlada (com cast)
double resultadoCorreto = (double) a / b; // Resultado: 4.5
System.out.println(resultadoCorreto);
