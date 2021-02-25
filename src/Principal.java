import Entidades.Fisica;
import Entidades.Juridica;
import Entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();

        System.out.print("Entre com a quantidade de pagantes: ");
        Integer n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Calculo Pagante #"+i);
            System.out.print("Pessoa Fisica ou Jurifica (f/j)  :");
            char pessoa = scanner.next().charAt(0);

            if (pessoa == 'f'){
                System.out.print("Nome: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.print("Renda Anual :");
                Double rendaAnual = scanner.nextDouble();
                System.out.print("Despesas Médicas  ");
                Double despesasMedicas = scanner.nextDouble();

                Fisica fisica = new Fisica(nome,rendaAnual,despesasMedicas);

                lista.add(fisica);
            } else {
                System.out.print("Nome: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.print("Renda Anual :");
                Double rendaAnual = scanner.nextDouble();
                System.out.print("Quantidade de Funcionarios: ");
                Integer numeroFuncionarios = scanner.nextInt();

                Juridica juridica = new Juridica(nome,rendaAnual,numeroFuncionarios);
                lista.add(juridica);
            }
        }

        System.out.println("Taxas Pagas");
        Double soma = 0.00;
        for(Pessoa plista : lista){
            System.out.println(plista.getNome() + ": $" + plista.calculaImposto());

            soma = soma + plista.calculaImposto();

        }

        System.out.println("Total taxas: $" + soma);




        scanner.close();

    }
}
