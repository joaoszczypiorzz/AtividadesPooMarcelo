package Prova;

import java.sql.SQLOutput;
import java.util.*;

public class EscolaApp{

    public static void main(String[] args){
        CatalogoCursos<Curso> catalogo = new CatalogoCursos<>(); //instanciando Lista para incluir o catalogo de cursos de acordo com o que foi definido no Objeto curso
        Scanner sc = new Scanner(System.in); //instanciando Scanner para leitura de dados do usuário

        List<Curso> iniciais = Arrays.asList(
                new CursoPresencial("C001", "Java Fundamentos",       1200.00, 40),
                new CursoPresencial("C002", "Desenvolvimento Web",    1400.00, 50),
                new CursoPresencial("C003", "Algoritmos e Lógica",    1000.00, 30),
                new CursoPresencial("C004", "Estruturas de Dados",    1500.00, 60),


                new CursoOnline("C005", "POO em Java",                900.00,  "Plataforma X", true),
                new CursoOnline("C006", "Banco de Dados",             800.00,  "Plataforma Y", false),
                new CursoOnline("C007", "Desenvolvimento Front-end",  950.00,  "Plataforma X", true),
                new CursoOnline("C008", "APIs REST em Java",          1100.00, "Plataforma Z", true),
                new CursoOnline("C009", "DevOps Básico",              1050.00, "Plataforma Y", false),
                new CursoOnline("C010", "Introdução a Python",        700.00,  "Plataforma X", true)
        );
        //adicionando todos os cursos ao catálogo:
        iniciais.forEach(c -> catalogo.adicionar(c));

        //Exibição do catálogo de cursos disponiveis (INICIAIS)
        System.out.println("=== CURSOS DISPONÍVEIS (INICIAIS) ===");
        catalogo.listarCursos();

        //Começando a Pedido de dados ao usuário:
        System.out.println("=== REALIZAR INSCRIÇÃO EM CURSO ===");
        try{
            System.out.print("Digite o código do curso para realizar inscrição: ");
            String cursoDigitado = sc.nextLine();
            Curso cursoEncontrado = catalogo.buscarPorCodigo(cursoDigitado);
            System.out.println("Curso selecionado: " + cursoEncontrado);
            System.out.print("Digite a quantidade de matrículas: ");
            int quantidade = sc.nextInt();
            sc.nextLine();
            if(quantidade < 0){
                throw new InputMismatchException();
            }
            cursoEncontrado.inscrever(quantidade);
            cursoEncontrado.calcularValorTotal(quantidade);



        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println(e);
            System.out.println("Erro: Número de matrículas deve ser mairo que zero!");
        }



    }

}