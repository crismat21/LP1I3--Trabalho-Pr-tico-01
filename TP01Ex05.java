import java.util.Scanner;

/*
5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado. 
Cristiano Guimarães de Carvalho F.P. CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
*/
public class TP01Ex05 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        double diametro;
        double raio;
        double volume;
        
        System.out.println("Digite o valor do diâmetro da esfera: ");
        diametro = read.nextDouble();
        
        raio = diametro/2;
        volume = (4*3.14*Math.pow(raio,3))/3;
        
        System.out.printf("O volume da esfera é: " + decimal.format(volume));
    }
    
}