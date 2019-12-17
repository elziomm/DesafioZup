
package desafiozup;

import java.util.Arrays;
import java.util.stream.IntStream;


/**
 *
 * @author Elzio Maia
 */
public class Funcoes {
    
    //Exercício 1)
    public void polindromo(String palavra){
        String invertida = ""; //vetor de char (string) que servirá para inverter a palavra recebida
        
        //Criação de um laço para "montar" a string invertida, a última letra da palavra recebida será a primeira da palavra invertida
        for(int i = palavra.length()-1; i >= 0; i--){
            invertida += palavra.charAt(i);
        }
        
        //Condição que verifica se a palavra enviada é um políndromo
        if(palavra.equals(invertida)){
            System.out.println(palavra + " é um Políndromo.");
        }else{
            System.out.println(palavra + " não é um Políndromo.");
        }
    }
    
    //Exercício 2)
    public int espacoBinario(int n){
        String bin = Integer.toBinaryString(n); //Conversão do número recebido em uma String binária
        int contaZero = 0, aux = 0; //variáveis contaZero que contará o intervalo de 0 e a auxiliar que servirá como controle 
        
        //laço que percorrerá a string bin para verificar a quantidade de zeros no intervalo entre "uns"
        for(int i = 0; i <= bin.length()-1; i++){
            //condição que verifica se encontrou o caracter "1"
            if(bin.charAt(i) != '1')
                aux++; //soma a variável auxiliar
            else{
                //condição que verifica se a variavél auxiliar é maior que a contaZero, em caso positivo, atribui o seu valor à contaZero e zera a auxiliar para iniciar a contagem novamente
                if(aux > contaZero){
                    contaZero = aux;
                    aux = 0;
                } 
            }
        }
        
        //Condição que verifica a quantidade de zeros no maior intervalo e retorna a resposta adequada
        if(contaZero > 0)
            return contaZero;
            //System.out.println("O número " + n + " (" + bin + ")" + " possui " + contaZero + " espaços binários");
        else
            return 0;
    }
    
    //Exercício 3)
    public int permutacao(int[] a){
        
        Arrays.sort(a);//ordena o array recebido
        
        //laço para percorrer o array ordenado
        for (int i = 0; i < a.length; i++) {
            //condição que exclui o último elemento da verificação
            if(i < a.length-1){
                //condição que verifica se o sucessor é maior que o antecessor mais um
                if(a[i+1] > a[i]+1)
                    return 0;
            }
        }
        return 1;
    }
    
    //Exercício 4)
    public void distintos(int[] A){
        /*  Criação da variável que receberá a quantidadade de elementos distintos;
            cast para converter o valor da atribuição em inteiro;
            utilização da API Stream framework para verificar a quantidade de elementos distintos no array recebido;
            por fim a função "count" que "quantitatiza" o valor retornado pela Collection Framework IntStream.
        */
        int elementosDistintos = (int) IntStream.of(A).distinct().count();
        System.out.println(elementosDistintos);
    }
    
    //Exercício 5)
    public int lucro(int[] acoes){
        //variáveis que aramazenarão o possivel lucro em todas as possibilidades e o maior lucro real
        int possivelLucro = 0, lucro = 0;
        
        //laço que percorrerá todas as possibilidades de venda de açoes possíveis em cada dia
        for(int diaVenda = 0; diaVenda < acoes.length; diaVenda++){
            for(int diaCompra = 0; diaCompra < acoes.length; diaCompra++){
                
                //condição para eliminar erros temporais... rs
                if(diaVenda > diaCompra){
                    
                    //aferição do lucro diário
                    possivelLucro = acoes[diaVenda] - acoes[diaCompra];
                    
                    //condição do maior lucro real
                    if(lucro < possivelLucro)
                        lucro = possivelLucro;
                }
            }
        }
        
        //condição de retorno da função
        if(lucro <= 0)
            return 0;
        else
            return lucro;
    }
}
