/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lado_do_triângulo;

/**
 *
 * @author Micro
 */import java.util.Scanner;
public class Lado_do_Triângulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada;
        
       Double a,b,c;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor:");
        a = entrada.nextDouble();
        
        System.out.print("Digite outro valor:");
        b = entrada.nextDouble();
        
        System.out.print("Digite outro valor:");
        c = entrada.nextDouble();
        
        if((a==0) || (b==0) || (c==0)){
        System.out.print("Não forma um triângulo");}
        else if((a+b)>c && (a+c)>b && (b+c)>a ){
        System.out.print("Forma um Triângulo");}
        else if((a==b) && (a==c) && (b==c)){
        System.out.print("Equilátero");}
        else if((a!=b) && (a!=c) && (b!=c)){
        System.out.print("Escaleno");}
        else if((a==b) && (a!=c) && (a==c) && (a!=b) || (b==c) && (b!=a));{
        System.out.print("Isósceles");}
        
        
        
    }
    
}
