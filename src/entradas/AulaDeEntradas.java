package entradas;

import java.util.Scanner;

public class AulaDeEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Olá! Digite o seu nome, por gentileza: %n");
        String nomeDoUsuario = scanner.nextLine();

        System.out.printf("%s, digite sua cidade natal: %n",nomeDoUsuario);
        String cidade = scanner.nextLine();

        System.out.printf("%s, digite sua idade: %n",nomeDoUsuario);
        int idadeDoUsuario = scanner.nextInt();
        
        System.out.printf("Obrigada pelas informações!%n%s, você nasceu em %s, há %d anos.", nomeDoUsuario,cidade,idadeDoUsuario);


    }
}
