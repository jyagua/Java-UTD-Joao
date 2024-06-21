package Variáveis;

import java.util.Scanner;

public class A04_comandosDeEntrada {
    
    public static void main(String[] args) {


            System.out.println("Executando java no VS code");

            Scanner leitor = new Scanner(System.in);


            int teste = 2;
            String nome = leitor.nextLine();
            int idade = leitor.nextInt();
            float altura = leitor.nextFloat();
            double peso = leitor.nextDouble();
            String tipoSanguineo = leitor.next();
            char fatorRh = leitor.next().charAt(0);

            leitor.close();    

            System.out.printf("%s\n", nome);
            System.out.printf("idade: %d\n", idade);
            System.out.printf("altura: %.2f\n", altura);
            System.out.printf("peso: %.2f\n", peso);
            System.out.printf("tipo sanguineo: %s%c\n", tipoSanguineo, fatorRh);

            /*System.out.println("Nome = " + nome + "\nidade = " + idade + "\naltura = " + altura + "\npeso = " + peso + "\nTipo Sanguineo = " + tipoSanguineo + fatorRh);*/
    }

}
