
//import javax.print.attribute.standard.Media;

//a classe principal e basicamente onde iremos chamar nossas outras classes
//e seus respectivos metodos

public class principal {
    public static void main(String[] args) {
      Filme meuFilme = new Filme();
      meuFilme.nome = "demolidor";
      meuFilme.anoDeLancamento = 2012;
      meuFilme.duracaoEmMinutos = 160;
      meuFilme.incluidoNoPlano = true;
      //meuFilme.totalDeAvaliacoes = 1000000;

      //como nosso metodo esta dentro da classe,temos que chamar o metodo atraves da classe
      meuFilme.exibirFichaTecnica();

      meuFilme.AvaliaFilme(10);
      meuFilme.AvaliaFilme(10);

      System.out.println("soma das avaliacoes " +  meuFilme.getSomaDasAvaliacoes());

      System.out.println("total de avaliacoes " + meuFilme.totalDeAvaliacoes);
      
      //na verdade teoricamente sao a mesma coisa
      double media = meuFilme.mediaNotas();

      System.out.println("o resultado da nossa media e  " + media);

      //doidera,como isso rodou kkkk
      System.out.println("o resultado da media e " + meuFilme.mediaNotas());

    }
}