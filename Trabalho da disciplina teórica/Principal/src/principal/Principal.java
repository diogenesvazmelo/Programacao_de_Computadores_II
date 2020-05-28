/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        
        System.out.println("\t PROGRAMA DE CONTROLE DE PAGAMENTOS DOS PROFESSORES");
        System.out.println("\n\t1- Primeiramente, inclua um professor");
        
        Professor[] novoProfessor = new Professor[10];
        System.out.println("\n");
        Professor p1 = new Professor(i+1);
        novoProfessor[i] = p1;
        i++;
        
        do{
            int verif=0;
            System.out.println("\t PROGRAMA DE CONTROLE DE PAGAMENTOS DOS PROFESSORES");
            System.out.println("\n\t   Opções:");
            System.out.println("\n\t1- Incluir novo Professor");
            System.out.println("\t2- Pesquisar dados de um Professor");
            System.out.println("\t3- Alterar dados de um Professor");
            System.out.println("\t4- Excluir Professor");
            System.out.println("\t5- Imprimir folha de pagamento");
            System.out.println("\n\t6- SAIR do Programa");
            
            Scanner teclado = new Scanner(System.in);
            
            System.out.print("\n\t   Selecionar opção: ");
            verif = teclado.nextInt();
            
            //Professor[] novoProfessor = new Professor[10];
            
            
            switch (verif){
                case 1:  {
                    //while (i<novoProfessor.length){

                    /*
                    ContaCorrente contaNova = new ContaCorrente();
                    contaNova.deposita(1000.0);
                    minhasContas[0] = contaNova;
                    */
                    System.out.println("\n");
                    Professor p2 = new Professor(i+1);
                    novoProfessor[i] = p2;
                    i++;
                }
                break;
                
                case 2: {
                    System.out.println("Lista de professores: ");
                    for (int cont=0; cont<i; cont++){
                        System.out.println("Código: " + novoProfessor[cont].getCodigo() + "  " + novoProfessor[cont].getNome());
                    }
                    System.out.print("\n\nInforme o código do professor para ver seus dados: ");
                    verif = teclado.nextInt();
                    
                    if (verif >= 1 && (verif-1) <= i)
                        novoProfessor[(verif)-1].imprimeDados();
                    else
                        System.out.println("Código inválido!!");
                    
                }break;
                
                case 3: {
                    System.out.println("Lista de professores: ");
                    for (int cont=0; cont<i; cont++){
                        System.out.println("Código: " + novoProfessor[cont].getCodigo() + "  " + novoProfessor[cont].getNome());
                    }
                    System.out.print("\n\nInforme o código do professor para alterar seus dados: ");
                    verif = teclado.nextInt();
                    if (verif >= 1 && (verif-1) <= i){
                        System.out.println("\n\t   Opções:");
                        System.out.println("\t1- Alterar nome");
                        System.out.println("\t2- Alterar titulação");
                        System.out.println("\t3- Alterar o número de horas mensais que o professor leciona");
                        System.out.println("\t4- VOLTAR");
                        System.out.print("\n\t   Selecionar opção: ");
                        int verif2 = teclado.nextInt();
                        switch (verif2){
                            case 1:{
                                System.out.print("Informe o novo nome: ");
                                teclado.nextLine();
                                String a;
                                a = teclado.nextLine();
                                novoProfessor[(verif)-1].setNome(a);
                            }break;
                            case 2:{
                                System.out.print("Informe a nova titulação: ");
                                teclado.nextLine();
                                novoProfessor[(verif)-1].setTitulacao(teclado.next().charAt(0));
                            }break;
                            case 3:{
                                System.out.print("Informe o novo numero de horas mensais: ");
                                novoProfessor[(verif)-1].setQthoraslec(teclado.nextDouble());
                            }break;
                            case 4: break;
                            default:{
                                System.out.println("Seleção inválida!!");
                            }
                        }
                        
                    }  
                    else
                        System.out.println("Código inválido!!");
                }break;
                
                case 4: {
                    System.out.println("Lista de professores: ");
                    for (int cont=0; cont<i; cont++){
                        System.out.println("Código: " + novoProfessor[cont].getCodigo() + "  " + novoProfessor[cont].getNome());
                    }
                    System.out.print("\n\nInforme o código do professor que deseja excluir do sistema: ");
                    verif = teclado.nextInt();
                    
                    if (verif >= 1 && (verif-1) <= i){
                        novoProfessor[(verif)-1] = null;
                        i--;
                    }
                    else
                        System.out.println("Código inválido!!");
                    
                }break;
                
                case 5: {
                    System.out.println("Lista de professores: ");
                    for (int cont=0; cont<i; cont++){
                        System.out.println("Código: " + novoProfessor[cont].getCodigo() + "  " + novoProfessor[cont].getNome());
                    }
                    System.out.print("\n\nInforme o código do professor que deseja imprimir a folha de pagamento: ");
                    verif = teclado.nextInt();
                    
                    novoProfessor[verif-1].imprimeFolhadePagamento();
                    
                    
                }break;
                
                case 6: {
                    System.exit(0);
                }break;
              
                default: System.out.println("Opção Inválida!");
            }
        }while(true); 
    }
    
}
