import java.util.Scanner;

public class cadastro {
    void main () {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("SISTEMA DE CADASTRO");

        System.out.println ("DIGITE SEU NOME COMPLETO:");
        String nome = scanner.nextLine();

        System.out.println ("DIGITE SEU CPF:");
        String documento = scanner.nextLine();

        System.out.println ("DIGITE SUA IDADE:");
        int idade = scanner.nextInt ();

        System.out.println ("DIGITE PESO:");
        double peso = scanner.nextDouble ();

        System.out.println ("DIGITE SUA ALTURA:");
        double altura = scanner.nextDouble ();

        scanner.nextLine();

        System.out.println("DIGITE SEU ESTADO CIVIL:");
        String estadoCivil = scanner.nextLine();

        System.out.println ("SEGUE SEUS DADOS:");

        System.out.println("Nome Completo: " + nome);
        System.out.println("CPF: " + documento);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Estado Civil: " + estadoCivil);

    }
}

