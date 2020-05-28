package PassarinhoCinza;

import java.util.ArrayList;

public class Usuario {

    private String login, nome, email;
    private int dia, mes, ano;
    private ArrayList<Mensagem> Mensagens = new ArrayList<>();
    private ArrayList<Mensagem> Comentarios = new ArrayList<>();
    private ArrayList<Usuario> quemSegue = new ArrayList<>();

    public Usuario(String login, String nome, String email, int dia, int mes, int ano) {
        this.login = login;
        this.nome = nome;
        this.email = email;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimirLoginENome() {
        System.out.println("Login: " + this.login);
        System.out.println("Nome: " + this.nome);
        System.out.println("\n");
    }

    public void imprimirTudo() {
        System.out.println("Login: " + this.login);
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Dia de nascimento: " + this.dia);
        System.out.println("Mes de nascimento: " + this.mes);
        System.out.println("Ano de nascimento: " + this.ano);
        System.out.println("\n");
    }

    public int listarMensagens(int ii) {
        int i;
        for (i = ii; i < Mensagens.size(); i++) {
            System.out.println("\nMensagem numero " + (i + 1));
            System.out.println("* " + this.Mensagens.get(i).getStringmensagem() + "\n");
        }
        return (i + 1);
    }

    public String getLogin() {
        return login;
    }

    public void adicionarSeguidor(Usuario u1) {
        this.quemSegue.add(u1);
    }

    public void adicionarMensagem(String autor, String texto) {
        Mensagem m1 = new Mensagem(autor, texto, 0 , 0 , 0 , 0 ,0);
        this.Mensagens.add(m1);
    }

    public void adicionarComentario(String autor, String texto, int min, int hora, int dia, int mes, int ano) {
        Mensagem m1 = new Mensagem(autor, texto, min, hora, dia, mes, ano);
        this.Comentarios.add(m1);
    }

    public ArrayList<Usuario> getQuemSegue() {
        return quemSegue;
    }

    public void setQuemSegue(ArrayList<Usuario> quemSegue) {
        this.quemSegue = quemSegue;
    }

    public ArrayList<Mensagem> getMensagens() {
        return Mensagens;
    }

    public void setMensagens(ArrayList<Mensagem> Mensagens) {
        this.Mensagens = Mensagens;
    }

    public ArrayList<Mensagem> getComentarios() {
        return Comentarios;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
