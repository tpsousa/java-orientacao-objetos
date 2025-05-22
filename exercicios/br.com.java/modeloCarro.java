
package br.com.java;

public class modeloCarro extends Carro{
  
  private String marca;
  private String peneu;
  private double altura;
  
  public modeloCarro(String name,double precoPorUnidade,String cor,int capacidadeDeCarros,String marca, String peneu,double altura){
    super(name, precoPorUnidade, cor, capacidadeDeCarros);
    this.marca = marca;
    this.peneu = peneu;
    this.altura = altura;

  }

  public String getMarca(){
    return marca;
  }
  public String setMarca(String marca){
    return this.marca = marca;
  }

  public double getAltura(){
    return altura;
  }
  public double setAltura(double altura){
    return this.altura = altura;
  }
 public String getPeneu() {
    return peneu;
 }
 public String setPeneu(String peneu){
    return this.peneu = peneu;
 }  
 Carro outroCarro = new Carro();


}