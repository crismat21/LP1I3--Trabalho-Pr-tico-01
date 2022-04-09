import java.util.Scanner;

/*
17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. 
Cristiano Guimarães de Carvalho F.P. CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
*/
public class TP01Ex17 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double x, y, result;
		
		System.out.println("Digite o valor da base x: ");
		x = read.nextDouble();
		
		System.out.println("Digite o valor do expoente y: ");
		y = read.nextDouble();
		
		result = Math.pow(x, y);
		
		System.out.println("Resultado: " + result);

	}

}