import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Escolha a opção de acordo com o menu abaixo:");
        System.out.println("1 - Inserir nome no arquivo");
        System.out.println("2 - Exibir todos os nomes do arquivo");
        System.out.println("3 - Apagar todo o arquivo");

        Scanner teclado = new Scanner(System.in);
        int opcaoEscolhida = teclado.nextInt();

        switch(opcaoEscolhida) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        teclado.close();
    }

}