import java.util.Scanner;

/*
9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
Cristiano Guimarães de Carvalho F.P. CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
*/
public class TP01Ex09 {
        public static void main(String[] args) {

            Scanner read = new Scanner(System.in);

            double resist;
            double corrente;
            double circuito;

            System.out.println("Digite o valor da resistência elétrica: ");
            resist = read.nextDouble();
 
            System.out.println("Digite o valor da corrente elétrica: ");
            corrente = read.nextDouble();

            circuito = resist*corrente;

            System.out.println("Valor de circuito elétrico: " + circuito + " V");
    }
}