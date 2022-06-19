package vetorMatrizes;

import java.util.Scanner;

public class atividade5 {
	//diferença entre as duas matrizes criando uma nova D
	public static int[] []matrizD(int [][]a, int [][]b) {
		//nova matriz
		int [][]d = new int [4][6];
		
		//linha e coluna
		for(int i=0; i< d.length; i++) {
			for(int c=0; c< d[i].length; c++) {
		
				//subtrção entre as matrizes
				d[i][c]= a[i][c]-b[i][c];	
				System.out.print(d[i][c]+" ");
			}
			System.out.println();
		}
		return d;
	}
	//soma das duas matrizes criando uma nova S
	public static int[] []matrizS(int [][]a, int [][]b) {
		//nova matriz
		int [][]s = new int [4][6];
		
		//linha e coluna
		for(int i=0; i< s.length; i++) {
			for(int c=0; c< s[i].length; c++) {
		//somei 
				s[i][c]= a[i][c]+b[i][c];	
				System.out.print(s[i][c]+" ");
			}
			System.out.println();
		}
		return s;
	}
	
	//preencher as matrizes
	public static void preencher(int [][]a, int [][]b) {
		Scanner interno = new Scanner (System.in);
		
		//preenchi a matriz a
		for(int i=0; i< a.length; i++) {
			for(int c=0; c < a[i].length; c++) {				
				System.out.println("Digite um numero");
				a[i][c]=interno.nextInt();									
			}
		}
		//preenchi a matriz b
		for(int i=0; i< b.length; i++) {
			for(int c=0; c< b[i].length; c++) {
			
			System.out.println("Digite um numero");
			b[i][c]=interno.nextInt();	
			}
		}
	}
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//declarar as variaveis
		
		int[][] a = new int [4][6];
		int[][] b = new int [4][6];

		//receber as funções e procedimentos
		preencher(a,b);
		System.out.println("matriz s "+matrizS(a,b));
		System.out.println("matriz s "+matrizD(a,b));

	}

}
