//import java.io.PrintStream;
import java.util.Random;

public class CampoMinado {
    private char mapa[][];
    private int m, n, qtbombas, verif=0;
    //private int solucao[][];
    
    public CampoMinado(int mw, int nw){
        //qtbombas = qtbomba;
        m = mw;
        n = nw;
        
        mapa = new char[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                mapa[i][j] = '.';
            }
        } 
    }
    
    public void preencheComBombas(int qtbombas){
        Random random = new Random();
        
        int i=0;
        while (i<qtbombas){
            int a = random.nextInt(m);
            int b = random.nextInt(n);
            
            if (mapa[a][b] != '*'){
                mapa[a][b] = '*';
                i++;
            } 
        }
    }
    
    public void imprimeMapa(){
      /*  for (char a[] : mapa){
            System.out.print("\n");
            for (char b : a){
                PrintStream printf = System.out.printf("%c",mapa[m-1][n-1]);
                System.out.print("\t");
            }
        }*/
      
      /*
        for(int a=0; a<m; a++){
            
            System.out.print("\n");
            
            for(int b=0; b<n; b++){
                System.out.print(mapa[a][b]);
                System.out.print("\t");
            }
        }
        */
        
        for (int i=-1; i<m; ++i){
            if (i==-1)
                System.out.printf("      ");
            
            else{
            if (i<=8)
                System.out.printf(" L-%d  |", i+1);
            else
                System.out.printf(" L-%d |", i+1);
            }
            for (int j=0; j<n; ++j){
                if (i==-1){
                    System.out.printf("\tC-%d", j+1);
                }
                else{
                    System.out.printf("\t");
                    System.out.print(mapa[i][j]);
                }
            }
            if (i!=-1)
            System.out.printf("\t|");
            System.out.printf("\n");
        }
        System.out.printf("\n");  
    }
    
    public void imprimeSolucao(){
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (mapa[i][j]!='*'){
                    int soma=0;
                    
                    if (j-1>=0 && mapa[i][j-1]=='*')
                        soma++;
                    
                    if (j+1<n && mapa[i][j+1]=='*')
                        soma++;
                    
                    if (i-1>=0 && mapa[i-1][j]=='*')
                        soma++;
                    
                    if (i+1<m && mapa[i+1][j]=='*')
                        soma++;
                    
                    
                    
                    if (i-1>=0 && j-1>=0 && mapa[i-1][j-1]=='*')
                        soma++;
                    
                    if (i-1>=0 && j+1<n && mapa[i-1][j+1]=='*')
                        soma++;
                    
                    if (j-1>=0 && i+1<m && mapa[i+1][j-1]=='*')
                        soma++;
                    
                    if (i+1<m && j+1<n && mapa[i+1][j+1]=='*')
                        soma++;
                    
                    
                    if (soma==0)
                        mapa[i][j] = 48;
                    else if (soma==1)
                        mapa[i][j] = 49;
                    else if (soma==2)
                        mapa[i][j] = 50;
                    else if (soma==3)
                        mapa[i][j] = 51;
                    else if (soma==4)
                        mapa[i][j] = 52;
                    else if (soma==5)
                        mapa[i][j] = 53;
                    else if (soma==6)
                        mapa[i][j] = 54;
                    else if (soma==7)
                        mapa[i][j] = 55;
                    else if (soma==8)
                        mapa[i][j] = 56;
                    else 
                        mapa[i][j] = 'E';
                        
                }
            }
        }  
    }
    
    public void resolveMapa(int i, int j){
        if (mapa[i][j]!='*'){
            int soma=0;
                    
            if (j-1>=0 && mapa[i][j-1]=='*')
                soma++;
                    
            if (j+1<n && mapa[i][j+1]=='*')
                soma++;
                    
            if (i-1>=0 && mapa[i-1][j]=='*')
                soma++;
                    
            if (i+1<m && mapa[i+1][j]=='*')
                soma++;
                    
                    
                    
            if (i-1>=0 && j-1>=0 && mapa[i-1][j-1]=='*')
                soma++;
                    
            if (i-1>=0 && j+1<n && mapa[i-1][j+1]=='*')
                soma++;
                    
            if (j-1>=0 && i+1<m && mapa[i+1][j-1]=='*')
                soma++;
                    
            if (i+1<m && j+1<n && mapa[i+1][j+1]=='*')
                soma++;
                    
                    
            if (soma==0)
                mapa[i][j] = 48;
            else if (soma==1)
                mapa[i][j] = 49;
            else if (soma==2)
                mapa[i][j] = 50;
            else if (soma==3)
                mapa[i][j] = 51;
            else if (soma==4)
                mapa[i][j] = 52;
            else if (soma==5)
                mapa[i][j] = 53;
            else if (soma==6)
                mapa[i][j] = 54;
            else if (soma==7)
                mapa[i][j] = 55;
            else if (soma==8)
                mapa[i][j] = 56;
            else 
                mapa[i][j] = 'E';
        }
        else{
            System.out.print("\nVocê errou!\n");
            imprimeSolucao();
            imprimeMapa();
            verif = 1;
        }
    }
    
    public void imprimeMapa2(){
        for (int i=-1; i<m; ++i){
            if (i==-1)
                System.out.printf("      ");
            
            else{
            if (i<=8)
                System.out.printf(" L-%d  |", i+1);
            else
                System.out.printf(" L-%d |", i+1);
            }
            for (int j=0; j<n; ++j){
                if (i==-1){
                    System.out.printf("\tC-%d", j+1);
                }
                else{
                    System.out.printf("\t");
                    if (mapa[i][j]=='*')
                        System.out.print('.');
                    else
                        System.out.print(mapa[i][j]);
                }
            }
            if (i!=-1)
            System.out.printf("\t|");
            System.out.printf("\n");
        }
        System.out.printf("\n");  
    }
    
    public int getVerif(){
        return verif;
    }
  
}
