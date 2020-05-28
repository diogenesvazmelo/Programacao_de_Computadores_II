/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ccc
 */
public class Mensagens {

    //não está sendo usado  private int cod;
    //não está sendo usado  private Usuario u_postou;
    private String msg;
    private String autor;

    Scanner teclado = new Scanner(System.in);

    ArrayList<Mensagens> lista_de_Mensagens = new ArrayList<Mensagens>();

    public void constroiMensagens(String autor) {
        this.autor = autor;
        System.out.print("\n\tEscreva: ");
        String msg = teclado.nextLine();

        if (msg.length() > 140) {
            System.out.println("\tO limite de 140 caracteres foi excedido!");
        } else {
            this.msg = msg;
        }
    }

    public void imprimeMensagem() {

    }

    public String getMsg() {
        return msg;
    }

    public void adicionarComentario(String autor) {
        Mensagens m1 = new Mensagens();
        m1.constroiMensagens(autor);
        this.lista_de_Mensagens.add(m1);
    }

    public int listarComentarios() {
        int i;
        for (i = 0; i < lista_de_Mensagens.size(); i++) {
            System.out.println("\n\tComentário '" + (i + 1) + "': ");
            System.out.println("-->" + this.lista_de_Mensagens.get(i).getMsg() + "\n");
        }
        return (i + 1);
    }

    public ArrayList<Mensagens> getLista_de_Mensagens() {
        return lista_de_Mensagens;
    }

    //Gets
    public String getAutor() {
        return autor;
    }

    //Sets
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
