
import pacoteA.ClasseA;
import pacoteB.ClasseB;

public class main{
     public static void main(String[] args) {
        ClasseA objA = new ClasseA("João");
        System.out.println("Nome: " + objA.getNome());

        objA.setNome("Maria");
        System.out.println("Novo nome: " + objA.getNome());

        ClasseB objB = new ClasseB(25);
        System.out.println("Idade: " + objB.getIdade());

        objB.setIdade(30);
        System.out.println("Nova idade: " + objB.getIdade());
    }
}