import java.util.Scanner;

/*
3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado. 
Cristiano Guimarães de Carvalho F.P. CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
*/
public class TP01Ex03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double diagonal, area;
		
		System.out.println("Digite o valor da diagonal do quadrado: ");
		diagonal = read.nextDouble();
		
		area = (diagonal * diagonal) / 2;
		
		System.out.println("A �rea do quadrado � igual a: " + area);
		

	}

}   