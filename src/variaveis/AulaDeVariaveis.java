package variaveis;
// Material de estudo de variaveis da aula quatro, dia 07/07/22
// Autor: Marina Larissa Carpes Röhrig

import java.util.Scanner;

public class AulaDeVariaveis {
    public static void main(String[] args) {
    int anoAtual = 2022;
    int anoNascimetnoUsuario = 1997;
    String nome = "Marina";
    char primeiraLetra = 'M';
    double altura = 1.58;
    boolean casado = false;
    int idade = anoAtual - anoNascimetnoUsuario;
    String nomeCompleto = "Marina Larissa Carpes Röhrig";
    final double CONSTANTE_PI = 3.14;
    long identificador = 2147483648l;
    float alturaFloat = 1.58f;
    // No alturaFloat, o f após o número está indicando para o Java que o número é um float, serve para long l

    int alturaInt = (int) 1.75;
    // transformando o valor 1.75 em inteiro


    System.out.println(nomeCompleto);
    System.out.println(identificador);
    System.out.println(CONSTANTE_PI);
    System.out.printf("Minha altura é: %.2f %n", altura);
    // O .2 identifica o número de casas após a vírgula
    // O pintf imprime de forma formatada

    System.out.println("Minha altura é: " + altura + ". E meu nome é: " + nomeCompleto + ". E minha idade é: " + idade
     +".");
    System.out.printf("Minha altura é: %.2f. E meu nome é: %s. E minha idade é: %d.%n", altura, nomeCompleto,idade);

    System.out.println(alturaFloat + altura); // aqui soma os valores
    System.out.println("texto " + alturaFloat + altura); // aqui concatena os valores


        Scanner entrada; // cria a variável entrada do tipo Scanner
        entrada = new Scanner(System.in); // inicializa a variável entrada

        // Scanner tranda = new Scanner(System.in);  cria e inicializa a variável

        System.out.println("Digite sua cidade natal, por gentileza: ");
        String cidade = entrada.nextLine(); // cria a variável cidade que vai receber a próxima linha digitada

        System.out.printf ("Sua cidade é: %s %n",cidade);
    }
}
