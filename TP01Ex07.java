import java.util.Scanner;

/*
7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.  
Cristiano Guimarães de Carvalho F.P. CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
*/
public class TP01Ex07 {
            public static void main(String[] args) {

            Scanner read = new Scanner(System.in);

            double valor[] = new double[2];
            double soma=0;
            double mediag=0;

            for(int i =0; i<2;i++){
                System.out.println("Digite o valor a ser calculado: ");
                valor[i] = read.nextDouble();
            }


            mediag = Math.sqrt(valor[0]*valor[1]);

            System.out.println("Média geométrica: " + mediag);
        }
}