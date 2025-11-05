package Atividade08;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in); //instanciando Scanner para leitura de dados
        ArrayList<Jogador> jogadores = new ArrayList<>(); //instanciando a lista

        System.out.println("Informe quantos Jogadores deseja Cadastrar: ");
        int qtdJogadores = sc.nextInt();
        sc.nextLine();

        //For para adicionar Jogadores
        for(int i = 0; i < qtdJogadores; i++){
            //entrada de dados Do usuário:
            System.out.println("---Jogador " + (i+1) + " ---");
            System.out.println("Informe o nome do Jogador: ");
            String nome = sc.nextLine();

            System.out.println("Informe o Salario do Jogador " + (i+1));
            double salario = sc.nextDouble();
            sc.nextLine();

            System.out.println("Informe Um número de camisa para o Jogador " + (i+1));
            int camisa = sc.nextInt();
            sc.nextLine();

            //Adicionando Informações no ArrayList:
            jogadores.add(new Jogador(nome, salario, camisa));
        }
        System.out.println("Lista de Jogadores cadastrados: ");
        for(Jogador j: jogadores){
            System.out.println("Nome do Jogador  |  Salário  |  Camisa " );
            System.out.println(j.getNome()+ "              " + j.getSalario() + "        " + j.getCamisa());
        }




    }
}
