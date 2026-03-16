package Prática;

import java.util.Scanner;
// Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado. OK

// Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as 
// em uma mensagem. OK

// Crie um programa que solicite ao usuário digitar um número. 
// Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

// Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

// Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

// Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

// Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

// Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

public class Principal {
public static void main(String[] args) {
  Scanner leitura = new Scanner(System.in);

    // aplicando conceito básico de concanetação de string e chamando outra classe
      Soma sm = new Soma(); // cria um novo objeto, que é de classe Soma.java
        System.out.println("Primeira nota: " + sm.x);
        System.out.println("Segunda nota: " + sm.y);
          System.out.println("Soma de duas notas decimais: " + sm.total);

        System.out.println("---------------------");
            
    // aplicando casting explícito, de double para int
      int nt = (int) (sm.x + sm.y);
          System.out.println("Nota (sem casas decimais): " + nt);

        System.out.println("---------------------");

    // aplicando valores a variáveis do tipo char e string
      char letra = 'P';
        String palavra = "ALMEIRAS";
          System.out.println("Senha de 8 dígitos " + letra + palavra);

        System.out.println("---------------------");

    // aplicando uma lógica simples de preco do produto * quantidade para saber o valor total
      Vendas ve = new Vendas();
        System.out.println("Preço do produto: " + ve.precoProduto);
        System.out.println("Quantidade: " + ve.qtde);
          System.out.println("Valor total: " + ve.total);

        System.out.println("---------------------");

    // aplicando lógica em java, com uma conversão básica de dólar para reais
      Conversão co = new Conversão();
        System.out.println("Valor em dólar: " + co.valorEmDolares);
        System.out.println("Valor equivalente a 1 dólar: " + co.valorEmReais);
          System.out.println("Valor da conversão: " + co.conversão);

        System.out.println("---------------------");

    // aplicando a lógica em java, com um desconto em determinado produto e seu valor
      Soma so = new Soma();
        System.out.println("Preço original: " + so.precoOriginal);
        System.out.println("Porcentagem do desconto: %" + so.desconto);
          so.precoOriginal = so.precoFinal;
            System.out.println("Valor final (com desconto): " + so.precoOriginal);

        System.out.println("----------------------");
        
    // aplicando scanner para leitura de dados
      double nota = 0;
      double media = 0;
        for (int i = 0; i < 4; i++) {
          System.out.println("Nota: ");
            nota = leitura.nextDouble();
            media += nota;
      }
    System.out.println("Média final das notas: " + media / 4);

    leitura.close();
  }
}