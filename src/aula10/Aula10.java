package aula10;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa pes1 = new Pessoa();
        Aluno alu1= new Aluno();
        Funcionario func1= new Funcionario();
        Professor prof=new Professor();

        pes1.setNome("Pedro");
        alu1.setNome("Maria");
        func1.setNome("Claudio");
        prof.setNome("Fabiana");

        System.out.println(pes1.getNome());
    }


}
