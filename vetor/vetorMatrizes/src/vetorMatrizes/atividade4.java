package vetorMatrizes;

import java.util.Scanner;

public class atividade4 {
	public static int tudo(int [][]matriz) {
		int soma = 0;
		
		//somar todos os numeros da matriz
	    for (int i =0;i<matriz.length; i++) {
		    for (int c =0;c<matriz[0].length; c++) {
		    	
		    	//soma desses numeros
	    	soma+= matriz[i][c];
	    }
	    }
	  	return soma;

	}
	//somar numero da diagonal Secundaria
	public static int diagonalSec(int [][]matriz) {
		int soma = 0;	
		//o total da matriz menos um
		int pos = matriz.length-1;
		
	    for (int i =0;i<matriz.length; i++) {
	    	//somar diminuindo a posi??o
			soma += matriz[i][pos];
			pos--;
			
		    }
	    
	    	return(soma);
	}
		//somar numeros da diagonal
	public static int diagonal(int [][]matriz) {
		int soma=0;
	    for (int i =0;i<matriz.length; i++) {
	    	//somando 
			soma += matriz[i][i];

	    }
	    return soma;
	}
	//somar coluna 2
	public static int calc(int [][]matriz) {
		int soma=0;
		for(int i=0; i<matriz.length; i++) {
			//somando a coluna
			soma += matriz[i][1];

		}
		return soma;

	}
	//somar numeros da linha 4
	public static int  calcula(int [][]matriz){
		int soma=0;
		
		for(int i=0; i<matriz.length; i++) {
			//somado a linha
			soma += matriz[3][i];
			
		}
		
		return soma;

	}
	//preencher a matriz
	public static void preencher(int[][]m) {
		Scanner interno = new Scanner(System.in);

		//preencher linha
		for(int i=0;i<m.length; i++) {
			//preencher coluna
			for(int b=0; b<m[0].length;b++) {
				//pedir para digitar os numeros
		    	System.out.println("digite os numeros");
		    	m[i][b]= interno.nextInt();
			}
		}		
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int[][]m = new int [5][5];
		
		
		//receber no main e imprimir as fun??es e procedimentos
		preencher(m);
		System.out.println("soma da coluna 4: "+calcula(m));
		System.out.println("soma da coluna 2: " + calc(m));
		System.out.println("soma da diagonal: " + diagonal(m));
		System.out.println("soma da diagonal invertida: "+diagonalSec(m));
		System.out.println("soma de tudo: "+tudo(m));

		
		ent.close();
	
	}
}
