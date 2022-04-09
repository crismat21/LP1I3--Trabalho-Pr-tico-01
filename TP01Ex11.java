import java.util.Scanner;

/*
11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. 
Cristiano Guimarães de Carvalho F.P. CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
*/
public class TP01Ex11 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double diametro, raio, area;
		
		System.out.println("Digite o valor do di�metro do c�rculo: ");
		diametro = read.nextDouble();
		
		raio = diametro / 2;
		
		area = 3.14 * (raio * raio);
		
		System.out.println("O valor do di�metro � igual a: " + area);

	}

}