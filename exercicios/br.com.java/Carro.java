package br.com.java;

public class Carro {
    private String name;
    private String cor;
    private double precoPorUnidade;
    private int[] totalDeCarros;
    private int quantidadeDeCarros;

    // Constructor
    public Carro(String name, double precoPorUnidade, String cor, int capacidadeDeCarros) {
        this.name = name;
        this.precoPorUnidade = precoPorUnidade;
        this.cor = cor;
        this.totalDeCarros = new int[capacidadeDeCarros];
        this.quantidadeDeCarros = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoPorUnidade() {
        return precoPorUnidade;
    }

    public void setPrecoPorUnidade(double precoPorUnidade) {
        this.precoPorUnidade = precoPorUnidade;
    }

    public int[] getTotal() {
        return totalDeCarros;
    }

    public void setTotal(int[] totalDeCarros) {
        this.totalDeCarros = totalDeCarros;
    }

    public void mostrarCarro() {
        System.out.println("O nome do carro é: " + name);
        System.out.println("O valor por unidade do carro é: " + precoPorUnidade);
    }

    // Método para adicionar carros vendidos
    public void adicionarCarro(int quantidadeVendidos) {
        if (quantidadeDeCarros + quantidadeVendidos <= totalDeCarros.length) {
            this.quantidadeDeCarros += quantidadeVendidos;
        } else {
            System.out.println("Quantidade de carros excede o limite.");
        }
    }

    // Método para encontrar o carro mais caro
    public void maiorPreco() {
        double maiorPreco = 0;
        for (int i = 0; i < quantidadeDeCarros; i++) {
            if (totalDeCarros[i] > maiorPreco) {
                maiorPreco = totalDeCarros[i];
            }
        }
        if (maiorPreco > 0) {
            System.out.println("O preço do carro mais caro é: " + maiorPreco);
        } else {
            System.out.println("Não foi encontrado o carro mais caro.");
        }
    }

    // Método para encontrar o carro mais barato
    public void menorPreco() {
        if (quantidadeDeCarros > 0) {
            double menorPreco = totalDeCarros[0];
            for (int i = 1; i < quantidadeDeCarros; i++) {
                if (totalDeCarros[i] < menorPreco) {
                    menorPreco = totalDeCarros[i];
                }
            }
            System.out.println("O carro com o menor preço é: " + menorPreco);
        } else {
            System.out.println("Nenhum carro disponível.");
        }
    }
}
