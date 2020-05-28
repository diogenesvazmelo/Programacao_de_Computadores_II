/* 
                INFORMAÇÕES

    Esse trabalho faz parte da disciplina de Programação de Computadores II, 
cursada por mim no CEFET-MG. O objetivo da disciplina era introduzir conceitos 
de programação orientada à objetos, utilizando a linguagem Java. Pode-se notar 
rapidamente que o código tem várias falhas que dificultam a leitura, possiveis
modificações ou correções.

    Há também uma outra vesão desse programa com o diferencial de gerar um 
arquivo com os dados inputados e depois carregá-los na próxima execução.
*/


package PassarinhoCinza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassarinhoCinza {

    public static void main(String[] args) {
        ArrayList<Usuario> Usuarios = new ArrayList<>();

        int i;

        do {
            i = 0;
            //  Gastador de papel
            while (i < 100) {
                System.out.println("\n");
                i++;
            }
            i = 0;
            System.out.println("      _");
            System.out.println("     ('>");
            System.out.println("     /))@@@@@.      Rede");
            System.out.println("    /@\"@@@@@()@        Social");
            System.out.println("   .@@()@@()@@@@        do Passarinho");
            System.out.println("   @@@O@@@@()@@@        Cinza");
            System.out.println("   @()@@\\@@@()@@");
            System.out.println("    @()@||@@@@@'");
            System.out.println("     '@@||@@@'");
            System.out.println("        ||");
            System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("1) Menu dos usuários");
            System.out.println("2) Menu dos seguidores");
            System.out.println("3) Menu das mensagens");
            System.out.println("4) Opções da rede");
            System.out.println("5) Mostrar o usuário mais ativo (função extra)");
            System.out.println("9) Encerrar");

            Scanner in = new Scanner(System.in);

            System.out.print("Escolha: ");
            int auxiliarmenu = 0;
            auxiliarmenu = in.nextInt();

            switch (auxiliarmenu) {
                case 1: {
                    //  Menu dos usuários 
                    do {
                        i = 0;
                        while (i < 100) {
                            System.out.println("\n");
                            i++;
                        }
                        i = 0;
                        System.out.println("      _");
                        System.out.println("     ('>");
                        System.out.println("     /))@@@@@.      Rede");
                        System.out.println("    /@\"@@@@@()@        Social");
                        System.out.println("   .@@()@@()@@@@        do Passarinho");
                        System.out.println("   @@@O@@@@()@@@        Cinza");
                        System.out.println("   @()@@\\@@@()@@");
                        System.out.println("    @()@||@@@@@'");
                        System.out.println("     '@@||@@@'");
                        System.out.println("        ||                      Usuários");
                        System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("1) Cadastrar novo usuário");
                        System.out.println("2) Alterar algum dado de algum usuário");
                        System.out.println("3) Excluir um usuário");
                        System.out.println("4) Listar os usuários");
                        System.out.println("5) Pesquisar os dados do usuário");
                        System.out.println("8) Retornar");
                        System.out.print("Escolha: ");
                        auxiliarmenu = in.nextInt();

                        switch (auxiliarmenu) {
                            case 1: {
                                //  Opção de Cadastrar novo usuário
                                String stringauxiliar;
                                do {
                                    System.out.print("Login: ");
                                    stringauxiliar = in.next();

                                    for (i = 0; i < (Usuarios.size()); i++) {
                                        if (stringauxiliar.equals(Usuarios.get(i).getLogin()) && !"login".equals(stringauxiliar)) {
                                            System.out.print("Esse login já está em uso");
                                            stringauxiliar = "login";
                                            System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                            in.nextLine();
                                            in.nextLine();
                                            break;
                                        }
                                    }
                                    if (!"login".equals(stringauxiliar)) {

                                        System.out.print("Nome: ");
                                        String nome = in.nextLine();
                                        nome = in.nextLine();
                                        System.out.print("e-mail: ");
                                        String email = in.nextLine();

                                        System.out.println("Nascimento: ");

                                        System.out.print(" -Dia: ");
                                        int dia = in.nextInt();

                                        System.out.print(" -Mês: ");
                                        int mes = in.nextInt();

                                        System.out.print(" -Ano: ");
                                        int ano = in.nextInt();

                                        Usuario u1 = new Usuario(stringauxiliar, nome, email, dia, mes, ano);
                                        Usuarios.add(u1);
                                    }
                                } while ("login".equals(stringauxiliar));
                            }
                            break;

                            case 2: {
                                //  Opção de Alterar algum dado de algum usuário
                                System.out.print("Informe o login: ");
                                String stringauxiliar;
                                stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        System.out.println("1) Alterar nome");
                                        System.out.println("2) Alterar e-mail");
                                        System.out.println("3) Alterar data de nascimeto");
                                        System.out.print("Escolha: ");
                                        auxiliarmenu = in.nextInt();
                                        System.out.println("");
                                        switch (auxiliarmenu) {
                                            case 1: {
                                                System.out.print("Informe o novo nome: ");
                                                in.nextLine();
                                                Usuarios.get(i).setNome(in.nextLine());
                                            }
                                            break;
                                            case 2: {
                                                System.out.print("Informe o novo e-mail: ");
                                                in.nextLine();
                                                Usuarios.get(i).setEmail(in.nextLine());
                                            }
                                            break;
                                            case 3: {
                                                System.out.print(" -Dia: ");
                                                Usuarios.get(i).setDia(in.nextInt());

                                                System.out.print(" -Mês: ");
                                                Usuarios.get(i).setMes(in.nextInt());

                                                System.out.print(" -Ano: ");
                                                Usuarios.get(i).setAno(in.nextInt());
                                            }
                                            break;
                                        }
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("login errado");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                }
                            }
                            break;

                            case 3: {
                                //  Opção de Excluir um usuário
                                System.out.println("Lista de Usuários: ");
                                for (i = 0; i < (Usuarios.size()); i++) {
                                    Usuarios.get(i).imprimirLoginENome();
                                }

                                System.out.print("\nQual usuário será excluído? ");
                                String stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        for (int j = 0; j < (Usuarios.size()); j++) {
                                            if (stringauxiliar.equals(Usuarios.get(j).getLogin())) {
                                            } else {
                                                for (int k = 0; k < (Usuarios.get(j).getMensagens().size()); k++) {
                                                    for (int w = 0; w < (Usuarios.get(j).getMensagens().get(k).getComentarios().size()); w++) {
                                                        if (stringauxiliar.equals(Usuarios.get(j).getMensagens().get(k).getComentarios().get(w).getAutor())) {
                                                            Usuarios.get(j).getMensagens().get(k).getComentarios().remove(w);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        Usuarios.remove(i);
                                        stringauxiliar = "login";
                                        System.out.print("Exclusão realizada com sucesso");
                                        System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                        in.nextLine();
                                        in.nextLine();
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("Nenhum usuário com esse login");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                }
                            }
                            break;

                            case 4: {
                                //  Opção de Listar os usuários
                                System.out.println("Usuários cadastrados no sistema: ");
                                for (i = 0; i < (Usuarios.size()); i++) {
                                    Usuarios.get(i).imprimirLoginENome();
                                }

                                System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                in.nextLine();
                                in.nextLine();
                            }
                            break;

                            case 5: {
                                //  Opção de Pesquisar os dados de um usuário
                                System.out.print("Login: ");
                                String stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        Usuarios.get(i).imprimirTudo();
                                        System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                        in.nextLine();
                                        in.nextLine();
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("login errado");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                }
                            }
                            break;

                            case 8: {
                                //  Opção de Retornar ao menu anterior
                                auxiliarmenu = 8;
                            }
                            break;
                        }
                    } while (auxiliarmenu != 8);
                }
                break;

                case 2: {
                    //  Menu dos seguidores
                    do {
                        i = 0;
                        while (i < 100) {
                            System.out.println("\n");
                            i++;
                        }
                        i = 0;
                        System.out.println("      _");
                        System.out.println("     ('>");
                        System.out.println("     /))@@@@@.      Rede");
                        System.out.println("    /@\"@@@@@()@        Social");
                        System.out.println("   .@@()@@()@@@@        do Passarinho");
                        System.out.println("   @@@O@@@@()@@@        Cinza");
                        System.out.println("   @()@@\\@@@()@@");
                        System.out.println("    @()@||@@@@@'");
                        System.out.println("     '@@||@@@'");
                        System.out.println("        ||                    Seguidores");
                        System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("1) Seguir");
                        System.out.println("2) Cancelar seguir");
                        System.out.println("8) Retornar");
                        System.out.print("Escolha: ");
                        auxiliarmenu = in.nextInt();

                        String stringauxiliar;
                        int elementox = 0;

                        switch (auxiliarmenu) {
                            case 1: {
                                //  Opção de seguir um usuário

                                System.out.print("Login: ");
                                stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        elementox = i;
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("login errado");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                    break;
                                }

                                System.out.print("Qual o login do usuário que deseja seguir? ");
                                stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (i == elementox) {
                                    } else if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        Usuarios.get(elementox).adicionarSeguidor(Usuarios.get(i));
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("login errado");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                }

                            }
                            break;
                            case 2: {
                                //  Opção de cancelar seguir um usuário

                                System.out.print("Login: ");
                                stringauxiliar = in.next();
                                String stringauxiliar2 = "";
                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        elementox = i;
                                        stringauxiliar2 = stringauxiliar;
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("login errado");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                    break;
                                }
                                stringauxiliar = stringauxiliar2;

                                System.out.print("Qual o login do usuário que não mais será seguido? ");
                                stringauxiliar2 = in.next();

                                for (i = 0; i < (Usuarios.get(elementox).getQuemSegue().size()); i++) {
                                    if (stringauxiliar2.equals(Usuarios.get(elementox).getQuemSegue().get(i).getLogin())) {
                                        System.out.print("O usuário " + stringauxiliar + " deixou de seguir o usuário " + Usuarios.get(elementox).getQuemSegue().get(i).getLogin());
                                        Usuarios.get(elementox).getQuemSegue().remove(i);
                                        Usuarios.get(elementox).setQuemSegue(Usuarios.get(elementox).getQuemSegue());
                                        stringauxiliar2 = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar2)) {
                                    System.out.print("login errado");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                }
                            }
                            break;
                            case 8: {
                                //  Opção de voltar ao menu anterior
                                auxiliarmenu = 8;
                            }
                            break;
                        }
                    } while (auxiliarmenu != 8);
                }
                break;

                case 3: {
                    //  Menu das mensagens 
                    do {
                        i = 0;
                        while (i < 100) {
                            System.out.println("\n");
                            i++;
                        }
                        i = 0;
                        System.out.println("      _");
                        System.out.println("     ('>");
                        System.out.println("     /))@@@@@.      Rede");
                        System.out.println("    /@\"@@@@@()@        Social");
                        System.out.println("   .@@()@@()@@@@        do Passarinho");
                        System.out.println("   @@@O@@@@()@@@        Cinza");
                        System.out.println("   @()@@\\@@@()@@");
                        System.out.println("    @()@||@@@@@'");
                        System.out.println("     '@@||@@@'");
                        System.out.println("        ||                     Mensagens");
                        System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("1) Registra mensagem");
                        System.out.println("2) Comentar mensagem");
                        System.out.println("3) Ver mensagens");
                        System.out.println("8) Retornar");
                        System.out.print("Escolha: ");
                        auxiliarmenu = in.nextInt();
                        String stringauxiliar;
                        int elementox = 0;
                        switch (auxiliarmenu) {
                            case 1: {
                                //  Opção de registrar uma mensagem
                                
                                System.out.print("Login: ");
                                stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        elementox = i;
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("login errado");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                } else {
                                    System.out.print("\nDigite a mensagem: ");
                                    String mensagem = in.nextLine();
                                    mensagem = in.nextLine();

                                    if (mensagem.length() > 140) {
                                        System.out.println("Erro: o texto precisa ter até 140 caracteres");
                                    } else {
                                        Usuarios.get(elementox).adicionarMensagem(stringauxiliar, mensagem);
                                    }
                                }
                            }
                            break;
                            case 2: {
                                //  Opção de comentar uma mensagem
                                
                                System.out.print("Login do usuário A: ");
                                stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        System.out.println("Mensagens do usuário A");
                                        Usuarios.get(i).listarMensagens(0);
                                        System.out.print("Qual o número da mensagem que deseja comentar? ");
                                        int numeromensagem = (in.nextInt()) - 1;
                                        System.out.print("Login do usuário B: ");
                                        String stringauxiliar2 = in.next();

                                        for (int j = 0; j < (Usuarios.size()); j++) {
                                            if (stringauxiliar2.equals(Usuarios.get(j).getLogin())) {
                                                int usuarioB = j;

                                                for (int k = 0; k < (Usuarios.get(usuarioB).getQuemSegue().size()); k++) {
                                                    if (stringauxiliar.equals(Usuarios.get(usuarioB).getQuemSegue().get(k).getLogin())) {

                                                        if (numeromensagem >= 0 && numeromensagem <= Usuarios.get(usuarioB).getQuemSegue().get(k).getMensagens().size()) {
                                                            System.out.print("\nDigite o comentário: ");
                                                            String mensagem = in.nextLine();
                                                            mensagem = in.nextLine();

                                                            if (mensagem.length() > 140) {
                                                                System.out.println("Erro: o texto precisa ter até 140 caracteres");
                                                            } else {

                                                                System.out.print("Digite o minuto atual: ");
                                                                int min = in.nextInt();
                                                                System.out.print("Digite a hora atual: ");
                                                                int hora = in.nextInt();
                                                                System.out.print("Digite o dia: ");
                                                                int dia = in.nextInt();
                                                                System.out.print("Digite o mes: ");
                                                                int mes = in.nextInt();
                                                                System.out.print("Digite o ano: ");
                                                                int ano = in.nextInt();
                                                                Usuarios.get(usuarioB).getQuemSegue().get(k).getMensagens().get(numeromensagem).adicionarComentario(stringauxiliar2, mensagem, min, hora, dia, mes, ano);
                                                                Usuarios.get(usuarioB).adicionarComentario(stringauxiliar2, mensagem, min, hora, dia, mes, ano);
                                                            }
                                                        } else {
                                                            System.out.print("erro no código");
                                                            System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                                            in.nextLine();
                                                            in.nextLine();
                                                        }

                                                        stringauxiliar = "login";
                                                        break;
                                                    }
                                                }
                                                if (!"login".equals(stringauxiliar)) {
                                                    System.out.print("login errado");
                                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                                    in.nextLine();
                                                    in.nextLine();
                                                }
                                                stringauxiliar = "login";
                                                break;
                                            }
                                        }
                                        if (!"login".equals(stringauxiliar)) {
                                            System.out.print("login errado");
                                            System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                            in.nextLine();
                                            in.nextLine();
                                        }
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("login errado");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                }
                            }
                            break;

                            case 3: {
                                //  Opção de ver mensagens
                                
                                System.out.print("Login do usuário A: ");
                                stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        elementox = i;
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("login errado");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                } else {
                                    System.out.println("Mensagens do usuário A");
                                    int numeromensagem = Usuarios.get(elementox).listarMensagens(0);
                                    numeromensagem--;

                                    System.out.println("\nMensagens dos amigos do usuário A");
                                    for (i = 0; i < (Usuarios.get(elementox).getQuemSegue().size()); i++) {
                                        System.out.println("\n\nMensagens de " + Usuarios.get(elementox).getQuemSegue().get(i).getLogin());
                                        Usuarios.get(elementox).getQuemSegue().get(i).listarMensagens(numeromensagem);
                                        numeromensagem--;
                                    }
                                    System.out.print("Digite 'sim' se quiser ver comentários: ");
                                    String aux = in.nextLine();
                                    aux = in.nextLine();
                                    if ("sim".equals(aux)) {
                                        System.out.print("Qual o número da mensagem? ");
                                        int cod_da_mensagem = (in.nextInt());
                                        
                                        int contador = 0;
                                        if (cod_da_mensagem <= (Usuarios.get(elementox).getMensagens().size()) && cod_da_mensagem > 0) {
                                            Usuarios.get(elementox).getMensagens().get(cod_da_mensagem - 1).imprimirComentarios();
                                        } else {
                                            contador = Usuarios.get(elementox).getMensagens().size();
                                            for (i = 0; i < (Usuarios.get(elementox).getQuemSegue().size()); i++) {
                                                for (int j = 0; j < (Usuarios.get(elementox).getQuemSegue().get(i).getMensagens().size()); j++) {
                                                    contador = contador + (j + 1);
                                                    if (contador == cod_da_mensagem) {
                                                        Usuarios.get(elementox).getQuemSegue().get(i).getMensagens().get(j).imprimirComentarios();
                                                        contador = -1;
                                                        break;
                                                    }
                                                }
                                                if (contador == -1 ){
                                                    break;
                                                }
                                            }
                                        }
                                        if (contador != -1){
                                            System.out.print("erro no codigo");
                                        }
                                    }
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                }
                            }
                            break;
                            case 8: {
                                //  Retornar ao menu anterior
                                auxiliarmenu = 8;
                            }
                            break;
                            default:
                                System.out.println("Escolha incorreta");
                                System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                in.nextLine();
                                in.nextLine();
                        }
                    } while (auxiliarmenu != 8);
                }
                break;
                case 4: {
                    //  Menu dos seguidores
                    do {
                        i = 0;
                        while (i < 100) {
                            System.out.println("\n");
                            i++;
                        }
                        i = 0;
                        System.out.println("      _");
                        System.out.println("     ('>");
                        System.out.println("     /))@@@@@.      Rede");
                        System.out.println("    /@\"@@@@@()@        Social");
                        System.out.println("   .@@()@@()@@@@        do Passarinho");
                        System.out.println("   @@@O@@@@()@@@        Cinza");
                        System.out.println("   @()@@\\@@@()@@");
                        System.out.println("    @()@||@@@@@'");
                        System.out.println("     '@@||@@@'");
                        System.out.println("        ||                          Rede");
                        System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("1) Seguidores");
                        System.out.println("2) Seguidos");
                        System.out.println("3) Ver usuário mais influente");
                        System.out.println("4) Pesuisar ocorrência de assunto");
                        System.out.println("8) VOLTAR");
                        System.out.print("Escolha: ");
                        auxiliarmenu = in.nextInt();
                        String stringauxiliar;
                        int objIndex = 0;
                        switch (auxiliarmenu) {
                            case 1: {
                                //  Opções dos seguidores
                                System.out.print("\nInforme o login: ");
                                stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        objIndex = i;
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("Nenhum usuário com esse login");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                    break;
                                }

                                System.out.print("\nSeguidores: ");
                                for (i = 0; i < (Usuarios.size()); i++) {
                                    for (int j = 0; j < (Usuarios.get(i).getQuemSegue().size()); j++) {
                                        if (Usuarios.get(i).getQuemSegue().get(j) == Usuarios.get(objIndex)) {
                                            Usuarios.get(i).imprimirLoginENome();
                                        }
                                    }
                                }
                                System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                in.nextLine();
                                in.nextLine();
                            }
                            break;

                            case 2: {
                                //  Opções dos usuários seguidos por alguém 
                                System.out.print("\nInforme o login: ");
                                stringauxiliar = in.next();

                                for (i = 0; i < (Usuarios.size()); i++) {
                                    if (stringauxiliar.equals(Usuarios.get(i).getLogin())) {
                                        objIndex = i;
                                        stringauxiliar = "login";
                                        break;
                                    }
                                }
                                if (!"login".equals(stringauxiliar)) {
                                    System.out.print("Nenhum usuário com esse login");
                                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                    in.nextLine();
                                    in.nextLine();
                                    break;
                                }

                                System.out.print("Lista de usuários seguidos: ");
                                for (i = 0; i < (Usuarios.get(objIndex).getQuemSegue().size()); i++) {
                                    Usuarios.get(objIndex).getQuemSegue().get(i).imprimirLoginENome();
                                }
                                System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                in.nextLine();
                                in.nextLine();
                            }
                            break;

                            case 3: {
                                // Opção de ver o usário que tem mais seguidores 
                                List<Integer> Influentes = new ArrayList<>();

                                for (i = 1; i <= (Usuarios.size()); i++) {
                                    Influentes.add(0);
                                }

                                int aux = 0;
                                for (i = 0; i < (Usuarios.size()); i++) {
                                    for (int j = 0; j < (Usuarios.get(i).getQuemSegue().size()); j++) {
                                        for (int k = 0; k < (Usuarios.size()); k++) {
                                            if (Usuarios.get(k) == Usuarios.get(i).getQuemSegue().get(j)) {
                                                aux = Influentes.get(k);
                                                aux++;
                                                Influentes.add(k, aux);
                                                break;
                                            }
                                        }
                                    }
                                }
                                aux = Influentes.get(0);
                                for (i = 0; i < (Influentes.size()); i++) {
                                    if (Influentes.get(i) > aux) {
                                        aux = Influentes.get(i);
                                    }
                                }
                                int contador = 0;
                                for (i = 0; i < (Influentes.size()); i++) {
                                    if (Influentes.get(i) == aux) {
                                        System.out.print("" + Usuarios.get(i).getLogin());
                                        contador++;
                                    }
                                }
                                if (contador == 1) {
                                    System.out.print(" é o mais influente.");
                                } else if (contador > 1) {
                                    System.out.print(" são os mais influentes.");
                                }
                                System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                in.nextLine();
                                in.nextLine();
                            }
                            break;

                            case 4: {
                                // Procura por um terno nas mensagens
                                System.out.print("\n\tInforme o termo a ser buscado: ");
                                String termo = in.next();
                                int contador = 0;
                                for (i = 0; i < (Usuarios.size()); i++) {
                                    for (int j = 0; j < (Usuarios.get(i).getMensagens().size()); j++) {
                                        if (Usuarios.get(i).getMensagens().get(j).getStringmensagem().contains(termo)) {
                                            contador++;
                                        }

                                        for (int k = 0; k < (Usuarios.get(i).getMensagens().get(j).getComentarios().size()); k++) {
                                            if (Usuarios.get(i).getMensagens().get(j).getComentarios().get(k).getStringmensagem().contains(termo)) {
                                                contador++;
                                            }
                                        }
                                    }
                                }
                                System.out.println("\tA palavra " + termo + " aparece " + contador + " vezes");
                                System.out.print("\n\nPressione qualquer tecla para continuar... ");
                                in.nextLine();
                                in.nextLine();
                            }
                            break;

                            case 8: {
                                auxiliarmenu = 8;
                            }
                            break;
                        }
                    } while (auxiliarmenu != 8);
                }
                break;

                case 5: {
                    //  Mostrar o usuário mais ativo (função extra)
                    List<Integer> Ativos = new ArrayList<>();
                    for (i = 0; i < (Usuarios.size()); i++) {
                        Ativos.add(i, Usuarios.get(i).getComentarios().size());
                    }
                    int nmax = Ativos.get(0);
                    for (i = 0; i < (Ativos.size()); i++) {
                        if (Ativos.get(i) > nmax) {
                            nmax = Ativos.get(i);
                        }
                    }
                    int contador = 0;
                    for (i = 0; i < (Ativos.size()); i++) {
                        if (Ativos.get(i) == nmax) {
                            System.out.print("" + Usuarios.get(i).getLogin() + " ");
                            contador++;
                        }
                    }
                    if (contador == 1) {
                        System.out.print("é o usuário que mais comenta.");
                    } else if (contador > 1) {
                        System.out.print("são os usuários que mais comentam.");
                    }
                    System.out.print("\n\nPressione qualquer tecla para continuar... ");
                    in.nextLine();
                    in.nextLine();

                }
                break;

                case 9: {
                    System.exit(0);
                }
                break;
            }
        } while (true);
    }
}
