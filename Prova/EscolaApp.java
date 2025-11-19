package Prova;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EscolaApp {
    static void main(String[] args) {
        // 1) Declaração do catálogo
        CatalogoCursos<Curso> cursos = new CatalogoCursos<>();

        // 2) Lista de cursos iniciais
        List<Curso> iniciais = Arrays.asList(
                new CursoPrescencial("C001", "Java Fundamentos",       1200.00, 40),
                new CursoPrescencial("C002", "Desenvolvimento Web",    1400.00, 50),
                new CursoPrescencial("C003", "Algoritmos e Lógica",    1000.00, 30),
                new CursoPrescencial("C004", "Estruturas de Dados",    1500.00, 60),

                new cursoOnline("C005", "POO em Java",                900.00,  "Plataforma X", true),
                new cursoOnline("C006", "Banco de Dados",             800.00,  "Plataforma Y", false),
                new cursoOnline("C007", "Desenvolvimento Front-end",  950.00,  "Plataforma X", true),
                new cursoOnline("C008", "APIs REST em Java",          1100.00, "Plataforma Z", true),
                new cursoOnline("C009", "DevOps Básico",              1050.00, "Plataforma Y", false),
                new cursoOnline("C010", "Introdução a Python",        700.00,  "Plataforma X", true)
        );

        iniciais.forEach(cursos::adicionar);

        System.out.println("\n===== LISTA INICIAL DE CURSOS =====");
        cursos.listarCursos();

        Scanner sc = new Scanner(System.in);

        try {
            // =============================================================
            // 4) ETAPA 1 – Cadastro de novo curso
            // =============================================================
            System.out.println("\n===== ETAPA 1 – Cadastro de novo curso =====");
            System.out.print("Informe o tipo de curso (P = presencial, O = online): ");
            String tipo = sc.nextLine().trim().toUpperCase();

            System.out.print("Informe o código do novo curso: ");
            String codigoStr = sc.nextLine().trim();
            int codigo = Integer.parseInt(codigoStr);

            System.out.print("Informe o título: ");
            String titulo = sc.nextLine();

            System.out.print("Informe o valor base: ");
            double valor = Double.parseDouble(sc.nextLine());

            Curso novoCurso = null;

            if (tipo.equals("P")) {
                System.out.print("Informe a carga horária: ");
                int carga = Integer.parseInt(sc.nextLine());
                novoCurso = new CursoPrescencial(codigoStr, titulo, valor, carga);

            } else if (tipo.equals("O")) {
                System.out.print("Informe a plataforma: ");
                String plataforma = sc.nextLine();

                System.out.print("Possui material extra? (true/false): ");
                boolean extra = Boolean.parseBoolean(sc.nextLine());

                novoCurso = new cursoOnline(codigoStr, titulo, valor, plataforma, extra);

            } else {
                System.out.println("Tipo inválido! Curso não será criado.");
            }

            if (novoCurso != null) {
                cursos.adicionar(novoCurso);
                System.out.println("Curso cadastrado com sucesso!");
            }

            System.out.println("\n===== LISTA ATUALIZADA DE CURSOS =====");
            cursos.listarCursos();


            // =============================================================
            // 5) ETAPA 2 – Inscrição em um curso
            // =============================================================
            System.out.println("\n===== ETAPA 2 – Inscrição =====");
            System.out.print("Informe o código do curso para inscrição: ");
            int codInscricao = Integer.parseInt(sc.nextLine());

            Curso cursoEncontrado = cursos.buscarPorCodigo(codInscricao);

            if (cursoEncontrado == null) {
                throw new IllegalArgumentException("Curso não encontrado!");
            }

            System.out.println("Curso encontrado: " + cursoEncontrado.getTitulo());

            System.out.print("Informe a quantidade de matrículas: ");
            int qtd = Integer.parseInt(sc.nextLine());

            if (qtd <= 0) {
                throw new IllegalArgumentException("Quantidade inválida!");
            }

            cursoEncontrado.inscrever(qtd);

            double total = cursoEncontrado.calcularValorTotal(qtd);
            System.out.println("Valor total a pagar: R$ " + total);


            // =============================================================
            // 6) ETAPA 3 – Aplicar desconto
            // =============================================================
            System.out.println("\n===== ETAPA 3 – Desconto =====");
            System.out.print("Informe o código do curso para aplicar desconto: ");
            int codDesconto = Integer.parseInt(sc.nextLine());

            Curso cursoDesconto = cursos.buscarPorCodigo(codDesconto);

            if (cursoDesconto == null) {
                throw new IllegalArgumentException("Curso não encontrado!");
            }

            System.out.print("Informe o percentual de desconto: ");
            double perc = Double.parseDouble(sc.nextLine());

            if (perc <= 0) {
                throw new IllegalArgumentException("Percentual deve ser maior que zero!");
            }

            cursoDesconto.aplicarDisconto(perc);

            System.out.println("Desconto aplicado! Novo valor base: R$ " + cursoDesconto.getValorBase());

            System.out.println("\n===== LISTA FINAL DE CURSOS =====");
            cursos.listarCursos();

        } catch (NumberFormatException e) {
            System.out.println("Erro: valor numérico inválido! " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());

        } finally {
            sc.close();
            System.out.println("\nSistema encerrado. Obrigado!");
        }
    }
}