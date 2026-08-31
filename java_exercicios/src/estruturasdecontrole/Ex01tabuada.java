package estruturasdecontrole;

public class Ex01tabuada

{ solicita que o usuário entre com um número
    numero = int(input("digite um número para ver a tabuada :"))


    print(f"tabuada do {numero}:")


    gera a tabuada de 1 até 10 usando um laço for
    for i in range(1,11):
       resultado = numero + i
       print(f"{numero} x {i} = {resultado}")


}

