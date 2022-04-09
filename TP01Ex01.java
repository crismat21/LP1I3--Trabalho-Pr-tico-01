import java.util.Scanner;

/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
Cristiano Guimarães de Carvalho F.P. CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
*/
public class TP01Ex01 {

	public static void main(String[] args) {
		
        Scanner read = new Scanner(System.in);
        
        double base;
        double altura;
        double area;
        
        System.out.println("Digite o valor da base do ret�ngulo: ");
        base = read.nextDouble();
        
        System.out.println("Digite o valor da altura do ret�ngulo: ");
        altura = read.nextDouble();
        
        area = base*altura;
        
        System.out.printf("A �rea do ret�ngulo �: " + area);
		
	}

}