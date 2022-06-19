package vetorMatrizes;

import java.util.Scanner;

public class atividade2 {
	
		public static void exibe(int []vetor) {
			//exibir os vetores
			for(int i=0;i <vetor.length; i++) {
				
				System.out.print(" "+vetor[i]);
			}
			//quebra de linha
		System.out.println();	
		}
	
		//função recebendo vetor e criando um novo com os numeros negativos
	public static int [] negativos(int[] num) {
		int neg=0;
		Scanner interno = new Scanner(System.in);
		
		for(int i=0; i < num.length; i++) {
				
			//somar um quando tiver algum numero negativo
			if(num[i]<0) {
				neg++;
			}
		}
			
		int posNeg = 0;
		int []negat =new int[neg];
		
			
		for(int i=0; i < num.length; i++) {			
			//preencher o vetor negativo
			if(num[i]<0) {
				negat[posNeg]= num[i];
				posNeg++;
			}
		}
						
			return negat;	
	}
				
	//procedimento preenchendo o vetor
	public static void preencher(int [] total) {
		Scanner interno = new Scanner(System.in);
		
		//preenchendo
		for(int i=0; i < total.length; i++) {			
			
			System.out.println("digite algum numero: ");
			total[i]= interno.nextInt();						
		}		
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int [] x= new int[10];
	
		//chamar os procedimentos e a função
		preencher(x);
		System.out.println("O vetor inteiro é: ");
		exibe(x);
		System.out.println("O vetor negativo é: ");
		exibe(negativos(x));
	}

}
