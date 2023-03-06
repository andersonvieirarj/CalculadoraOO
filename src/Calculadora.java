import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculadora {
    public double valor1;
    public double valor2;
    public double resultado;

    public double somar (){
        resultado = valor1 + valor2;
        return resultado;
    }
    public void subtrair(){
        resultado = valor1 - valor2;
        System.out.println("Subtração: " + resultado);
    }
    public double multiplicar (){
        resultado = valor1 * valor2;
        return resultado;
    }
    public void dividir(){
        resultado = valor1 / valor2;
        System.out.println("Dividir: " + resultado);
    }
    public void entradaDados(){
        Scanner leitura = new Scanner (System.in);

        System.out.println("Informe o primeiro número:");
        valor1 = leitura.nextDouble();
        System.out.println("Informe o segundo número:");
        valor2 = leitura.nextDouble();
    }
    public void mostrarDados(){
        System.out.println(resultado);
    }
   }
