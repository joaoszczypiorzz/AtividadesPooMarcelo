package Listas;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //instanciando Scanner
        ArrayList<Produto> produtos = new ArrayList<>(); //instanciando um array list do que tem como tipo o Objeto Produto
        int n;

        //Pedindo dados ao usuário
        System.out.println("Informe quantos Produtos deseja ter em seu ArrayList:");
        n = sc.nextInt();
        sc.nextLine();

        //Laço de repetição para cadastrar os produtos no ArryLis:
        for(int i = 0; i < n; i++){
            System.out.println("---Produto " + (i+1) + " ---"); //Começando a pedir inputs do usuário para os cadastros dos produtos
            System.out.println("Informe o Código do Produto: ");
            int codigo = sc.nextInt();
            sc.nextLine();

            /*Laço de repetição para percorrer todo o Array List Produtos e
             fazer a verificação de o codigo do produto já foi cadastrado
            * */
            for(Produto p : produtos){
                if(p.getCodProduto() == codigo) throw new IllegalArgumentException("Código já Cadastrado.");
            }

            //Pedindo o restante das informações do Produto
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();
            if(preco <=0) throw new IllegalArgumentException("Preço deve ser maior que Zero!"); //verificação para não aceitar preços menores ou iguais a zero
            produtos.add(new Produto(codigo, nome, preco));//adiciona os cadastros no ArrayList
        }

        /*Resta apenas chamar a função aumentoPercentual,
          Isso será feito com entradas do usuário, então o usuário que define:
          qual o produto ele quer e quanto de Percentual de aumento ele quer no Produto
        * */


    }
}
