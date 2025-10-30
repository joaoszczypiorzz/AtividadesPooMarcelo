package Listas;

import java.util.*;
public class Listas1 {

    static void main() {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Rafael");
        nomes.add("Guilherme");
        nomes.add("Gustavo");
        nomes.add("Bruno");
        nomes.add("Leandra");
        nomes.add("Rafaela");
        nomes.add("penelope");

        System.out.println("Imprimindo o arrayList na tela: " + nomes);

        System.out.println("--------------------------------");
        nomes.add(1,"Malta");
        System.out.println("Imprimindo o Vetor com o nome Malta na posição 1 do ArrayList: " + nomes);


    }
}
