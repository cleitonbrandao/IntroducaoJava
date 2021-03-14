package javaCurso;

import java.util.Scanner;

public class estruturaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new  Scanner(System.in);
		
		//for (inicio ; condicao ; incremento) {
	//}
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<N; i+=1) {
			int x = sc.nextInt();
			soma +=x;			
		}
		System.out.println(soma);
		sc.close();
	}
}