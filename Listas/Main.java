package Listas;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in); //instanciando Scanner
        ArrayList<String> qtdProdutos = new ArrayList<>();
        int n;

        System.out.println("Informe quantos Produtos deseja ter em seu ArrayList:");
        n = sc.nextInt();
        sc.nextLine();


        for (int i = 0;i<n;i++){
            System.out.println("Digite o Elemento #" + (i+1) + ": ");
            String elemento = sc.nextLine();
            qtdProdutos.add(elemento);
        }

        System.out.println(qtdProdutos);
    }
}
