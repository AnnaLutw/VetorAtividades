package vetorMatrizes;

import java.util.Scanner;
public class atividade1 {
	
	public static void media (int[] total) {
		
		int  soma = 0, cont = 0;		
		double media = 0,n = total.length;
		
		//somei cada nota
		for(int i =0; i < n; i++) {
			
			soma += total[i];
			
			}
		//media é total de alunos dividido pela soma das notas
		media+= soma/n;

		//somar total de alunos acima da media
		for(int b = 0; b < n; b++) {
			if(total[b] > media ) {
				cont++;
			}
			
		}
				//printar os resultados
		System.out.println("A media é: "+ media);
		
		System.out.println("Alunos acima da media: " + cont);
	}
	

	public static void notas(int[] total) {
		
		Scanner interno = new Scanner(System.in);
		//recebi e preenchi os vetores com as notas dos alunos

		for(int al=0; al < total.length; al++) {
			
			System.out.println("Digite a nota do aluno: ");	
			
			total[al]  = interno.nextInt();			
		}		
	}		

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//declarei a variavel
		int [] alunos=new int[10];
	
			//chamei os procedimentos
		notas(alunos);
		
		media(alunos);	
		
		
	}
	
}
