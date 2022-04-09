import java.util.Scanner;

/*
2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado. 
Cristiano Guimarães de Carvalho F.P. CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
*/
public class TP01Ex02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
				
		double aresta, area;
		
		System.out.println("Digite o valor da aresta do quadrado: ");
		aresta = read.nextDouble();
		
		area = aresta * aresta;
		
		System.out.println("O valor da �rea � igual a: " + area);		

	}

}