/* 
                INFORMAÇÕES

    Esse trabalho faz parte da disciplina de Programação de Computadores II, 
cursada por mim no CEFET-MG. O objetivo da disciplina era introduzir conceitos 
de programação orientada à objetos, utilizando a linguagem Java. Pode-se notar 
rapidamente que o código tem várias falhas que dificultam a leitura, possiveis
modificações ou correções.

    Há também uma outra vesão desse programa, um pouco mais simplificada, com o 
nome de "PassarinhoCinza".
*/

package tp03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diógenes Vaz de Melo Oliveira
 */
public class TP03 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        ArrayList<Usuario> lista_de_Usuarios = new ArrayList<Usuario>();

        lista_de_Usuarios = ler();
        //System.out.println("\t Usuário mensagem: " + lista_de_Usuarios.get(1).getLista_de_Mensagens().get(0).getMsg());
        //System.out.println("\t Seguido nome: " + lista_de_Usuarios.get(0).getLista_de_Seguidos().get(0).getNome());    //getLista_de_Mensagens().get(0).getMsg());
        //System.out.println("\t Seguido mensagem: " + lista_de_Usuarios.get(0).getLista_de_Seguidos().get(0).getLista_de_Mensagens().get(0).getMsg());
        int i;

        do {
            int verif = 0;
            System.out.println("\t TUÍTER");
            System.out.println("\n\t -- MENU PRICIPAL --");
            System.out.println("\n\t   Opções:");
            System.out.println("\n\t1- Usuário");
            System.out.println("\t2- Seguidores");
            System.out.println("\t3- Mensagens");
            System.out.println("\t4- Rede");
            System.out.println("\t5- Plus");
            System.out.println("\n\t6- SAIR do Programa");

            Scanner teclado = new Scanner(System.in);

            System.out.print("\n\t   Selecionar opção: ");
            verif = teclado.nextInt();

            switch (verif) {
                case 1: {
                    do {
                        System.out.println("\n\t -- SUBMENU USUÁRIO --");
                        System.out.println("\n\t   Opções:");
                        System.out.println("\n\t1- Cadastrar novo usuário");
                        System.out.println("\t2- Alterar");
                        System.out.println("\t3- Excluir");
                        System.out.println("\t4- Listar");
                        System.out.println("\t5- Pesquisar");
                        System.out.println("\n\t6- VOLTAR");

                        System.out.print("\n\t   Selecionar opção: ");
                        verif = teclado.nextInt();

                        switch (verif) {
                            case 1: {
                                String login;
                                do {
                                    System.out.println("\n\tInforme: ");
                                    System.out.print("\tLogin: ");
                                    login = teclado.next();

                                    if ("palavra_reservada".equals(login)) {
                                        System.out.print("\tNão é possível escolher este login!");
                                    }
                                    for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                        if (login.equals(lista_de_Usuarios.get(i).getLogin())) {
                                            System.out.print("\tO login informado já está em uso por outro usuário!");
                                            login = "palavra_reservada";
                                            break;
                                        }
                                    }
                                    if (!"palavra_reservada".equals(login)) {
                                        Usuario u1 = new Usuario();
                                        u1.constroiUsuario(login);
                                        lista_de_Usuarios.add(u1);
                                    }
                                } while ("palavra_reservada".equals(login));
                            }
                            break;

                            case 2: {
                                System.out.print("\n\tInforme o login: ");
                                String login;
                                login = teclado.next();

                                if ("palavra_reservada".equals(login)) {
                                    System.out.print("\tNão é possível escolher este login!");
                                }
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    if (login.equals(lista_de_Usuarios.get(i).getLogin())) {
                                        lista_de_Usuarios.get(i).alterarDado();
                                        login = "palavra_reservada";
                                        break;
                                    }
                                }
                                if (!"palavra_reservada".equals(login)) {
                                    System.out.print("\tO login informado não foi encontrado!");
                                }
                            }
                            break;

                            case 3: {
                                System.out.println("\tLista de Usuários: ");
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    lista_de_Usuarios.get(i).imprimeLoginENome();
                                }

                                System.out.print("\n\n\tInforme o Login do Usuário que deseja excluir: ");
                                String login = teclado.next();

                                if ("palavra_reservada".equals(login)) {
                                    System.out.print("\tNão é possível escolher este login!");
                                }
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    if (login.equals(lista_de_Usuarios.get(i).getLogin())) {
                                        for (int j = 0; j < (lista_de_Usuarios.size()); j++) {
                                            if (login.equals(lista_de_Usuarios.get(j).getLogin())) {
                                                continue;
                                            } else {
                                                for (int k = 0; k < (lista_de_Usuarios.get(j).getLista_de_Mensagens().size()); k++) {
                                                    for (int w = 0; w < (lista_de_Usuarios.get(j).getLista_de_Mensagens().get(k).getLista_de_Mensagens().size()); w++) {
                                                        if (login.equals(lista_de_Usuarios.get(j).getLista_de_Mensagens().get(k).getLista_de_Mensagens().get(w).getAutor())) {
                                                            lista_de_Usuarios.get(j).getLista_de_Mensagens().get(k).getLista_de_Mensagens().remove(w);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        lista_de_Usuarios.remove(i);
                                        login = "palavra_reservada";
                                        break;
                                    }
                                }
                                if (!"palavra_reservada".equals(login)) {
                                    System.out.print("\tO login informado não foi encontrado!");
                                }
                            }
                            break;

                            case 4: {
                                System.out.println("\tLista de Usuários: ");
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    lista_de_Usuarios.get(i).imprimeLoginENome();
                                }
                            }
                            break;

                            case 5: {
                                System.out.println("\tLista de Usuários: ");
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    lista_de_Usuarios.get(i).imprimeLoginENome();
                                }

                                System.out.print("\n\n\tInforme o Login do Usuário para pesquisar seus dados: ");
                                String login = teclado.next();

                                if ("palavra_reservada".equals(login)) {
                                    System.out.print("\tNão é possível escolher este login!");
                                }
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    if (login.equals(lista_de_Usuarios.get(i).getLogin())) {
                                        lista_de_Usuarios.get(i).imprimeDados();
                                        login = "palavra_reservada";
                                        break;
                                    }
                                }
                                if (!"palavra_reservada".equals(login)) {
                                    System.out.print("\tO login informado não foi encontrado!");
                                }
                            }
                            break;

                            case 6: {
                                verif = 6;
                                System.out.println("\n");
                            }
                            break;

                            default:
                                System.out.println("\tOpção Inválida!");
                        }

                    } while (verif != 6);
                }
                break;

                case 2: {
                    do {
                        System.out.println("\n\t -- SUBMENU SEGUIDORES --");
                        String login;
                        int posicao_A = 0;

                        System.out.println("\n\t   Opções:");
                        System.out.println("\n\t1- Entrar com um Login");
                        System.out.println("\n\t2- VOLTAR");
                        System.out.print("\n\t   Selecionar opção: ");
                        verif = teclado.nextInt();
                        switch (verif) {
                            case 1: {
                                System.out.print("\n\tInforme o login: ");
                                login = teclado.next();

                                if ("palavra_reservada".equals(login)) {
                                    System.out.print("\tNão é possível escolher este login!");
                                }
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    if (login.equals(lista_de_Usuarios.get(i).getLogin())) {
                                        posicao_A = i;
                                        login = "palavra_reservada";
                                        break;
                                    }
                                }
                                if (!"palavra_reservada".equals(login)) {
                                    System.out.print("\tO login informado não foi encontrado!");
                                    break;
                                }

                                do {
                                    System.out.println("\n\t   Opções:");
                                    System.out.println("\n\t1- Seguir");
                                    System.out.println("\t2- Cancelar seguir");
                                    System.out.println("\n\t3- VOLTAR");

                                    System.out.print("\n\t   Selecionar opção: ");
                                    verif = teclado.nextInt();

                                    switch (verif) {
                                        case 1: {
                                            do {
                                                System.out.print("\n\tInforme o Login do usuário que deseja seguir: ");
                                                login = teclado.next();

                                                if ("palavra_reservada".equals(login)) {
                                                    System.out.print("\tNão é possível escolher este login!");
                                                }
                                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                                    if (i == posicao_A) {
                                                    } else if (login.equals(lista_de_Usuarios.get(i).getLogin())) {
                                                        lista_de_Usuarios.get(posicao_A).adicionarSeguidor(lista_de_Usuarios.get(i));
                                                        login = "palavra_reservada";
                                                        break;
                                                    }
                                                }
                                                if (!"palavra_reservada".equals(login)) {
                                                    System.out.print("\tO login informado não foi encontrado!");
                                                }
                                            } while (!"palavra_reservada".equals(login));
                                        }
                                        break;
                                        case 2: {
                                            do {
                                                System.out.print("\n\tLista de usuários seguidos: ");
                                                ArrayList<Usuario> lista_de_Seguidores = new ArrayList<Usuario>();
                                                lista_de_Seguidores = lista_de_Usuarios.get(posicao_A).getLista_de_Seguidos();
                                                for (i = 0; i < (lista_de_Seguidores.size()); i++) {
                                                    lista_de_Seguidores.get(i).imprimeLoginENome();
                                                }

                                                System.out.print("\n\tInforme o Login do usuário que deseja deixar de seguir: ");
                                                login = teclado.next();

                                                if ("palavra_reservada".equals(login)) {
                                                    System.out.print("\tNão é possível escolher este login!");
                                                }
                                                for (i = 0; i < (lista_de_Seguidores.size()); i++) {
                                                    if (login.equals(lista_de_Seguidores.get(i).getLogin())) {
                                                        lista_de_Seguidores.remove(i);
                                                        lista_de_Usuarios.get(posicao_A).setLista_de_Seguidos(lista_de_Seguidores);
                                                        login = "palavra_reservada";
                                                        break;
                                                    }
                                                }
                                                if (!"palavra_reservada".equals(login)) {
                                                    System.out.print("\tO login informado não foi encontrado!");
                                                }
                                            } while (!"palavra_reservada".equals(login));
                                        }
                                        break;
                                        case 3: {
                                            verif = 3;
                                            System.out.println("\n");
                                        }
                                        break;
                                        default:
                                            System.out.println("\tOpção Inválida!");
                                    }
                                } while (verif != 3);
                            }
                            break;
                            case 2: {
                                verif = 2;
                            }
                            break;
                            default:
                                System.out.println("\tOpção Inválida!");
                        }
                    } while (verif != 2);
                }
                break;

                case 3: {
                    do {
                        System.out.println("\n\t -- SUBMENU MENSAGENS --");
                        String login;
                        int posicao_A = 0;

                        System.out.println("\n\t   Opções:");
                        System.out.println("\n\t1- Entrar com um Login");
                        System.out.println("\n\t2- VOLTAR");
                        System.out.print("\n\t   Selecionar opção: ");
                        verif = teclado.nextInt();
                        switch (verif) {
                            case 1: {
                                System.out.print("\n\tInforme o login: ");
                                login = teclado.next();

                                if ("palavra_reservada".equals(login)) {
                                    System.out.print("\tNão é possível escolher este login!");
                                }
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    if (login.equals(lista_de_Usuarios.get(i).getLogin())) {
                                        posicao_A = i;
                                        login = "palavra_reservada";
                                        break;
                                    }
                                }
                                if (!"palavra_reservada".equals(login)) {
                                    System.out.print("\tO login informado não foi encontrado!");
                                    break;
                                }

                                do {
                                    System.out.println("\n\t   Opções:");
                                    System.out.println("\n\t1- Registra mensagem");
                                    System.out.println("\t2- Comentar mensagem");
                                    System.out.println("\t3- Ver mensagens");
                                    System.out.println("\n\t4- VOLTAR");

                                    System.out.print("\n\t   Selecionar opção: ");
                                    verif = teclado.nextInt();

                                    switch (verif) {
                                        case 1: {
                                            lista_de_Usuarios.get(posicao_A).adicionarMensagem(lista_de_Usuarios.get(posicao_A).getLogin());
                                        }
                                        break;
                                        case 2: {
                                            do {
                                                System.out.print("\n\tLista de usuários seguidos: ");
                                                ArrayList<Usuario> lista_de_Seguidores = new ArrayList<Usuario>();
                                                lista_de_Seguidores = lista_de_Usuarios.get(posicao_A).getLista_de_Seguidos();
                                                for (i = 0; i < (lista_de_Seguidores.size()); i++) {
                                                    lista_de_Seguidores.get(i).imprimeLoginENome();
                                                }

                                                System.out.print("\n\tInforme o Login do usuário que deseja ver as mensagens: ");
                                                login = teclado.next();

                                                if ("palavra_reservada".equals(login)) {
                                                    System.out.print("\tNão é possível escolher este login!");
                                                }
                                                for (i = 0; i < (lista_de_Seguidores.size()); i++) {
                                                    if (login.equals(lista_de_Seguidores.get(i).getLogin())) {
                                                        lista_de_Usuarios.get(posicao_A).getLista_de_Seguidos().get(i).listarMensagens();
                                                        System.out.print("\n\tInforme o código da mensagem que deseja comentar: ");
                                                        int cod_da_mensagem = (teclado.nextInt()) - 1;

                                                        if (cod_da_mensagem >= 1 || cod_da_mensagem <= lista_de_Seguidores.get(i).listarMensagens()) {
                                                            lista_de_Seguidores.get(i).getLista_de_Mensagens().get(cod_da_mensagem).adicionarComentario(lista_de_Usuarios.get(posicao_A).getLogin());

                                                            for (int j = 0; j < (lista_de_Usuarios.size()); j++) {
                                                                if (lista_de_Usuarios.get(j).getLogin().equals(lista_de_Seguidores.get(i).getLogin())) {
                                                                    lista_de_Usuarios.get(j).setLista_de_Mensagens(lista_de_Seguidores.get(i).getLista_de_Mensagens());
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            System.out.print("\tNão foi encontrada nenhuma mensagem com o código informado!");
                                                        }

                                                        login = "palavra_reservada";
                                                        break;
                                                    }
                                                }
                                                if (!"palavra_reservada".equals(login)) {
                                                    System.out.print("\tO login informado não foi encontrado!");
                                                    break;
                                                }
                                            } while (!"palavra_reservada".equals(login));
                                        }
                                        break;

                                        case 3: {
                                            lista_de_Usuarios.get(posicao_A).listarMensagens();
                                            char aux = '0';
                                            do {
                                                System.out.print("\n\tDeseja ver os comentários de alguma mensagem listada acima? (y/n): ");
                                                aux = teclado.next().charAt(0);
                                                if (aux == 'y' || aux == 'Y') {
                                                    System.out.print("\n\tInforme o código da mensagem que deseja ver os detalhes: ");
                                                    int cod_da_mensagem = (teclado.nextInt()) - 1;
                                                    if (cod_da_mensagem < lista_de_Usuarios.get(posicao_A).getLista_de_Mensagens().size() && cod_da_mensagem >= 0) {
                                                        if (lista_de_Usuarios.get(posicao_A).getLista_de_Mensagens().get(cod_da_mensagem).getLista_de_Mensagens().size() == 0) {
                                                            System.out.print("\tNão há nenhum comentário para essa mensagem");
                                                        } else {
                                                            lista_de_Usuarios.get(posicao_A).getLista_de_Mensagens().get(cod_da_mensagem).listarComentarios();
                                                        }
                                                    } else {
                                                        System.out.print("\tO código informado não foi encontrado!");
                                                    }
                                                } else if (aux == 'N') {
                                                    aux = 'n';
                                                }
                                            } while (aux != 'n');
                                            System.out.println("\n");
                                        }
                                        break;
                                        case 4: {
                                            verif = 4;
                                            System.out.println("\n");
                                        }
                                        break;
                                        default:
                                            System.out.println("\tOpção Inválida!");
                                    }
                                } while (verif != 4);
                            }

                            break;

                            case 2: {
                                verif = 2;
                            }
                            break;
                            default:
                                System.out.println("\tOpção Inválida!");
                        }
                    } while (verif != 2);
                }

                break;

                case 4: {
                    do {
                        System.out.println("\n\t -- SUBMENU REDE --");
                        String login;
                        int posicao_A = 0;

                        System.out.println("\n\t   Opções:");
                        System.out.println("\n\t1- Ver usuário mais influente");
                        System.out.println("\t2- Pesuisar ocorrência de assunto");
                        System.out.println("\t3- Entrar com Login para mais opções");
                        System.out.println("\n\t4- VOLTAR");
                        System.out.print("\n\t   Selecionar opção: ");
                        verif = teclado.nextInt();
                        switch (verif) {
                            case 1: {
                                List<Integer> lista_Influentes = new ArrayList<Integer>();

                                for (i = 1; i <= (lista_de_Usuarios.size()); i++) {
                                    lista_Influentes.add(0);
                                }

                                int aux = 0;
                                //System.out.println("\t Vetor lista_Inf:");
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    for (int j = 0; j < (lista_de_Usuarios.get(i).getLista_de_Seguidos().size()); j++) {
                                        for (int k = 0; k < (lista_de_Usuarios.size()); k++) {
                                            if (lista_de_Usuarios.get(k) == lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j)) {
                                                aux = lista_Influentes.get(k);
                                                aux++;
                                                //lista_Influentes.add(k, ((lista_Influentes.get(k)) + 1));
                                                //lista_Influentes.add(k, 4);
                                                lista_Influentes.add(k, aux);
                                                //System.out.println("\t " + lista_Influentes.get(k));
                                                break;
                                            }
                                        }
                                        //System.out.println("\t----------- 1");
                                    }
                                    //System.out.println("\t----------- 2");
                                }
                                //System.out.println("\t----------- 3");
                                //teste System.out.println("\tPassou 1 ");

                                /* //teste 
                                System.out.println("\tlista_Influentes: ");
                                for (i = 0; i < (lista_Influentes.size()); i++) {
                                    System.out.println("\ti: " + i);
                                    System.out.println("\t" + lista_Influentes.get(i) + "; ");
                                }
                                 */ //teste 
                                /*
                                aux = 0;
                                for (i = 1; i < (lista_Influentes.size()); i++) {
                                    if (lista_Influentes.get(i) > lista_Influentes.get(i - 1)) {
                                        aux = lista_Influentes.get(i);
                                    }
                                }
                                 */
                                aux = lista_Influentes.get(0);
                                for (i = 0; i < (lista_Influentes.size()); i++) {
                                    if (lista_Influentes.get(i) > aux) {
                                        aux = lista_Influentes.get(i);
                                    }
                                }
                                //teste System.out.println("\n\tPassou 2 ");

                                System.out.print("\n\tO(s) usuário(s) mais influente(s) é(são): ");
                                for (i = 0; i < (lista_Influentes.size()); i++) {
                                    if (lista_Influentes.get(i) == aux) {
                                        //lista_Influentes.add(lista_de_Usuarios.get(i));
                                        System.out.print(lista_de_Usuarios.get(i).getLogin() + " ");
                                    }
                                }
                            }
                            break;

                            case 2: {
                                System.out.print("\n\tInforme o termo a ser buscado: ");
                                String termo = teclado.next();
                                int aux = 0;
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    for (int j = 0; j < (lista_de_Usuarios.get(i).getLista_de_Mensagens().size()); j++) {
                                        if (lista_de_Usuarios.get(i).getLista_de_Mensagens().get(j).getMsg().indexOf(termo) != -1) {
                                            aux++;
                                        }

                                        for (int k = 0; k < (lista_de_Usuarios.get(i).getLista_de_Mensagens().get(j).getLista_de_Mensagens().size()); k++) {
                                            if (lista_de_Usuarios.get(i).getLista_de_Mensagens().get(j).getLista_de_Mensagens().get(k).getMsg().indexOf(termo) != -1) {
                                                aux++;
                                            }
                                        }
                                    }
                                }
                                System.out.println("\tO termo buscado aparece nas mensagens e comentários " + aux + " vezes.");
                            }
                            break;

                            case 3: {
                                System.out.print("\n\tInforme o login: ");
                                login = teclado.next();

                                if ("palavra_reservada".equals(login)) {
                                    System.out.print("\tNão é possível escolher este login!");
                                }
                                for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                    if (login.equals(lista_de_Usuarios.get(i).getLogin())) {
                                        posicao_A = i;
                                        login = "palavra_reservada";
                                        break;
                                    }
                                }
                                if (!"palavra_reservada".equals(login)) {
                                    System.out.print("\tO login informado não foi encontrado!");
                                    break;
                                }

                                do {
                                    System.out.println("\n\t   Opções:");
                                    System.out.println("\n\t1- Exibir dados dos seguidores");
                                    System.out.println("\t2- Exibir dados dos seguidos");
                                    System.out.println("\n\t3- VOLTAR");

                                    System.out.print("\n\t   Selecionar opção: ");
                                    verif = teclado.nextInt();

                                    switch (verif) {
                                        case 1: {
                                            System.out.print("\n\tLista de usuários seguidores: ");
                                            //ArrayList<Usuario> lista_de_Seguidores = new ArrayList<Usuario>();
                                            //lista_de_Seguidores = lista_de_Usuarios.get(posicao_A).getLista_de_Seguidos();
                                            for (i = 0; i < (lista_de_Usuarios.size()); i++) {
                                                for (int j = 0; j < (lista_de_Usuarios.get(i).getLista_de_Seguidos().size()); j++) {
                                                    if (lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j) == lista_de_Usuarios.get(posicao_A)) {
                                                        lista_de_Usuarios.get(i).imprimeLoginENome();
                                                    }
                                                }

                                            }
                                        }
                                        break;
                                        case 2: {
                                            System.out.print("\n\tLista de usuários seguidos: ");
                                            ArrayList<Usuario> lista_de_Seguidores = new ArrayList<Usuario>();
                                            lista_de_Seguidores = lista_de_Usuarios.get(posicao_A).getLista_de_Seguidos();
                                            for (i = 0; i < (lista_de_Seguidores.size()); i++) {
                                                lista_de_Seguidores.get(i).imprimeLoginENome();
                                            }
                                        }
                                        break;
                                        case 3: {
                                            verif = 3;
                                            System.out.println("\n");
                                        }
                                        break;
                                        default:
                                            System.out.println("\tOpção Inválida!");
                                    }
                                } while (verif != 3);
                            }
                            break;

                            case 4: {
                                verif = 4;
                            }
                            break;
                            default:
                                System.out.println("\tOpção Inválida!");
                        }
                    } while (verif != 4);
                }
                break;

                case 5: {
                    System.out.println("\tEsta funcionalidade ainda não foi implementada!");
                }
                break;

                case 6: {
                    gravar(lista_de_Usuarios);
                    System.exit(0);
                }
                break;

                default:
                    System.out.println("Opção Inválida!");
            }

        } while (true);

    }

    public static void gravar(ArrayList<Usuario> lista_de_Usuarios) throws IOException {
        List<String> listaUsuariosLogin = new ArrayList<String>();
        List<String> listaUsuariosNome = new ArrayList<String>();
        List<String> listaUsuariosEmail = new ArrayList<String>();

        List<String> listaDiaNascimento = new ArrayList<String>();
        List<String> listaMesNascimento = new ArrayList<String>();
        List<String> listaAnoNascimento = new ArrayList<String>();

        // -------------------
        List<String> listaSeguidorLoginVerificador = new ArrayList<String>();

        List<String> listaSeguidorLogin = new ArrayList<String>();
        List<String> listaSeguidorNome = new ArrayList<String>();
        List<String> listaSeguidorEmail = new ArrayList<String>();

        List<String> listaSeguidorDiaNascimento = new ArrayList<String>();
        List<String> listaSeguidorMesNascimento = new ArrayList<String>();
        List<String> listaSeguidorAnoNascimento = new ArrayList<String>();

        List<String> listaSeguidorMensagensMsgVerificador = new ArrayList<String>();

        List<String> listaSeguidorMensagensMsg = new ArrayList<String>();
        List<String> listaSeguidorMensagensNome = new ArrayList<String>();

        // -------------------
        List<String> listaMensagensMsgVerificador = new ArrayList<String>();

        List<String> listaMensagensMsg = new ArrayList<String>();
        List<String> listaMensagensNome = new ArrayList<String>();

        // -------------------
        List<String> listaComentariosMsgVerificador = new ArrayList<String>();

        List<String> listaComentariosMsg = new ArrayList<String>();
        List<String> listaComentariosNome = new ArrayList<String>();

        // -------------------
        for (int i = 0; i < lista_de_Usuarios.size(); i++) {
            listaUsuariosLogin.add(lista_de_Usuarios.get(i).getLogin());
            listaUsuariosNome.add(lista_de_Usuarios.get(i).getNome());
            listaUsuariosEmail.add(lista_de_Usuarios.get(i).getEmail());

            listaDiaNascimento.add(Integer.toString(lista_de_Usuarios.get(i).getDia_nascimento()));
            listaMesNascimento.add(Integer.toString(lista_de_Usuarios.get(i).getMes_nascimento()));
            listaAnoNascimento.add(Integer.toString(lista_de_Usuarios.get(i).getAno_nascimento()));

            for (int j = 0; j < lista_de_Usuarios.get(i).getLista_de_Seguidos().size(); j++) {
                listaSeguidorLoginVerificador.add(lista_de_Usuarios.get(i).getLogin());

                listaSeguidorLogin.add(lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getLogin());
                listaSeguidorNome.add(lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getNome());
                listaSeguidorEmail.add(lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getEmail());

                listaSeguidorDiaNascimento.add(Integer.toString(lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getDia_nascimento()));
                listaSeguidorMesNascimento.add(Integer.toString(lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getMes_nascimento()));
                listaSeguidorAnoNascimento.add(Integer.toString(lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getAno_nascimento()));

                for (int k = 0; k < lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getLista_de_Mensagens().size(); k++) {
                    listaSeguidorMensagensMsgVerificador.add(lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getLogin());

                    listaSeguidorMensagensMsg.add(lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getLista_de_Mensagens().get(k).getMsg());
                    listaSeguidorMensagensNome.add(lista_de_Usuarios.get(i).getLista_de_Seguidos().get(j).getLista_de_Mensagens().get(k).getAutor());
                }
            }

            for (int j = 0; j < lista_de_Usuarios.get(i).getLista_de_Mensagens().size(); j++) {
                listaMensagensMsgVerificador.add(lista_de_Usuarios.get(i).getLogin());

                listaMensagensMsg.add(lista_de_Usuarios.get(i).getLista_de_Mensagens().get(j).getMsg());
                listaMensagensNome.add(lista_de_Usuarios.get(i).getLista_de_Mensagens().get(j).getAutor());

                for (int k = 0; k < lista_de_Usuarios.get(i).getLista_de_Mensagens().get(j).getLista_de_Mensagens().size(); k++) {
                    listaComentariosMsgVerificador.add(Integer.toString(j + 1));

                    listaComentariosMsg.add(lista_de_Usuarios.get(i).getLista_de_Mensagens().get(j).getLista_de_Mensagens().get(k).getMsg());
                    listaComentariosNome.add(lista_de_Usuarios.get(i).getLista_de_Mensagens().get(j).getLista_de_Mensagens().get(k).getAutor());
                }
            }
        }
        ManipuladorArquivo.escritorString("UsuariosLogin", listaUsuariosLogin);
        ManipuladorArquivo.escritorString("UsuariosNome", listaUsuariosNome);
        ManipuladorArquivo.escritorString("UsuariosEmail", listaUsuariosEmail);

        ManipuladorArquivo.escritorString("DiaNascimento", listaDiaNascimento);
        ManipuladorArquivo.escritorString("MesNascimento", listaMesNascimento);
        ManipuladorArquivo.escritorString("AnoNascimento", listaAnoNascimento);

        // -------------------
        ManipuladorArquivo.escritorString("SeguidorLoginVerificador", listaSeguidorLoginVerificador);

        ManipuladorArquivo.escritorString("SeguidorLogin", listaSeguidorLogin);
        ManipuladorArquivo.escritorString("SeguidorNome", listaSeguidorNome);
        ManipuladorArquivo.escritorString("SeguidorEmail", listaSeguidorEmail);

        ManipuladorArquivo.escritorString("SeguidorDiaNascimento", listaSeguidorDiaNascimento);
        ManipuladorArquivo.escritorString("SeguidorMesNascimento", listaSeguidorMesNascimento);
        ManipuladorArquivo.escritorString("SeguidorAnoNascimento", listaSeguidorAnoNascimento);

        ManipuladorArquivo.escritorString("SeguidorMensagensMsgVerificador", listaMensagensMsgVerificador);

        ManipuladorArquivo.escritorString("SeguidorMensagensMsg", listaMensagensMsg);
        ManipuladorArquivo.escritorString("SeguidorMensagensNome", listaMensagensNome);

        // -------------------
        ManipuladorArquivo.escritorString("MensagensMsgVerificador", listaMensagensMsgVerificador);

        ManipuladorArquivo.escritorString("MensagensMsg", listaMensagensMsg);
        ManipuladorArquivo.escritorString("MensagensNome", listaMensagensNome);

        // -------------------
        ManipuladorArquivo.escritorString("ComentariosMsgVerificador", listaComentariosMsgVerificador);

        ManipuladorArquivo.escritorString("ComentariosMsg", listaComentariosMsg);
        ManipuladorArquivo.escritorString("ComentariosNome", listaComentariosNome);

        // -------------------
    }

    public static ArrayList<Usuario> ler() throws IOException {
        ArrayList<Usuario> lista_de_Usuarios = new ArrayList<Usuario>();

        //List<String> lista_de_Strings = new ArrayList<String>();
        //lista_de_Strings = ManipuladorArquivo.leitorString("UsuariosLogin");
        for (int i = 1; i < (ManipuladorArquivo.leitorString("UsuariosLogin").size()); i++) {
            Usuario u1 = new Usuario();
            //System.out.println(i + " Login: " + ManipuladorArquivo.leitorString("UsuariosLogin").get(i).toString());
            u1.setLogin(ManipuladorArquivo.leitorString("UsuariosLogin").get(i).toString());
            u1.setNome(ManipuladorArquivo.leitorString("UsuariosNome").get(i).toString());
            u1.setEmail(ManipuladorArquivo.leitorString("UsuariosEmail").get(i).toString());

            u1.setDia_nascimento(Integer.parseInt((ManipuladorArquivo.leitorString("DiaNascimento").get(i).toString())));
            u1.setMes_nascimento(Integer.parseInt(ManipuladorArquivo.leitorString("MesNascimento").get(i).toString()));
            u1.setAno_nascimento(Integer.parseInt(ManipuladorArquivo.leitorString("AnoNascimento").get(i).toString()));

            for (int j = 1; j < ManipuladorArquivo.leitorString("SeguidorLoginVerificador").size(); j++) {
                if (ManipuladorArquivo.leitorString("SeguidorLoginVerificador").get(j).toString().equals(ManipuladorArquivo.leitorString("UsuariosLogin").get(i).toString())) {
                    Usuario seguindo1 = new Usuario();
                    seguindo1.setLogin(ManipuladorArquivo.leitorString("SeguidorLogin").get(j).toString());
                    seguindo1.setNome(ManipuladorArquivo.leitorString("SeguidorNome").get(j).toString());
                    seguindo1.setEmail(ManipuladorArquivo.leitorString("SeguidorEmail").get(j).toString());

                    seguindo1.setDia_nascimento(Integer.parseInt(ManipuladorArquivo.leitorString("SeguidorDiaNascimento").get(j).toString()));
                    seguindo1.setMes_nascimento(Integer.parseInt(ManipuladorArquivo.leitorString("SeguidorMesNascimento").get(j).toString()));
                    seguindo1.setMes_nascimento(Integer.parseInt(ManipuladorArquivo.leitorString("SeguidorAnoNascimento").get(j).toString()));

                    for (int k = 1; k < ManipuladorArquivo.leitorString("SeguidorMensagensMsgVerificador").size(); k++) {
                        if (ManipuladorArquivo.leitorString("SeguidorMensagensMsgVerificador").get(k).toString().equals(ManipuladorArquivo.leitorString("SeguidorLogin").get(j).toString())) {
                            Mensagens m1 = new Mensagens();
                            //u1.getLista_de_Mensagens().get(j).setMsg(ManipuladorArquivo.leitorString("MensagensMsg").get(j).toString());
                            m1.setMsg(ManipuladorArquivo.leitorString("SeguidorMensagensMsg").get(j).toString());
                            m1.setAutor(ManipuladorArquivo.leitorString("SeguidorMensagensNome").get(j).toString());

                            seguindo1.lista_de_Mensagens.add(m1);
                        }
                    }
                    u1.adicionarSeguidor(seguindo1);
                }
            }

            for (int j = 1; j < ManipuladorArquivo.leitorString("MensagensMsgVerificador").size(); j++) {
                if (ManipuladorArquivo.leitorString("MensagensMsgVerificador").get(j).toString().equals(ManipuladorArquivo.leitorString("UsuariosLogin").get(i).toString())) {
                    Mensagens m1 = new Mensagens();
                    //u1.getLista_de_Mensagens().get(j).setMsg(ManipuladorArquivo.leitorString("MensagensMsg").get(j).toString());
                    m1.setMsg(ManipuladorArquivo.leitorString("MensagensMsg").get(j).toString());
                    m1.setAutor(ManipuladorArquivo.leitorString("MensagensNome").get(j).toString());

                    for (int k = 1; k < ManipuladorArquivo.leitorString("ComentariosMsgVerificador").size(); k++) {
                        if (Integer.parseInt(ManipuladorArquivo.leitorString("ComentariosMsgVerificador").get(k).toString()) == (j)) {
                            Mensagens comentario1 = new Mensagens();

                            comentario1.setMsg(ManipuladorArquivo.leitorString("ComentariosMsg").get(k).toString());
                            comentario1.setAutor(ManipuladorArquivo.leitorString("ComentariosNome").get(k).toString());

                            m1.lista_de_Mensagens.add(comentario1);
                        }
                    }
                    u1.lista_de_Mensagens.add(m1);
                }
            }
            lista_de_Usuarios.add(u1);
        }
        return lista_de_Usuarios;
    }

}
