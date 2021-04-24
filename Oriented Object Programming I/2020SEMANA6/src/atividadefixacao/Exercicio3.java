package atividadefixacao;

import java.util.Scanner;

public class Exercicio3 {
	/*Crie uma matriz 3 x 3 de inteiros, e atribua os valores via leitura de dados do console. Posteriormente,
	obtenha:
	Impressão da soma dos elementos de cada linha
	Impressão do produto dos elementos de cada coluna
	Impressão dos elementos da diagonal principal da matriz.*/
	
	public static void main(String[] args) {
		
		int i, j;
        int [][] m = new int[3][3];
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Digite um número: ");
                m[i][j] = s.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
            	System.out.println(" | lin: " + i + " | col: " + j + " | Número: " + m[i][j]);
            
            }
        }
         
       //soma das linhas
        int[] soma = new int [m.length];
        somaLinhas (m, soma);
        int auxiliar = 0;
        
        for (int k = 0; k<m.length; k++) {
        	for (int l = 0; l<m.length; l++) {
        		auxiliar +=m[k][l];
        	}
        	soma[k] = auxiliar;
        	System.out.println("Soma dos Elementos da Linha ( " + k + " )da Matriz = " + soma [k]);
        	auxiliar = 0;
        }
        
    	System.out.println("\n");
        
        int[] multiplica = new int[m.length];
        multiplicaColunas (m, multiplica);
        int produto ;
        produto = 1;
    
        	for (int p = 0; p<m.length; p++) {
        		produto *= m[p][p];
        		multiplica[p] = produto;
        	
        	System.out.println("Produto dos Elementos da Coluna ( " + p + " )da Matriz = " + multiplica [p]);
        }
        	//Imprime Diagonal Principal
        	
    		int diagonal;
    	
    		for (int d =0; d<m.length; d++) {
    			for (int f =0; f<m.length; f++){
    				if ( d==f) {
    					diagonal= m[d][f];
    					
    					System.out.println("\nDIAGONAL PRINCIPAL = " + m[d][f]);
    				}
    			}
    		}	
	}
	
	private static void multiplicaColunas(int[][] m, int[] multiplica) {
		// TODO Auto-generated method stub
	}

	private static void somaLinhas(int[][] m, int[] soma) {
		// TODO Auto-generated method stub	
	}
		
	}

