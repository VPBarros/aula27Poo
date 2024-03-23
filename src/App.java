import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Vetores POO 
		//Programa leia numeros inteiro positivos N (maximo 10)e depois N numeros Inteiros e armazene os vetores
		//E mostre na tela SO os numeros negativos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? no maximo 10! ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i]= sc.nextInt();
		}
		    System.out.println("Numeros Negativos: ");    
             for (int i = 0; i < n; i++) {
            	 if (vet[i]< 0) {
            		 System.out.println(vet[i]);
            		 
            	 }
             }
             sc.close();
    }
}
