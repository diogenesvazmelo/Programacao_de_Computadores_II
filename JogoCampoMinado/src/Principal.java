import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.print("\n** MENU **");
            System.out.print("\n\n -1: Jogar");
            System.out.print("\n -2: Sair");
            System.out.print("\n Escolha: ");
            
            int aux = 0;
            aux = teclado.nextInt();
            
            switch (aux){
                case 1: {
                    //do{
                        int verif = 1;
                        do{
                            System.out.print("\nQual o tamanho do mapa? Informe a quntidade de linhas e colunas (máx.: 5x5): ");
                            int linhas = teclado.nextInt();
                            int colunas = teclado.nextInt();
                            
                            if (linhas>5 || colunas>5 || linhas<0 || colunas<0){
                                System.out.println("Entrada Inválida!");
                                //verif = 0;
                                break;
                            }
                            
                            CampoMinado m1 = new CampoMinado(linhas,colunas);
                            m1.imprimeMapa();
                            System.out.println("\n\n");
                            
                            do{
                                System.out.println("Quantas bombas deseja colocar no mapa? (máx. " + ((linhas*colunas)-1) + "):");
                                int bombas = teclado.nextInt();
                                
                                if (bombas<=0 || bombas>((linhas*colunas)-1)){
                                    System.out.println("Entrada Inválida!");
                                    verif = 0;
                                    break;
                                }
                                
                                m1.preencheComBombas(bombas);
                            } while (verif == 0);
                            
                            do{
                                System.out.print("\nEscolha uma posição (linha e coluna): ");
                                int l = teclado.nextInt();
                                int c = teclado.nextInt();
                                
                                m1.resolveMapa(l-1,c-1);
                                verif = m1.getVerif();
                                if (verif == 0)
                                    m1.imprimeMapa2();
                            } while (verif == 0);
                            
                        } while (verif == 0);
        
                    //} while(true);
                    
                } break;
                case 2: System.exit(0);
                default: System.out.println("Entrada inválida!"); break;
            }
        } while (true);
            
    }
    
}
