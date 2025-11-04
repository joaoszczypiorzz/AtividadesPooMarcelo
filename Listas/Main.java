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

        //pedindo ao usuário o código do produto que ele deseja alterar
        System.out.println("Informe o código do produto que deseja alterar o preço: ");
        int codigoBusca = sc.nextInt();

        //Laço de repetição para procurar o codigo do produto informado pelo meu usuário
        Produto produtoSelecionado = null;
        for(Produto p : produtos){
            if(p.getCodProduto() == codigoBusca){
                produtoSelecionado = p;
                break;
            }
        }
        //if caso o produto selecionado não exisitir
        if(produtoSelecionado == null) throw new IllegalArgumentException("Código do produto não encontrado! Informe um código válido");

        //Pedindo o percentual de aumento ao usuário
        System.out.println("Informe o percentual de aumento que você deseja aplicar: ");
        double percentual = sc.nextDouble();

        if(percentual <= 0) throw new IllegalArgumentException("Percentual deve ser maior que zero!");

        produtoSelecionado.aumentoPercentual(percentual);

        //exibindo lista atualizada para o usuário na tela
        System.out.println("\nLista de Produtos Atualizada: ");
        for(Produto p : produtos){
            System.out.printf("Código: %d  | Nome: %s  | Preço: R$%.2f%n ",
                    p.getCodProduto(), p.getNome(), p.getPreco());

        }
        sc.close();

    }
}
