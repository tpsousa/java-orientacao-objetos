package br.pulse.screenmatch.calculos;

public class calculadoraDeTempo {

   private int tempoTotal;

   public int getTempo(){
     return tempoTotal;
   }

   public int setTempo() {
    this.tempoTotal = tempoTotal;
   }


   public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
   }
}