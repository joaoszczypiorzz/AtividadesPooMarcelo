package Atividade08;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
            //verificação para salario menor ou igual a zero:
            if(salario <= 0){
                    throw new IllegalArgumentException("Salário deve ser maior que Zero!");
            }


            System.out.println("Informe Um número de camisa para o Jogador (Número identificador Único) " + (i+1));
            int camisa = sc.nextInt();
            sc.nextLine();
            //verificação se o Número da camisa já existe
            for(Jogador j : jogadores){
                if(j.getCamisa() == camisa){
                    throw new IllegalArgumentException("Camisa já cadastrada!");
                }
            }


            //Adicionando Informações no ArrayList:
            jogadores.add(new Jogador(nome, salario, camisa));
        }

        //exibindo a Lista dos jogadores cadastrados para meu usuário:
        System.out.println("Lista de Jogadores cadastrados: ");
        for(Jogador j: jogadores){
            System.out.println("Nome do Jogador  |  Salário  |  Camisa " );
            System.out.println(j.getNome()+ "              " + j.getSalario() + "        " + j.getCamisa());
        }

        //Solicitando ao meu usuário um aumento salarial no Jogador que ele deseja:
        System.out.println("Informe um Percentual(%) de aumento Salarial que deseja Aplicar: ");
        double percetual = sc.nextDouble();
        if(percetual <= 0 ){
            throw new IllegalArgumentException("Percentual de aumento Deve ser maior que Zero!");
        }
        //Pedindo a qual jogador deseja o aumento salarial:
        System.out.println("Informe a qual jogador deseja aplicar este aumento (Para identifica-lo Informe seu número de camisa): ");
        int camisaIdentificadora = sc.nextInt();

       /* //Verificação caso jogador exista ou não:
        Jogador joga = jogadores.stream()
                .filter(j -> j.getCamisa() == camisaIdentificadora)
                .findFirst()
                .orElse(null);
                */

        Jogador joga = null;
        for(Jogador j: jogadores){
            if(j.getCamisa() == camisaIdentificadora){
                joga = j;
                joga.aumentarSalario(percetual);
                break;
            }
            else{
                throw new IllegalArgumentException("Jogador Inexistente");
            }
        }

        //exibindo Lista Atualizada ao meu usuário:
        System.out.println("Lista de Jogadores cadastrados Atualizada: ");
        for(Jogador j: jogadores){
            System.out.printf("Camisa: %d  | Nome do Jogador: %s  | Salário: R$%.2f%n ",
                    j.getCamisa() , j.getNome(), j.getSalario());
        }
        sc.close(); //fechando o Scanner
    }
}
