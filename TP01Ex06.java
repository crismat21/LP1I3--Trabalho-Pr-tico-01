import java.util.Scanner;

/*
6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados. 
Cristiano Guimarães de Carvalho F.P. CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
*/
public class TP01Ex06 {
        public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        double valor[] = new double[4];
        double soma=0;
        double media=0;
        
        for(int i =0; i<4;i++){
            System.out.println("Digite o valor a ser calculado: ");
            valor[i] = read.nextDouble();
        }

        for(int i =0; i<4;i++){
            soma = soma + valor[i];
        }
        
        media = soma/4;
        
        System.out.println("Média aritmética: " + media);
    }
    
}