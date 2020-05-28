/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.Scanner;
package principal;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Professor {
    private int codigo = 0;
    private String nome;
    private char titulacao;
    
    private double qthoraslec;
    
    
    //Setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTitulacao(char titulacao) {
        this.titulacao = titulacao;
    }

    public void setQthoraslec(double qthoraslec) {
        this.qthoraslec = qthoraslec;
    }
    
    //
    
    public Professor(int codigo){
        Scanner teclado = new Scanner(System.in);
        
        this.codigo = codigo;
        System.out.println("CÓDIGO DO PROFESSOR: " + (this.codigo));
        
        System.out.print("Informe o nome do Professor: ");
        this.nome = teclado.nextLine();
        System.out.print("Informe a titulação do professor: ");
        this.titulacao = teclado.next().charAt(0);
        System.out.print("Informe o número de horas semanais que o professor leciona: ");
        this.qthoraslec = teclado.nextDouble();
    }
    
    // Getters

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
    
    //
    
    public void imprimeDados(){
        System.out.println("Dados do professor:");
        System.out.println("\tNome: " + this.nome);
        System.out.println("\tTitulação: " + this.titulacao);
        System.out.println("\tQuantidade de horas lecionadas no mês: " + this.qthoraslec);
    }
    
    public void imprimeFolhadePagamento(){
        if (this.titulacao == 'e' || this.titulacao == 'E'){
            System.out.println("FOLHA DE PAGAMENTO - PROFESSOR " + this.nome);
            //double salario_bruto = this.qthoraslec*4.5*20.4;
            double k = 20.4;
            System.out.printf("Salário Bruto: %.2f \n", (this.qthoraslec*4.5*k));
            System.out.printf("INSS descontado: %.2f \n", ((this.qthoraslec*4.5*k)*0.085));
            System.out.printf("IR descontado: %.2f \n", (((this.qthoraslec*4.5*k)*0.15)-((this.qthoraslec*4.5*k)*0.085)));
            System.out.printf("Salário líquido: %.2f \n", ((this.qthoraslec*4.5*k)-((this.qthoraslec*4.5*k)*0.085)-(((this.qthoraslec*4.5*k)*0.15)-((this.qthoraslec*4.5*k)*0.085))));
        }
        else if (this.titulacao == 'm' || this.titulacao == 'M'){
            System.out.println("FOLHA DE PAGAMENTO - PROFESSOR " + this.nome);
            double k = 31.2;
            System.out.printf("Salário Bruto: %.2f \n", (this.qthoraslec*4.5*k));
            System.out.printf("INSS descontado: %.2f \n", ((this.qthoraslec*4.5*k)*0.085));
            System.out.printf("IR descontado: %.2f \n", (((this.qthoraslec*4.5*k)*0.15)-((this.qthoraslec*4.5*k)*0.085)));
            System.out.printf("Salário líquido: %.2f \n", ((this.qthoraslec*4.5*k)-((this.qthoraslec*4.5*k)*0.085)-(((this.qthoraslec*4.5*k)*0.15)-((this.qthoraslec*4.5*k)*0.085))));
        }
        else if (this.titulacao == 'd' || this.titulacao == 'D'){
            System.out.println("FOLHA DE PAGAMENTO - PROFESSOR " + this.nome);
            double k = 42.8;
            System.out.printf("Salário Bruto: %.2f \n", (this.qthoraslec*4.5*k));
            System.out.printf("INSS descontado: %.2f \n", ((this.qthoraslec*4.5*k)*0.085));
            System.out.printf("IR descontado: %.2f \n", (((this.qthoraslec*4.5*k)*0.15)-((this.qthoraslec*4.5*k)*0.085)));
            System.out.printf("Salário líquido: %.2f \n", ((this.qthoraslec*4.5*k)-((this.qthoraslec*4.5*k)*0.085)-(((this.qthoraslec*4.5*k)*0.15)-((this.qthoraslec*4.5*k)*0.085))));
        }
        else
            System.out.println("ERRO NA ESPECIFICAÇÃO DA TITULAÇÃO!");
    }
    
}
