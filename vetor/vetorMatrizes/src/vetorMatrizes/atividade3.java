package vetorMatrizes;

import java.util.Scanner;

public class atividade3 {
	//apenas exibir o vetor intercalado
	public static void exibir(int[]x) {
		
		for(int i=0;i< x.length;i++) {
			System.out.print(" "+x[i]);			
		}
		System.out.println();
	}
	
	//recebendo e preenchendo novo vetor com posições imapares e pares da forma correta
	public static void recebe(int[]x, int[]y) {
		Scanner interno = new Scanner(System.in);

		//novo vetor
		int[]newVet = new int[20];
		int impar=0, par=0;
		
		
		for(int i=0; i < newVet.length;i++) {
			//colocar numeros do vetor x na posição par
			if(i%2==0) {
				newVet[i]= x[par++];
			}
			// se não colocar numeros do vetor y na posição impar

			else {
				newVet[i]=y[impar++];
			}
		}
		//exibir o vetor intercalado
		System.out.println("vetor intercalado: ");
		exibir(newVet);
	}
	public static void preencher(int []x) {
		Scanner interno = new Scanner(System.in);
		
		//preenchendo um vetor para os dois vetores

		for(int i=0;i<x.length;i++) {
			
			System.out.println("Digite um numero: ");
			x[i]=interno.nextInt();					
			}					
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//declarando as variaveis
		int []x = new int[10];
		int []y = new int[10];

		
		//chamando os procedimentos
		System.out.println("preencha valor de x");
		preencher(x);
		System.out.println("preencha o valor de y");
		preencher(y);
		
		recebe(x,y);
		
		System.out.println("vetor x: ");
		exibir(x);
		
		System.out.println("vetor y: ");
		exibir(y);

		ent.close();
		
	}

}
