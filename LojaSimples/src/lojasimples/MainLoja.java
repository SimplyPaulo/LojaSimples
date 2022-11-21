package lojasimples;

import java.util.Scanner;

public class MainLoja {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        String nome = input.nextLine();
        System.out.println("\nInforme o seu cpf:");
        String cpf = input.nextLine();
        System.out.println("\nInforme email:");
        String email = input.nextLine();

        Usuario comprador = new Usuario(nome, cpf, email);
        Produto produto = new Produto("Secador", 100.00, 1);
        Venda venda = new Venda();
        venda.realizarVenda(produto,comprador);
    }

}
