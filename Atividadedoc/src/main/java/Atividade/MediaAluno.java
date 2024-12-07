
package Atividade;

import java.util.Scanner;

/**
 * A classe MediaAluno calcula a média das notas de um aluno e determina
 * se ele foi aprovado ou reprovado com base nessa média.
 * 
 * A média é calculada com base em 4 notas fornecidas pelo usuário.
 * O aluno é aprovado se a média for maior ou igual a 6.
 * 
 * @author Samuel Antunes
 * @since 07/12/2024
 * @version 1.0
 */
public class MediaAluno {
    int[] nota = new int[4];
    
    /**
     *Calcula a média das notas fornecidas no vetor.
     * @param nota Um vetor de inteiros representando as notas dos alunos
     * @return A média das notas no vetor fornecido.
     */
    public float Calculo_media(int[] nota){
        float soma=0;
        for(int i=0; i<4;i++){
            soma = soma += nota[i];
            
        }
        float media= soma/4;          
            return media;
        
    }
    
    /**
     * Verifica se o aluno foi aprovado ou reprovado com base na média.
     * 
     * Aprovado se a média for maior ou igual a 6.
     * 
     * @param nota Um vetor de inteiros representando as notas dos alunos.
     */
    public void Aprovacao(int[] nota){
       if(Calculo_media(nota)>=6){
           System.out.println("Parabens vc foi aprovado");
           
       }else{
           System.out.println("Reprovado ");
       }
        
    }
    /**
     * Método principal que executa o programa.
     * 
     * Este método permite ao usuário inserir as notas do aluno,
     * calcula a média e imprime se o aluno foi aprovado ou reprovado.
     *
     */
     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nota= new int[4];
       
        
        for(int i=0; i<4;i++){
            System.out.println("digite a "+(i+1) +" nota");
            nota[i]= scan.nextInt();
                  
            
        }
        
        MediaAluno aluno = new MediaAluno();
        System.out.println("sua media foi "+aluno.Calculo_media(nota));
        aluno.Aprovacao(nota);
        
    }
    
    
}
