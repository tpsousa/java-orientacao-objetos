
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double SomaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    double getSomaDasAvaliacoes(){
       return SomaDasAvaliacoes;        
    }   
    //nosso metodo de exibir algumas informacoes do filme dentro da nossa classe
    void exibirFichaTecnica(){
    System.out.println("o nome do filme e " + nome);
    System.out.println("o ano de lancamento e " + anoDeLancamento);

    }

    void AvaliaFilme(double nota){
          SomaDasAvaliacoes = SomaDasAvaliacoes + nota;
          totalDeAvaliacoes++;
    }
    double mediaNotas(){
        double media  = SomaDasAvaliacoes / totalDeAvaliacoes;
        return media;
       // return media;
    }
 

}