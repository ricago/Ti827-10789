
package intro_java;

import java.util.Scanner;


public class Intro_Java {
  public static Scanner ler = new Scanner(System.in);
  
  public static void main(String[] args) {
        
    int op;
    do{
    System.out.println("Menu Conversões");
    System.out.println("1 - Comprimento ");
    System.out.println("2 - Pesos ");
    System.out.println("3 - Moedas ");
    System.out.println("4 - Sair ");
    System.out.println("Escolha a opção pretendida");
    op = ler.nextInt();
    if(op == 1)
        converteComprimento();
    else if(op == 2)
        convertPesos();
    else if(op == 3)
        converteMoedas();
    else if(op != 4)
        System.out.println("Escolha uma opção válida");
    }while(op!=4);    
    }

    private static void converteComprimento() {
        float metros;
        System.out.println("Insira um valor em metros");
        metros = ler.nextFloat();
        System.out.println(metros+ " (m) equivale a:\n"+(metros*10)+" (dm)\n"+(metros*100)+" (cm)\n"+(metros*1000)+" (mm)\n"+
                +(metros/1000)+" (km)");
    }

    private static void convertPesos() {
        float peso;
        System.out.println("Insira um valor em Kg");
        peso = ler.nextFloat();
        System.out.println(peso+ " (Kg) equivale a:\n"+
                +(peso*10)+" (dg)\n"+
                +(peso*100)+" (cg)\n"+
                +(peso*1000)+" (g)\n"+
                +(peso/1000)+" (Ton)");
    }

    private static void converteMoedas() {
    }
    
}
