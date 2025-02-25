import java.util.Scanner;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double nota1 = 9.0;
        double nota2 = 10.0;

        double media;
        media = (nota1 + nota2) /2;
        out.println(media);

        int valor;
        Scanner teclado = new Scanner(in);
        out.println("Digite um valor: ");
        valor = teclado.nextInt();

        out.println(valor/2);
        out.println(valor%2);

        int num1, num2;
        num1 = 6;
        num2 = 6;

        out.println(num1);
        out.println(num2);

        num1++; // num1 = num1 + 1;
        ++num2; // num2 = num2 + 1

        out.println(num1);
        out.println(num2);

        int numero;
        numero = 6;
        numero -= 2;
        out.println(numero);

        out.println(numero >= 2); // maior ou igual
        out.println(numero == 7); // igual
        out.println(numero != 7); // diferente
    }
}