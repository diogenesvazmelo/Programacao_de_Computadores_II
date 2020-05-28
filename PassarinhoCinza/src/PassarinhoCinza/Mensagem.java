package PassarinhoCinza;

import java.util.ArrayList;

public class Mensagem {

    private String stringmensagem, autor;
    private int min, hora, dia, mes, ano;
    private ArrayList<Mensagem> Comentarios = new ArrayList<>();

    public Mensagem(String autor, String mensagem, int min, int hora, int dia, int mes, int ano) {
        this.autor = autor;
        this.stringmensagem = mensagem;
        this.min = min;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getStringmensagem() {
        return stringmensagem;
    }

    public void adicionarComentario(String autor, String texto, int min, int hora, int dia, int mes, int ano) {
        Mensagem m1 = new Mensagem(autor, texto, min, hora, dia, mes, ano);
        this.Comentarios.add(m1);
    }

    public int imprimirComentarios() {
        int i;
        for (i = 0; i < Comentarios.size(); i++) {
            System.out.println("\n");
            System.out.println("Comentário número " + (i + 1));
            System.out.println("* " + this.Comentarios.get(i).getStringmensagem() + "\n");
        }
        return (i + 1);
    }

    public ArrayList<Mensagem> getComentarios() {
        return Comentarios;
    }

    public String getAutor() {
        return autor;
    }

    public void setStringmensagem(String stringmensagem) {
        this.stringmensagem = stringmensagem;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
