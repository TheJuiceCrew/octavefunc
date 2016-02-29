/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao.pkg1;
import java.util.Scanner;

public class Questao1 {
    static boolean teste = true;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 12;
        int soma = 0;
        int vetor[] = new int[n];
        int x,y;
        
        for (int i = 0; i < n; i++){
            System.out.println("Digite um valor para a posição " + i);
            vetor[i] = ler.nextInt();
        
        }
        while(teste == true) {
            System.out.println("-----------------------");
            System.out.println("Digite um índice X (entre 0 e 11)");
            System.out.println("-----------------------");
            x = ler.nextInt();
            System.out.println("-----------------------");
            System.out.println("Digite um índice Y (entre 0 e 11)");
            System.out.println("-----------------------");
            y = ler.nextInt();
            if (x < 12 && y < 12){
                soma = (vetor[x]+vetor[y]);
                System.out.println("-----------------------");
                System.out.println("A soma dos valores dentro dos índices X e Y é = " + soma);
                teste = false;
            }
            else if (x < 0 && y < 0){
                System.out.println("-----------------------");
                System.out.println("Valor inválido, por favor entre com um valor positivo");
                System.out.println("-----------------------");
            }
            else {
                System.out.println("-----------------------");
                System.out.println("Número maior que o tamanho do vetor");
                System.out.println("-----------------------");
            }   
        }
    }
}