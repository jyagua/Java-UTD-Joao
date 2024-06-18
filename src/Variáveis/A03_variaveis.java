package Variáveis;

import java.util.Scanner;

public class A03_variaveis {
    
    public static void main(String[] args) {
        System.out.println("Executando java no VS code");

        String nome = "Joao Victor Moraes";
        int idade = 20;
        float altura = 1.80f;
        double peso = 60;
        char tipoSanguineo = 'O';
        char fatorRh = '+';

        Scanner leitor = new Scanner(System.in);

        nome = leitor.nextLine();

        System.out.println("Nome = " + nome + "\nidade = " + idade + "\naltura = " + altura + "\npeso = " + peso + "\nTipo Sanguineo = " + tipoSanguineo + fatorRh);
    }

}
