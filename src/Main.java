import java.io.IOException;
import java.util.Scanner;
import controllers.FileController;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Escolha a opção de acordo com o menu abaixo:");
        System.out.println("1 - Inserir nome no arquivo");
        System.out.println("2 - Exibir todos os nomes do arquivo");
        System.out.println("3 - Apagar todo o arquivo");
        System.out.println("4 - Encerrar programa");

        Scanner teclado = new Scanner(System.in);
        FileController arquivo = new FileController();
        int opcaoEscolhida = teclado.nextInt();

        switch(opcaoEscolhida) {
            case 1:
                try {
                    arquivo.write("file.txt");
                    System.out.println("Você escreveu no arquivo!");
                } catch (IOException e) {
                    throw new IOException(e);
                } finally {
                    System.out.println("Programa encerrado!");
                }

                break;
            case 2:
                try {
                    System.out.println("---- Começo do arquivo ----");
                    arquivo.read("file.txt");
                    System.out.println("---- Final do arquivo ----");
                } catch (IOException e) {
                    throw new IOException(e);
                } finally {
                    System.out.println("Programa encerrado!");
                }

                break;
            case 3:
                try {
                    arquivo.delete("file.txt");
                    System.out.println("Arquivo apagado!");
                } catch (IOException e) {
                    throw new IOException(e);
                } finally {
                    System.out.println("Programa encerrado!");
                }

                break;
            case 4:
                System.out.println("Programa encerrado!");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        teclado.close();
    }

}