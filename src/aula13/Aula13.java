package aula13;


public class Aula13 {
    public static void main(String[] args) {
        Mamifero mam1 = new Mamifero();
        Lobo lob1 = new Lobo();
        Cachorro cao1 = new Cachorro();

        System.out.println("SOBREPOSIÇÃO:");
        System.out.println("--------------");

        mam1.emitirSom();
        lob1.emitirSom();
        cao1.emitirSom();

        System.out.println("SOBRECARGA:");
        System.out.println("------------");
        cao1.reagir(true);
        cao1.reagir(false);
        cao1.reagir("Olá");
        cao1.reagir("Não vai sair.");
        cao1.reagir(12,20);
        cao1.reagir(20,30);
        cao1.reagir(8,15);
        cao1.reagir(2,3.6f);
        cao1.reagir(10,7.5f);



    }
}
