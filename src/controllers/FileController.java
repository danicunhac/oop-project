package controllers;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
    public void read(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        while (true) {
            String linha = buffRead.readLine();
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
        }
        buffRead.close();
    }

    public void write(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha).append("\n");
        buffWrite.close();
    }

    public void delete(String path) throws IOException {
        new FileWriter(path, false).close();
    }

}
