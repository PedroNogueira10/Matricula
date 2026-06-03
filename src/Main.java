import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        String continuar = "Sim", nome, mensagem;
        int codigo, idade, ch, totalCH = 0;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt();


        do {
            System.out.print("""
                \n
                ===Disciplinas Disponíveis===
                Codigo           Disciplina           Carga Horária     Idade Mínima
                   1    -      Matemática Básica     -       40h       -    Nenhuma
                   2    -    Programação Java      -       60h       -    14 anos
                   3    -    Física Experimental   -       50h       -    15 anos
                   4    -    Inglês Intermediário  -       45h       -    12 anos
                   5    -    Robótica              -       70h       -    16 anos
                
                Seleciona uma disciplina: """);
            codigo = sc.nextInt();do {
            System.out.print("""
                \n
                ===Disciplinas Disponíveis===
                Codigo           Disciplina           Carga Horária     Idade Mínima
                   1    -      Matemática Básica     -       40h       -    Nenhuma
                   2    -    Programação Java      -       60h       -    14 anos
                   3    -    Física Experimental   -       50h       -    15 anos
                   4    -    Inglês Intermediário  -       45h       -    12 anos
                   5    -    Robótica              -       70h       -    16 anos
                
                Seleciona uma disciplina: """);
            codigo = sc.nextInt();do {
            System.out.print("""
                \n
                ===Disciplinas Disponíveis===
                Codigo           Disciplina           Carga Horária     Idade Mínima
                   1    -      Matemática Básica     -       40h       -    Nenhuma
                   2    -    Programação Java      -       60h       -    14 anos
                   3    -    Física Experimental   -       50h       -    15 anos
                   4    -    Inglês Intermediário  -       45h       -    12 anos
                   5    -    Robótica              -       70h       -    16 anos
                
                Seleciona uma disciplina: """);
            codigo = sc.nextInt();do {
            System.out.print("""
                \n
                ===Disciplinas Disponíveis===
                Codigo           Disciplina           Carga Horária     Idade Mínima
                   1    -      Matemática Básica     -       40h       -    Nenhuma
                   2    -    Programação Java      -       60h       -    14 anos
                   3    -    Física Experimental   -       50h       -    15 anos
                   4    -    Inglês Intermediário  -       45h       -    12 anos
                   5    -    Robótica              -       70h       -    16 anos
                
                Seleciona uma disciplina: """);
            codigo = sc.nextInt();
            sc.nextLine();

            switch (codigo) {
                case 1:
                    System.out.println("\nMatrícula Válida!");

                    totalCH += 40;

                    break;
                case 2:
                    if (idade >= 14) {
                        System.out.println("\nMatrícula Válida!");
                        totalCH += 60;
                    } else {
                        System.out.println("\nVocê precisa ter pelo menos 14 anos para se matricular nessa disciplina!");
                    }
                    break;
                case 3:
                    if (idade >= 15) {
                        System.out.println("\nMatrícula Válida!");
                        totalCH += 50;
                    } else {
                        System.out.println("\nVocê precisa ter pelo menos 15 anos para se matricular nessa disciplina!");
                    }
                    break;
                case 4:
                    if (idade >= 12) {
                        System.out.println("\nMatrícula Válida!");
                        totalCH += 45;
                    } else {
                        System.out.println("\nVocê precisa ter pelo menos 12 anos para se matricular nessa disciplina!");
                    }
                    break;
                case 5:
                    if (idade >= 16) {
                        System.out.println("\nMatrícula Válida!");
                        totalCH += 70;
                    } else {
                        System.out.println("\nVocê precisa ter pelo menos 16 anos para se matricular nessa disciplina!");
                    }
                    break;
                default:
                    System.out.println("\nCódigo de disciplina inválido!");

            }


            System.out.print("\nDeseja se matricular em outra disciplina? (Sim/Nao): ");
            continuar = sc.next();

        }while (continuar.equalsIgnoreCase("Sim"));

        System.out.println("\nPreparando comprovante...");

        for (int i = 3; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.printf("""
                
                Matrícula Realizada!
                
                == Comprovante de Matrícula =======================
                
                Aluno: %s    Idade: %d
                
                Carga Horária Total: %dh
                
                ===================================================
                
                Boas aulas!
                
                """, nome, idade, totalCH);


        sc.close();
    }
}
