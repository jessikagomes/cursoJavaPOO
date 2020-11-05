package projetoFinal;

public class ProjetoFinal {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0]=new Video("Aula 1 de POO");
        v[1]=new Video("Aula 2 de PHP");
        v[2]=new Video("Aula 3 de JS");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubile","M",21,"juba");
        g[1]=new Gafanhoto("Creuza","F",23,"creuzinha");

        Visualizacao[] y = new Visualizacao[2];
        y[0]=new Visualizacao(g[1],v[0]);
        y[1]=new Visualizacao(g[0],v[1]);
        y[0].avaliar();
        y[1].avaliar(25.0f);

        System.out.println(y[0].toString());

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());

    }
}
