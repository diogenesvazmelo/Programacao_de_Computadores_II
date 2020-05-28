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
public class Usuario {

    private String login;
    private String nome;
    private String email;

    private int dia_nascimento;
    private int mes_nascimento;
    private int ano_nascimento;

    Scanner teclado = new Scanner(System.in);

    ArrayList<Mensagens> lista_de_Mensagens = new ArrayList<Mensagens>();
    ArrayList<Usuario> lista_de_Seguidos = new ArrayList<Usuario>();

    /*
    public void menuSeguidores() {
        int verif2;
        do {
            System.out.println("\n\t   Opções:");
            System.out.println("\t1- Seguir");
            System.out.println("\t2- Cancelar seguir");
            System.out.println("\n\t3- VOLTAR");
            System.out.print("\n\t   Selecionar opção: ");
            verif2 = teclado.nextInt();
            switch (verif2) {
                case 1: {
                    lista_de_Usuarios.get(verif2);
                }
                break;
                case 2: {
                    System.out.print("\n\tInforme o novo e-mail: ");
                    teclado.nextLine();
                    this.email = teclado.nextLine();
                }
                break;
                case 3: {
                    verif2 = 4;
                }
                break;
                default: {
                    System.out.println("\tSeleção inválida!!");
                }
            }
        } while (verif2 != 3);
    }
    

    public void registrarMensagem() {
        Mensagens m1 = new Mensagens();
        this.lista_de_Mensagens.add(m1);
    }
     */
 /*
    public void menuMnesagens() {
        int verif2;
        do {
            System.out.println("\n\t   Opções:");
            System.out.println("\t1- Registar mensagem");
            System.out.println("\t2- Comentar mensagem");
            System.out.println("\t3- Ver minhas mensagens");
            System.out.println("\n\t4- VOLTAR");
            System.out.print("\n\t   Selecionar opção: ");
            verif2 = teclado.nextInt();
            switch (verif2) {
                case 1: {
                    this.registrarMensagem();
                }
                break;
                case 2: {
                    System.out.print("\n\tInforme o novo e-mail: ");
                    teclado.nextLine();
                    this.email = teclado.nextLine();
                }
                break;
                case 3: {
                    
                }
                break;
                case 4: {
                    verif2 = 4;
                }
                break;
                default: {
                    System.out.println("\tSeleção inválida!!");
                }
            }
        } while (verif2 != 4);
    }
     */
    public void constroiUsuario(String login) {
        this.login = login;

        System.out.print("\tNome: ");
        this.nome = teclado.nextLine();
        System.out.print("\te-mail: ");
        this.email = teclado.nextLine();

        System.out.println("\tNascimento: ");

        int dia_a;
        do {
            System.out.print("\t\tDia: ");
            dia_a = teclado.nextInt();
        } while (dia_a < 0 || dia_a > 31);
        this.dia_nascimento = dia_a;

        int mes_a;
        do {
            System.out.print("\t\tMês: ");
            mes_a = teclado.nextInt();
        } while (mes_a < 1 || mes_a > 12);
        this.mes_nascimento = mes_a;

        int ano_a;
        do {
            System.out.print("\t\tAno: ");
            ano_a = teclado.nextInt();
        } while (ano_a < 1900 || ano_a > 2200);
        this.ano_nascimento = ano_a;

    }

    public void imprimeLoginENome() {
        System.out.println("\n\tUsuário '" + this.login + "':");
        System.out.println("\tNome: " + this.nome);
        System.out.println("\t-- --");
    }

    public void imprimeDados() {
        System.out.println("\n\tUsuário '" + this.login + "':");
        System.out.println("\tNome: " + this.nome);
        System.out.println("\te-mail: " + this.email);
        System.out.println("\tNascimento: " + this.dia_nascimento + "/" + this.mes_nascimento + "/" + this.ano_nascimento);
        System.out.println("\t-- --");
    }

    public void alterarDado() {
        int verif2;
        do {
            System.out.println("\n\t   Opções:");
            System.out.println("\t1- Alterar nome");
            System.out.println("\t2- Alterar e-mail");
            System.out.println("\t3- Alterar data de nascimeto");
            System.out.println("\n\t4- VOLTAR");
            System.out.print("\n\t   Selecionar opção: ");
            verif2 = teclado.nextInt();
            switch (verif2) {
                case 1: {
                    System.out.print("\n\tInforme o novo nome: ");
                    teclado.nextLine();
                    this.nome = teclado.nextLine();
                }
                break;
                case 2: {
                    System.out.print("\n\tInforme o novo e-mail: ");
                    teclado.nextLine();
                    this.email = teclado.nextLine();
                }
                break;
                case 3: {
                    int dia_a;
                    do {
                        System.out.print("\t\tDia: ");
                        dia_a = teclado.nextInt();
                    } while (dia_a < 0 || dia_a > 31);
                    this.dia_nascimento = dia_a;

                    int mes_a;
                    do {
                        System.out.print("\t\tMês: ");
                        mes_a = teclado.nextInt();
                    } while (mes_a < 1 || mes_a > 12);
                    this.mes_nascimento = mes_a;

                    int ano_a;
                    do {
                        System.out.print("\t\tAno: ");
                        ano_a = teclado.nextInt();
                    } while (ano_a < 1900 || ano_a > 2200);
                    this.ano_nascimento = ano_a;
                }
                break;
                case 4: {
                    verif2 = 4;
                }
                break;
                default: {
                    System.out.println("\tSeleção inválida!!");
                }
            }
        } while (verif2 != 4);
    }

    public int listarMensagens() {
        int i;
        for (i = 0; i < lista_de_Mensagens.size(); i++) {
            System.out.println("\n\tMensagem '" + (i + 1) + "': ");
            System.out.println("-->" + this.lista_de_Mensagens.get(i).getMsg() + "\n");
        }
        return (i + 1);
    }

    public String getLogin() {
        return login;
    }

    public void adicionarSeguidor(Usuario u1) {
        this.lista_de_Seguidos.add(u1);
    }

    public void adicionarMensagem(String autor) {
        Mensagens m1 = new Mensagens();
        m1.constroiMensagens(autor);
        this.lista_de_Mensagens.add(m1);
    }

    public ArrayList<Usuario> getLista_de_Seguidos() {
        return lista_de_Seguidos;
    }

    public void setLista_de_Seguidos(ArrayList<Usuario> lista_de_Seguidos) {
        this.lista_de_Seguidos = lista_de_Seguidos;
    }

    public ArrayList<Mensagens> getLista_de_Mensagens() {
        return lista_de_Mensagens;
    }

    public void setLista_de_Mensagens(ArrayList<Mensagens> lista_de_Mensagens) {
        this.lista_de_Mensagens = lista_de_Mensagens;
    }

    //Gets
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getDia_nascimento() {
        return dia_nascimento;
    }

    public int getMes_nascimento() {
        return mes_nascimento;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }
    
    //Sets

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDia_nascimento(int dia_nascimento) {
        this.dia_nascimento = dia_nascimento;
    }

    public void setMes_nascimento(int mes_nascimento) {
        this.mes_nascimento = mes_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }
    
    
}
