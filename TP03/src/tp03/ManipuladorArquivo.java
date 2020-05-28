/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

/**
 *
 * @author ccc
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipuladorArquivo {

    public static List leitorString(String path) throws IOException {

        List<String> listaDados = new ArrayList<String>();
        BufferedReader buffer = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                //System.out.println("linha");
                listaDados.add(linha);
            } else {
                break;
            }
            linha = buffer.readLine();
        }
        buffer.close();
        return listaDados;
    }

    public static void escritorString(String path, List dado) throws IOException {
        BufferedWriter buffer = new BufferedWriter(new FileWriter(path));
        for (int i = 0; i < dado.size(); i++) {
            String linha = "";
            linha = dado.get(i).toString();
            buffer.append(linha + "\n");
        }
        buffer.close();
    }

    public static void escritorStringVerificador(String path, String dado, String verificador) throws IOException {

        BufferedWriter buffer = new BufferedWriter(new FileWriter(path));
        String linha = "";
        linha = dado;
        buffer.append(verificador + "\n");
        buffer.append(linha + "\n");
        buffer.close();
    }

    public static void escritorInt(String path, int dado) throws IOException {

        BufferedWriter buffer = new BufferedWriter(new FileWriter(path));
        int linha = 0;
        linha = dado;
        buffer.append(linha + "\n");
        buffer.close();
    }

    public static void escritorIntVerificador(String path, int dado, String verificador) throws IOException {

        BufferedWriter buffer = new BufferedWriter(new FileWriter(path));
        int linha = 0;
        linha = dado;
        buffer.append(verificador + "\n");
        buffer.append(linha + "\n");
        buffer.close();
    }
}
