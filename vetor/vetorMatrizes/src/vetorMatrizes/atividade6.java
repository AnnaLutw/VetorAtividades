package vetorMatrizes;

import java.util.Scanner;

public class atividade6 {
	
	private static int tamanhoMatrix = 10;
	
	//trocar linha 5 com 10
	public static void troca4(int [][]m){
		//nova matriz p salvar a linha 5
		int [][] linha5 = new int [tamanhoMatrix][1];
		//nova matriz p salvar a coluna 10
		int [][] coluna10 = new int [tamanhoMatrix][1];
			
		//salvar o valor da linha 5 dentro da varialvel 
		for(int i=0; i< m.length; i++) {
			linha5[i][0] = m[4][i];										
		}	
		//salvar o valor da da coluna 10 da varialvel 
		for(int i=0; i< m.length; i++) {
			coluna10[i][0] = m[i][9];	
			
			//trocar a coluna salva na variavel pela linha
		}			
		for(int  i=0; i< m.length; i++) {			
		    m[i][9]= linha5[i][0];
			//trocar a linha salva na variavel pela coluna

		}
		for(int i=0; i< m.length; i++) {
			m[4][i]= coluna10[i][0];
		}	
		
		//printar a matriz trocada
		System.out.println("a linha 5 com a coluna 10. ");

		for(int i=0; i< m.length; i++) {
			for( int c=0; c< m.length; c++) {
				System.out.print(m[i][c]);
			}
			System.out.println();
		}		
	}
	
	//trocar diagonal principal com secundaria
	
	public static void troca3(int [][]m){
		//nova matriz p salvar os valores das diagonais
	int [][] novo = new int [tamanhoMatrix][1];
			
	//salvar o valor da diagonal principal dentro da varialvel 

		for(int i=0; i< m.length; i++) {
			novo[i][0] = m[i][i];										
		}	
		//salvar o valor da diagonal secundaria dentro da varialvel 

		for(int  i=0; i< m.length; i++) {			
		    m[i][i]= m[i][(m.length-1)-i];
		}
		//trocar uma diagonal pela outra

		for(int i=0; i< m.length; i++) {
			m[i][(m.length-1)-i]= novo[i][0];
		}	
		
		//printar a matriz trocada
		System.out.println("a diagonal principal com a diagonal secundária");

		for(int i=0; i< m.length; i++) {
			for( int c=0; c< m.length; c++) {
				System.out.print(m[i][c]);
			}
			System.out.println();
		}		
	}
	//trocar coluna 4 com 10
	public static void troca2(int [][]m){
		//nova matriz p salvar as colunas

	int [][] novo = new int [tamanhoMatrix][1];
	//salvar o valor da coluna 4 dentro da varialvel 

		for(int i=0; i< m.length; i++) {
			novo[i][0] = m[i][3];										
		}	
	//salvar o valor da coluna 10 dentro da varialvel 

		for(int  i=0; i< m.length; i++) {			
		    m[i][3]= m[i][9];
		}
		
		for(int i=0; i< m.length; i++) {
			m[i][9]= novo[i][0];
		}	
		//printar a matriz trocada
		
		System.out.println("MATRIZ TROCANDO 4->10");

		for(int i=0; i< m.length; i++) {
			for( int c=0; c< m.length; c++) {
				System.out.print(m[i][c]);
			}
			System.out.println();
		}		
	}
	//trocando linha 2 pela 8 
	public static void troca1 (int [][]m) {
		int i = 0;
		//nova matriz com essa linha trocada
		int [][] novo = new int[1][tamanhoMatrix];

		//trocando
		for( i=0; i< m.length; i++) {

			novo[0][i] = m[1][i];										
		}	
		for( i=0; i< m.length; i++) {			
			m[1][i]= m[7][i];
		}
		//trocando linha 8 pela 2
		for( i=0; i< m.length; i++) {

			m[7][i]= novo[0][i];
		}
		System.out.println("MATRIZ TROCANDO 2->8");
		for( i=0; i< m.length; i++) {
			for( int c=0; c< m[0].length; c++) {

				System.out.print(m[i][c]);
			}
			System.out.println();
		}	
		System.out.println();

	}
	//preenchendo a matriz
	public static void preencher (int [][]m) {
		Scanner interno = new Scanner(System.in);
		int i = 0,c = 0;

		//pedindo os numeros
		for( i=0; i< m.length; i++) {
			for( c=0; c< m[0].length; c++) {

				System.out.println("Digite um numero");
				m[i][c]=interno.nextInt();			
			}			
		}
		//exibindo a matriz
		System.out.println("MATRIZ ");

		for( i=0; i< m.length; i++) {
			for( c=0; c< m[0].length; c++) {

				System.out.print(m[i][c]);
			}
			System.out.println();
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//declarando matriz
		int [][]m = new int [tamanhoMatrix][tamanhoMatrix];

		//passando os procedimentos	
		preencher(m);
		troca1(m);
		
		preencher(m);
		troca2(m);
		preencher(m);
		troca3(m);
		preencher(m);
		troca4(m);		
	}

}
