package Atividade10_tryCatchFinnaly;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //instanciando Scanner para leitura de dados

        //Declarando variaveis para entrada de dados do usuário:
        int num1;
        int num2;

        //Try-Catch para lidar tratar das exceções que essa operação pode soltar
        try{
            System.out.println("Informe um Número para ser o Dividendo: ");
            num1 = sc.nextInt();
            sc.nextLine();

            System.out.println("Informe um número para ser o divisor: ");
            num2 = sc.nextInt();

            double resultado = dividir(num1, num2);
            System.out.println("Resultado da divisão: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Erro: Você deve informar apenas Números Inteiros!");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage()); //pega a mensagem do Throw e lança ao usuário
        }finally{
            System.out.println("Operação finalizada...Programa encerrando...");
            sc.close();
        }
    }
    public static double dividir(int a, int b){
        if(b == 0){
            //manda erro:
            throw new ArithmeticException("Erro: divisão por zero não é permitida!");
        }
        return (double) a/b;
    }
}


