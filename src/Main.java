/* Elaborar um programa Java que simule uma calculadora básica das
4 operações aritméticas. Construir uma classe base para armazenar
os atributos da classe (dois valores e o resultado) e os métodos da
classe (somar, substrair, multiplicar, dividir, entrada de dados,
saída de dados). Copie o código da classe Calculadora no campo abaixo. */
public class Main {
    public static void main(String[] args) {

        Calculadora C = new Calculadora();

        C.entradaDados();
        C.somar();
        C.mostrarDados();

        C.subtrair();

        C.multiplicar();
        C.mostrarDados();

        C.dividir();
    }
}