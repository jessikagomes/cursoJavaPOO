package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        a1.setNome("Claudio");
        v1.setNome("Juvenal");
        b1.setNome("Alexandre");


        System.out.println(v1.toString());
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        b1.pagarMensalidade();

    }
}
