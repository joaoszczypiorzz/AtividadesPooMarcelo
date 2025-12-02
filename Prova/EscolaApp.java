package Prova;



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

        //Cadastro de novo curso com entradas do usuário
        System.out.println("=== CADASTRO DE NOVO CURSO ===");
        try{
            System.out.print("Informe O tipo de Curso (P - Presencial / O Online):");
            String cursoEscolhido = sc.nextLine();
            if(!cursoEscolhido.equalsIgnoreCase("p") && !cursoEscolhido.equalsIgnoreCase("o")){
                throw new InputMismatchException();
            }
            System.out.println("Informe um Novo código para o curso");
            String codigoNovo = sc.nextLine();
            Curso codigoIgual = catalogo.verifiarExiste(codigoNovo);
            if(codigoIgual != null){
                throw new IllegalArgumentException();
            }
            System.out.println("Informe o Titulo do curso: ");
            String titulo = sc.nextLine();
            System.out.println("Informe um Preço para o Curso: ");
            double valor = sc.nextDouble();
            sc.nextLine(); //pulando Buffer
            if(valor < 0){
                throw new ArithmeticException();
            }
            if(cursoEscolhido.equalsIgnoreCase("p")){
                System.out.println("Informe uma Carga Horaria: ");
                int cargaHoraria = sc.nextInt();
                sc.nextLine(); //pulando buffer
                catalogo.adicionar(new CursoPresencial(codigoNovo, titulo, valor, cargaHoraria));
            }else{
                System.out.println("Informe a plataforma do curso: ");
                String plataforma = sc.nextLine();
                System.out.println("Informe se já possui Material extra ou não (Digite true para sim | false para não)");
                boolean materialExtra = sc.nextBoolean();
                sc.nextLine(); //pulando Buffer
                catalogo.adicionar(new CursoOnline(codigoNovo, titulo, valor, plataforma, materialExtra));
            }

        }catch (InputMismatchException e){
            System.out.println(e);
            System.out.println("Erro: Tipo de Curso Inválido!");
        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Erro: Código já cadastrado no Catálogo!");
        }catch (ArithmeticException e){
            System.out.println("Erro: Preço deve ser maior que Zero!");
        }finally {
            System.out.println("=== CATALOGO DE CURSOS ATUALIZADO ===");
            catalogo.listarCursos();
        }


        //realizando Inscrição
        System.out.println("=== REALIZAR INSCRIÇÃO EM CURSO ===");
        try{
            System.out.print("Digite o código do curso para realizar inscrição: ");
            String cursoDigitado = sc.nextLine();
            Curso cursoEncontrado = catalogo.buscarPorCodigo(cursoDigitado);
            System.out.println("Curso selecionado: " + cursoEncontrado);
            System.out.print("Digite a quantidade de matrículas: ");
            int quantidade = sc.nextInt();
            sc.nextLine(); //pulando buffer
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

        //Operação para aplicar desconto
        System.out.println("=== APLICAR DESCONTO ===");
        try{
            System.out.println("Informe o código do curso a qual deseja aplicar o desconto: ");
            String codigoDesconto = sc.nextLine(); //limpa o buffer automaticamente
            Curso cursoEncontra = catalogo.buscarPorCodigo(codigoDesconto);
            System.out.print("Informe o Percentual de desconto: ");
            int percentual = sc.nextInt();
            sc.nextLine(); //pulando buffer
            if(percentual < 0){
                new InputMismatchException();
            }
            cursoEncontra.aplicarDesconto(percentual);
            System.out.println("Curso após DESCONTO: " + cursoEncontra);


        }catch (InputMismatchException e){
            System.out.println("Erro: Percentual deve ser maior que zero!");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }finally {
            System.out.println("Programa encerrando...");
            sc.close(); //fechando Scanner
        }




    }

}