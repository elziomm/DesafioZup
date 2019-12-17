
package desafiozup;

/**
 *
 * @author Elzio Maia
 */
public class DesafioZup {

    public static void main(String[] args) {
        Funcoes teste = new Funcoes();
        
        //Exercício 1)
        System.out.print("1) ");
        teste.polindromo("ANA");
        
        //Exercício 2)
        System.out.println("2) " + teste.espacoBinario(15));
        
        //Exercíco 3)
        int[] a = {1, 4, 3, 2};
        System.out.println("3) " + teste.permutacao(a));
        
        //Exercício 4)
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.print("4) ");
        teste.distintos(A);
        
        //Exercício 5)
        int[] acoes = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println("5) " + teste.lucro(acoes));
    }
    
}
