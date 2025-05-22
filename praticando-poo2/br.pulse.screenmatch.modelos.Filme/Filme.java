
public class Filme {
    private String name;
    private int anoDeLancamento;
   // private double DuracaoEmMinutos;

    public Filme(String name){
        this.name = name;
    }
    //getter
    public String getName() {
        return name;
    }
    
    public void setName(String name){
      this.name = name;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    public int setAnoDeLancamento(int anoDeLancamento){
        return this.anoDeLancamento = anoDeLancamento;
    }

   // public double setDuracaoEmMinutos(){
    //   return this.DuracaoEmMinutos = DuracaoEmMinutos;
    //}
}