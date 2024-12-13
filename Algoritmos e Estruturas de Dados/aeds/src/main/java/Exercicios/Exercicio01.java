package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       System.out.print("Digite o tamnho do vetor: ");
       int tamanhoVetor = entrada.nextInt();
       
       System.out.print("\nDigite os valores do vetor: ");
       int vetor[] = new int [tamanhoVetor];
       
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = entrada.nextInt();   
        }
        ordenaVetor(tamanhoVetor,vetor);
        
        System.out.print("Vetor: ");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i]);    
            
        }
    } 
    
    //ordenar o vetor usando o método de inserção
    public static void ordenaVetor(int tamanho, int vetor[]){
        int contador = 0;
        for (int i = 1; i < tamanho; i++) {
            int auxiliar = vetor[i];
            int j = i-1;
            
            //Comparar e mover elementos
            while (j >= 0 && vetor[j] > auxiliar) {
                vetor [j+1] =vetor[j];
                j--;
                contador++;
            }
            contador++;
            vetor[j+1] = auxiliar;
            System.out.print("Numero de comparacoes foi: "+contador);
        }
    }
}
