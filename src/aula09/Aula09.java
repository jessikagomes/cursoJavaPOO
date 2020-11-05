package aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", "m" ,22);
        p[1]=new Pessoa("Maria", "f",25);

        l[0]=new Livro("Aprendendo Java","José da Silva",300,p[0]);
        l[1]=new Livro("POO para Iniciantes","Pedro Paulo",500,p[1]);
        l[2]=new Livro("Java Avançado","Marcia Candido",800,p[0]);

        //System.out.println(l[0].detalhes());
        //l[0].folhear(300);
        l[0].abrir();
        l[0].avancarPagina();
        l[0].setPagAtual(20);
        l[0].voltarPagina();
        System.out.println(l[0].detalhes());
    }
}
